package com.animal.fish;

import com.animal.Fish;
import com.util.Color;
import com.util.Size;


public class Clownfish extends Fish {
	
	public Clownfish() {

	}
	
	public Clownfish(Size size, Color color) {
		super(size, color);
	}
	
	public void makeJokes() {
		System.out.println("I can crack jokes!");
	}

}
