<%@page import="member.MemberDTO"%>
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
		ArrayList<MemberDTO> memberlist = (ArrayList<MemberDTO>)request.getAttribute("memberlist");
		int size = memberlist.size();
	%>
	<h1>부서목록보기</h1>
	<hr/>
	<table width="500px" border = "1">
	<tr>
		<th>아이디</th><th>패스워드</th><th>이름</th><th>주소</th>
		<th>부서번호</th><th>등급</th><th>포인트</th><th>삭제</th>
	</tr>
	<%
		for(int i=0;i<size;i++){ 
			MemberDTO member = memberlist.get(i);
	%>
		<tr>
		<td><a href="/serverweb/member/read.do?id=<%= member.getId() %>"><%= member.getId() %></a></td>
		<td><%= member.getPass() %></td>
		<td><%= member.getName() %></td>
		<td><%= member.getAddr() %></td>
		<td><%= member.getDeptNo() %></td>
		<td><%= member.getGrade() %></td>
		<td><%= member.getPoint() %></td>
		<td><a href="/serverweb/member/delete.do?id=<%=member.getId() %>&info=test">삭제</a></td>
		</tr>
	<% } %>
	</table>
</body>
</html>