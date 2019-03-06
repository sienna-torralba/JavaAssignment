package com.animal.bird;

import com.animal.Bird;
import com.util.LangUtil;


public class Chicken extends Bird {
	
	private Type type;
	
	public enum Type {
		ROOSTER,
		HEN
	}
	
	public Chicken() {

	}
	
	public Chicken(Type type) {
		this.type = type;
	}
	
	@Override
	public void sing() {
		if(this.type == Type.ROOSTER) {
			System.out.println("Cock-a-doodle-doo!");
		} else {
			System.out.println("Cluck, cluck!");
		}
	}
	
	public void sing(String language) {
		if(language == null || language.isEmpty()) {
			System.out.println("Translation not found!");
			return;
		}
		
		if(this.type == Type.ROOSTER) {
			String sound = LangUtil.getInstance().getRoosterLanguages().get(language.toUpperCase());
			if(sound == null || sound.isEmpty()) {
				System.out.println("Translation not found!");
				return;
			}
			
			System.out.println(language.toUpperCase() + ": " + sound);
			
		} else {
			sing();
		}
	}

}
