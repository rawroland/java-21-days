
public class HalfDollars {
  
  public static void main(String[] args) {
    
    int[] denver = {2500000, 2900000, 3500000};
    int[] philly = new int[denver.length];
    int[] total = new int[denver.length];
    int average;

    philly[0] = 2500000;
    philly[1] = 2900000;
    philly[2] = 3800000; 
 
    for(int ctr = 0; ctr < denver.length; ctr ++) {
      total[ctr] = denver[ctr] + philly[ctr];
      System.out.print(2003 + ctr + " production: ");
      System.out.format("%,d%n", total[ctr]);
    }
    average = (int)((total[0] + total[1] + total[2]) / 3);
    System.out.print("Average production: ");
    System.out.format("%,d%n", average);
  }
}
