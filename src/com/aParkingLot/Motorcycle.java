package com.aParkingLot;

public class Motorcycle extends Vehicle
{
	private boolean sideCar = false; 
	
	
	public Motorcycle(boolean running, String color, String condition, boolean fueledUp, int numberOfSeats, int wheels,
			boolean sideCar) {
		super(running, color, condition, fueledUp, numberOfSeats, wheels);
		this.sideCar = sideCar;
	}
		public void doWeHaveASideCar()
		{
			if(sideCar)
			{
				wheels += 1;
				numberOfSeats += 1; 
			}
		
		}
		public boolean isSideCar() {
			return sideCar;
		}
		public void setSideCar(boolean sideCar) {
			this.sideCar = sideCar;
		}
}
