package com.animal.insect;

import com.animal.Insect;
import com.animal.action.WalkingAnimal;


public class Caterpillar extends Insect implements WalkingAnimal {

	@Override
	public void walk() {
		System.out.println("I can crawl!");
	}

}
