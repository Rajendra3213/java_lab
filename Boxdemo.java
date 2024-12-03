
public class Boxdemo {
    public static void main(String[] args) {
        // Create a Box object using the constructor
        Box box1 = new Box(10, 20, 15);

        // Display dimensions of the box
        System.out.println("Box 1 Dimensions:");
        box1.displayDimensions();

        // Calculate and display the volume of the box
        double volume1 = box1.calculateVolume();
        System.out.println("Volume of Box 1: " + volume1);

        // Create another Box object with different dimensions
        Box box2 = new Box(5, 8, 3);

        // Display dimensions of the second box
        System.out.println("\nBox 2 Dimensions:");
        box2.displayDimensions();

        // Calculate and display the volume of the second box
        double volume2 = box2.calculateVolume();
        System.out.println("Volume of Box 2: " + volume2);
    }
}
