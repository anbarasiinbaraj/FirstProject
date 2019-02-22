package com.maven.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	static WebDriver driver;
	@FindBy(id="radiobutton_0")
	private WebElement SelectRadioBtn;
	@FindBy(id="continue")
	private WebElement ClickcontinueBtn;

	@FindBy(xpath=("//tr/td/input[contains(@value,'Days')]"))
	private WebElement TC_108BVerification;
	@FindBy(xpath=("//tr/td/input[@name='price_night_0'][contains(@value,'AUD $ ')]"))
	private WebElement TC_108AVerification;
	@FindBy(xpath=("//tr/td/input[contains(@value,'Rooms')]"))
	private WebElement TC_108CVerification;
	@FindBy(xpath=("//tr/td/input[@name='total_price_0'][contains(@value,'AUD $ ')]"))
	private WebElement TC_108DVerification;

	public SelectHotel(WebDriver driver2) {
		WebDriver driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelectRadioBtn() {
		return SelectRadioBtn;
	}

	public WebElement getClickcontinueBtn() {
		return ClickcontinueBtn;
	}


	public WebElement getTC_108BVerification() {
		return TC_108BVerification;
	}

	public WebElement getTC_108AVerification() {
		return TC_108AVerification;
	}

	public WebElement getTC_108CVerification() {
		return TC_108CVerification;
	}

	public WebElement getTC_108DVerification() {
		return TC_108DVerification;
	}


}
