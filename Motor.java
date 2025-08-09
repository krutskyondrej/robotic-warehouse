package model;

public class Motor {
	
	private int id;
	private int speed;
	private int maxSpeed;
	private boolean status;
	private boolean isRunning;
	
	
	/*
	 * Creates a new class Motor
	 * 
	 * @param id
	 * @param maxSpeed
	 * 
	 */
	public Motor (String id, int maxSpeed) {
		
	}
	
	public void start(int speed) {
		
		if(!isRunning) { 
			if (speed < 0 || speed > 100) {
				System.out.println("Speed must be between 0 and 100");
				return;				
			}
				this.speed = speed;
				isRunning = true;
				System.out.println("Motor started at speed: " + speed);				
			} else {
				System.out.println("Motor is already running");
			
		}
		
	}
	
	public void stop(int speed) {
		
		if(isRunning) {
			isRunning = false;
			speed = 0;
			System.out.println("Motor stopped");
		} else {
			System.out.println("Motor is not running");
		}
	}
	
	public void setSpeed() {
	}
	
	public void setDirection() {
		
	}
	
	public String getStatus() {
		
	}

}
