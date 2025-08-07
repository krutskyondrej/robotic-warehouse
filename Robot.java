package model;

/*
 * Main application class Robot
 * 
 * @author Ondrej Krutsky
 */

public class Robot {
	
	private String id;
	private String name;
	private String status;
	private int batteryLevel;
	private String currentTask;
	private String location;
	
	/*
	 * Constructor
	 */
	public Robot(String id, String name) {
		this.id = id;
		this.name = name;
		this.status = 'IDLE';
		this.batteryLevel = 100;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void assignTask(String taskID) {
		this.currentTaks = taskId;
		this.status = 'WORKING';
	}
	
	

}
