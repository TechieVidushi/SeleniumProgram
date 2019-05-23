package com.test.com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class GoogleTitleTest {
	
	WebDriver driver;
	
	 @BeforeMethod
	  public void setUp() {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\workspace\\LearnJava\\SeleniumFirstProgram\\lib\\Mozilladriver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://www.google.com");
	  }
	 
	  @Test
	  public void GoogleTitleTest(){
		  String title = driver.getTitle();
		  System.out.println(title);
		  
		  Assert.assertEquals("title not matched", "Google123", title);
	    
	  }
	  
	  @Test(priority=1,groups="Logo")
	  public void GoogleLogoTest() {
		  boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		  Assert.assertTrue("Illegal Logo", b);
	  }
	  
	  @AfterMethod
	  public void tearDown() {
		  driver.quit();
	  }

}
