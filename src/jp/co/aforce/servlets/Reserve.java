package jp.co.aforce.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Reservation;
import dao.ReservationDao;
import tool.Page;

@WebServlet(urlPatterns = { "/SampleLogin/src/jp.co.aforcr.servlets.reserve" })
public class Reserve extends HttpServlet {

	public void doPost(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Page.header(out);
		try {
			String name = request.getParameter("name");
			String date = request.getParameter("date");
			String time = request.getParameter("time");

			Reservation r = new Reservation();
			r.setName(name);
			r.setDate(date);
			r.setTime(time);

			ReservationDao dao = new ReservationDao();
			int line = dao.insert(r);

			if (line > 0) {
				request.getRequestDispatcher("/html/answer.html").forward(request, response);
			}

		} catch (Exception e) {
			e.printStackTrace(out);
		}
		Page.footer(out);
	}
}
