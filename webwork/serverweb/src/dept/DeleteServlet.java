package dept;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "delete", urlPatterns = { "/dept/delete.do" })
public class DeleteServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		
		String deptNo = request.getParameter("deptNo");
		deptDAO dao = new deptDAOImpl();
		int result = dao.delete(deptNo);
		
		//요청 재지정
		//response.sendRedirect("/serverweb/dept/list.do");
		
		pw.print("<h1>삭제 성공</h1>");
		pw.print("<hr/>");
		pw.print("<h3>"+result+"개 삭제</h3>");
		pw.print("<h3><a href='/serverweb/dept/list.do'>목록 보기</a></h3>");
		
	}

}
