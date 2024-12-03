import java.net.URL;

public class URLExample {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://example.com:8080/docs/resource.html?query=java#section1");

        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
        System.out.println("Port: " + url.getPort());
        System.out.println("File: " + url.getFile());
        System.out.println("Path: " + url.getPath());
        System.out.println("Query: " + url.getQuery());
        System.out.println("Ref: " + url.getRef());
    }
}
