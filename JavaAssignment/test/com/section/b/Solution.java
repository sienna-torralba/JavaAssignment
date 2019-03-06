package com.section.b;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import com.animal.Fish;
import com.animal.fish.Clownfish;
import com.animal.fish.Shark;
import com.animal.mammal.Dolphin;
import com.util.Color;
import com.util.Size;

public class Solution {
	
	@Rule
	public TestName testName = new TestName();
	
	@BeforeClass
	public static void testDesc() {
		System.out.println("/* SOLUTION TO ITEM B.1, B.2, B.3 */ \n");
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
	public void testFish() {
		Fish fish = new Fish();
		fish.swim();
	}
	
	@Test
	public void testClownfish() {
		Clownfish clownFish = new Clownfish(Size.SMALL, Color.ORANGE);
		clownFish.describe();
		clownFish.swim();
		clownFish.makeJokes();
	}
	
	@Test
	public void testShark() {
		Shark shark = new Shark(Size.LARGE, Color.GREY);
		shark.describe();
		shark.swim();
		shark.eat(new Clownfish());
	}
	
	@Test
	public void testSharkEatingClownFish() {
		Shark shark = new Shark(Size.LARGE, Color.GREY);
		shark.describe();
		shark.swim();
		shark.eat(new Fish());
	}
	
	@Test
	public void testDolphin() {
		Dolphin dolphin = new Dolphin();
		dolphin.swim();
	}
	
}
