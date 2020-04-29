package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dept.deptDTO;

@WebServlet(name = "forward", urlPatterns = { "/forward.do" })
public class FowardServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
												throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		
		pw.println("<h1>forwardȭ��</h1>");
		
		//1. ������ �����ϱ�
		deptDTO dept = new deptDTO("001", "�����", "", "", "");
		request.setAttribute("mydata", dept);
		System.out.println("forwardServlet����Ϸ�");
		
		//2. ��û������ - forward
		RequestDispatcher rd = request.getRequestDispatcher("/jspbasic/subPage.jsp");
		rd.forward(request, response);
	}

}
