package com.Pages_RoleModule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.BasePackage.Base_Class;
import com.PageRepositary.PageRepositary_callcentreRole;
import com.extentReports.ExtentTestManager;

public class Addusermodule extends Base_Class {
	PageRepositary_callcentreRole PageRepositary= new PageRepositary_callcentreRole();
	
	public boolean Newusermodule() throws InterruptedException 
	{
	
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.presenceOfElementLocated(PageRepositary.sidemenu));
		System.out.println("testing");
		 System.out.println(ExpectedConditions.presenceOfElementLocated(PageRepositary.sidemenu));
		click(PageRepositary.sidemenu);
		Thread.sleep(1000);
		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		wait2.until(ExpectedConditions.presenceOfElementLocated(PageRepositary.user));
		System.out.println("testing");
		 System.out.println(ExpectedConditions.presenceOfElementLocated(PageRepositary.user));
		click(PageRepositary.user);
		Thread.sleep(1000);
		WebDriverWait wait4 = new WebDriverWait(driver, 30);
		wait4.until(ExpectedConditions.presenceOfElementLocated(PageRepositary.usernamegrid));
		System.out.println("testing");
		// System.out.println(ExpectedConditions.presenceOfElementLocated(PageRepositary.Adduser));
		click(PageRepositary.usernamegrid);
		Thread.sleep(1000);
		WebDriverWait wait3 = new WebDriverWait(driver, 30);
		wait3.until(ExpectedConditions.presenceOfElementLocated(PageRepositary.Adduser));
		System.out.println("testing");
		 System.out.println(ExpectedConditions.presenceOfElementLocated(PageRepositary.Adduser));
		click(PageRepositary.Adduser);
		Thread.sleep(1000);
		return true;	
			
	}	
	
	public boolean submitbutton() throws InterruptedException {
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.presenceOfElementLocated(PageRepositary.submitbutton));
		System.out.println("testing");
		 //System.out.println(ExpectedConditions.presenceOfElementLocated(PageRepositary.executive));
		click(PageRepositary.submitbutton);
		
		Thread.sleep(1000);
		
		return true;
	}
	public boolean enterexecutive() throws InterruptedException {
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.presenceOfElementLocated(PageRepositary.executive));
		System.out.println("testing");
		 //System.out.println(ExpectedConditions.presenceOfElementLocated(PageRepositary.executive));
		click(PageRepositary.executive);
		input(PageRepositary.executive , "100789");
		Thread.sleep(1000);
		
		return true;
	}

	public boolean entername() throws InterruptedException {
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.presenceOfElementLocated(PageRepositary.name));
		System.out.println("testing");
		 //System.out.println(ExpectedConditions.presenceOfElementLocated(PageRepositary.executive));
		click(PageRepositary.name);
		input(PageRepositary.name , "fullpowercallcentre");
		Thread.sleep(1000);
		
		return true;
	}
	public boolean email() throws InterruptedException {
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.presenceOfElementLocated(PageRepositary.email));
		System.out.println("testing");
		 //System.out.println(ExpectedConditions.presenceOfElementLocated(PageRepositary.executive));
		click(PageRepositary.email);
		input(PageRepositary.email , "fullpowercallcentre@gmail.com");
		Thread.sleep(1000);
		click(PageRepositary.mobile);
		input(PageRepositary.mobile , "5645454545");
		click(PageRepositary.inputrole);
		
		Thread.sleep(1000);
		
		return true;
	}
	
	
	
	
	
	
}








