package com.zoo;

import java.util.ArrayList;

public class Zoo
{

	public static void main(String[] args)
	{
		System.out.println("Today at the zoo I saw:\n ");
		
		ArrayList<Animal> ourZoo = new ArrayList<>();
		Animal elephant = new Elephant(true, 5000f, 8.9f, "gray", 4, false, "pffffff", false, 25); 
		Animal giraffe = new Giraffe(true, 700f, 17f, "yellow and brown", 4, false, "bleet");
		Animal monkey = new Monkey(false, 82f, 2f, "brown", 2, false, "ooh ooh ah ah"); 
		Animal alligator = new Alligator(true, 500f, 1f, "green", 4, true, "hissss");
		Animal bat = new Bat(false, .5f, .5f, "black", 2, true, "screetch");
		Animal lion = new Lion(true, 400f, 4f, "yellow", 4, false, "roar");
		Animal bear = new Bear(true, 750f, 4f, "brown", 4, true, "growl");
		Animal rhino = new Rhinoceros(true, 500f, 6f, "gray", 4, true, "bellow"); 
		Animal wolf = new Wolf(true, 70f, 2.5f, "white and black", 4, false, "howl");
		Animal peacock = new Peacock(false, 13f, 4f, "blue and green", 2, false, "cacaw");
		Bat vampire = new VampireBat(false, 1f, .6f, "brown", 2, true, "screetch");
		Bear panda = new Panda(true, 150f, 3f, "black and white", 4, true, "squeak", true);
		Wolf arctic = new ArcticWolf(false, 100f, 2.8f, "white", 4, false, "howl", true); 
		Monkey yellow = new YellowBaboon(false, 56.9f, 3f, "tan", 2, false, "eeeee", true);
		Alligator china = new ChineseAlligator(true, 79f, .7f, "gray", 4, false, "hiss", true); 
		
		ourZoo.add(elephant); 
		ourZoo.add(giraffe);
		ourZoo.add(monkey); 
		ourZoo.add(alligator); 
		ourZoo.add(bat);
		ourZoo.add(lion); 
		ourZoo.add(bear); 
		ourZoo.add(rhino); 
		ourZoo.add(wolf); 
		ourZoo.add(peacock); 
		ourZoo.add(vampire); 
		ourZoo.add(panda); 
		ourZoo.add(arctic); 
		ourZoo.add(yellow); 
		ourZoo.add(china); 
		
		for(int i=0; i<ourZoo.size(); i++)
		{
		System.out.println(ourZoo.get(i));
		}
		
	}

}
