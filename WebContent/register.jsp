<%@page import="sun.invoke.empty.Empty"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.user.serviceimp.EmployeeServiceImpl" %>
 <%@ page import="com.user.service.EmployeeService" %>
  <%@ page import="java.util.List" %>
    <%@ page import="  com.user.bean.EmployeeBean" %>
 <%
 EmployeeServiceImpl empService = new EmployeeService();
 List<EmployeeBean> employees = empService.getAllEmployeeList();
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
.txt{
height: 25px;outline: none;border-radius: 5px;border: 1px solid gainsboro;    padding-left: 2px;width: 20%;
}
.col, .label,.col2{
display: inline;
}
label{
padding: 5px;
}
.row1,  .row2{
margin-top: 20px;
}
.txtarea
{
outline: none;
border-radius: 5px;border: 1px solid gainsboro;
}
.firstDiv
 {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #316c6f;
	width: 100%;
	height: 65px;
	text-align: center;
	color: #fff;
	border-top: pink 2px solid;
	border-bottom: #BBB 2px solid;
	font-size: 50px;
}
body 
{
	margin: 0;
	padding: 0;
	background-color: #f7f8fa;
	-webkit-font-smoothing: antialiased;
	font-size: 16px;
	color: #555;
	font-weight: normal;
}
.button {
    background-color: #4CAF50; 
    border: none;
    color: white;
    padding: 10px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    -webkit-transition-duration: 0.4s;
    transition-duration: 0.4s;
    cursor: pointer;
    outline: none;
}
.button1 {
    background-color: gray; 
    color: white; 
    border-radius: 2px ;
}

.button1:hover {
    background-color: #4CAF50;
    color: white;
}
.button2:hover {
    background-color: red;
    color: white;
}
input[type=search] {
	-webkit-appearance: none;
	height: 30px;
	border-radius: 4px;
	border: 1px;
	outline: none;
}
table.dataTable thead th div.DataTables_sort_wrapper {
	position: relative;
	text-align: center;
}
td {
	text-align: center;
}
.dataTables_wrapper .ui-toolbar {
	padding: 8px;
	margin-top: 2px;
}

.ui-corner-all, .ui-corner-top, .ui-corner-right, .ui-corner-tr {
	border-top-right-radius: 0px !important;
}

.ui-corner-all, .ui-corner-top, .ui-corner-left, .ui-corner-tl {
	border-top-left-radius: 0px !important;
}
th{
outline: none;
}
.ui-widget-header {
    background: rgba(36, 170, 145, 0.97) url(images/ui-bg_highlight-soft_75_cccccc_1x100.png) 50% 50% repeat-x !important;
}
.ui-state-default, .ui-widget-content .ui-state-default, .ui-widget-header .ui-state-default {
    background: #c37777 url(images/ui-bg_glass_75_e6e6e6_1x400.png) 50% 50% repeat-x !important;
    color: floralwhite !important;
}

tr:hover>.sorting_1, tbody>tr:hover {
    background-color: #DAF7A6 !important;
    color: #555;
}

</style>
<link rel="stylesheet" href="css/jquery-ui.css"/>  
<link rel="stylesheet" href="css/dataTables.jqueryui.min.css"/>  
<link rel="stylesheet" href="css/smoothness-jquery-ui.css"/>

<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
<script src="js/jquery.dataTables.min.js"></script>
<script src="js/dataTables.jqueryui.min.js"></script> 
 
<script>
$(document).ready(function(){
$('#emp_table').DataTable();
    });
</script> 
<title>Insert title here</title>
</head>
<body>
<div class="firstDiv">Employee Details:</div>
<form method="post" action="EmployeeController" id="emp_control"  name="emp_control">
<input type="hidden" name="emp_id" id="emp_id" >
<input type="hidden" name="btnClicked" id="btnClicked">
<div class="form-cantainer" >
<div class="row1">
		<label style="padding-left: 30px;">First Name</label>
	<div class="col">
	  <input type="text" name="firstname" class="txt" id="firstname"/>
	</div>
		<label>Middle Name</label>
	<div class="col">
	  <input type="text" name="middlename" class="txt" id="middlename"/>
	</div>
	<label>Last Name</label>
	<div class="col">
	  <input type="text" name="lastname" class="txt" id="lastname"/>
	</div>
</div>
<div class="row2">
	<label>Phone Number</label>
	<div class="col2">
	  <input type="text" name="phone_no"  id = "phone_no" class="txt"/>
	</div>
		<label style="padding-left: 25px;">Mobile No</label>
	<div class="col2">
	  <input type="text" name="mobile_no" id="mobile_no" class="txt"/>
</div>
<div class="row1">
		<label style="padding-left: 48px;">Country</label>
	<div class="col">
	  <input type="text" name="country" id="country" class="txt"/>
	</div>
		<label style="padding-left: 65px;">State</label>
	<div class="col">
	  <input type="text" name="state" id="state" class="txt"/>
	</div>
	<label style="padding-left: 45px;">City</label>
	<div class="col">
	  <input type="text" name="city" class="txt" id="city"/>
	</div>
</div>
<div class="row1">
	<label>Local Address</label>
	<div class="col">
	  <textarea rows="3" cols="36" name="local_addr" id="localaddr" class="txtarea"></textarea>
	</div>
		<label style="padding-left: 335px;">Permanent Address</label>
	<div class="col">
	  <textarea rows="3" cols="36" class="txtarea" name="prmt_addr" id="prmt_addr"></textarea>
	</div>
</div>
<div align="center">
      <input type="submit" name="btn" value="Save" id="saveBtn" class="button button1" onclick="doSubmit(this.value);">
      <input type="reset" name="btn" value="Cancel" class="button button1 button2">
</div>
</div>
</div>
</form>
<table id="emp_table" class="display" cellspacing="0" width="100%">
        <thead>
            <tr>
                <th>Employee Id</th>
                <th>Name</th>
                <th>Middle Name</th>
                <th>Last Name</th>
                <th>Mobile</th>
                 <th>Edit</th>
                <th>Delete</th>
            </tr>
        </thead>
        <tbody>
<% 
        if(!employees.isEmpty()){
           for(EmployeeBean emp: employees)
           {
%>
           <tr ondblclick="callEdit('<%=emp.getEmp_id() %>','<%=emp.getFirstname()%>','<%=emp.getMiddlename()%>',
                   '<%=emp.getLastname()%>','<%=emp.getMobile_no() %>','<%=emp.getPhone_no() %>','<%= emp.getCountry()%>','<%=emp.getState()%>' , '<%=emp.getCity()%>'
                   ,'<%=emp.getPrmt_addr()%>','<%=emp.getLocal_addr()%>','view')">    
                <td><%=emp.getEmp_id() %></td>
                <td><%=emp.getFirstname()%></td>
                <td><%=emp.getMiddlename()%></td>
                <td><%=emp.getLastname()%></td>
                <td><%=emp.getMobile_no() %></td>
               <td><a href="#" onclick="callEdit('<%=emp.getEmp_id() %>','<%=emp.getFirstname()%>','<%=emp.getMiddlename()%>',
               '<%=emp.getLastname()%>','<%=emp.getMobile_no() %>','<%=emp.getPhone_no() %>','<%= emp.getCountry()%>','<%=emp.getState()%>' , '<%=emp.getCity()%>'
               ,'<%=emp.getPrmt_addr()%>','<%=emp.getLocal_addr()%>','edit')" style="text-decoration: none; color: #555;">Edit</a></td>
                <td><a href="#" style="text-decoration: none; color: #555;" onclick="callDelete('<%=emp.getEmp_id() %>')" >Delete</a></td>
            </tr>
 <%
             }
        }
%>
        </tbody>
             <tfoot>
            <tr>
                <th>Employee Id</th>
                <th>Name</th>
                <th>Middle Name</th>
                <th>Last Name</th>
                <th>Mobile</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
        </tfoot>
    </table>
</body>
<script>
function doSubmit(val)
{
		$('#btnClicked').val(val);	
}

function callEdit(id, firstname, middlename, lastname, mobileno, phoneno, country, state, city, prmt_addr, localaddr, status)
{
	if(status == 'edit')
		{
		$('#emp_id').val(id);	
		$('#firstname').val(firstname);
		$('#middlename').val(middlename);
		$('#lastname').val(lastname);
		$('#mobile_no').val(mobileno);
		$('#phone_no').val(phoneno);	
		$('#country').val(country);
		$('#state').val(state);
		$('#city').val(city);
		$('#prmt_addr').val(prmt_addr);
		$('#localaddr').val(localaddr);
		$('#saveBtn').val('Update');
		$("#emp_control input ").prop("disabled", false);
		$('#prmt_addr').prop("disabled", false);
		$('#localaddr').prop("disabled", false);
		$('.button').show();
		}
	else
		{
		$("#emp_control input").prop("disabled", true);
		$('#prmt_addr').prop("disabled", true);
		$('#localaddr').prop("disabled", true);
		 $('.button').hide();
		$('#emp_id').val(id);	
		$('#firstname').val(firstname);
		$('#middlename').val(middlename);
		$('#lastname').val(lastname);
		$('#mobile_no').val(mobileno);
		$('#phone_no').val(phoneno);	
		$('#country').val(country);
		$('#state').val(state);
		$('#city').val(city);
		$('#prmt_addr').val(prmt_addr);
		$('#localaddr').val(localaddr);
		}
	
}

function callDelete(id)
{
	$('#emp_id').val(id);
	$('#btnClicked').val('Delete');
	document.emp_control.submit();
}

</script>
</html>