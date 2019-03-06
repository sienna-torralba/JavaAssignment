package com.section.bonus;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import com.animal.bird.Chicken;
import com.animal.bird.Chicken.Type;

public class Solution1 {
	
	@Rule
	public TestName testName = new TestName();
	
	@BeforeClass
	public static void testDesc() {
		System.out.println("/* SOLUTION TO BONUS ITEM 1 */");
		System.out.println("/* This uses singleton design pattern. */ \n");
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
	public void testRoosterDanish() {
		Chicken rooster = new Chicken(Type.ROOSTER);
		rooster.sing("DANISH");
	}

	@Test
	public void testRoosterRussian() {
		Chicken rooster = new Chicken(Type.ROOSTER);
		rooster.sing("Russian");
	}
	
	@Test
	public void testRoosterTagalog() {
		Chicken rooster = new Chicken(Type.ROOSTER);
		rooster.sing("tagalog");
	}
	
	@Test
	public void testRoosterUnknownLang() {
		Chicken rooster = new Chicken(Type.ROOSTER);
		rooster.sing("VISAYA");
	}
	
	@Test
	public void testChickenLang() {
		Chicken chicken = new Chicken();
		chicken.sing();
	}
	
}
