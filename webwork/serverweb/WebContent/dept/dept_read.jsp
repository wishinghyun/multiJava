<%@page import="java.io.PrintWriter"%>
<%@page import="dept.deptDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
	<%
		//������ ������ ������ ������
		dept.deptDTO deptread = (dept.deptDTO)request.getAttribute("readdept");
	%>
	<div class="container-fluid">
			<form role="form" class="form-horizontal"
		action="/serverweb/action?deptno=<%= "001" %>&state=UPDATE" 
		method="get">
				<fieldset>
					<div id="legend">
						<legend>�Ʒ� ����� �ۼ����ּ���.</legend>
					</div>
					<div class="form-group">
						<!-- �μ��ڵ� -->
						<label class="control-label col-sm-2" for="orgcode">�μ��ڵ�</label>
						<div class="col-sm-3">
							<!-- �μ��ڵ带 �̰��� ����ϼ��� -->
							<%= deptread.getDeptNo() %>
						</div>
					</div>
					<div class="form-group">
						<!-- �μ���-->
						<label class="control-label col-sm-2" for="orgname">�μ���</label>
						<div class="col-sm-3">
							<!-- �μ����� �̰��� ����ϼ��� -->
							<%= deptread.getDeptName() %>
						</div>
					</div>
					<div class="form-group">
						<!-- �μ���ġ-->
						<label class="control-label col-sm-2" for="orgloc">�μ���ġ</label>
						<div class="col-sm-3">
							<!-- �μ���ġ�� �̰��� ����ϼ��� -->
							<%= deptread.getLoc() %>
						</div>
					</div>
					<div class="form-group">
						<!-- ��ȭ��ȣ-->
						<label class="control-label col-sm-2" for="orgtel">��ȭ��ȣ</label>
						<div class="col-sm-3">
							<!-- �μ���ȭ��ȣ�� �̰��� ����ϼ��� -->
							<%= deptread.getTel() %>
						</div>
					</div>
					<div class="form-group">
						<!-- �Ŵ���-->
						<label class="control-label col-sm-2" for="orgtel">������</label>
						<div class="col-sm-3">
							<!-- �����ڸ� �̰��� ����ϼ��� -->
							<%= deptread.getMgr() %>
						</div>
					</div>
					<div class="form-group">
						<!-- Button -->
						<div class="col-sm-3 col-sm-offset-2">
							<input type="submit" value="����" class="btn btn-success"/>
						</div>
					</div>
				</fieldset>
			</form>
	</div>
</body>
</html>