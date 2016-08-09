package com.zoo;

public class Giraffe extends Animal
{

	public Giraffe(boolean isCaged, float weight, float height, String color, int legs, boolean isSleeping,
			String sound)
	{
		super(isCaged, weight, height, color, legs, isSleeping, sound);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString()
	{
		return "2. A Giraffe. It was in a cage." + " It weighed " + weightInLBS + " pounds and had a height of " + heightInFeet + " feet. It was " + color
				+ " and had " + legs +" legs and was not sleeping." + "I heard it " + sound + ".";
	}

}
