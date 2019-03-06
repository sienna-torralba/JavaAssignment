package com.animal.mammal;

import com.animal.Mammal;
import com.animal.action.SingingAnimal;
import com.animal.action.WalkingAnimal;


public class Dog extends Mammal implements WalkingAnimal, SingingAnimal {
	
	@Override
	public void sing() {
		System.out.println("Woof, Woof!");
	}

	@Override
	public void walk() {
		System.out.println("I can walk!");
	}

}
