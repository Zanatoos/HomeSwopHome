package lab.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lab.mvc.dao.HouseDao;
import lab.mvc.model.HouseInfo;

/**
 * Servlet implementation class ControllerHouse
 */
@WebServlet("/ControllerHouse")
public class ControllerHouse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerHouse() {
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
		String houseId = request.getParameter("houseId");
//		String title = request.getParameter("title");
		String adrs_1 = request.getParameter("adrs_1");
		String adrs_2 = request.getParameter("adrs_2");
		String city  = request.getParameter("city");
		String code_postal = request.getParameter("code_postal");
		String country = request.getParameter("country");
		String date_start = request.getParameter("date_start");
		String date_fin = request.getParameter("date_fin");
		String num_people = request.getParameter("num_people");
		String house_type = request.getParameter("house_type");
		String service = request.getParameter("service");
		String constraints = request.getParameter("constraints");
		String description = request.getParameter("description");
		

		
		HouseInfo house = new HouseInfo(houseId, adrs_1,adrs_2,city, code_postal, country, date_start, date_fin, num_people, house_type, service, constraints, description);

		HouseDao houseDao = new HouseDao();//实例化数据库操作对象
		houseDao.insertHouse(house);//调用方法
		request.getRequestDispatcher("Sucess.jsp").forward(request,response);

	}

}
