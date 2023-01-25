package com.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;

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
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**2
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("ename");
		String dept = request.getParameter("edept");
		Float salary = Float.parseFloat(request.getParameter("esalary"));
		Employee e=new Employee();
		e.setId(id);
		e.setName(name);
		e.setDept(dept);
		e.setSalary(salary);
		EmployeeService eService=new EmployeeServiceImpl();
			eService.save(e);
			RequestDispatcher rd=request.getRequestDispatcher("FetchServlet");
			  rd.forward(request, response);
			
		PrintWriter out = response.getWriter();
		out.print(id + "," + name + "," + dept + "," + salary);
		
	}

}
