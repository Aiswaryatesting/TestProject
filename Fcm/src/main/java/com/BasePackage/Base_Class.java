package com.BasePackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.PageRepositary.PageRepositary_callcentreRole;

import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {

	public static RemoteWebDriver driver = null;
	
	public WebDriver getDriver() {
		return driver;
	}
	PageRepositary_callcentreRole PageRepositary= new PageRepositary_callcentreRole();

	private static By L_username = By.xpath("//html/body/div/html/body/section/div/div/div[2]/div/form/input[1]");
	private static By L_password = By.xpath("//html/body/div/html/body/section/div/div/div[2]/div/form/input[2]");
	private static By L_signin = By.xpath("//html/body/div/html/body/section/div/div/div[2]/div/form/div[1]/button");
	private static By L_sidemenu = By.xpath("//html/body/div/div[2]/body/div/div/nav/div/div/ul/li[2]/a/span[2]");
	//private static By L_role = By.xpath("//html/body/div/div[2]/body/div/div/nav/div/div/ul/li[2]/ul/li[2]/a/span");
	/*private static By L_addrole =By.xpath("//html/body/div/div[2]/div[1]/div[3]/div/div/div/div/div/button[2]");
	private static By L_rolename = By.name("RoleName");
	private static By L_checkbox = By.xpath("//html/body/div/div[2]/div[1]/div[2]/form/div[2]/div/div/table/tbody/tr[7]/td[2]/table/tbody/tr[1]/td/input");
	private static By L_checkboxone = By.xpath("//html/body/div/div[2]/div[1]/div[2]/form/div[2]/div/div/table/tbody/tr[7]/td[2]/table/tbody/tr[2]/td/input");
	private static By L_savebutton = By.xpath("//button[normalize-space()='Save']");
	private static By L_validation = By.xpath("//div[@class='rz-growl-message");
	private static By L_action = By.xpath("//span[normalize-space()='Action']");
	private static By L_search = By.xpath("//html/body/div/div[2]/div[1]/div[3]/div/div/div/div/div/div/input"); */
	
	public static String Pagetitle;

	public static Properties configloader() throws IOException {
		FileInputStream File = new FileInputStream(".\\src\\test\\resources\\config.properties");
		Properties properties = new Properties();
		properties.load(File);
		return properties;
	}

public  void SetUp() throws IOException, InterruptedException {
		
		String Browser = configloader().getProperty("Browser");
		String Url = configloader().getProperty("URL");
		String UserName = configloader().getProperty("UserName");
		String Password = configloader().getProperty("Password");
		String rolename = configloader().getProperty("rolename");
		String search = configloader().getProperty("search");
		
		switch (Browser.toUpperCase()) {

		case "CHROME":

			ChromeOptions options = new ChromeOptions();
			//options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
			options.addArguments("--disable-extensions");
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\linita.shivalkar\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);		
			break;

		case "FIREFOX":

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();			
			break;

		default:
			System.err.println("The Driver is not defined");
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		Log.info("Driver has initialized successfully for "+Browser+"browser");
		driver.get(Url);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(9000);
		Pagetitle = driver.getTitle();
		Log.info("Title is displayed : "+Pagetitle);
		input(L_username, UserName);
		input(L_password, Password);
		click(L_signin);
		click(L_sidemenu);
		//click(L_role);
		/*click(L_addrole);
		click(L_rolename);
		input(L_rolename, rolename);
		click(L_checkbox);
		click(L_checkboxone);
		click(L_savebutton);
		click(L_action);
		click(L_search); 
		input(L_search, search); */
		//Thread.sleep(4000);
		//click(DesktopNot);
		//Thread.sleep(1000);


	}


public static  void input(By element, String Value) throws InterruptedException {


	WebDriverWait wait2 = new WebDriverWait(driver, 30);
	wait2.until(ExpectedConditions.presenceOfElementLocated(element)).sendKeys(Value);


}
public static  void click(By element) throws InterruptedException {

	Thread.sleep(2000);
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	Thread.sleep(2000);

}

public static boolean ElementDisplayed(By locator)
{
	WebElement element = driver.findElement(locator);
	Boolean flag = element.isDisplayed();
	return flag;
}

public void handlePopupDesktop() {
	try {
		WebElement popupElement = driver.findElement(PageRepositary.locators);
		if (popupElement.isDisplayed()) {
			System.out.println("Popup displayed for Desktop.. Clicking OK");
			driver.findElement(PageRepositary.yes).click();
			ExtentTestManager.getTest().log(Status.PASS, "Handled Desktop Notification Popup");
			Log.info("Handing Desktop Notification Popup");
		}
	} catch (Exception e) {
		System.out.println("Popup is not displayed for desktop");
	}
}
}




