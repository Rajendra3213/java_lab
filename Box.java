public class Box {
    // Attributes of the box
    double width;
    double height;
    double depth;

    // Constructor to initialize dimensions
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate and return the volume
    public double calculateVolume() {
        return width * height * depth;
    }

    // Method to display box dimensions
    public void displayDimensions() {
        System.out.println("Width: " + width + ", Height: " + height + ", Depth: " + depth);
    }
}
