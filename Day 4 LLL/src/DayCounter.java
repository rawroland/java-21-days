
public class DayCounter {
  
  public static void main(String[] args) {
    int yearIn = 2012;
    int monthIn = 3;
    
    //Enough arguments provided?
    if( args.length > 0 ) {
      monthIn = Integer.parseInt(args[0]);
    }
    if( args.length > 1 ) {
      yearIn = Integer.parseInt(args[1]);
    }
    
    System.out.println(monthIn + "/" + yearIn + "has " 
        + countDays(monthIn, yearIn) + " days.");
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
