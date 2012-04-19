
public class Passer {

  void toUpperCase(String[] text) {
    for(int i= 0; i < text.length; i++) {
      text[i] =text[i].toUpperCase();
    }
  }
  /**
   * @param args
   */
  public static void main(String[] args) {
    
    Passer passer = new Passer();
    passer.toUpperCase(args);
    
    for(int i = 0; i < args.length; i++) {
      System.out.print(args[i] + " ");
    }
  }

}
