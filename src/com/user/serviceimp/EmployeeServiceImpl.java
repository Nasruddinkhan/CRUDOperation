package com.user.serviceimp;

import java.util.List;

import com.user.bean.EmployeeBean;

public interface EmployeeServiceImpl {
public int saveEmployee(EmployeeBean bean);
public List<EmployeeBean> getAllEmployeeList();
public int updateEmployee(EmployeeBean empBean);
public int deleteEmployee(int empl_Id);

}
