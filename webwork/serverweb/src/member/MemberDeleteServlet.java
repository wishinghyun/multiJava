package member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "memDel", urlPatterns = { "/member/delete.do" })
public class MemberDeleteServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		
		String id = request.getParameter("id");
		MemberDAO dao = new MemberDAO();
		int result = dao.delete(id);
		
		pw.print("<h1>삭제 성공</h1>");
		pw.print("<hr/>");
		pw.print("<h3>"+result+"개 삭제</h3>");
		pw.print("<h3><a href='/serverweb/member/list.do'>목록 보기</a></h3>");
	}

}
