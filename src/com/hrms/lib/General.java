//12-April-2022

package com.hrms.lib;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrms.utility.log;

import org.openqa.selenium.By;

public class General extends Global
{
	//standard rule: to provide all re-usable functions/methods related to whole application
	public void openApplication()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Naresh_Dell Laptop\\Projects\\Project_14_Full Stack Java Developer\\Naresh IT\\Notes\\08_Testing\\Drivers\\chromedriver_win32_102\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened");
		Reporter.log("Application Opened");
		log.info("Application Opened");
	}
	public void closeApplication()
	{
		driver.close();
		System.out.println("Application Closed");
		Reporter.log("Application Closed");
		log.info("Application Closed");
	}
	public void login()
	{
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login Successful");
		Reporter.log("Login Successful");
		log.info("Login Successful");
	}
	public void logout()
	{
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout Successful");
		Reporter.log("Logout Successful");
		log.info("Logout Successful");
	}
	public void enterFrame()
	{
		driver.switchTo().frame(frm_frame);
		System.out.println("Entered into frame");
		Reporter.log("Entered into frame");
		log.info("Entered into frame");
	}
	public void exitFrame()
	{
		driver.switchTo().defaultContent();
		System.out.println("Exited from frame");
		Reporter.log("Exited from frame");
		log.info("Exited from frame");
	}
	public void addEmp()
	{
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.name(txt_fn)).sendKeys(fn);
		driver.findElement(By.name(txt_mn)).sendKeys(mn);
		driver.findElement(By.name(txt_ln)).sendKeys(ln);
		driver.findElement(By.id("btnEdit")).click();
		System.out.println("New Employee Added");
		Reporter.log("New Employee Added");
		log.info("New Employee Added");
	}
	
	  public void editEmp()
	  {
		  Select st = new Select(driver.findElement(By.name("loc_code")));
		  st.selectByValue("2");
		  driver.findElement(By.name("loc_name")).sendKeys("Fullstackdev");
		  driver.findElement(By.xpath("//input[@value='Search']")).click();
		  driver.findElement(By.linkText("Naresh Kaler Fullstackdev")).click();
		  driver.findElement(By.id("btnEditPers")).click();
		  driver.findElement(By.name("txtEmpLastName")).clear();
		  driver.findElement(By.name("txtEmpLastName")).sendKeys("Fullstackjavadev");
		  driver.findElement(By.name("EditMain")).click();
		  System.out.println("Edited employee details");
		  Reporter.log("Edited employee details");
		  log.info("Edited employee details");
	  }

	  public void delEmp()
	  {
		  Select st = new Select(driver.findElement(By.name("loc_code")));
		  st.selectByValue("2");
		  driver.findElement(By.name("loc_name")).sendKeys("Fullstackjavadev");
		  driver.findElement(By.xpath("//input[@value='Search']")).click();
		  driver.findElement(By.name("chkLocID[]")).click();
		  driver.findElement(By.xpath("//input[@value='Delete']")).click();
		  System.out.println("Employee deleted");
		  Reporter.log("Employee deleted");
		  log.info("Employee deleted");
	  } 
}
