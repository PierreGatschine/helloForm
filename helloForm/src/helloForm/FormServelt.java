package helloForm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormServelt
 */
@WebServlet("/FormServelt")
public class FormServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	/*
    public FormServelt() {
        super();
        // TODO Auto-generated constructor stub
    }
	*/
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	*/
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String name = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String time = request.getParameter("time");
		String customMessage = "";
		String[] heure = time.split(":");
		String moment = "";

		int h = Integer.parseInt(heure[0]);
		if (h >= 0 && h <= 12) {
			moment = "Good morning ";
		} else if (h > 12 && h <= 20) {
			moment = "Good afternoon ";
		} else {
			moment = "Good evening ";
		}
		
		customMessage = moment + name + " " + lastname;
		request.setAttribute("heure", h);
		request.setAttribute("customMessage", customMessage);
		request.getRequestDispatcher("/WEB-INF/customMessage.jsp").forward(request, response);
	}

}
