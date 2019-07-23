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
import org.openqa.selenium.support.ui.Select;

import com.training.generics.ScreenShot;
import com.training.pom.HomePagePOMETC1;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class SimpleTestCasesTest {


	private WebDriver driver; 
	private String baseUrl; 
	private HomePagePOMETC1 homePagePOMETC1;
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
		homePagePOMETC1 = new HomePagePOMETC1(driver);
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
		driver.findElement(By.partialLinkText("Sign up!")).click();
		homePagePOMETC1.sendregistrationfirstname("Gopal");
		homePagePOMETC1.sendregistrationlastname("Krishna");
		homePagePOMETC1.sendregistrationemail("gopal.krishna@gmail.com");
		homePagePOMETC1.sendUserName("kgopal");
		homePagePOMETC1.sendPass1("krishna");
		homePagePOMETC1.sendPass2("krishna"); 
		homePagePOMETC1.sendregistrationphone("9885589770"); 
		Select m= new Select(driver.findElement(By.id("registration_language")));
		m.selectByVisibleText("English");
		driver.findElement(By.xpath(".//*[@id='registration_submit']")).click();
		screenShot.captureScreenShot("First");
	
		
	}


}



