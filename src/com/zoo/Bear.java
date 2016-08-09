package com.zoo;

public class Bear extends Animal
{

	public Bear(boolean isCaged, float weight, float height, String color, int legs, boolean isSleeping, String sound)
	{
		super(isCaged, weight, height, color, legs, isSleeping, sound);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString()
	{
		return "7. A Bear. It was caged. Its weight in pounds was " + weightInLBS + ". Its height in feet was " + heightInFeet + ". Its color was " + color
                + ". The number of legs it had was " + legs + ". It was sleeping. The sound it made was " + sound + ".";
	}

}
