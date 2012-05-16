import java.net.MalformedURLException;
import java.net.URL;


public class WebReader {

  private URL baseURL = null;
  
  public WebReader() {
    try {
      baseURL = new URL("http://wertagent.com/"); 
    } catch (MalformedURLException malformed) {
      System.out.println("Malformed baseURL: " + malformed.toString());
    }
  }
  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}
