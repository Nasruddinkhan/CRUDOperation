package com.user.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.bean.EmployeeBean;
import com.user.service.EmployeeService;
import com.user.serviceimp.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeBean empBean = null;
	RequestDispatcher requestDispatcher = null;
	EmployeeServiceImpl employeeServiceImpl = new  EmployeeService();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hiiiiiii");
		String btnAction = "";
		try
		{
			empBean = new EmployeeBean();
			empBean.setFirstname(request.getParameter("firstname"));
			empBean.setMiddlename(request.getParameter("middlename"));
			empBean.setLastname(request.getParameter("lastname"));
			empBean.setPhone_no(request.getParameter("phone_no"));
			empBean.setMobile_no(request.getParameter("mobile_no"));
			empBean.setCountry(request.getParameter("country"));
			empBean.setCity(request.getParameter("city"));
			empBean.setState(request.getParameter("state"));
			empBean.setLocal_addr(request.getParameter("local_addr"));
			empBean.setPrmt_addr(request.getParameter("prmt_addr"));
			btnAction = request.getParameter("btnClicked");
		   if("Save".equalsIgnoreCase(btnAction))
		   {
			  int row =  employeeServiceImpl.saveEmployee(empBean);
			  System.out.println("row  :::"+row);
			  requestDispatcher = request.getRequestDispatcher("register.jsp");
			  requestDispatcher.include(request, response);;
		   }
		   else if("Update".equalsIgnoreCase(btnAction))
		   {
			   System.out.println("Inside Update !!!!!!!"+request.getParameter("emp_id"));
			   empBean.setEmp_id(Integer.parseInt(request.getParameter("emp_id")));
			   int row =  employeeServiceImpl.updateEmployee(empBean);
			   request.getRequestDispatcher("register.jsp").include(request, response);
		   }
		   else if("Update".equalsIgnoreCase(btnAction))
		   {
			   System.out.println("Inside Update !!!!!!!"+request.getParameter("emp_id"));
			   empBean.setEmp_id(Integer.parseInt(request.getParameter("emp_id")));
			   int row =  employeeServiceImpl.updateEmployee(empBean);
			   request.getRequestDispatcher("register.jsp").include(request, response);
		   }
		   else if("Delete".equalsIgnoreCase(btnAction))
		   {
			   System.out.println("Inside Update !!!!!!!"+request.getParameter("emp_id"));
			  int empl_Id = Integer.parseInt(request.getParameter("emp_id"));
			   int row =  employeeServiceImpl.deleteEmployee(empl_Id);
			   request.getRequestDispatcher("register.jsp").include(request, response); 
		   }
		}
		catch (Exception e) 
		{
			System.out.println("EmployeeController.doPost() ::::"+e.getMessage());
			e.printStackTrace();
		}
}

}
