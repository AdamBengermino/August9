package com.zoo;

public class ChineseAlligator extends Alligator
{
	private boolean inChina = true;

	public ChineseAlligator(boolean isCaged, float weight, float height, String color, int legs, boolean isSleeping,
			String sound, boolean inChina)
	{
		super(isCaged, weight, height, color, legs, isSleeping, sound);
		this.inChina = inChina;
	}

	public boolean isInChina()
	{
		return inChina;
	}

	public void setInChina(boolean inChina)
	{
		this.inChina = inChina;
	}

	@Override
	public String toString()
	{
		return "15. A Chinese alligator. It normally only lives in China and was in its cage. Its weight in pounds was " + weightInLBS
				+ ". It's height in feet was " + heightInFeet + ". Its color was " + color + ". It had " + legs + " legs. It was not sleeping. The sound it made was " + sound + ".";
	}
	
}
