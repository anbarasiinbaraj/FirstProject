package com.org.BaseClass;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetPageSource;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Text;


public class BaseClass {
	public static WebDriver driver;
	public static WebDriver getDriver(String browserName) {
		 try {
			if (browserName == "chrome") {
				 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anbarasii\\eclipse-workspace\\WebProject\\Driver\\chromedriver.exe");
				 driver = new ChromeDriver();
			 }else if(browserName == "ie") {
				 System.setProperty("webdriver.ie.driver", "C:\\Users\\Anbarasii\\eclipse-workspace\\WebProject\\Driver\\IEDriverServer.exe");
				 driver = new InternetExplorerDriver();
				 
			 }else {
				 System.out.println("Please enter a valid Browser"); 
				 throw new RuntimeException("Please enter the valid browser");
			 }
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Please enter the valid browser");
		}
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		 
		return driver;
		 
	 }

	public static void getUrl(String url) {
		driver.get(url);
	}
	public static void waitforVisiblityofElement(WebElement element) {
		WebDriverWait wb = new WebDriverWait(driver, 5000);
		wb.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static boolean elementIsDisplayed (WebElement element) {
		boolean displayed= element.isDisplayed ();
		return displayed;	
	}

	public static boolean elementIsEnabled (WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}
	public static void inputText(WebElement element, String value) throws Exception {
		try {
			waitforVisiblityofElement(element);
			if (elementIsDisplayed(element)&& elementIsEnabled(element)) {
				element.clear();
				element.sendKeys(value);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
			
		}
	}
		public static String getText(WebElement element) throws Exception {
			try {
			waitforVisiblityofElement(element);
			String text =null;
				text=element.getText();
//				System.out.println(text);
		}catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
			
		}
			return null;
	}	
		public static String getAttribute(WebElement element, String value ) throws Exception {
			try {
				String test =null;
				test=element.getAttribute(value);
//				System.out.println(test);
		}catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
			
		}
			return value;

	}	
	public static void clickOnElement(WebElement element) throws Exception	{
		try {
			waitforVisiblityofElement(element);
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();		
		}
	}	
	public static void clickAfterMouseOver(WebElement element)throws Exception{
		element.click();
	}
		public static void mouseOver(WebElement element)throws Exception {
			 try {
				waitforVisiblityofElement(element);
				 Actions act = new Actions(driver);
				 act.moveToElement(element).build().perform();
			} catch (Exception e) {
				e.printStackTrace();
			    throw new Exception();
			}	

}
		public static void selectOptionFromDD(WebElement element, String value, String Options) throws Exception {
			try {
				Select sc = new Select(element);
				if (Options.equalsIgnoreCase("Value")) {
					sc.selectByValue(value);					
				}else if (Options.equalsIgnoreCase("VisibleText")) {
					sc.selectByVisibleText(value);					
				}else if (Options.equalsIgnoreCase("Index")) {
					sc.selectByIndex(Integer.parseInt(value));
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
				throw new Exception();
				
			}
		}
	//Creating common highLighter
		 public static void highLighter(WebElement element){
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		 }	

		 public static void scrollup(WebElement element){
	
				try {
					JavascriptExecutor sc = (JavascriptExecutor)driver;
					 sc.executeScript("arguments[0].scrollIntoView();",element);
				} catch (Exception e) {
					e.printStackTrace();
				}
		
			 }	

		
		 public static void iframe(WebElement element) {
			 driver.switchTo().frame(element);
			 
		 }

}
