<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改审核名单</title>
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
			<style type="text/css">
	body{
	   background: url(images/d.jpg)repeat;
	}
	</style>
</head>
<body>
		<br/>			
		<br/>
		<p class="text-center">
	<font color=black>
		<font size=100 family>欢迎使用 <strong>学生科创信息管理系统</strong></font>
	</font>
		<br/>
		<!-- 按钮1 -->
		<div class="col-md-offset-10">
			<button type="button" class="btn btn-danger btn-sm" id="return_modal_btn">
				<span class="glyphicon glyphicon-hand-right" aria-hidden="true">
					点击返回
				</span>
			</button>
		</div>	
		<!-- 显示数据库中已确认数据 -->
		<div class="row">
			<div class="col-md-8 col-md-offset-2">
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
			<div class="col-md-6 col-md-offset-2" id="page_info_area"></div>
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
					url:"${APP_PATH}/checked",
					data:"pn="+pn, 
					type:"GET",
					success:function(result){

						//1、解析并显示员工数据
						build_stus_table(result);
						//2、解析并显示分页信息
						build_page_info(result);
						//3、解析显示分页条数据
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
					var delBtn = $("<button></button>").addClass("btn btn-danger btn-sm delete_btn")
					.append($("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除");
					$("<tr></tr>").append(stuIdTd)
						.append(stuNameTd)
						.append(stuGradeTd)
						.append(collegeTd)
						.append(classTd)
						.append(proNameTd)
						.append(proGradeTd)
						.append(proRankTd)
						.append(proStatusTd)
						.append(proCheckTd)
						.append(delBtn)
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
			$("#return_modal_btn").click(function(){

		      	  location.href="index2.jsp"
				}
			);
			
			//单个删除
			$(document).on("click",".delete_btn",function(){
				//1、弹出是否确认删除对话框
				var name = $(this).parents("tr").find("td:eq(1)").text();
				var IdTd = $(this).parents("tr").find("td:eq(0)").text();
				if(confirm("审核对象:【"+name+"】确认其不通过审核?")){
					//确认，发送ajax请求删除即可
					$.ajax({
						url:"${APP_PATH}/delete/"+IdTd,
						type:"DELETE",
						success:function(result){
							alert(result.msg);
							to_page(currentPage);
						}
					});
				}
			});			
	</script>
</body>
</html>