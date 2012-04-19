
public class Dimensions {
  
  public static void main(String[] args) {
    DimensionsHelper dim = new DimensionsHelper(20, 30, 40);
    System.out.println("The dimensions are: ");
    System.out.println("Height: " + dim.height);
    System.out.println("Weight: " + dim.weight);
    System.out.println("Depth: " + dim.depth);
  }
}

class DimensionsHelper {  
  int height; 
  int weight; 
  int depth;
  
  DimensionsHelper(int height, int weight, int depth) {
    this.height = height;
    this.weight = weight;
    this.depth = depth;
  }
}
