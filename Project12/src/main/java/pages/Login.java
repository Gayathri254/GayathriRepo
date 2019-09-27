package pages;

import base.ProjectSpecificMethod;

public class Login extends ProjectSpecificMethod {
	
	public Login() {
		
	}
	public Login enterUsername()  {
		driver.switchTo().frame(0);
		driver.findElementByXPath("//input[@name='user_name']").sendKeys("admin");
		return this;
	}
	public Login enterPassword() {
		driver.findElementById("user_password").sendKeys("India@123");
		return this;
	}
	public  Home  click() {
		driver.findElementById("sysverb_login").click();
		return new Home();	
	
	
	
	
	
	}
}
	


