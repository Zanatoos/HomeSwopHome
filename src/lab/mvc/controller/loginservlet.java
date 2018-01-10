package lab.mvc.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lab.mvc.dao.Dbmanage;
import lab.mvc.dao.UserDao;
import lab.mvc.model.UserInfo;
import java.util.ArrayList;

/**
 * Servlet implementation class loginservlet
 */
@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("email");
		String password = request.getParameter("password");



		
		
		UserDao userDao = new UserDao();
		UserInfo user = null;
		try {
			user = userDao.judgeUserPassword(email, password);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String message = "password are not correct！";

		if (user == null) {

			request.setAttribute("message", message);

			request.getRequestDispatcher("login.jsp").forward(request,response);
			


		}else{
			HttpSession session = request.getSession();  
		    session.setAttribute("email", email);
//		    session.setAttribute("password", password);
//		    session.setAttribute("tel", tel);
			request.getRequestDispatcher("Sucess.jsp").forward(request, response);

		}
	}

}
