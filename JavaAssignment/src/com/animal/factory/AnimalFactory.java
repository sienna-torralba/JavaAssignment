package com.animal.factory;

import com.animal.Animal;
import com.animal.Bird;
import com.animal.Fish;
import com.animal.bird.Chicken;
import com.animal.bird.Duck;
import com.animal.bird.Parrot;
import com.animal.fish.Clownfish;
import com.animal.fish.Shark;
import com.animal.insect.Butterfly;
import com.animal.insect.Caterpillar;
import com.animal.mammal.Cat;
import com.animal.mammal.Dog;
import com.animal.mammal.Dolphin;


public class AnimalFactory {
	
	public static Animal getAnimal(String type) {
		
		if(type == null || type.isEmpty()) {
			return null;
		}
		
		if(type.equalsIgnoreCase("BIRD")) {
			return new Bird();
			
		} else if (type.equalsIgnoreCase("DUCK")) {
			return new Duck();
			
		} else if (type.equalsIgnoreCase("CHICKEN")) {
			return new Chicken();
			
		} else if (type.equalsIgnoreCase("ROOSTER")) {
			return new Chicken();
			
		} else if (type.equalsIgnoreCase("PARROT")) {
			return new Parrot();
			
		} else if (type.equalsIgnoreCase("FISH")) {
			return new Fish();
			
		} else if (type.equalsIgnoreCase("SHARK")) {
			return new Shark();
			
		} else if (type.equalsIgnoreCase("CLOWNFISH")) {
			return new Clownfish();
			
		} else if (type.equalsIgnoreCase("DOLPHIN")) { 
			return new Dolphin();
			
		} else if (type.equalsIgnoreCase("BUTTERFLY")) {
			return new Butterfly();
			
		} else if (type.equalsIgnoreCase("CATERPILLAR")) {
			return new Caterpillar();
			
		} else if (type.equalsIgnoreCase("CAT")) {
			return new Cat();
			
		} else if (type.equalsIgnoreCase("DOG")) {
			return new Dog();
		}
		
		return null;
	}

}
