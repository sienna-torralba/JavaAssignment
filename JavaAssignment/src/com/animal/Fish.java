package com.animal;

import com.animal.action.SwimmingAnimal;
import com.util.Color;
import com.util.Size;


public class Fish extends Animal implements SwimmingAnimal {
	
	protected Size size;
	protected Color color;
	
	public Fish() {
		
	}
	
	public Fish(Size size, Color color) {
		this.size = size;
		this.color = color;
	}
	
	@Override
	public void swim() {
		System.out.println("I can swim!");
	}
	
	public void describe() {
		System.out.println("My size is " + size.toString() + "!");
		System.out.println("My color is " + color.toString() + "!");
	}

}
