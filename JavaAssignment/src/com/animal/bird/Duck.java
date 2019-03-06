package com.animal.bird;

import com.animal.Bird;
import com.animal.action.SwimmingAnimal;


public class Duck extends Bird implements SwimmingAnimal {

	@Override
	public void swim() {
		System.out.println("I can swim!");
	}
	
	@Override
	public void sing() {
		System.out.println("Quack, quack!");
	}

}
