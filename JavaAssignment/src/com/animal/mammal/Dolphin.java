package com.animal.mammal;

import com.animal.Mammal;
import com.animal.action.SwimmingAnimal;


public class Dolphin extends Mammal implements SwimmingAnimal {
	
	@Override
	public void swim() {
		System.out.println("I am not exactly a fish but I can swim!");
	}

}
