package com.maven.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	static WebDriver driver;
	
	//tr/td/span[text()='Check-In Date shall be before than Check-Out Date']
	@FindBy(xpath=("//tr/td/span[text()='Check-In Date shall be before than Check-Out Date']"))
	private WebElement TC_102Verification;
	@FindBy(xpath=("//tr/td/span[text()='Check-In Date should be either Today or Later Date']"))
	private WebElement TC_103Verification;	
	@FindBy(xpath=("//tr/td/input[contains(@value,'Sydney')]"))
	private WebElement TC_104Verification;
//	value="Sydney"
	@FindBy(xpath=("//tr/td/input[contains(@value,'24/02/2019')]"))
	private WebElement TC_105AVerification;
	@FindBy(xpath=("//tr/td/input[contains(@value,'26/02/2019')]"))
	private WebElement TC_105BVerification;
	@FindBy(xpath=("//tr/td/input[contains(@value,'Rooms')]"))
	private WebElement TC_106Verification;
//	value="Deluxe"
	@FindBy(xpath=("//tr/td/input[contains(@value,'Double')]"))
	private WebElement TC_107Verification;
	@FindBy(xpath=("//input[contains(@value,'Hello')]"))
	private WebElement LoginVerification;
	
	@FindBy(xpath=("//tbody/tr/td[text()='Search Hotel ']"))
	private WebElement SearchHotelPgVp;
	@FindBy(xpath=("//select[@name='location']"))
	private WebElement SelectLocation;
	@FindBy(name="hotels")
	private WebElement SelectHotel;
	@FindBy(id="room_type")
	private WebElement SelectRoomType;
	@FindBy(id="room_nos")
	private WebElement SelectRoomNos;
	@FindBy(name="datepick_in")
	private WebElement CheckinDate;
	@FindBy(id="datepick_out")
	private WebElement CheckOutDate;
	@FindBy(name="adult_room")
	private WebElement AdultRoom;
	@FindBy( id="child_room")
	private WebElement ChildRoom;
	@FindBy( id="Submit")
	private WebElement SearchBtn;
	@FindBy( xpath="//td/a[text()='Logout']")
	private WebElement Logout;
	

	public WebElement getSearchHotelPgVp() {
		return SearchHotelPgVp;
	}
	public WebElement getSelectLocation() {
		return SelectLocation;
	}
	public WebElement getSelectHotel() {
		return SelectHotel;
	}
	public WebElement getSelectRoomType() {
		return SelectRoomType;
	}
	public WebElement getSelectRoomNos() {
		return SelectRoomNos;
	}
	public WebElement getCheckinDate() {
		return CheckinDate;
	}
	public WebElement getCheckOutDate() {
		return CheckOutDate;
	}
	public WebElement getAdultRoom() {
		return AdultRoom;
	}
	public WebElement getChildRoom() {
		return ChildRoom;
	}
	public WebElement getSearchBtn() {
		return SearchBtn;
	}
	public SearchHotel(WebDriver driver2) {
		WebDriver driver = driver2;
		PageFactory.initElements(driver, this);
}
	public WebElement getTC_102Verification() {
		return TC_102Verification;
	}
	public WebElement getLoginVerification() {
		return LoginVerification;
	}
	public WebElement getLogout() {
		return Logout;
	}
	public WebElement getTC_103Verification() {
		return TC_103Verification;
	}
	public WebElement getTC_104Verification() {
		return TC_104Verification;
	}
	public WebElement getTC_105AVerification() {
		return TC_105AVerification;
	}
	public WebElement getTC_105BVerification() {
		return TC_105BVerification;
	}
	public WebElement getTC_106Verification() {
		return TC_106Verification;
	}
	public WebElement getTC_107Verification() {
		return TC_107Verification;
	}	
	
	/*
	<option value="Melbourne">Melbourne</option>
	<option value="Hotel Creek">Hotel Creek</option>
	<option value="Standard">Standard</option>
	<option value="2">2 - Two</option>
			<input  
			<input name="todate_in" type="hidden" id="todate_in" value="16/02/2019">
			name="adult_room"
					<option value="2">2 - Two</option>
					<option value="1" selected="selected">1 - One</option>
			<select name="child_room" id="child_room" class="search_combobox">
            <option value="">- Select Children per Room -</option>
            <option value="1">1 - One</option>
          </select>
          <input type="submit" name="Submit" id="Submit" class="reg_button" value="Search">*/
}
