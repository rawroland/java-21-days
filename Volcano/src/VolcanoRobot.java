
/**
 * 
 * @author roland
 * 
 */
public class VolcanoRobot {
	String status; 
	int speed;
	float temperature;
	
	/**
	 * Check the temperature and set variables
	 */
	public void checkTemperature() {
	  if ( temperature > 660 ) {
	    status = "returning home";
	    speed = 5;
	  }
	}
	
	/**
	 * Display variables.
	 */
	public void showAttributes() {
	  System.out.println("Status: " + status);
    System.out.println("Speed: " + speed);
    System.out.println("Temperature: " + temperature);
	}
}
