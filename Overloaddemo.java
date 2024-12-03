public class Overloaddemo {
    // Method with no parameters
    void display() {
        System.out.println("Display method with no parameters.");
    }

    // Method with one integer parameter
    void display(int number) {
        System.out.println("Display method with one integer parameter: " + number);
    }

    // Method with two parameters (integer and string)
    void display(int number, String message) {
        System.out.println("Display method with two parameters: " + number + ", " + message);
    }

    // Method with one double parameter
    void display(double value) {
        System.out.println("Display method with one double parameter: " + value);
    }

    public static void main(String[] args) {
        Overloaddemo demo = new Overloaddemo();

        // Call the method with no parameters
        demo.display();

        // Call the method with one integer parameter
        demo.display(42);

        // Call the method with two parameters
        demo.display(7, "Hello");

        // Call the method with one double parameter
        demo.display(3.14);
    }
}
