<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>教师登陆</title>
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
	   background: url(images/a.jpg)repeat;
	}

	#login-box {
		padding: 35px;

		border-radius:15px;

		background: #56666B;

		color: #fff;

	}
	</style>
</head>
<body>



	
	
	<div class="container" id="top">

	<div class="row" style="margin-top: 280px; ">

		<div class="col-md-4"></div>

		<div class="col-md-4" id="login-box">

			<form class="form-horizontal" role="form"  id="from1" method="post">

			  <div class="form-group">

			    <label for="firstname" class="col-sm-3 control-label">用户id</label>

			    <div class="col-sm-9">

			      <input type="text" class="form-control" id="teacherId" placeholder="请输入id" name="teacherId">

			    </div>

			  </div>

			  <div class="form-group">

			    <label for="lastname" class="col-sm-3 control-label">密码</label>

			    <div class="col-sm-9">

			      <input type="password" class="form-control" id="teacherPassword" placeholder="请输入密码" name="teacherPassword">

			    </div>

			  </div>
			  <div class="form-group pull-right" style="margin-right: 15px;">

			    <div class="col-sm-offset-2 col-sm-10">

			      <button type="submit" class="btn btn-default btn-info" id="login_btn">登录</button>

			    </div>

			  </div>

			</form>

		</div>

		<div class="col-md-4"></div>

	</div>		

</div>
	
		<script type="text/javascript">
		
		$("#login_btn").click(function(){
			
			var teacherId =$("#teacherId").val();
            var teacherPassword =$("#teacherPassword").val();
            
			 if(teacherId==""){
	                alert("账号不能为空！");
	                return false;
	            }
			 if(teacherPassword==""){
                alert("密码不能为空！");
                return false;
            }
				{    
	           	$.ajax({
	   				url:"${APP_PATH}/checkTeacher",
	   				type:"POST",
	   				data:{teacherId:teacherId,teacherPassword:teacherPassword},
	   				success:function(result){
	   					if(result.code==100){
	   						 location.href="index2.jsp";
	   					}else{
	   						alert("信息有误");
	   					}
				   				}
				      	 })	
				     	}
			

		});

		       		 
	</script>
</body>
</html>