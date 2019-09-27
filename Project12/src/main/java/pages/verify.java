package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import base.ProjectSpecificMethod;

public class verify extends ProjectSpecificMethod {
	public verify(){
	}
	

	public verify Check() throws InterruptedException
	{
		
		Thread.sleep(3000);
		WebElement search = driver.findElementByXPath("(//span//input[contains(@class,'form-control')])[1]");
		search.click();
		System.out.println("Clicked");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		String id2 = driver.findElementByXPath("(//*[@class='linked formlink'])").getText();
		System.out.println(id2);

		
			if(id1.equals(id2))
			{
				System.out.println("Completed");
			}
			else

			{
				System.out.println("Not completed");
			}
			return this;
		} 

	}
