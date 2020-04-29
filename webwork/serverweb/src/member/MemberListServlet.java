package member;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "memlist", urlPatterns = { "/member/list.do" })
public class MemberListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO> memberlist = dao.getMemberList();
		
		request.setAttribute("memberlist", memberlist);
		
		RequestDispatcher rd = request.getRequestDispatcher("/member/list.jsp");
		rd.forward(request, response);
	}

}
