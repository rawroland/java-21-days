
/**
 * @author roland
 *
 */
public class Weather {
  public static void main(String[] args) {
    float fah = 86;
    System.out.println(fah + " degrees Fahrenheit is ...");
    //To convert Fahrenheit into degrees
    //Begin by subtracting 32
    fah = fah - 32;
    //Divide answer by 9
    fah = fah / 9;
    //Multiply by 5
    fah = fah * 5;
    System.out.println(fah + " degrees Celcius\n");
    
    float cel = 33;
    System.out.println(cel + " degrees Celcius is ...");
    //To convert Celcius into Fahrenheit
    //Multiply answer by 9
    cel = cel * 9;
    //Begin by dividing by 5
    cel = cel / 5;
    //Add 32 to the answer
    cel = cel + 32;
    System.out.println(cel + " Fahrenheit\n");
  }
}
