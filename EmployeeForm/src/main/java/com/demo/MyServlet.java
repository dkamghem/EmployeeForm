package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
//@WebServlet("/MyServlet")
//Annotation Based, XMl Based 

//container-- software who is responsible to manage life cycle of servlet

//Life Cycle-- to create object and call important method which will execute servlet. 
//Life Cycle method-- init(), service/doPost()/doGet, destroy()

//init --it is call once in servlet Life Cycle which is at beginning only 
// service()/doGet()/doPost()- it is called for every request
//destroy()-- it is call at once which is at end only 
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
	public void init() throws ServletException {
		System.out.println("Init");
		super.init();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.print("Hello to My Servlet "+ new Date());
	}
	
	@Override
	public void destroy() {
		System.out.println("Destroy");
		//super.destroy();
	}

} 

// front end(.jsp), back end(servlet)
