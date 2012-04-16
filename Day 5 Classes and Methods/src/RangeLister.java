
public class RangeLister {

  /**
   * Returns an array of integers with the range
   * @param int lower boundary
   * @param int upper upper boundary
   * @return int array of integers
   */
  int[] makeRange(int lower, int upper) {
    
    int[] range = new int[(upper - lower) + 1];
    
    //Crying for a while loop
    int key = 0;
    while(lower <= upper) {
      range[key++] = lower++;
    }
    return range;
  }
  
  /**
   * @param String arguments
   */
  public static void main(String[] argumentss) {
    int range[];
    RangeLister lister = new RangeLister();
    range = lister.makeRange(4, 13);
    System.out.print("The array is [");
    for(int i = 0; i < range.length; i++) {
      System.out.print(range[i] + " ");
    }
    System.out.println("]");
  }

}
