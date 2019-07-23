package com.training.sanity.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.training.generics.ScreenShot;
import com.training.pom.HomePagePOMETC2;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class SImpleTestCasesTest1 {


	private WebDriver driver; 
	private String baseUrl; 
	private HomePagePOMETC2 homePagePOMETC2;
	private static Properties properties; 
	private ScreenShot screenShot; 


	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);	
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		homePagePOMETC2 = new HomePagePOMETC2(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		driver.get(baseUrl);	
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();	
	}

	@Test
	public void SimpleTestCasesTest() {
		homePagePOMETC2.sendUsername("kgopal");
		homePagePOMETC2.sendPassword("krishna");
		driver.findElement(By.xpath(".//*[@id='form-login_submitAuth']")).click();
		screenShot.captureScreenShot("First");
	}
}
