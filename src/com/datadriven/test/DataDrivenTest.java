package com.datadriven.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.excel.utility.Xls_Reader1;

public class DataDrivenTest {

	public static void main(String[] args) {
		
		Xls_Reader1 reader = new Xls_Reader1("C:\\Users\\user\\workspace\\LearnJava\\SeleniumFirstProgram\\src\\com\\testdata\\GmailTestData.xlsx");
		
		String Firstname =reader.getCellData("RegTestData", "First name", 2);
		System.out.println(Firstname);
		
		String Lastname =reader.getCellData("RegTestData", "Last name", 2);
		System.out.println(Lastname);
		
		String Username =reader.getCellData("RegTestData", "Username", 2);
		System.out.println(Username);
		
		String Password =reader.getCellData("RegTestData", "Password", 2);
		System.out.println(Password);
		
		String Confirm =reader.getCellData("RegTestData", "Confirm", 2);
		System.out.println(Confirm);
		
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\workspace\\LearnJava\\SeleniumFirstProgram\\lib\\Mozilladriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
		

	}

}
