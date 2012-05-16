import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class SuggestsReader {

  private URL baseURL = null;
  String relativeSuggests = "autocomplete.php?term=son";
  
  public SuggestsReader() {
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
    
  }
  
  private String getSuggestions() {
    try{
      URL suggestsURL = new URL(this.baseURL, this.relativeSuggests);
      HttpURLConnection connection = (HttpURLConnection) suggestsURL.c
    } catch (MalformedURLException malformed) {
      System.out.println("Malformed baseURL: " + malformed.toString());
    }
    return null;
  }

}
