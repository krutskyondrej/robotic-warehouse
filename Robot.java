/*
 * Main application class Robot
 * 
 * @author Ondrej Krutsky
 * Date 2025-08-07
 */

public class Robot {
	
	private String id;
	private String name;
	private String status;
	private int batteryLevel;
	private String currentTask;
	private String location;
	
	/*
	 * Constructor Robot
	 */
	public Robot(String id, String name) {
		this.id = id;
		this.name = name;
		this.status = status;
		this.batteryLevel = batteryLevel;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void assignTask(String taskID) {
		this.currentTaks = taskId;
		this.status = status;
	}
	
	

}

