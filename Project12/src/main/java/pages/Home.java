package pages;

import base.ProjectSpecificMethod;

public class Home extends ProjectSpecificMethod{
	public Home filter() throws InterruptedException 
	{
	driver.findElementByXPath("//input[@id='filter']").sendKeys("Incident");
	Thread.sleep(3000);
	return this;
	}
	public Incident create() throws InterruptedException
	{
		Thread.sleep(3000);	
	driver.findElementByXPath("(//div[text()='Create New'])[1]").click();
	Thread.sleep(3000);
	return new Incident();
}}