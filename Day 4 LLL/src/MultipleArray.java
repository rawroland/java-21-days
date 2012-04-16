
public class MultipleArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] dayValue = new int[52][7];
		int ctr = 0;
		int totalLength = 0;
		while( ctr < dayValue.length) {
		  totalLength += dayValue[ctr].length;
		  ctr++;
		}
		int day = 1;
		for(int i = 0; i < dayValue.length; i++){
		  for(int j = 0; j < dayValue[i].length; j++){
		    System.out.print(day + ", ");
		    day++;
		  }
		}
	}

}
