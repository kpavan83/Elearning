package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOMETC3 {
	private WebDriver driver; 

	public HomePagePOMETC3(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="login")
	private WebElement userName; 

	@FindBy(id="password")
	private WebElement password;

	@FindBy(id="form-login_submitAuth")
	private WebElement login_submitAuth; 

	@FindBy(id="Edit profile")
	private WebElement Editprofile;

	@FindBy(id="profile_password0")
	private WebElement profile_password0;

	@FindBy(id="password1")
	private WebElement password1;

	@FindBy(id="profile_password2")
	private WebElement profile_password2;

	@FindBy(id="profile_apply_change")
	private WebElement profile_apply_change;


	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}

	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}

	public void sendprofile_password0(String profile_password0) {
		this.profile_password0.clear(); 
		this.profile_password0.sendKeys(profile_password0); 
	}

	public void sendPassword1(String password1) {
		this.password1.clear(); 
		this.password1.sendKeys(password1); 
	}

	public void sendPassword2(String profile_password2) {
		this.profile_password2.clear(); 
		this.profile_password2.sendKeys(profile_password2); 
	}

	public void sendprofile_apply_change(String profile_apply_change) {
		this.profile_apply_change.clear(); 
		this.profile_apply_change.sendKeys(profile_apply_change); 
	}

}





