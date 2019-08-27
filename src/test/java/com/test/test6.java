package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class test6 {
	WebDriver driver;

	SoftAssert softAssert = new SoftAssert();

	@BeforeTest
	public void setting() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Eclipse\\Jar Files\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void hardAssertion() {

		Assert.assertEquals("pass", "pass");
		System.out.println("This line is executed because assertEquals " + "passed as both the strings are same");
		Assert.assertNull("assertion");
		System.out.println("Since the object under assertion" + " is not null, the assertion will fail. "
				+ "This line will not be executed");
	}

	@Test
	public void softAssertion() {

		softAssert.assertNull("assertion");
		System.out.println(
				"We are using Soft assertion in this method," + " so this line of code will also be executed even if "
						+ "the assetion fails.Wherever we want to execute full "
						+ "testcase/method, we should use SoftAssertion");
		softAssert.assertAll();
	}

	@Test
	public void assertionTest() {

		// Assertion Passing
		Assert.assertTrue(1 + 2 == 3);
		System.out.println("Passing 1");

		// Assertion failing
		Assert.fail("Failing second assertion");
		System.out.println("Failing 2");
	}

	@Test
	public void softAssertionTest() {

		// Creating softAssert object
		SoftAssert softAssert = new SoftAssert();

		// Assertion failing
		softAssert.fail("Failing first assertion");
		System.out.println("Failing 1");

		// Assertion failing
		softAssert.fail("Failing second assertion");
		System.out.println("Failing 2");

		// Collates the assertion results and marks test as pass or fail
		softAssert.assertAll();
	}

	@Test
	public void VerifytestPresent() {
		if (driver.getPageSource().contains("Text - Testing with Arif")) {
			System.out.println("Text is Present");
		} else {
			System.out.println("Text is not Present");
		}
		// 2nd Section
		try {
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*verify text is present[\\s\\S]*$"));
			} catch (Error e) {
			System.out.println(e.toString());
			}
		// 3rd Section
		driver.findElement(By.xpath("//span[contains(.,'Transaction was added successfully')]"));
		System.out.println("Transaction successful");
		
		//4th Section
		try {
			assertEquals("Verify Text in Element", driver.findElement(By.cssSelector("div.bbMargin")).getText());
			} catch (Error e) {
				System.out.println(e.toString());
			}
	}
	
	@Test
	public void AsserttestPresent() {
		//1st Section
		assertTrue(driver.getPageSource().contains("1,500.00"));
		System.out.println("1500.00 found in page source");
		
		// Assert True
		assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*assert text is present[\\s\\S]*$"));
		
		// Assert Equals
		assertEquals("1,500.00", driver.findElement(By.cssSelector("div.eoh.")).getText());
		System.out.println("1500 found written in div");
		// Assert True
		assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Record found successfully[\\s\\S]*$"));
		// Assert True
		assertTrue(driver.findElement(By.id("myElement")).getText().equals("foo"));
		
	}
	@Test
	public void VerifyElementPresent() {
		if(isElementPresent(By.linkText("Submit")))
		{
		System.out.println("SUBMIT Link/Button found");
		}
		else
		{
		System.out.println("SUBMIT Link/Button not found");
		}
		// 2nd Section

		try {
			assertTrue(isElementPresent(By.cssSelector("div.bbMargin")));
			} catch (Error e) {
				System.out.println(e.toString());
			}
	}
	@Test
	public void AssertElementPresent() {
		assertTrue(isElementPresent(By.cssSelector("div.bbMargin")));
		//Assert.assertEquals(0, wd.findElements(By.locator("locator")).size());
	}
	private boolean isElementPresent(By linkText) {
		// TODO Auto-generated method stub
		return false;
	}
}
