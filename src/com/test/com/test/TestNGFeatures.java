package com.test.com.test;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test
	public void loginTest() {
		System.out.println("Login Test");
		//int i =9/0;
	}
	
	@Test(dependsOnMethods="loginTest")
	public void HomePageTest() {
		System.out.println("Home Page Test");
	}
	
	@Test
	public void SearchPageTest() {
		System.out.println("Search Page Test");
	}

}
