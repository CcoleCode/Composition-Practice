/*
 * Author: Chelsea Cole
 * Date: March 14, 2022
 * IS A / HAS A Relationship Assignment
 * 
 */


public class Demo {

	public static void main(String[] args) {
		
		Engine e = new Engine(6, "400 horsepower");
		
		Wheel[] wheel = {new Wheel ("alloy", 45, "front-right"),//[0]
				new Wheel ("alloy", 45, "rear-left"),//[1]
				new Wheel ("alloy", 45, "front-left"),//[2]
				new Wheel ("alloy", 45, "rear-right")};//[3]
	
		// String color, int maxSpeed, String typeOfTank, int seatingCapacity, String make, int year, Engine engine,
		//Wheel[] wheels
		Car c = new Car("black", 100, "gas", 5, "Chrysler", 2021, e, wheel);
		
		c.getEngine().start();
		
	
		
		//Print wheel in 2nd index's sizeInInches 
		System.out.println(c.getWheels()[2].getSizeInInches());
		
		System.out.println("Type of tank: " + c.getTypeOfTank());
		
		System.out.println("Seating Capacity: " + c.getSeatingCapacity());
		
		//car object has an engine. engine class holds the function
		c.getEngine().stop();

	}

}
