package yeogiyong;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import yeogiyong.model.Member;

/**
 * Servlet implementation class JoinServlet
 */
@WebServlet("/JoinServlet.do")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String job = req.getParameter("job");
		String email = req.getParameter("email");

		Member member = new Member();
		member.setId(id);
		member.setName(name);
		member.setJob(job);
		member.setEmail(email);

		req.setAttribute("member", member);
		RequestDispatcher view = req.getRequestDispatcher("./example/joinResult.jsp");
		view.forward(req, res);
	}

}
