
public class DisplayDate {


  public static void main(String[] args) {
    int yearIn = 2012;
    
    if(args.length > 0) {
      yearIn = Integer.parseInt(args[0]);
    }
    
    int[] days = new int[13];
    for(int ctr = 0; ctr < 12; ctr++) {
      int monthIn = ctr + 1;
      days[monthIn] = countDays(monthIn, yearIn);
      for( int dayCtr = 1; dayCtr <= days[monthIn]; dayCtr++) {
        System.out.println("Date: " + String.format("%02d", dayCtr) + "/" + monthIn + "/" + yearIn);
      }
    }
  }

/**
 * Calculate the number of days for the given month 
 * and year
 * @param int month Given month as an integer 
 * @param int year Given year as an integer
 * @return int The number of days for the given month and year.
 */
  static int countDays(int month, int year) {
    int count = -1;
    switch (month) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        count = 31;
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        count = 30;
        break;
      case 2:
        if( (year % 4 == 0 ) || ((year % 100 != 0) && (year % 400 == 0))) {
          count = 29;
        } else {
          count = 28;
        }
      default:
        break;
          
    }
    return count;
  }
}