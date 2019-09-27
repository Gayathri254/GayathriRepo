package pages;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import base.ProjectSpecificMethod;

public class Testcase extends ProjectSpecificMethod {
	
		@BeforeClass
		public void setData() {
			excelFileName="TC002";
		}
		@Test(dataProvider="fetchData")
		public void Login(String name,String descp) throws InterruptedException {
		Login page =new Login();
		page.enterUsername()
		.enterPassword()
		.click()
		.filter()
		.create()
		.number()
		.callerid(name)
		.description( descp).clickSubmit().Check();
		
	
	
	
	
}
}





