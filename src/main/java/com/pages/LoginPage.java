package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="email")
	WebElement txt_Username;
	
	@FindBy(id="password")
	WebElement txt_Password;
	
	@FindBy(xpath="//button")
	WebElement sign_In_Btn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void username(String uname) {
		txt_Username.sendKeys(uname);
	}
	
	public void password(String pass) {
		txt_Password.sendKeys(pass);
	}
	
	public void signInClick() {
		sign_In_Btn.click();
	}
}
