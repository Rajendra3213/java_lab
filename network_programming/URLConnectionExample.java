import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLConnectionExample {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.example.com");
        URLConnection connection = url.openConnection();

        System.out.println("Content Type: " + connection.getContentType());
        System.out.println("Content Length: " + connection.getContentLength());

        try (Scanner scanner = new Scanner(connection.getInputStream())) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
    }
}
