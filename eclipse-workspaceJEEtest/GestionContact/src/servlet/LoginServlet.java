package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.ContactService;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ContactService serv;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
    	this.serv = new ContactService();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("name");
		String pass = request.getParameter("password");
		
		if(nom.equals(pass)) {
			request.setAttribute("listeContacts", serv.readContact());
			RequestDispatcher rd = request.getRequestDispatcher("accueil.jsp");
			rd.include(request, response);
			rd.forward(request, response);
		}
		else {
			response.sendRedirect("index.html");
		}
	}

}
