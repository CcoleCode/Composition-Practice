/*
 * Author: Chelsea Cole
 * Date: March 14, 2022
 * IS A / HAS A Relationship Assignment
 * 
 */


public class Engine {

	private int rpm;
	private String type;
	
	
	
	
	public Engine(int rpm, String type) {
		super();
		this.rpm = rpm;
		this.type = type;
	}

	public void start() {
		
		System.out.println("Starting engine");
		
	}
	
	public void stop() {
		
		System.out.println("Stopping Engine");
		
	}

	public int getRpm() {
		return rpm;
	}

	public void setRpm(int rpm) {
		this.rpm = rpm;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
	
	
}
