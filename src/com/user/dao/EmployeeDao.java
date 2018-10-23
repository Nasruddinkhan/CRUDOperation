package com.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.user.bean.EmployeeBean;
import com.user.daoimp.EmployeeDaoImpl;
import com.user.util.DBConnection;
import com.user.util.UtillQuery;

public class EmployeeDao implements EmployeeDaoImpl{
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs  = null;
	int row = 0;
	@Override
	public int saveEmployee(EmployeeBean bean) {
		try
		{
			conn  = DBConnection.getConnection();
			psmt = conn.prepareStatement(UtillQuery.saveEmp);
			psmt.setString(1, bean.getFirstname());
			psmt.setString(2, bean.getMiddlename());
			psmt.setString(3, bean.getLastname());
			psmt.setString(4, bean.getPhone_no());
			psmt.setString(5, bean.getMobile_no());
			psmt.setString(6, bean.getCountry());
			psmt.setString(7, bean.getState());
			psmt.setString(8, bean.getCity());
			psmt.setString(9, bean.getLocal_addr());
			psmt.setString(10, bean.getPrmt_addr());
			row  = psmt.executeUpdate();
			if(psmt !=null)
			{
				psmt.close();
				psmt = null;
			}
			System.out.println("row inside dao"+row);
		}
		catch (Exception e)
		{
			System.out.println("EmployeeDao.saveEmployee()::"+e.getMessage());
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(conn !=null)
				{
					conn.close();
					conn = null;
				}
				if(psmt !=null)
				{
					psmt.close();
					psmt = null;
				}
			}catch (Exception e) {
              System.out.println("EmployeeDao.saveEmployee() Infinally Block :::"+e.getMessage());
			}
		}
		return row;

	}
	public List<EmployeeBean> getAllEmployeeList()
	{
		 List<EmployeeBean> employee = new ArrayList<EmployeeBean>();
		try
		{
			conn  = DBConnection.getConnection();
			psmt = conn.prepareStatement(UtillQuery.empList);
             rs = psmt.executeQuery();
            while( rs.next() )
            {
            	EmployeeBean empBean = new EmployeeBean();
            	empBean.setEmp_id( rs.getInt( "emp_id" ) );
            	empBean.setFirstname( rs.getString( "firstName" ) );
                 empBean.setMiddlename(rs.getString("middlename"));
            	empBean.setLastname(rs.getString("lastname"));
            	empBean.setPhone_no(rs.getString("phone_no"));
            	empBean.setMobile_no(rs.getString("mobile_no"));
            	empBean.setCountry(rs.getString("country"));
            	empBean.setState(rs.getString("state"));
            	empBean.setCity(rs.getString("city"));
            	empBean.setLocal_addr(rs.getString("local_addr"));
            	empBean.setPrmt_addr(rs.getString("prmt_addr"));
            	employee.add(empBean);
            }
		}
		catch (Exception e)
		{
			System.out.println("EmployeeDao.saveEmployee()::"+e.getMessage());
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(conn !=null)
				{
					conn.close();
					conn = null;
				}
				if(psmt !=null)
				{
					psmt.close();
					psmt = null;
				}
				if(rs !=null)
				{
					rs.close();
					rs = null;
				}
			}catch (Exception e) {
              System.out.println("EmployeeDao.saveEmployee() Infinally Block :::"+e.getMessage());
			}
		}
		return employee;
	}
	@Override
	public int updateEmployee(EmployeeBean bean) {
		// TODO Auto-generated method stub
		try
		{
			conn  = DBConnection.getConnection();
			psmt = conn.prepareStatement(UtillQuery.updateEmp);
			psmt.setString(1, bean.getFirstname());
			psmt.setString(2, bean.getMiddlename());
			psmt.setString(3, bean.getLastname());
			psmt.setString(4, bean.getPhone_no());
			psmt.setString(5, bean.getMobile_no());
			psmt.setString(6, bean.getCountry());
			psmt.setString(7, bean.getState());
			psmt.setString(8, bean.getCity());
			psmt.setString(9, bean.getLocal_addr());
			psmt.setString(10,bean.getPrmt_addr());
			psmt.setInt(11,bean.getEmp_id());
			row  = psmt.executeUpdate();
			if(psmt !=null)
			{
				psmt.close();
				psmt = null;
			}
			System.out.println("row inside dao"+row);
		}
		catch (Exception e)
		{
			System.out.println("EmployeeDao.saveEmployee()::"+e.getMessage());
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(conn !=null)
				{
					conn.close();
					conn = null;
				}
				if(psmt !=null)
				{
					psmt.close();
					psmt = null;
				}
			}catch (Exception e) {
              System.out.println("EmployeeDao.saveEmployee() Infinally Block :::"+e.getMessage());
			}
		}
		return row;
	}
	@Override
	public int deleteEmployee(int empl_Id) {
		// TODO Auto-generated method stub
		try
		{
			conn  = DBConnection.getConnection();
			psmt = conn.prepareStatement(UtillQuery.deleteEmp);
			psmt.setInt(1, empl_Id);
			row  = psmt.executeUpdate();
			if(psmt !=null)
			{
				psmt.close();
				psmt = null;
			}
			System.out.println("row inside dao"+row);
		}
		catch (Exception e)
		{
			System.out.println("EmployeeDao.saveEmployee()::"+e.getMessage());
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(conn !=null)
				{
					conn.close();
					conn = null;
				}
				if(psmt !=null)
				{
					psmt.close();
					psmt = null;
				}
			}catch (Exception e) {
              System.out.println("EmployeeDao.saveEmployee() Infinally Block :::"+e.getMessage());
			}
		}
		return row;
	}
}
