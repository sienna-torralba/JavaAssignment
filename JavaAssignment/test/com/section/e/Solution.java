package com.section.e;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import com.animal.Animal;
import com.animal.action.FlyingAnimal;
import com.animal.action.SingingAnimal;
import com.animal.action.SwimmingAnimal;
import com.animal.action.WalkingAnimal;
import com.animal.factory.AnimalFactory;

public class Solution {
	
	static int fly = 0, sing = 0, swim = 0, walk = 0;
	
	@Rule
	public TestName testName = new TestName();
	
	@BeforeClass
	public static void testDesc() {
		System.out.println("/* SOLUTION TO E.1 */");
		System.out.println("/* This uses factory design pattern. */ \n");
	}
	
	@Before
	public void startTest() {
		System.out.println(">>>>>> " + testName.getMethodName() + " <<<<<<");
		
		fly = 0;
		sing = 0;
		swim = 0;
		walk = 0;
	}
	
	@After
	public void endTest() {
		System.out.println("No. of animals that can fly : " + fly);
		System.out.println("No. of animals that can sing: " + sing);
		System.out.println("No. of animals that can swim: " + swim);
		System.out.println("No. of animals that can walk: " + walk);
		
		System.out.println("");
	}
	
	@Test
	public void testAnimalCount() {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(AnimalFactory.getAnimal("BIRD"));
		animals.add(AnimalFactory.getAnimal("DUCK"));
		animals.add(AnimalFactory.getAnimal("CHICKEN"));
		animals.add(AnimalFactory.getAnimal("ROOSTER"));
		animals.add(AnimalFactory.getAnimal("PARROT"));
		animals.add(AnimalFactory.getAnimal("FISH"));
		animals.add(AnimalFactory.getAnimal("SHARK"));
		animals.add(AnimalFactory.getAnimal("CLOWNFISH"));
		animals.add(AnimalFactory.getAnimal("DOLPHIN"));
		animals.add(AnimalFactory.getAnimal("BUTTERFLY"));
		animals.add(AnimalFactory.getAnimal("CATERPILLAR"));
		animals.add(AnimalFactory.getAnimal("DOG"));
		animals.add(AnimalFactory.getAnimal("CAT"));
		
		for(Animal animal : animals) {
			if(animal instanceof FlyingAnimal) {
				fly++;
			} 
			if(animal instanceof SwimmingAnimal) {
				swim++;
			}
			if(animal instanceof SingingAnimal) {
				sing++;
			}
			if(animal instanceof WalkingAnimal) {
				walk++;
			}
		}
	}
	
	@Test
	public void testAnimalCountUnknownAnimal() {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(AnimalFactory.getAnimal(""));
		animals.add(AnimalFactory.getAnimal(null));
		animals.add(AnimalFactory.getAnimal("SPIDERMAN"));
		animals.add(AnimalFactory.getAnimal("CATWOMAN"));
		
		for(Animal animal : animals) {
			if(animal instanceof FlyingAnimal) {
				fly++;
			} 
			if(animal instanceof SwimmingAnimal) {
				swim++;
			}
			if(animal instanceof SingingAnimal) {
				sing++;
			}
			if(animal instanceof WalkingAnimal) {
				walk++;
			}
		}
	}
	
}