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
	<h1>�μ���Ϻ���</h1>
	<hr/>
	<table width="500px" border = "1">
	<tr>
		<th>���̵�</th><th>�н�����</th><th>�̸�</th><th>�ּ�</th>
		<th>�μ���ȣ</th><th>���</th><th>����Ʈ</th><th>����</th>
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
		<td><a href="/serverweb/member/delete.do?id=<%=member.getId() %>&info=test">����</a></td>
		</tr>
	<% } %>
	</table>
</body>
</html>