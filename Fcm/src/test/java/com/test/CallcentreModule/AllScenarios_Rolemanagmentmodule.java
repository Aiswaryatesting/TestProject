package com.test.CallcentreModule;



import java.io.File;
import java.io.IOException;
import java.util.Map;

//import org.openqa.selenium.By;
import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Pages_RoleModule.RoleManagmentModule;
import com.Pages_RoleModule.Addusermodule;

import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class AllScenarios_Rolemanagmentmodule extends Base_Class {
	com.Utility.ExcelReader ExcelReader;
	Base_Class Base_Class;
	Log log;
	TestListener TestListener;
	com.Utility.ScreenShot screenShot;
	RoleManagmentModule RoleManagmentModule;
	Addusermodule Addusermodule;

	//private static By userDropDown = By.xpath("//div[@id='userDropdown']/h4");
	//private static By L_signout = By.xpath("//button[@class='dropdown-item ' and contains(text(),'Sign out')]");
	
	@BeforeSuite
	public void reference() {
		ExcelReader = new com.Utility.ExcelReader("callcentrerole");
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		
		Base_Class = new Base_Class();
		
		RoleManagmentModule= new RoleManagmentModule();
		//Addusermodule = new Addusermodule();

	}

	@Test(dataProvider = "TestData")
	public void RUNALL(Map<Object, Object> testdata, ITestContext context) throws IOException, InterruptedException {

		try {

			if (testdata.get("Run").toString().equalsIgnoreCase("Yes")) {
				// TC_BAC_Login_Positive case
				ExtentTestManager.startTest(testdata.get("TestScenario").toString());
				Log.info("*** Running test method " + testdata.get("TestScenario").toString() + "...");
				context.setAttribute("fileName", "Login");
				Base_Class.SetUp();
				ExtentTestManager.getTest().log(Status.PASS,
						"Application Login" + com.BasePackage.Base_Class.Pagetitle);
				Log.info("Login successful !");
				Thread.sleep(3000);
				
//				String leaveType = testdata.get("Rolename").toString();
//				String fromYear = testdata.get("fromYear").toString();
//				String fromMonth = testdata.get("fromMonth").toString();
//				String fromDate = testdata.get("fromDate").toString();
//				String toYear = testdata.get("toYear").toString();
//				String toMonth = testdata.get("toMonth").toString();
//				String toDate = testdata.get("toDate").toString();
//				String duration = testdata.get("duration").toString();
//				String Reason = testdata.get("Reason").toString();
//				String Employee = testdata.get("Employee").toString();


			//PDF Restriction Error Displayed
			ExtentTestManager.startTest("TestScenario01 : Role management");
			Thread.sleep(3000);
			Log.info("before RoleManagmentModule !");
			boolean flag1 = RoleManagmentModule.clickOnfcmModule(); 
			Log.info("after RoleManagmentModule !");
			
			Thread.sleep(5000);
			ExtentTestManager.startTest("TestScenario01 : Role management");
			Thread.sleep(3000);
			Log.info("before RoleManagmentModule !");
			boolean flag2 = Addusermodule.Newusermodule(); 
			Log.info("after RoleManagmentModule !");
			
			Thread.sleep(5000);
			//ExtentTestManager.getTest().log(Status.PASS, "Validated Leave Request Form : " + flag1);
			//Log.info("Validated Leave Request Form : " + flag1);
			
			//ExtentTestManager.startTest("TestScenario02 : Leave Request Form");
			//Thread.sleep(3000);
			//Leave_LeaveRequest.selectLeaveType(leaveType);
			//Leave_LeaveRequest.leaveRequestForm(leaveType, fromYear, fromMonth, fromDate,toYear, toMonth, toDate, duration,Reason,Employee );
			//boolean flag2 = Leave_LeaveRequest.submitButton();
			//Thread.sleep(5000);
			//ExtentTestManager.getTest().log(Status.PASS, "Validated Leave Request Form : " + flag2);
			//Log.info("Validated Leave Request Form : " + flag2);
			
			//Thread.sleep(5000);
			// Logout
			/*ExtentTestManager.startTest("Application Logout Initiated.");
			context.setAttribute("fileName", "Logout");
			click(userDropDown);
			click(L_signout);
			Thread.sleep(2000);
			driver.quit();
			ExtentTestManager.getTest().log(Status.PASS, "Application Logout");
			Log.info("Logout is done!"); */

			// EndTest
			System.out.println(("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***"));
			ExtentTestManager.endTest();
			ExtentManager.getInstance().flush();
			Log.info("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***");

			}

			}
			catch (Exception e) {
			System.out.println("*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
			Log.error("*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
			Log.error("" + e.getMessage());
			String fileName = (String) context.getAttribute("fileName"); 

			try {
				File file = new com.Utility.ScreenShot(driver).takeScreenShot(fileName,
						testdata.get("TestScenario").toString());
				ExtentTestManager.getTest().fail(e.getMessage(),
						MediaEntityBuilder.createScreenCaptureFromPath(file.toString()).build());
			} catch (Exception e1) {
				System.out.println("File not found " + e1);
			}
			ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");

			// Logout
			context.setAttribute("fileName", "Logout");
			driver.quit();
			ExtentTestManager.getTest().log(Status.PASS, "Application Logout");
			Log.info("Logout is done");

			// EndTest
			System.out.println(("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***"));
			ExtentTestManager.endTest();
			ExtentManager.getInstance().flush();
			Log.info("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***");
		} catch (AssertionError e) {
			System.out.println("*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
			Log.error("*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
			Log.error("" + e.getMessage());
			String fileName = (String) context.getAttribute("fileName");

			try {
				File file = new com.Utility.ScreenShot(driver).takeScreenShot(fileName,
						testdata.get("TestScenario").toString());
				ExtentTestManager.getTest().fail(e.getMessage(),
						MediaEntityBuilder.createScreenCaptureFromPath(file.toString()).build());
			} catch (Exception e1) {
				System.out.println("File not found " + e1);
			}
			ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");

			// Logout
			context.setAttribute("fileName", "Logout");
			driver.quit();
			ExtentTestManager.getTest().log(Status.PASS, "Application Logout");
			Log.info("Logout is done");

			// EndTest
			System.out.println(("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***"));
			ExtentTestManager.endTest();
			ExtentManager.getInstance().flush();
			Log.info("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***");
		}

	}

	@DataProvider(name = "TestData")
	public static Object[][] gettestdate() throws IOException {

		Object[][] objectarry = null;
		java.util.List<Map<String, String>> completedata = com.Utility.ExcelReader.getdata();

		objectarry = new Object[completedata.size()][1];

		for (int i = 0; i < completedata.size(); i++) {
			objectarry[i][0] = completedata.get(i);
		}
		return objectarry;
	}

}

