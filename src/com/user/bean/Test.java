package com.user.bean;

import java.util.List;

import com.user.dao.EmployeeDao;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   EmployeeDao dao = new EmployeeDao();
   List<EmployeeBean> employees = dao.getAllEmployeeList();
	}

}
