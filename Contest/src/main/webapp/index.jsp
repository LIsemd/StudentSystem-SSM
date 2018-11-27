<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>科创信息管理系统</title>

<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<!-- web路径：
不以/开始的相对路径，找资源，以当前资源的路径为基准，经常容易出问题。
以/开始的相对路径，找资源，以服务器的路径为标准(http://localhost:3306)；需要加上项目名
 -->
<script type="text/javascript"
	src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<link
	href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body style="background-image: url(images/test4.png);background-size:cover">

					
	<!-- 搭建学生端显示页面 -->
	<div class="container">
		<!-- 标题 -->
		<br/>		
		<!-- 按钮1 -->
		<div class="col-md-offset-10">
			<button type="button" class="btn btn-danger btn-sm" id="login_btn">
				<span class="glyphicon glyphicon-hand-right" aria-hidden="true">
					教师登陆
				</span>
			</button>
		</div>	
		<br/>				
		<p class="text-center">
			<font color=black>
				<font size=120 family>学生科创信息管理系统</font>
			</font>
		</p>
	
		<!-- 按钮2 -->
		<br/>		
		<br/>		
		<div class="col-md-offset-10">
		<button type="button" class="btn btn-primary btn-lg" id="pro_add_modal_btn">
			<span class="glyphicon glyphicon-pencil" aria-hidden="true">
				信息录入
			</span>
		</button>
		</div>	
			<div class="col-md-offset-9">
			<form class="col-md-10" role="form" style="margin: 20px 0 10px 0;" id="form1" method="post">
								<div class="input-group">
									<input type="text" class="form-control" placeholder="请输入学生姓名" name="Id" id="Id">
									<span class="input-group-addon btn" id="sub">搜索</span>
								</div>
			</form>
			</div>
		<br/>
	</div>



<!-- 学生信息填写的模态框 -->
<div class="modal fade bs-example-modal-lg" id="proAddModal" tabindex="-1" role="dialog" aria-labelledby="proAddModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">信息录入</h4>
      </div>
	      <div class="modal-body">
	      <form class="form-horizontal">
		  <div class="form-group">
		    <label  class="col-sm-2 control-label">学号</label>
		    <div class="col-sm-10">
		      <input type="test" class="form-control" name="studentId" id="studentId" placeholder="必填">
		    </div>
		  </div>
		 	 <div class="form-group">
		    <label  class="col-sm-2 control-label">项目名称</label>
		    <div class="col-sm-10">
		      <input type="test" class="form-control" name="projectName" id="projectName" placeholder="必填">
		    </div>
		  </div>

		  	  <div class="form-group">
		    <label class="col-sm-2 control-label">科创等级</label>
		    <div class="col-sm-6">
		      <label class="radio-inline">
			  <input type="radio" name="projectGrade" id="projectGrade1" value="国赛" checked="checked"> 国赛
			</label>
			<label class="radio-inline">
			  <input type="radio" name="projectGrade" id="projectGrade2" value="省赛"> 省赛
			</label>
			<label class="radio-inline">
			  <input type="radio" name="projectGrade" id="projectGrade3" value="其他"> 其他
			</label>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">项目排位</label>
		    <div class="col-sm-6">
		      <label class="radio-inline">
			  <input type="radio" name="projectRank" id="projectRank1" value="1" checked="checked"> 1
			</label>
			<label class="radio-inline">
			  <input type="radio" name="projectRank" id="projectRank2" value="2"> 2
			</label>
			<label class="radio-inline">
			  <input type="radio" name="projectRank" id="projectRank3" value="3"> 3
			</label>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">执行情况</label>
		    <div class="col-sm-6">
		      <label class="radio-inline">
			  <input type="radio" name="projectStatus" id="projectStatus1" value="0" checked="checked"> 未执行
			</label>
			<label class="radio-inline">
			  <input type="radio" name="projectStatus" id="projectStatus2" value="1"> 已执行
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">审核情况</label>
		    <div class="col-sm-6">
		      <label class="radio-inline">
			  <input type="radio" name="projectCheck" id="projectCheck" value="0" checked="checked"> 待审核
			</label>
		    </div>
		  </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary" id="pro_save_btn" >提交</button>
      </div>
      </div>
    </div>
  </div>
</div>
		<!-- 显示数据库中已确认数据 -->
		<div class="row">
			<div class="col-md-10 col-md-offset-1">
				<table class="table table-hover" id="stus_table">
					<thead>
						<tr>
							<th>学号</th>
							<th>姓名</th>
							<th>年级</th>
							<th>学院</th>
							<th>班级</th>
							<th>项目名称</th>
							<th>科创等级</th>
							<th>项目排位</th>
							<th>执行情况</th>
							<th>审核情况</th>

						</tr>
					</thead>
					<tbody>
					
					</tbody>
				</table>
			</div>
		</div>
		<!-- 显示分页信息 -->
		<div class="row">
			<!--分页文字信息  -->
			<div class="col-md-6 col-md-offset-1" id="page_info_area"></div>
			<!-- 分页条信息 -->
			<div class="col-md-4 col-md-offset-8" id="page_nav_area">
				
			</div>
		</div>
	<script type="text/javascript">
		var totalRecord,currentPage;
		//1、页面加载完成以后，直接去发送ajax请求,要到分页数据
		$(function(){
			//去首页
			to_page(1);
		});
		function to_page(pn){
			$.ajax({
				url:"${APP_PATH}/pros",
				data:"pn="+pn,
				type:"GET",
				success:function(result){

			
					build_stus_table(result);
					//解析并显示分页信息
					build_page_info(result);
					//解析显示分页条数据
					build_page_nav(result);
				}
			});
		}
		function build_stus_table(result){
			//清空table表格
			$("#stus_table tbody").empty();
			var stus = result.extend.pageInfo.list;
			$.each(stus,function(index,item){
				var stuIdTd = $("<td></td>").append(item.studentId);
				var stuNameTd = $("<td></td>").append(item.student.studentName);
				var stuGradeTd = $("<td></td>").append(item.student.studentGrade);
				var collegeTd = $("<td></td>").append(item.student.studentCollege);
				var classTd = $("<td></td>").append(item.student.studentClass);
				var proNameTd = $("<td></td>").append(item.projectName);
				var proGradeTd = $("<td></td>").append(item.projectGrade);
				var proRankTd = $("<td></td>").append(item.projectRank);
				var proStatusTd = $("<td></td>").append(item.projectStatus==0?"未执行":"已执行");
				var proCheckTd = $("<td></td>").append(item.projectCheck==0?"待审核":"审核通过");
				$("<tr></tr>")
					.append(stuIdTd)
					.append(stuNameTd)
					.append(stuGradeTd)
					.append(collegeTd)
					.append(classTd)
					.append(proNameTd)
					.append(proGradeTd)
					.append(proRankTd)
					.append(proStatusTd)
					.append(proCheckTd)
					//.append(teaNameTd)
					.appendTo("#stus_table tbody");
			});
		}
		//解析显示分页信息
		function build_page_info(result){
			$("#page_info_area").empty();
			$("#page_info_area").append("当前"+result.extend.pageInfo.pageNum+"页,总"+
					result.extend.pageInfo.pages+"页,总"+
					result.extend.pageInfo.total+"条记录");
			totalRecord = result.extend.pageInfo.total;
			currentPage = result.extend.pageInfo.pageNum;
		}
		//解析显示分页条，点击分页要能去下一页....
		function build_page_nav(result){
			//page_nav_area
			$("#page_nav_area").empty();
			var ul = $("<ul></ul>").addClass("pagination");
			
			//构建元素
			var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
			var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
			if(result.extend.pageInfo.hasPreviousPage == false){
				firstPageLi.addClass("disabled");
				prePageLi.addClass("disabled");
			}else{
				//为元素添加点击翻页的事件
				firstPageLi.click(function(){
					to_page(1);
				});
				prePageLi.click(function(){
					to_page(result.extend.pageInfo.pageNum -1);
				});
			}
			var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
			var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
			if(result.extend.pageInfo.hasNextPage == false){
				nextPageLi.addClass("disabled");
				lastPageLi.addClass("disabled");
			}else{
				nextPageLi.click(function(){
					to_page(result.extend.pageInfo.pageNum +1);
				});
				lastPageLi.click(function(){
					to_page(result.extend.pageInfo.pages);
				});
			}	
			//添加首页和前一页 的提示
			ul.append(firstPageLi).append(prePageLi);
			//1,2，3遍历给ul中添加页码提示
			$.each(result.extend.pageInfo.navigatepageNums,function(index,item){
				var numLi = $("<li></li>").append($("<a></a>").append(item));
				if(result.extend.pageInfo.pageNum == item){
					numLi.addClass("active");
				}
				numLi.click(function(){
					to_page(item);
				});
				ul.append(numLi);
			});
			//添加下一页和末页 的提示
			ul.append(nextPageLi).append(lastPageLi);
			//把ul加入到nav
			var navEle = $("<nav></nav>").append(ul);
			navEle.appendTo("#page_nav_area");
		}
		
		//清空表单样式及内容
		function reset_form(ele){
			$(ele)[0].reset();
			//清空表单样式
			$(ele).find("*").removeClass("has-error has-success");
			$(ele).find(".help-block").text("");
		}
		//信息录入
		$("#pro_add_modal_btn").click(function(){
			//清除表单数据（表单完整重置（表单的数据，表单的样式））
			 reset_form("#proAddModal form");
			//$("")[0].reset();
			//弹出模态框
			$("#proAddModal").modal({
				backdrop:"static"
			});
		});
		
		//教师登陆
		$("#tea_check_modal_btn").click(function(){

			//弹出模态框
			$("#teaCheckModal").modal({
				backdrop:"static"
			});
		});
		//申请保存
		$("#pro_save_btn").click(function(){
			//1.将学生信息提交到审核表中
			//2.发送ajax请求保存学生信息
				var studentId =$("#studentId").val();
	            var projectName =$("#projectName").val();
	           if(studentId==""){
	                alert("学号不能为空!");
	                return false;
	            }
	            else if(projectName==""){
	                alert("项目名不能为空!");
	                return false;
		            }
			$.ajax({
				url:"${APP_PATH}/checkid",
				data:"studentId="+studentId,
				type:"POST",
				
				success:function(result){
					if(result.code==200){
						alert("学号不存在!请重新输入")
					}else{
						$.ajax({
							url:"${APP_PATH}/save",
							type:"POST",
							data:$("#proAddModal form").serialize(),
							success:function(result){
								alert(result.msg);
								$("#proAddModal").modal('hide');
							}
						});
					}
				}
			});
		});
		
		//搜索学生信息
		$("#sub").click(function(){
			var name =$("#Id").val();
			$.ajax({
				url:"${APP_PATH}/search",
				type:"GET",
				data:"studentName="+name,
				success:function(result){
					build_stus_table(result);
					//解析并显示分页信息
					build_page_info(result);
					//解析显示分页条数据
					build_page_nav(result);
				}
			});
		});
		
		
		//跳转到登陆页面
		$("#login_btn").click(function(){
				location.href="login.jsp";
		});
		
		 
	</script>
</body>
</html>