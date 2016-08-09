package com.zoo;

public class VampireBat extends Bat
{
	public VampireBat(boolean isCaged, float weight, float height, String color, int legs, boolean isSleeping,
			String sound)
	{
		super(isCaged, weight, height, color, legs, isSleeping, sound);
		// TODO Auto-generated constructor stub
	}

	private boolean drinksBlood = true; 
	
	public boolean isDrinksBlood()
	{
		return drinksBlood;
	}

	public void setDrinksBlood(boolean drinksBlood)
	{
		this.drinksBlood = drinksBlood;
	}

	@Override
	public String toString()
	{
		return "11. A Vampire bat. It drinks blood and was not caged. Its weight in pounds was " + weightInLBS +". Its height in feet was " + heightInFeet + ". Its color was " + color + ". It had " + legs + " legs. It was sleeping. The sound it made was " + sound + ".";
	}

}
