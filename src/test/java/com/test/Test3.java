package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 {

	@Test
	public void example1() {
		Assert.assertEquals(2, 3, "This test should be failed");
	}

	@Test
	public void example2() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void example3() {
		Assert.assertTrue(true, "This test should be failed");
	}

	@Test
	public void example4() {
		Assert.fail("This test should be failed");
		Assert.assertEquals(12, 12);
		Assert.assertFalse(false,"This Test should be false");
		Assert.fail("This test should be failed");
		Assert.assertNotEquals(12, 14, "This test shoul be pass");
	}

	@Test
	public void example5() {
		Assert.fail("This test should be failed");
	}

	@Test(dependsOnMethods = "example1")
	public void skippedByDependencyTest() {

	}

	@Test
	public void example6() {
	
		Assert.assertNotEquals(12, 14, "This test shoul be pass");
		
	}

	
}