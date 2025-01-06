package com.PageRepositary;
import org.openqa.selenium.By;


public class PageRepositary_callcentreRole {
	
	public By username= By.xpath("//html/body/div/html/body/section/div/div/div[2]/div/form/input[1]");
	public By password=By.xpath("//html/body/div/html/body/section/div/div/div[2]/div/form/input[2]");
	public By submit = By.xpath("//html/body/div/html/body/section/div/div/div[2]/div/form/div[1]/button");                           
	public By sidemenu = By.xpath("/html/body/div/div[2]/body/div/div/nav/div/div/ul/li[2]/a/span[2]");
	public By role = By.xpath("//html/body/div/div[2]/body/div/div/nav/div/div/ul/li[2]/ul/li[2]/a/span");
	public By rolegrid = By.xpath("/html/body/div/div[2]/div[1]/div[4]/div/div/div/div[1]/div/table/thead/tr/th[1]/div/span");
	public By addrole = By.xpath("//html/body/div/div[2]/div[1]/div[3]/div/div/div/div/div/button[2]");
	public By rolename = By.name("RoleName");
	public By checkbox = By.xpath("//html/body/div/div[2]/div[1]/div[2]/form/div[2]/div/div/table/tbody/tr[7]/td[2]/table/tbody/tr[1]/td/input");
	
	public By checkboxone = By.xpath("//html/body/div/div[2]/div[1]/div[2]/form/div[2]/div/div/table/tbody/tr[7]/td[2]/table/tbody/tr[2]/td/input");
	public By savebutton = By.xpath("//button[normalize-space()='Save']");
    public By validationmessage = By.xpath("//div[@class='rz-growl-message']");
	public By action= By.xpath("//span[normalize-space()='Action']");
	public By search = By.xpath("//html/body/div/div[2]/div[1]/div[3]/div/div/div/div/div/div/input");
	
	//
	public By searchbutton = By.xpath("//button[normalize-space()='Search']");
	

	
}



