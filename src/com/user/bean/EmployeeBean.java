package com.user.bean;

import java.sql.Timestamp;

public class EmployeeBean 
{
	private int emp_id;
  private String firstname;
  private String middlename;
  private String lastname;
  private String phone_no;
  private String mobile_no;
  private String country;
  private String state;
  private String city;
  private String prmt_addr;
  private String local_addr;
  private Timestamp chgDate;
  private Timestamp addDate;
  private String chgTerm;
  private String addTerm;
  private String chgUser;
  private String addUser;
public int getEmp_id() {
	return emp_id;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}
public Timestamp getChgDate() {
	return chgDate;
}
public void setChgDate(Timestamp chgDate) {
	this.chgDate = chgDate;
}
public Timestamp getAddDate() {
	return addDate;
}
public void setAddDate(Timestamp addDate) {
	this.addDate = addDate;
}
public String getChgTerm() {
	return chgTerm;
}
public void setChgTerm(String chgTerm) {
	this.chgTerm = chgTerm;
}
public String getAddTerm() {
	return addTerm;
}
public void setAddTerm(String addTerm) {
	this.addTerm = addTerm;
}
public String getChgUser() {
	return chgUser;
}
public void setChgUser(String chgUser) {
	this.chgUser = chgUser;
}
public String getAddUser() {
	return addUser;
}
public void setAddUser(String addUser) {
	this.addUser = addUser;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getMiddlename() {
	return middlename;
}
public void setMiddlename(String middlename) {
	this.middlename = middlename;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getPhone_no() {
	return phone_no;
}
public void setPhone_no(String phone_no) {
	this.phone_no = phone_no;
}
public String getMobile_no() {
	return mobile_no;
}
public void setMobile_no(String mobile_no) {
	this.mobile_no = mobile_no;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getPrmt_addr() {
	return prmt_addr;
}
public void setPrmt_addr(String prmt_addr) {
	this.prmt_addr = prmt_addr;
}
public String getLocal_addr() {
	return local_addr;
}
public void setLocal_addr(String local_addr) {
	this.local_addr = local_addr;
}
  
}
