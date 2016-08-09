package com.zoo;

public class YellowBaboon extends Monkey
{
	boolean bareBottom = true;

	public YellowBaboon(boolean isCaged, float weight, float height, String color, int legs, boolean isSleeping,
			String sound, boolean bareBottom)
	{
		super(isCaged, weight, height, color, legs, isSleeping, sound);
		this.bareBottom = bareBottom;
	}

	public boolean isBareBottom()
	{
		return bareBottom;
	}

	public void setBareBottom(boolean bareBottom)
	{
		this.bareBottom = bareBottom;
	}

	@Override
	public String toString()
	{
		return "14. A Yellow baboon. It had a bare bottom and was in its cage. Its weight in pounds was " + weightInLBS
				+ ". It's height in feet was " + heightInFeet + ". Its color was " + color + ". It had " + legs + " legs. It was not sleeping. The sound it made was " + sound + ".";
	}
	
}
