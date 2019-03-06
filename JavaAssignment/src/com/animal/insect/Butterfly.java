package com.animal.insect;

import com.animal.Insect;
import com.animal.action.FlyingAnimal;


public class Butterfly extends Insect implements FlyingAnimal {

	public Butterfly() {

	}
	
	// Metamorphosis
	public Butterfly(Caterpillar c) {
		System.out.println("Transforming caterpillar to a butterfly!");
	}
	
	@Override
	public void fly() {
		System.out.println("I can fly!");
	}

}
