package com.section.a;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import com.animal.bird.Chicken;
import com.animal.bird.Chicken.Type;
import com.animal.bird.Parrot;
import com.animal.mammal.Cat;
import com.animal.mammal.Dog;

public class Solution4 {
	
	@Rule
	public TestName testName = new TestName();
	
	@BeforeClass
	public static void testDesc() {
		System.out.println("/* SOLUTION TO ITEM A.4 */");
		System.out.println("/* Model a parrot to make the sound of the animal it lives with. */");
		System.out.println("/* This implements simple dependency injection. */ \n");
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
	public void testParrotLivingWithDog() {
		Parrot parrot = new Parrot(new Dog());
		parrot.fly();
		parrot.walk();
		parrot.sing();
	}
	
	@Test
	public void testParrotLivingWithCat() {
		Parrot parrot = new Parrot(new Cat());
		parrot.fly();
		parrot.walk();
		parrot.sing();
	}
	
	@Test
	public void testParrotLivingWithRooster() {
		Parrot parrot = new Parrot(new Chicken(Type.ROOSTER));
		parrot.fly();
		parrot.walk();
		parrot.sing();
	}
	
	@Test
	public void testParrotLivingWithChicken() {
		Parrot parrot = new Parrot(new Chicken());
		parrot.fly();
		parrot.walk();
		parrot.sing();
	}

}
