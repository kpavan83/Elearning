package com.training.pom;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOMETC1 {
	private WebDriver driver; 

	public HomePagePOMETC1(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="Sign up!")
	private WebElement Signup;

	@FindBy(id="registration_firstname")
	private WebElement registration_firstname; 

	@FindBy(id="registration_lastname")
	private WebElement registration_lastname;

	@FindBy(id="registration_email")
	private WebElement registration_email;

	@FindBy(id="username")
	private WebElement username;

	@FindBy(id="pass1")
	private WebElement pass1;

	@FindBy(id="pass2")
	private WebElement pass2;

	@FindBy(id="registration_phone")
	private WebElement registration_phone;

	@FindBy(id="registration_language")
	private WebElement registration_language;

	@FindBy(id="registration_submit")
	private WebElement registration_submit; 

	public void sendregistrationfirstname(String registration_firstname) {
		this.registration_firstname.clear();
		this.registration_firstname.sendKeys(registration_firstname);	
	}
	public void sendregistrationlastname(String registration_lastname) {
		this.registration_lastname.clear(); 
		this.registration_lastname.sendKeys(registration_lastname); 	
	}
	public void sendregistrationemail(String registration_email) {
		this.registration_email.clear();
		this.registration_email.sendKeys(registration_email);	
	}
	public void sendUserName(String username) {
		this.username.clear();
		this.username.sendKeys(username);	
	}
	public void sendPass1(String pass1) {
		this.pass1.clear();
		this.pass1.sendKeys(pass1);	
	}
	public void sendPass2(String pass2) {
		this.pass2.clear();
		this.pass2.sendKeys(pass2);	
	}
	public void sendregistrationphone(String registration_phone) {
		this.registration_phone.clear();
		this.registration_phone.sendKeys(registration_phone);	
	}
	public void sendregistrationlanguage(String registration_language) {
		this.registration_language.clear();
		this.registration_language.sendKeys(registration_language);	
	}
	public void clickregistrationSubmit(String registration_submit) {
		this.registration_submit.click(); 	
	}
}


