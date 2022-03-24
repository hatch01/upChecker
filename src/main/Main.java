import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import log4j.properties;
class Main {
  public static void main(String[] args) throws Exception {
    // Create a neat value object to hold the URL
    URL url = new URL("http://www.google.com/");
    //more code goes here

  log4j.rootLogger=DEBUG, ConsoleAppender, FileAppender;

    // Open a connection(?) on the URL(??) and cast the response(???)
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();

    // This line makes the request
    InputStream responseStream = connection.getInputStream();
    
    // Finally we have the response
    String text = new String(responseStream.readAllBytes()/*,StandardCharsets.UTF_8*/);

    System.out.println(text);

  }
}