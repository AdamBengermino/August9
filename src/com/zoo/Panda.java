package com.zoo;

public class Panda extends Bear
{
	private boolean eatsBamboo = true;

	public Panda(boolean isCaged, float weight, float height, String color, int legs, boolean isSleeping, String sound,
			boolean eatsBamboo)
	{
		super(isCaged, weight, height, color, legs, isSleeping, sound);
		this.eatsBamboo = eatsBamboo;
	}

	public boolean isEatsBamboo()
	{
		return eatsBamboo;
	}

	public void setEatsBamboo(boolean eatsBamboo)
	{
		this.eatsBamboo = eatsBamboo;
	}

	@Override
	public String toString()
	{
		return "12. A Panda. It eats bamboo and it was in a cage. Its weight in pounds was " + weightInLBS + ". Its height in feet was " + heightInFeet + ". Its color was " + color + ". It had " + legs + " legs. It was not sleeping. The sound it made was " + sound + ".";
	} 
	
	
	
}