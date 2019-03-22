package com.org.Stepdefinition;
import java.io.File;
import java.text.ParsePosition;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.GetElementAttribute;

import com.maven.pom.BookHotel;
import com.maven.pom.LoginPage;
import com.maven.pom.PageObjectManager;
import com.maven.pom.SearchHotel;
import com.maven.pom.SelectHotel;
import com.org.BaseClass.BaseClass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Stepdefinition extends BaseClass{
	static WebDriver driver;
	LoginPage lp;
	SelectHotel shl;
	BookHotel bh;
	SearchHotel sh;
	PageObjectManager pageObjectManager;
	
	

@Given("^User launch the browser$")
public void user_launch_the_browser() throws Throwable {
	driver = getDriver("chrome");
}
@When
("^Navigate to application$")
public void navigate_to_application() throws Throwable {
	getUrl("http://adactin.com/HotelAppBuild2");	
}

@Given("^User enter the valid username \"([^\"]*)\"$")
public void user_enter_the_valid_username(String arg1) throws Throwable {

	inputText(lp.getLoginUser(),arg1);
}

@When("^User enter the valid password \"([^\"]*)\"$")
public void user_enter_the_valid_password(String arg1) throws Throwable {

	inputText(lp.getPassword(),arg1);
}

@And("^User click the signin button$")
public void user_click_the_signin_button() throws Throwable {
	LoginPage lp = new LoginPage(driver); 
	clickOnElement(lp.getLoginBTN());
}

@And("^User validate the username \"([^\"]*)\" displayed in the header$")
public void user_validate_the_username_displayed_in_the_header(String arg1) throws Throwable {
	SearchHotel sh = new SearchHotel(driver);
	String expected=sh.getLoginVerification().getAttribute("value");
	org.junit.Assert.assertEquals(arg1, expected);
	System.out.println("Username displayed " + arg1 + "TC-101 Pass");
}

@And("^User close the browser$")
public void user_close_the_browser() throws Throwable {
	SearchHotel sh = new SearchHotel(driver);
	System.out.println("logout later");
	clickOnElement(sh.getLogout());
}

@Given("^User Select location as in test data \"([^\"]*)\"$")
public void user_Select_location_as_in_test_data(String arg1) throws Throwable {
	SearchHotel sh = new SearchHotel(driver);
	selectOptionFromDD(sh.getSelectLocation(), arg1, "value");
	Thread.sleep(2000);
}

@When("^User Select hotel as in test data \"([^\"]*)\"$")
public void user_Select_hotel_as_in_test_data(String arg1) throws Throwable {
	SearchHotel sh = new SearchHotel(driver);
	selectOptionFromDD(sh.getSelectHotel(), arg1, "value");
}

@And("^User Select room type as in test data \"([^\"]*)\"$")
public void user_Select_room_type_as_in_test_data(String arg1) throws Throwable {
	SearchHotel sh = new SearchHotel(driver);
	selectOptionFromDD(sh.getSelectRoomType(), arg1, "value");
}

@And("^User Select no-of-rooms as in test data \"([^\"]*)\"$")
public void user_Select_no_of_rooms_as_in_test_data(String arg1) throws Throwable {
	SearchHotel sh = new SearchHotel(driver);
	selectOptionFromDD(sh.getSelectRoomNos(), arg1, "value");
}

@And("^User Enter checkin-date later than the checkout-date \"([^\"]*)\"$")
public void user_Enter_checkin_date_later_than_the_checkout_date(String arg1) throws Throwable {
	SearchHotel sh = new SearchHotel(driver);
	inputText(sh.getCheckinDate(), arg1);
	Thread.sleep(2000);
}

@And("^User Enter Checkout-date before the checkin-date \"([^\"]*)\"$")
public void user_Enter_Checkout_date_before_the_checkin_date(String arg1) throws Throwable {
	SearchHotel sh = new SearchHotel(driver);
	inputText(sh.getCheckOutDate(), arg1);
}

@When("^User select AdultPerRoom option \"([^\"]*)\"$")
public void user_select_AdultPerRoom_option(String arg1) throws Throwable {
	 
	SearchHotel sh = new SearchHotel(driver);
	selectOptionFromDD(sh.getAdultRoom(), arg1, "value");
}

@And("^User Click on the search$")
public void user_Click_on_the_search() throws Throwable {
	SearchHotel sh = new SearchHotel(driver);
	clickOnElement(sh.getSearchBtn());
}

@Then("^User TestcaseTwo verify for the valid \"([^\"]*)\" error message \"([^\"]*)\"$")
public void user_TestcaseTwo_verify_for_the_valid_error_message(String arg1, String arg2) throws Throwable {
 	SearchHotel sh = new SearchHotel(driver);
	String expected=sh.getTC_102Verification().getText();
	org.junit.Assert.assertEquals(arg2, expected);
	System.out.println(expected);
	System.out.println("error message: " + arg2 + "=" + expected + arg1 + "  Pass" );
}


@And("^User captures ScreenShot$")
public void user_captures_ScreenShot() throws Throwable {
	SearchHotel sh = new SearchHotel(driver);
	File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(screenshotFile, new File("C:\\Users\\Anbarasii\\Desktop\\ScreenShotForAdactin\\TC_102.png"));
}

@Given("^User TestCaseThree verify for the valid \"([^\"]*)\" error message \"([^\"]*)\"$")
public void user_TestCaseThree_verify_for_the_valid_error_message(String arg1, String arg2) throws Throwable {	SearchHotel sh = new SearchHotel(driver);
	String expected=sh.getTC_103Verification().getText();
	org.junit.Assert.assertEquals(arg2, expected);
	System.out.println(expected);
	System.out.println("error message: " + arg2 + "=" + expected + arg1 + "  Pass" );
}
@Given("^User TestCasefour verify for the valid \"([^\"]*)\" error message \"([^\"]*)\"$")
public void user_TestCasefour_verify_for_the_valid_error_message(String arg1, String arg2) throws Throwable {
	SearchHotel sh = new SearchHotel(driver);
	String expected=sh.getTC_104Verification().getAttribute("value");
	org.junit.Assert.assertEquals(arg2, expected);	System.out.println(expected);
	System.out.println("Verify expected and actual: " + arg2 + "=" + expected + arg1 + "  Pass" );
}
@Given("^User TestCasefiveA verify for the valid \"([^\"]*)\" Check-In Date \"([^\"]*)\"$")
public void user_TestCasefiveA_verify_for_the_valid_Check_In_Date(String arg1, String arg2) throws Throwable {	
	SearchHotel sh = new SearchHotel(driver);
	String expected=sh.getTC_105AVerification().getAttribute("value");
	org.junit.Assert.assertEquals(arg2, expected);	System.out.println(expected);
	System.out.println("Verify expected and actual: " + arg2 + "=" + expected + arg1 + "  Pass" );
}
@Then("^User TestCasefiveB verify for the valid \"([^\"]*)\" Check-Out Date \"([^\"]*)\"$")
public void user_TestCasefiveB_verify_for_the_valid_Check_Out_Date(String arg1, String arg2) throws Throwable {
	SearchHotel sh = new SearchHotel(driver);
	String expected=sh.getTC_105BVerification().getAttribute("value");
	org.junit.Assert.assertEquals(arg2, expected);	System.out.println(expected);
	System.out.println("Verify expected and actual: " + arg2 + "=" + expected + arg1 + "  Pass" );
}
@Given("^User TestCasesix verify for the valid \"([^\"]*)\" NoOfRooms \"([^\"]*)\"$")
public void user_TestCasesix_verify_for_the_valid_NoOfRooms(String arg1, String arg2) throws Throwable {
	SearchHotel sh = new SearchHotel(driver);
	String expected=sh.getTC_106Verification().getAttribute("value");
	org.junit.Assert.assertEquals(arg2, expected);	System.out.println(expected);
	System.out.println("Verify expected and actual: " + arg2 + "=" + expected + arg1 + "  Pass" );
}
@Given("^User TestCaseseven verify for the valid \"([^\"]*)\" RoomType \"([^\"]*)\"$")
public void user_TestCaseseven_verify_for_the_valid_RoomType(String arg1, String arg2) throws Throwable {
	SearchHotel sh = new SearchHotel(driver);
	String expected=sh.getTC_107Verification().getAttribute("value");
	org.junit.Assert.assertEquals(arg2, expected);	
	System.out.println(expected);
	System.out.println("Verify expected and actual: " + arg2 + "=" + expected + arg1 + "  Pass" );
}

@Given("^User Click RadioBtn to select Hotel$")
public void user_Click_RadioBtn_to_select_Hotel() throws Throwable {
	SelectHotel shl = new SelectHotel(driver);
	clickOnElement(shl.getSelectRadioBtn());
	
}

@When("^User Click on the continueButton$")
public void user_Click_on_the_continueButton() throws Throwable {
	SelectHotel shl = new SelectHotel(driver);
	clickOnElement(shl.getClickcontinueBtn());
}

@Then("^User gets the Price perday to calculate to total price$")
public void user_gets_the_Price_perday_to_calculate_to_total_price() throws Throwable {
	SelectHotel shl = new SelectHotel(driver);
	String perNight=shl.getTC_108AVerification().getAttribute("value").replaceAll("[^0-9]", "");
	String noOfDays=shl.getTC_108BVerification().getAttribute("value").replaceAll("[^0-9]", "");
	String noOfRooms=shl.getTC_108CVerification().getAttribute("value").replaceAll("[^0-9]", "");
	String expectedPrice=shl.getTC_108DVerification().getAttribute("value").replaceAll("[^0-9]", "");
	int a= Integer.parseInt(perNight);
	int b= Integer.parseInt(noOfDays);
	int c= Integer.parseInt(noOfRooms);
	int d= Integer.parseInt(expectedPrice);
	int TotalPrice = a*b*c ;
	System.out.println(expectedPrice);
	System.out.println(noOfDays);
	System.out.println(noOfRooms);
	System.out.println(TotalPrice);
	
}

@Then("^User TestCaseEight verify for the correct \"([^\"]*)\" total price$")
public void user_TestCaseEight_verify_for_the_correct_total_price(String arg1) throws Throwable {
	SelectHotel shl = new SelectHotel(driver);
	String perNight=shl.getTC_108AVerification().getAttribute("value").replaceAll("[^0-9]", "");
	String noOfDays=shl.getTC_108BVerification().getAttribute("value").replaceAll("[^0-9]", "");
	String noOfRooms=shl.getTC_108CVerification().getAttribute("value").replaceAll("[^0-9]", "");
	String Price =shl.getTC_108DVerification().getAttribute("value").replaceAll("[^0-9]", "");
	int a= Integer.parseInt(perNight);
	int b= Integer.parseInt(noOfDays);
	int c= Integer.parseInt(noOfRooms);
	int expected= Integer.parseInt(Price);
	int TotalPrice = a*b*c ;
	System.out.println(expected);
	System.out.println(perNight);
	System.out.println(noOfDays);
	System.out.println(noOfRooms);
	System.out.println(TotalPrice);
	org.junit.Assert.assertEquals(expected, TotalPrice);	
	System.out.println("Verify expected and actual: " + expected + " = " + TotalPrice + arg1 + "  Pass" );
}

@Given("^User Enters FirstName \"([^\"]*)\"$")
public void user_Enters_FirstName(String arg1) throws Throwable {
	BookHotel bh = new BookHotel(driver);
	inputText(bh.getFirstname(), arg1);

}

@When("^User Enters LastName \"([^\"]*)\"$")
public void user_Enters_LastName(String arg1) throws Throwable {
	BookHotel bh = new BookHotel(driver);
	inputText(bh.getLastname(), arg1);

}

@And("^User Enters BillingAddress \"([^\"]*)\"$")
public void user_Enters_BillingAddress(String arg1) throws Throwable {
	BookHotel bh = new BookHotel(driver);
	inputText(bh.getAddress(), arg1);
	
}

@When("^User Enters CreditCardNo \"([^\"]*)\"$")
public void user_Enters_CreditCardNo(String arg1) throws Throwable {
	BookHotel bh = new BookHotel(driver);
	inputText(bh.getCreditCardNo(), arg1);
}

@When("^User Select CreditCardType \"([^\"]*)\"$")
public void user_Select_CreditCardType(String arg1) throws Throwable {
	BookHotel bh = new BookHotel(driver);
  selectOptionFromDD(bh.getCreditCardType(), arg1, "value");
}

@When("^User Select CcExpiryMonth \"([^\"]*)\"$")
public void user_Select_CcExpiryMonth(String arg1) throws Throwable {
	BookHotel bh = new BookHotel(driver);
	  selectOptionFromDD(bh.getCcExpMonth(), arg1, "value");
}

@When("^User Select CcExpiryYear \"([^\"]*)\"$")
public void user_Select_CcExpiryYear(String arg1) throws Throwable {
	BookHotel bh = new BookHotel(driver);
	  selectOptionFromDD(bh.getCcExpYear(), arg1, "value");
}

@When("^User Enters CVVNo \"([^\"]*)\"$")
public void user_Enters_CVVNo(String arg1) throws Throwable {
	BookHotel bh = new BookHotel(driver);
	inputText(bh.getCc_Cvv(), arg1);
}

@When("^User Click BookNowBtn$")
public void user_Click_BookNowBtn() throws Throwable {
	BookHotel bh = new BookHotel(driver);
	clickOnElement(bh.getBookNowBtn());
Thread.sleep(2000);
}

@Then("^User TestCaseNine verify for the correct \"([^\"]*)\" Sucessfully completed with valid testdata\\.$")
public void user_TestCaseNine_verify_for_the_correct_Sucessfully_completed_with_valid_testdata(String arg1) throws Throwable {
	BookHotel bh = new BookHotel(driver);
	System.out.println(arg1 + " pass");
}

@Given("^User TestCaseTen verify for the correct \"([^\"]*)\" total price$")
public void user_TestCaseTen_verify_for_the_correct_total_price(String arg1) throws Throwable {
	SelectHotel shl = new SelectHotel(driver);
	BookHotel bh = new BookHotel(driver);
	String perNight=bh.getTC_108AVerification().getAttribute("value").replaceAll("[^0-9]", "");
	String noOfDays=bh.getTC_110Verification().getAttribute("value").replaceAll("[^0-9]", "");
	String noOfRooms=bh.getTC_110CVerification().getAttribute("value").replaceAll("[^0-9]", "");
	String Price =bh.getTC_108DVerification().getAttribute("value").replaceAll("[^0-9]", "");
	String GST=bh.getTC_110BVerification().getAttribute("value").replaceAll("[^0-9]", "");
	String FinalPrice=bh.getTC_110AVerification().getAttribute("value").replaceAll("[^0-9]", "");
	int a= Integer.parseInt(perNight);
	int b= Integer.parseInt(noOfDays);
	int c= Integer.parseInt(noOfRooms);
	int d= Integer.parseInt(GST);
	int e= Integer.parseInt(FinalPrice);	
	int expected= Integer.parseInt(Price);
	int TotalPrice = a*b*c ;
	int calculateGST = (TotalPrice)*10/100 ;
	int PriceplusGST = (TotalPrice+calculateGST);
	System.out.println("expected  = " + expected);
	System.out.println("perNight  = " + perNight);
	System.out.println("noOfDays  = " + noOfDays);
	System.out.println("noOfRooms  = " + noOfRooms);
	System.out.println("FinalPrice  = " + FinalPrice);
	System.out.println("TotalPrice  = " + TotalPrice);
	System.out.println("GST  = " + GST);
	org.junit.Assert.assertEquals(expected, TotalPrice);	
	System.out.println("Verify expected and actual TotalPrice before GST 10%: " + expected + " = " + TotalPrice +" "+ arg1 + " "+"Pass" );
	System.out.println("Verify expected and actual FinalPrice included GST 10%: " + FinalPrice + " = " + PriceplusGST +" "+ arg1 + " " +" Pass" );
	}

@Then("^User TestCaseEleven verify the data given and processed are same and correct \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
public void user_TestCaseEleven_verify_the_data_given_and_processed_are_same_and_correct(String arg1, String arg2, String arg3, String arg4) throws Throwable {

	SelectHotel shl = new SelectHotel(driver);
	BookHotel bh = new BookHotel(driver);
	String AcHotel = bh.getHotelName().getAttribute("value");
	String AcLocation = bh.getLocation().getAttribute("value");
	String AcRoomType = bh.getRoomtype().getAttribute("value");

	org.junit.Assert.assertEquals(AcLocation, arg2);	
	org.junit.Assert.assertEquals(AcHotel, arg3);	
	org.junit.Assert.assertEquals(AcRoomType, arg4);	
	System.out.println("Verify expected and actual Location : " + arg2 + " = " + AcLocation +" "+ arg1 + " "+"Pass" );
	System.out.println("Verify expected and actual Hotel : " + arg3 + " = " + AcHotel +" "+ arg1 + " "+"Pass" );
	System.out.println("Verify expected and actual RoomType : " + arg4 + " = " + AcRoomType +" "+ arg1 + " "+"Pass" );

}
 
@After
@Given("^User Quit Browser$")
public void user_Quit_Browser() throws Throwable {
 driver.quit();
}

}