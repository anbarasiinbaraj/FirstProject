package com.maven.pom;



import org.openqa.selenium.WebDriver;
import com.maven.pom.BookHotel;
import com.maven.pom.LoginPage;
import com.maven.pom.SearchHotel;
import com.maven.pom.SelectHotel;

public class PageObjectManager {

		 
		 private WebDriver driver;
		 
		 private BookHotel BookHotel;	 
		 private LoginPage LoginPage;	 
		 private SearchHotel SearchHotel;	 
		 private SelectHotel SelectHotel;
		 
		 public PageObjectManager(WebDriver driver) {	 
		 this.driver = driver;	 
		 }
		 
		 public BookHotel getBookHotel(){
		 return (BookHotel == null) ? BookHotel = new BookHotel(driver) : BookHotel;
		 }
		 
		 public LoginPage getLoginPage() {		 
		 return (LoginPage == null) ? LoginPage = new LoginPage(driver) : LoginPage;	 
		 }
		
		 public SearchHotel getSearchHotele() {
		 return (SearchHotel == null) ? SearchHotel = new SearchHotel(driver) : SearchHotel;
		 }
		 
		 public SelectHotel getSelectHotel() {
		 return (SelectHotel == null) ? SelectHotel = new SelectHotel(driver) : SelectHotel;
		 }
}


