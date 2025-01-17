package com.Pages_RoleModule;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.BasePackage.Base_Class;
import com.PageRepositary.PageRepositary_callcentreRole;
import com.extentReports.ExtentTestManager;

public class RoleManagmentModule extends Base_Class {
	PageRepositary_callcentreRole PageRepositary= new PageRepositary_callcentreRole();
	
	public boolean clickOnfcmModule() throws IOException, InterruptedException 
	{
	
		/*click(PageRepositary.username);
		Thread.sleep(1000);
		click(PageRepositary.password);
		Thread.sleep(1000);
		click(PageRepositary.submit);
		Thread.sleep(2000); */
		
		handlePopupDesktop();
		
	
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.presenceOfElementLocated(PageRepositary.sidemenu));
		System.out.println("testing");
		 System.out.println(ExpectedConditions.presenceOfElementLocated(PageRepositary.sidemenu));
		click(PageRepositary.sidemenu);
		Thread.sleep(1000);
		
		WebDriverWait wait3 = new WebDriverWait(driver, 30);
		wait3.until(ExpectedConditions.presenceOfElementLocated(PageRepositary.role));
		System.out.println("clickrole");
		 System.out.println(ExpectedConditions.presenceOfElementLocated(PageRepositary.role));
		click(PageRepositary.role);
		Thread.sleep(20000);
		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		wait2.until(ExpectedConditions.presenceOfElementLocated(PageRepositary.action));
		System.out.println("clickaction");
		ElementDisplayed(PageRepositary.action);
		Thread.sleep(20000);
		WebDriverWait wait9 = new WebDriverWait(driver, 30);
		wait9.until(ExpectedConditions.presenceOfElementLocated(PageRepositary.rolegrid));
		System.out.println("clickaction");
		ElementDisplayed(PageRepositary.rolegrid);
		Thread.sleep(2000);
		
		 /*WebDriverWait wait11 = new WebDriverWait(driver, 30);
			wait11.until(ExpectedConditions.presenceOfElementLocated(PageRepositary.action));
			System.out.println("clickaction");
			ElementDisplayed(PageRepositary.action);
			WebDriverWait wait13 = new WebDriverWait(driver, 30);
			wait13.until(ExpectedConditions.presenceOfElementLocated(PageRepositary.rolegrid));
			System.out.println("clickaction");
			ElementDisplayed(PageRepositary.rolegrid);
			Thread.sleep(2000);*/
			
		
		WebDriverWait wait4 = new WebDriverWait(driver, 30);
		wait4.until(ExpectedConditions.presenceOfElementLocated(PageRepositary.addrole));
		System.out.println("click addrole");
		 System.out.println(ExpectedConditions.presenceOfElementLocated(PageRepositary.addrole));
		click(PageRepositary.addrole);
		Thread.sleep(10000);
		
		WebDriverWait wait5 = new WebDriverWait(driver, 30);
		wait5.until(ExpectedConditions.presenceOfElementLocated(PageRepositary.rolename));
		System.out.println("click addrole");
		 System.out.println(ExpectedConditions.presenceOfElementLocated(PageRepositary.rolename));
		click(PageRepositary.rolename);
		input(PageRepositary.rolename , "rolecalling100");
		//input(PageRepositary.rolename);
		
		Thread.sleep(1000);
		
		WebDriverWait wait6 = new WebDriverWait(driver, 30);
		wait6.until(ExpectedConditions.presenceOfElementLocated(PageRepositary.checkbox));
		click(PageRepositary.checkbox);
		Thread.sleep(1000);
		
		WebDriverWait wait7 = new WebDriverWait(driver, 30);
		wait7.until(ExpectedConditions.presenceOfElementLocated(PageRepositary.checkboxone));
		click(PageRepositary.checkboxone);
		Thread.sleep(1000);
		
		WebDriverWait wait8 = new WebDriverWait(driver, 30);
		wait8.until(ExpectedConditions.presenceOfElementLocated(PageRepositary.savebutton));
		click(PageRepositary.savebutton);
		Thread.sleep(50000);
		
		/*WebDriverWait wait10 = new WebDriverWait(driver, 200);
		wait10.until(ExpectedConditions.presenceOfElementLocated(PageRepositary.validationmessage));
		 Thread.sleep(5000);
		String actualMessage = driver.findElement(PageRepositary.validationmessage).getText();
		System.out.println(actualMessage);
        String expectedMessage = ("Record Saved Successfully") ;
        Assert.assertEquals(expectedMessage, actualMessage);
        System.out.println(expectedMessage);
        Thread.sleep(5000); */
        
        //search 
        
        WebDriverWait wait12 = new WebDriverWait(driver, 30);
		wait12.until(ExpectedConditions.presenceOfElementLocated(PageRepositary.search));
		//System.out.println("click addrole");
		 //System.out.println(ExpectedConditions.presenceOfElementLocated(PageRepositary.rolename));
		click(PageRepositary.search);
		input(PageRepositary.search , "rolecalling");
		Thread.sleep(1000);
		WebDriverWait wait14 = new WebDriverWait(driver, 30);
		wait14.until(ExpectedConditions.presenceOfElementLocated(PageRepositary.searchbutton));
		//System.out.println("click addrole");
		 //System.out.println(ExpectedConditions.presenceOfElementLocated(PageRepositary.rolename));
		click(PageRepositary.searchbutton);
		Thread.sleep(10000);
		
		// update 
		 WebDriverWait wait13 = new WebDriverWait(driver, 30);
			wait13.until(ExpectedConditions.presenceOfElementLocated(PageRepositary.actions));
			//System.out.println("click addrole");
			 //System.out.println(ExpectedConditions.presenceOfElementLocated(PageRepositary.rolename));
			click(PageRepositary.actions);
			click(PageRepositary.edit);
			//click(PageRepositary.checkboxtwo);
			Thread.sleep(1000);
			
	 // updatebutton 
			WebDriverWait wait16 = new WebDriverWait(driver, 30);
			wait16.until(ExpectedConditions.presenceOfElementLocated(PageRepositary.checkboxtwo));
			click(PageRepositary.checkboxtwo);
			Thread.sleep(1000);
			WebDriverWait wait15 = new WebDriverWait(driver, 30);
			wait15.until(ExpectedConditions.presenceOfElementLocated(PageRepositary.update));
			//System.out.println("click addrole");
			 //System.out.println(ExpectedConditions.presenceOfElementLocated(PageRepositary.rolename));
			click(PageRepositary.update);
			WebDriverWait wait11 = new WebDriverWait(driver, 30);
			wait11.until(ExpectedConditions.presenceOfElementLocated(PageRepositary.action));
			System.out.println("clickaction");
			ElementDisplayed(PageRepositary.action);
			
			Thread.sleep(1000);
		
		return true;
		
		
		
		
	}		
	
	public void handlePopupDesktop() {
		try {
			System.out.println("before......Handled Desktop Notification Popup");
			WebElement popupElement = driver.findElement(PageRepositary.locators);
			if (popupElement.isDisplayed()) {
				System.out.println("Popup displayed for Desktop.. Clicking OK");
				driver.findElement(PageRepositary.yes).click();
				System.out.println("Handled Desktop Notification Popup");
				login();
//				ExtentTestManager.getTest().log(Status.PASS, "Handled Desktop Notification Popup");
//				Log.info("Handing Desktop Notification Popup");
			}
		} catch (Exception e) {
			System.out.println("Popup is not displayed for desktop");
		}
		
	}
}







