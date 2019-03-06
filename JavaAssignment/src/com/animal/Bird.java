package com.animal;

import com.animal.action.SingingAnimal;
import com.animal.action.WalkingAnimal;


public class Bird extends Animal implements WalkingAnimal, SingingAnimal {

	@Override
	public void sing() {
		System.out.println("I can sing!");
	}

	@Override
	public void walk() {
		System.out.println("I can walk!");
	}

}
