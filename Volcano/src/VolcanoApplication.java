/**
 * @author roland
 *
 */
public class VolcanoApplication {
  
  public static void main(String[] arguments) {
    VolcanoRobot dante = new VolcanoRobot();
    dante.status = "exploring";
    dante.speed = 2;
    dante.temperature = 510;
    
    VolcanoRobot virgil = new VolcanoRobot();
    virgil.status = "Resting";
    virgil.speed = 0;
    virgil.temperature = 400;
    
    virgil.showAttributes();
    dante.showAttributes();
    System.out.println("Increasing speed to 3.");
    dante.speed = 3;
    dante.showAttributes();
    System.out.println("Changing temperature to 670.");
    dante.temperature = 670;
    dante.showAttributes();
    System.out.println("Checking the temperature.");
    dante.checkTemperature();
    dante.showAttributes();
  }
}
