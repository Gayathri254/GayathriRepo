package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import pages.Data;

public class ProjectSpecificMethod {
	public String excelFileName;
	public String id1="";
	public String id2="";
		public static ChromeDriver driver;
		@BeforeMethod
		public void launchurl() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\gayathri\\eclipse-workspace\\PageObjectModel\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https:dev77567.service-now.com");
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		@AfterMethod
		public void closeApp() {
		driver.close();
		}
		@DataProvider(name="fetchData")
	public String[][] dataCentre() throws IOException {
		String[][] data = Data.readExcel(excelFileName);
	return data;

}
}
