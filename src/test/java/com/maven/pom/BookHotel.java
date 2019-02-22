package com.maven.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
 static WebDriver driver;
 
 @FindBy(id="first_name")
 private WebElement firstname ;
 @FindBy(id="last_name")
 private WebElement lastname ;
 @FindBy(id="address")
 private WebElement address ;	
 @FindBy(id="cc_num")
 private WebElement CreditCardNo ;	 
 @FindBy(id="cc_type")
 private WebElement CreditCardType ;	 
 @FindBy(id="cc_exp_month")
 private WebElement CcExpMonth ;	 
 @FindBy(id="cc_exp_year")
 private WebElement CcExpYear ;
 @FindBy(id="cc_cvv")
 private WebElement Cc_Cvv ;
 @FindBy(id="book_now")
 private WebElement BookNowBtn ;
@FindBy(xpath="//tr/td/input[@name='order_no']")
private WebElement TC_109Verification;
@FindBy(id="logout")
private WebElement LogOut ;
@FindBy(xpath=("//tr/td/input[contains(@value,'Day(s)')]"))
private WebElement TC_110Verification;
@FindBy(xpath=("//tr/td/input[contains(@value,'Room(s)')]"))
private WebElement TC_110CVerification;
@FindBy(xpath=("//tr/td/input[@name='final_price_dis'][contains(@value,'AUD $ ')]"))
private WebElement TC_110AVerification;
@FindBy(xpath=("//tr/td/input[@name='price_night_dis'][contains(@value,'AUD $ ')]"))
private WebElement TC_108AVerification;
@FindBy(xpath=("//tr/td/input[@name='total_price_dis'][contains(@value,'AUD $ ')]"))
private WebElement TC_108DVerification;
@FindBy(xpath=("//tr/td/input[@id='gst_dis'][contains(@value,'AUD $ ')]"))
private WebElement TC_110BVerification;

		
// tc111 verify
@FindBy(xpath=("//tr/td/input[contains(@value,'Hotel Sunshine')]"))
private WebElement hotelName ;
@FindBy(xpath=("//tr/td/input[contains(@value,'Sydney')]"))
private WebElement location;
@FindBy(xpath=("//tr/td/input[contains(@value,'Double')]"))
private WebElement roomtype;

public WebElement getFirstname() {
	return firstname;
}
public WebElement getLastname() {
	return lastname;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCreditCardNo() {
	return CreditCardNo;
}
public WebElement getCreditCardType() {
	return CreditCardType;
}
public WebElement getCcExpMonth() {
	return CcExpMonth;
}
public WebElement getCcExpYear() {
	return CcExpYear;
}
public WebElement getCc_Cvv() {
	return Cc_Cvv;
}
public WebElement getBookNowBtn() {
	return BookNowBtn;
}

	public BookHotel(WebDriver driver2) {
		WebDriver driver = driver2;
		PageFactory.initElements(driver, this);
}
	public WebElement getTC_109Verification() {
		return TC_109Verification;
	}
	public WebElement getLogOut() {
		return LogOut;
	}
	public WebElement getTC_110AVerification() {
		return TC_110AVerification;
	}
	public WebElement getTC_110BVerification() {
		return TC_110BVerification;
	}
	public WebElement getTC_110Verification() {
		return TC_110Verification;
	}
	public WebElement getTC_110CVerification() {
		return TC_110CVerification;
	}
	public WebElement getTC_108AVerification() {
		return TC_108AVerification;
	}
	public WebElement getTC_108DVerification() {
		return TC_108DVerification;
	}
	public WebElement getHotelName() {
		return hotelName;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}

}
