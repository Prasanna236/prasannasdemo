package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Employee {

	@Test
	private void tc1() {
		//Login
		//Hard Assert
		Assert.assertEquals("Invalid Password", "Invalid UserName", "Validating the Login Error Msg");
		System.out.println("Test Case 1");
		System.out.println("I am Done");
	}

	@Test
	private void tc3() {
		System.out.println("Test Case 3");
	}

	@Test
	private void tc2() {
		//Payment Page
		//Soft Assert
		SoftAssert s = new SoftAssert();
		s.assertEquals("VISA", "Visa", "Validating the VISA text");//known issue
		s.assertEquals("Master", "Master", "Validating the VISA text");
		System.out.println("Test Case 2");
		System.out.println("End");
		s.assertAll();
	}
}
