package com.section.bonus;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class Solution2 {
	
	@Rule
	public TestName testName = new TestName();
	
	@BeforeClass
	public static void testDesc() {
		System.out.println("/* SOLUTION TO BONUS ITEM 2 */");
		System.out.println("/* REST API >> Please refer to structure in com.rest.api.AnimalsAPI.java. */ \n");
	}
	
	@Before
	public void startTest() {
		System.out.println(">>>>>> " + testName.getMethodName() + " <<<<<<");
	}
	
	@After
	public void endTest() {
		System.out.println("");
	}

	@Test
	public void testREST() {
		
	}

	
}
