package model;

public class Motor {
	
	private int id;
	private int speed;
	private int maxSpeed;
	private boolean status; // true on, false off;
	
	public Motor (String id, int maxSpeed) {
		this.id = id;
		this.maxSpeed = maxSpeed;
		this.speed = 0;
	}
	
	public void start() {
		this.status = true;
	}
	
	public void stop() {
	}
	
	public void setSpeed() {
	}
	
	public void setDirection() {
		
	}
	
	public String getStatus() {
		
	}

}
