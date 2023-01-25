package com.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

/**
 * Servlet implementation class FetchServlet
 */
@WebServlet("/FetchServlet")
public class FetchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FetchServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		EmployeeService eService = new EmployeeServiceImpl();
		List<Employee> elist=eService.fetchAll();
		
//		for(Employee e: elist) {
//			out.print(e.getId()+","+e.getName()+","+e.getSalary()+","+e.getAddress()+","+e.getMobileNo()+"\n");
//		}
		
		request.setAttribute("result", elist);
		RequestDispatcher rd=request.getRequestDispatcher("Fetch.jsp");
		rd.forward(request, response);

	}

}