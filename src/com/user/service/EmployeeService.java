package com.user.service;

import java.util.List;

import com.user.bean.EmployeeBean;
import com.user.dao.EmployeeDao;
import com.user.daoimp.EmployeeDaoImpl;
import com.user.serviceimp.EmployeeServiceImpl;

public class EmployeeService implements EmployeeServiceImpl {
EmployeeDaoImpl empDaoImpl = new EmployeeDao();
	@Override
	public int saveEmployee(EmployeeBean bean) {
		return empDaoImpl.saveEmployee(bean);
		
	}
	@Override
	public List<EmployeeBean> getAllEmployeeList() {
		// TODO Auto-generated method stub
		return empDaoImpl.getAllEmployeeList();
	}
	@Override
	public int updateEmployee(EmployeeBean empBean) {
		// TODO Auto-generated method stub
		return empDaoImpl.updateEmployee(empBean);
	}
	@Override
	public int deleteEmployee(int empl_Id) {
		// TODO Auto-generated method stub
		return empDaoImpl.deleteEmployee(empl_Id);
	}

}
