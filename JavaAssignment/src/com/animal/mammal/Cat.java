package com.animal.mammal;

import com.animal.Mammal;
import com.animal.action.SingingAnimal;
import com.animal.action.WalkingAnimal;


public class Cat extends Mammal implements WalkingAnimal, SingingAnimal {
	
	@Override
	public void sing() {
		System.out.println("Meow, meow!");
	}

	@Override
	public void walk() {
		System.out.println("I can walk!");
	}

}
