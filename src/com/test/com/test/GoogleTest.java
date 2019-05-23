package com.test.com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class GoogleTest {
	
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
  
 
  
  @Test(priority=3,groups="Title")
  public void GoogleTitleTest() {
	  String title = driver.getTitle();
	  System.out.println("title of the page is :" +title);
    
  }
  
  @Test(priority=1,groups="Logo")
  public void GoogleLogoTest() {
	  boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
  }
  
  @Test(priority=2,groups="Title")
  public void mailLinkTest() {
	  boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
  }
  
  @Test(priority=5,groups="Logo")
  public void test1() {
	  System.out.println("test1");
  }
  
  @Test(priority=4,groups="Title")
  public void test2() {
	  System.out.println("test2");
  }
  
  @Test(priority=6,groups="Logo")
  public void test3() {
	  System.out.println("test3");
  }

  @AfterMethod
  public void tearDown() {
	  driver.quit();
  }

}
