<%@page import="dept.deptDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		//������ ������ ������ ��������
		dept.deptDTO dept = (dept.deptDTO)request.getAttribute("mydata");
	%>
	<h1>��û���������� ����� ������</h1>
	<hr/>
	<h2>���������� :<%= dept.getDeptName() %></h2>
</body>
</html>