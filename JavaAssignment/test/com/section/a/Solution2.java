package com.section.a;


import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import com.animal.bird.Chicken;
import com.animal.bird.Duck;

public class Solution2 {
	
	@Rule
	public TestName testName = new TestName();
	
	@BeforeClass
	public static void testDesc() {
		System.out.println("/* SOLUTION TO ITEM A.2");
		System.out.println("/* Duck and chicken implementing different sound. */ \n");
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
	public void testDuck() {
		Duck duck = new Duck();
		duck.walk();
		duck.swim();
		duck.sing();
	}
	
	@Test
	public void testChicken() {
		Chicken chicken = new Chicken();
		chicken.walk();
		chicken.sing();
	}

}
