package jp.co.aforce.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Members;
import dao.MembersDao;
import tool.Page;

@WebServlet(urlPatterns = { "/SampleLogin/src/jp.co.aforcr.servlets.login" })
public class Login extends HttpServlet {
	public void doPost(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Page.header(out);

		HttpSession session = request.getSession();

		try {
			String userid = request.getParameter("userid");
			String password = request.getParameter("password");

			MembersDao dao = new MembersDao();
			Members members = dao.search(userid, password);

			if (members != null) {
				session.setAttribute("members", members);
				getServletContext().getRequestDispatcher("/jsp/login-out.jsp").forward(request, response);
			} else {
				String msg = "IDもしくはパスワードが違います";
				request.setAttribute("msg", "IDもしくはパスワードが違います");
				request.getRequestDispatcher("/jsp/login-in.jsp").forward(request, response);

			}

		} catch (Exception e) {
			e.printStackTrace(out);

		}
		Page.footer(out);

	}

}
