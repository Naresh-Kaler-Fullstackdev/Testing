//12-April-2022

package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global
{
	//standard rule: to provide test data and objects for whole application
	public WebDriver driver;
	//test data
	public String url = "http://183.82.103.245/nareshit/login.php";
	public String un = "nareshit";
	public String pw = "nareshit";
	public String fn = "Naresh";
	public String mn = "Kaler";
	public String ln = "Fullstackdev";
	
	//objects
	public String txt_loginname = "txtUserName";
	public String txt_password = "txtPassword";
	public String btn_login = "Submit";
	public String link_logout = "Logout";
	public String frm_frame = "rightMenu";
	public String btn_Add = "//input[@Value='Add']";
	public String txt_fn = "txtEmpFirstName";
	public String txt_mn = "txtEmpMiddleName";
	public String txt_ln = "txtEmpLastName";
	public String btn_save = "btnEdit";
}
