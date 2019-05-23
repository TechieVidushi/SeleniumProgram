package com.test.com.test;

import org.testng.annotations.Test;

public class InvocationcountTest {
	
	@Test(invocationCount=10)
	public void sum() {
		int a = 10;
		int b= 20;
		int c= a+b;
		System.out.println("sum is ===" +c);
	}

}
