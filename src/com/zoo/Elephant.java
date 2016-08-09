package com.zoo;

public class Elephant extends Animal
{
	private boolean hasTusks = true; 
	private int age = 0; 
	
	public Elephant(boolean isCaged, float weight, float height, String color, int legs, boolean isSleeping,
			String sound, boolean hasTusks, int age)
	{
		super(isCaged, weight, height, color, legs, isSleeping, sound);
		this.hasTusks = hasTusks;
		this.age = age;
	}

	public boolean isHasTusks()
	{
		return hasTusks;
	}

	public void setHasTusks(boolean hasTusks)
	{
		this.hasTusks = hasTusks;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	@Override
	public String toString()
	{
		return "1. An Elephant. It did not have tusks." + " Its age was " + age +". " + "It was caged." + " Its weight in pounds was " + weightInLBS + ". Its height in feet was " + heightInFeet + ". It was " + color
                + ". The number of legs it had was " + legs + ". It was not sleeping." + " The sound it made was " + sound + ".";
	}

}
