package com.section.a;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import com.animal.bird.Chicken;
import com.animal.bird.Chicken.Type;

public class Solution3 {
	
	private Chicken chicken;
	
	@Rule
	public TestName testName = new TestName();
	
	@BeforeClass
	public static void testDesc() {
		System.out.println("/* SOLUTION TO ITEM A.3 */");
		System.out.println("/* Model rooster from chicken class without using inheritance. */ \n");
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
	public void testChicken() {
		chicken = new Chicken();
		chicken.sing();
	}

	@Test
	public void testHen() {
		chicken = new Chicken(Type.HEN);
		chicken.sing();
	}
	
	@Test
	public void testRooster() {
		chicken = new Chicken(Type.ROOSTER);
		chicken.sing();
	}
}
