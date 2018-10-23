package com.user.util;


public class UtillQuery 
{
	public static final String saveEmp = "insert into employee (firstname, middlename, lastname, phone_no, mobile_no, country, state, city, local_addr, prmt_addr) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	public static final String empList = "select * from employee"; 
	public static final String updateEmp = "Update employee set firstname = ?, middlename = ?, lastname = ?, phone_no = ?, mobile_no = ?, country = ?, state = ?, city = ?, local_addr = ?, prmt_addr = ? where emp_id = ?";
	public static final String deleteEmp = "delete from  employee where emp_id = ? ";
}
