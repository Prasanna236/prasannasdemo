package com.TestNG;

import org.testng.annotations.Test;

public class Company {

	@Test(groups="Smoke")
	private void tc4() {
		System.out.println("Test Case 4");
	}

	@Test(groups="Regression")
	private void tc5() {
		System.out.println("Test Case 5");
	}

	@Test(groups="Phase-1")
	private void tc6() {
		System.out.println("Test Case 6");
	}
	
}
