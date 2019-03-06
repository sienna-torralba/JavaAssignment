package com.animal.fish;

import com.animal.Fish;
import com.util.Color;
import com.util.Size;


public class Shark extends Fish {
	
	public Shark() {

	}
	
	public Shark(Size size, Color color) {
		super(size, color);
	}
	
	public void eat(Fish f) {
		if(f instanceof Clownfish) {
			System.out.println("I can eat a clown fish!");
		} else {
			System.out.println("I can eat other fish!");
		}
	}

}
