import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONException;

public class SuggestsReader {

  private URL baseURL = null;
  String relativeSuggests = "autocomplete.php?term=sams";
  
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
    System.out.println("Suggestions: " + new SuggestsReader().getSuggestions());
  }
  
  private String getSuggestions() {

    String jsonSuggestions = "";
    JSONArray suggestionsArray = null;
    String dataChecker = null;
    try{
      URL suggestsURL = new URL(this.baseURL, this.relativeSuggests);
      HttpURLConnection connection = (HttpURLConnection) suggestsURL.openConnection();
      System.out.println("URL connection opened.");
      InputStream is = (InputStream) connection.getContent();
      InputStreamReader isReader = new InputStreamReader(is, "UTF-8");
      BufferedReader reader = new BufferedReader(isReader);
      System.out.println("Getting data...");
      do {
        dataChecker = reader.readLine();
        if ( dataChecker != null) {
          System.out.println("Step");
          jsonSuggestions += dataChecker;
        }
        System.out.println("Data: " /*+ jsonSuggestions*/ + "::" + dataChecker);
      } while (dataChecker != null);
    } catch (MalformedURLException malformed) {
      System.out.println("Malformed baseURL: " + malformed.toString());
    } catch (IOException io) {
      System.out.println("IO exception: " + io.toString());
    }
    try {
      suggestionsArray =new JSONArray(jsonSuggestions);
    } catch(JSONException jsonexception) {
      System.out.println("Json exception: " + jsonexception.getMessage());
    } catch (NullPointerException nullPex) {
      System.out.println("Null pointer exception: " + nullPex.getMessage());
    }
    return jsonSuggestions;
  }

}
