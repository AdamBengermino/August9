package com.zoo;

public class Animal
{
	protected boolean isCaged = true; 
	protected float weightInLBS = 0.0f; 
	protected float heightInFeet = 0.0f; 
	protected String color = null; 
	protected int legs = 0; 
	protected boolean isSleeping = false; 
	protected String sound = null;
	
	public Animal(boolean isCaged, float weight, float height, String color, int legs, boolean isSleeping, String sound)
	{
		this.isCaged = isCaged;
		this.weightInLBS = weight;
		this.heightInFeet = height;
		this.color = color;
		this.legs = legs;
		this.isSleeping = isSleeping;
		this.sound = sound;
	}

	public boolean isCaged()
	{
		return isCaged;
	}

	public void setCaged(boolean isCaged)
	{
		this.isCaged = isCaged;
	}

	public float getWeight()
	{
		return weightInLBS;
	}

	public void setWeight(float weight)
	{
		this.weightInLBS = weight;
	}

	public float getHeight()
	{
		return heightInFeet;
	}

	public void setHeight(float height)
	{
		this.heightInFeet = height;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public int getLegs()
	{
		return legs;
	}

	public void setLegs(int legs)
	{
		this.legs = legs;
	}

	public boolean isSleeping()
	{
		return isSleeping;
	}

	public void setSleeping(boolean isSleeping)
	{
		this.isSleeping = isSleeping;
	}

	public String getSound()
	{
		return sound;
	}

	public void setSound(String sound)
	{
		this.sound = sound;
	} 
	
}
