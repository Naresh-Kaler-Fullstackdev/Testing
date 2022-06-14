//12-April-2022

package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import com.hrms.lib.General;

public class Testing_032_DelEmployee
{
	//public static void main(String[] args)
	@Test
	public void DelEmp()
	{
		DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.enterFrame();
		obj.delEmp();
		obj.exitFrame();
		obj.logout();
		obj.closeApplication();
	}
}
