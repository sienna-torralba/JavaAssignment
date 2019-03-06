package com.section.d;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import com.animal.insect.Butterfly;
import com.animal.insect.Caterpillar;

public class Solution {
	
	@Rule
	public TestName testName = new TestName();
	
	@BeforeClass
	public static void testDesc() {
		System.out.println("/* SOLUTION TO ITEM D.1 & D.2 */ \n");
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
	public void testButterfly() {
		Butterfly butterfly = new Butterfly();
		butterfly.fly();
	}

	@Test
	public void testCaterpillar() {
		Caterpillar caterpillar = new Caterpillar();
		caterpillar.walk();
	}
	
	@Test
	public void testMetamorphosis() {
		Butterfly butterfly = new Butterfly(new Caterpillar());
		butterfly.fly();
	}
	
}
