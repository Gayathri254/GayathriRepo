package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import base.ProjectSpecificMethod;

public class Incident extends ProjectSpecificMethod  {
	public Incident number() throws InterruptedException
	{ 
	
		driver.switchTo().frame(0);
		WebElement number = driver.findElementById("incident.number");
		String numberid = number.getAttribute("value");
		System.out.println(numberid);
return this;
	}
	public Incident callerid(String name) throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement find = driver.findElementByXPath("//input[@name='sys_display.incident.caller_id']");
		find.click();
		find.sendKeys(name);
		Thread.sleep(3000);
		return this;
	}
	public Incident description(String descp)
	{
		driver.findElementByXPath("//input[@id='incident.short_description']").sendKeys(descp);
	   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    return this;
	}
	public verify clickSubmit()
	{
		driver.findElementByXPath("(//button[@id='sysverb_insert'])[1]").click();
	return new verify();
}
}