
public class WordToNumber {

  /**
   * @param args
   */
  public static void main(String[] args) {
    String numberWord = "";
    int number = 0;
    if( args.length > 0){
      numberWord = args[0];
    }
    
    switch (numberWord.charAt(0)) {
      case 'o':
        number = 1;
        break;
      case 't':
        if( numberWord.charAt(1) == 'w') {
          number = 2;
        } else if( numberWord.charAt(1) == 'h') {
          number = 3;
        } else if( numberWord.charAt(1) == 'e') {
          number = 10;
        }
        break;
      case 'f':
        if( numberWord.charAt(1) == 'o') {
          number = 4;
        } else if( numberWord.charAt(1) == 'i') {
          number = 5;
        }
        break;
      case 's':
        if( numberWord.charAt(1) == 'i') {
          number = 6;
        } else if( numberWord.charAt(1) == 'e') {
          number = 7;
        }
        break;
      case 'e':
        number = 8;
        break;
      case 'n':
        number = 9;
        break;
      default:
        number = 0;
        break;
          
    }
    
    System.out.println("Number = " + number);
  }

}
