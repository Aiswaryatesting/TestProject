package com.PageRepositary;
import org.openqa.selenium.By;


public class PageRepositary_callcentreRole {
	
	public By username= By.xpath("//html/body/div/html/body/section/div/div/div[2]/div/form/input[1]");
	public By password=By.xpath("//html/body/div/html/body/section/div/div/div[2]/div/form/input[2]");
	public By locators = By.xpath("/html/body/div/html/body/div/div[1]/div[1]");
	public By yes = By.xpath("/html/body/div/html/body/div/div[1]/div[2]/div/div/div/button[1]/span");
	public By submit = By.xpath("//html/body/div/html/body/section/div/div/div[2]/div/form/div[1]/button");                           
	public By sidemenu = By.xpath("/html/body/div/div[2]/body/div/div/nav/div/div/ul/li[2]/a/span[2]");
	public By role = By.xpath("//html/body/div/div[2]/body/div/div/nav/div/div/ul/li[2]/ul/li[2]/a/span");
	public By rolegrid = By.xpath("/html/body/div/div[2]/div[1]/div[4]/div/div/div/div[1]/div/table/thead/tr/th[1]/div/span");
    public By search = By.xpath("//html/body/div/div[2]/div[1]/div[3]/div/div/div/div/div/div/input");
	public By searchbutton = By.xpath("//button[normalize-space()='Search']");
	
	public By addrole = By.xpath("//html/body/div/div[2]/div[1]/div[3]/div/div/div/div/div/button[2]");
	public By rolename = By.name("RoleName");
	public By checkbox = By.xpath("//html/body/div/div[2]/div[1]/div[2]/form/div[2]/div/div/table/tbody/tr[7]/td[2]/table/tbody/tr[1]/td/input");
	
	public By checkboxone = By.xpath("//html/body/div/div[2]/div[1]/div[2]/form/div[2]/div/div/table/tbody/tr[7]/td[2]/table/tbody/tr[2]/td/input");
	public By savebutton = By.xpath("//button[normalize-space()='Save']");
    //public By validationmessage = By.xpath("//div[@class='rz-growl-message']");
	//div[@class='rz-growl-item']
	//public By validationmessage = By.xpath("//div[@class='rz-growl-message']");
	public By action= By.xpath("//span[normalize-space()='Action']");
	public By actions= By.xpath("//tbody/tr[1]/td[2]/span[1]/div[1]/button[1]/span[1]");
	public By  edit = By.xpath("//ul[contains(@class,'dropdown-menu show')]//button[contains(@type,'button')][normalize-space()='Edit']");
	public By checkboxtwo = By.xpath("//input[@id='37']");
	public By update = By.xpath("//button[normalize-space()='Save']");
	public By user = By.xpath("//a[@href='Admin/UserManagement']");
	public By usernamegrid = By.xpath("//span[normalize-space()='User Name']");
	public By Adduser = By.xpath("//a[normalize-space()='Add User']");
	public By submitbutton = By.xpath("//button[normalize-space()='Submit']");
	public By executive = By.xpath("//input[@id='AGAJlHwWQk']");
	public By name = By.xpath("//input[@id='DOwfFrKnbE']");
	public By email = By.name("Email");
	public By mobile = By.name("Mobile");
	public By Role = By.xpath("//html/body/div[1]/div[2]/div[1]/div[3]/div/form/div/div/div/div[5]/div/div/label");
	public By inputrole= By.xpath("//html/body/div[2]/div[1]/input");
}



