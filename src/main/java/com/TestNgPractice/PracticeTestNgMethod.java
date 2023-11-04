package com.TestNgPractice;

import org.testng.annotations.Test;

public class PracticeTestNgMethod {

	@Test(priority = 0, groups = { "smoke" })
	public void login() {
		System.out.println("This is 1:Login Method");
	}

	@Test(priority = 1, groups = { "regression" })
	public void dress() {
		System.out.println("This is the 2:Dress method");
	}

	@Test(priority = 2, groups = { "smoke", "regression" })
	public void cart() {
		System.out.println("This is the 3:Cart Method");

	}

	@Test(priority = 3, groups = { "regression" })
	public void payment() {
		System.out.println("This is the 4:Payment Method");
	}

	@Test(priority = 4, groups = { "regression" })
	public void placeorder() {
		System.out.println("This is the 5:Placeorder Method");
	}

	// public static void main(String[] args) {
	// PracticeTestNgMethod obj = new PracticeTestNgMethod();
	// obj.login();
	// obj.dress();
	// obj.cart();
	// obj.payment();
	// obj.placeorder();
	// }
}
