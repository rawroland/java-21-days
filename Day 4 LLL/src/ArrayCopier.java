
public class ArrayCopier {
  
  public static void main(String[] args) {
    int[] array1 = {7, 4, 8, 1, 4, 1, 4};
    float[] array2 = new float[array1.length];
    
    System.out.print("array1: [");
    for(int ctr = 0; ctr < array1.length; ctr++) {
      System.out.print(array1[ctr] + " ");
    }
    System.out.println("]");
    
    int count1 = 0;
    int count2 = 0;

    System.out.print("array2: [");
    while(count1++ < array1.length - 1) {
      array2[count2] = (float)array1[count1];
      if(array1[count1] == 1)
        continue;
      System.out.print(array2[count2++] + " ");
    }
    System.out.println("]");
  }
}
