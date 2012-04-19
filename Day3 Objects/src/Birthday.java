
import java.util.StringTokenizer;
public class Birthday {

  /**
   * @param args
   */
  public static void main(String[] args) {
    String birthday = new String("30/09/1987");
    StringTokenizer str = new StringTokenizer(birthday, "/");
    System.out.println("The birthday split into its components is: ");
    System.out.println("The day is: " + str.nextToken());
    System.out.println("The month is: " + str.nextToken());
    System.out.println("The year is: " + str.nextToken());

  }

}
