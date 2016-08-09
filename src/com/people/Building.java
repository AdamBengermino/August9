package com.people;

import java.util.ArrayList;

public class Building
{

	public static void main(String[] args)
	{
		ArrayList<Person> ourBuilding = new ArrayList<>(3); 
		
		Student studentA = new Student("Brendan", 29, "male", 6.4f, "12345", false, true, true); 
		Student studentB = new Student("Mary", 35, "female", 5.3f, "54321", true, true, true); 
		Janitor janitorA = new Janitor("Kavita", 30, "female", 5.0f, true, "Head GroundsKeeper"); 

		ourBuilding.add(studentA); 
		ourBuilding.add(studentB); 
		ourBuilding.add(janitorA); 
		
		System.out.println(ourBuilding.get(2));
		
		
	}
}
