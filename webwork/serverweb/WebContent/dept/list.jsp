<%@page import="dept.deptDTO"%>
<%@page import="java.util.ArrayList"%>
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
		ArrayList<dept.deptDTO> deptlist = (ArrayList<dept.deptDTO>)request.getAttribute("listresult");
		int size = deptlist.size();
	%>
	<h1>부서목록보기</h1>
	<hr/>
	<table width="500px" border = "1">
	<tr>
		<th>부서코드</th><th>부서명</th><th>위치</th>
		<th>전화번호</th><th>관리자</th><th>삭제</th>
	</tr>
	<%
		for(int i=0;i<size;i++){ 
		dept.deptDTO dept = deptlist.get(i);
	%>
		<tr>
		<td><%= dept.getDeptNo() %></td>
		<td><a href="/serverweb/dept/read.do?deptNo=<%= dept.getDeptNo() %>&info=한글데이터"><%= dept.getDeptName() %></a></td>
		<td><%= dept.getLoc() %></td>
		<td><%= dept.getTel() %></td>
		<td><%= dept.getMgr() %></td>
		<td><a href="/serverweb/dept/delete.do?deptNo=<%=dept.getDeptNo() %>&info=test">삭제</a></td>
		</tr>
	<% } %>
	</table>
</body>
</html>