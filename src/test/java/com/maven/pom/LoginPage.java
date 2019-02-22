package com.maven.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	static WebDriver driver;
	
	@FindBy(name="username")
	private WebElement LoginUser;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="login")
	private WebElement LoginBTN;
	public LoginPage(WebDriver driver2) {
		WebDriver driver = driver2;
		PageFactory.initElements(driver, this);

}
	
	public WebElement getLoginUser() {
		return LoginUser;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginBTN() {
		return LoginBTN;
	}
	
}
