package com.zoo;

public class ArcticWolf extends Wolf
{
	private boolean livesInArctic = true;

	public ArcticWolf(boolean isCaged, float weight, float height, String color, int legs, boolean isSleeping,
			String sound, boolean livesInArctic)
	{
		super(isCaged, weight, height, color, legs, isSleeping, sound);
		this.livesInArctic = livesInArctic;
	}

	public boolean isLivesInArctic()
	{
		return livesInArctic;
	}

	public void setLivesInArctic(boolean livesInArctic)
	{
		this.livesInArctic = livesInArctic;
	}

	@Override
	public String toString()
	{
		return "13. An Arctic wolf. Normally, it lives in the Arctic. It was in its cage. Its weight in pounds was " + weightInLBS
				+ ". Its height in feet was " + heightInFeet + ". Its color was " + color + ". It had " + legs + " legs. It was sleeping. The sound it made was " + sound + ".";
	} 
	
}
