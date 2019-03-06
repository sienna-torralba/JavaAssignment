package com.section.a;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

class Animal {
	void walk() {
		System.out.println("I am walking!");
	}
}

class Bird extends Animal {
	void fly() {
		System.out.println("I am flying!");
	}
	
	void sing() {
		System.out.println("I am singing!");
	}
}

public class Solution1 {
	
	private Bird bird;
	
	@Rule
	public TestName testName = new TestName();
	
	@BeforeClass
	public static void testDesc() {
		System.out.println("/* SOLUTION TO ITEM A.1");
		System.out.println("/* In order to call sing() method, it should be implemented in Bird class \n"
			+ "(particularly in this class since not all Animals can sing). Otherwise, this will cause \n"
			+ "an error (method is undefined). */ \n");
	}
	
	@Before
	public void startTest() {
		bird = new Bird();
		System.out.println(">>>>>> " + testName.getMethodName() + " <<<<<<");
	}
	
	@After
	public void endTest() {
		System.out.println("");
	}

	@Test
	public void testFly() {
		bird.fly();
	}
	
	@Test
	public void testWalk() {
		bird.walk();
	}
	
	@Test
	public void testSing() {
		bird.sing();
	}

}
