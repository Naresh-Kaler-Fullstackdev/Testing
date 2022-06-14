//12-April-2022

package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import com.hrms.lib.General;

public class Testing_030_AddEmployee
{
	//public static void main(String[] args)
	@Test
	public void AddEmp()
	{
		//Test steps
		DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.enterFrame();
		obj.addEmp();
		obj.exitFrame();
		obj.logout();
		obj.closeApplication();
	}
}
