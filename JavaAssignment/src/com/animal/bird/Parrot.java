package com.animal.bird;

import com.animal.Bird;
import com.animal.action.FlyingAnimal;
import com.animal.action.SingingAnimal;


public class Parrot extends Bird implements FlyingAnimal, SingingAnimal {
	
	private SingingAnimal livingWith = null;
	
	public Parrot() {

	}
	
	public Parrot(SingingAnimal livingWith) {
		this.livingWith = livingWith;
	}

	@Override
	public void fly() {
		System.out.println("I can fly!");
	}

	@Override
	public void sing() {
		if(livingWith == null) {
			super.sing();
		} else {
			livingWith.sing();
		}
	}
	
}
