//12-April-2022

package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import com.hrms.lib.General;

public class Testing_031_EditEmployee
{
	//public static void main(String[] args)
	@Test
	public void EditEmp()
	{
		DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.enterFrame();
		obj.editEmp();
		obj.exitFrame();
		obj.logout();
		obj.closeApplication();
	}
}
