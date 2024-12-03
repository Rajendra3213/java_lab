public class UseStatic {
    
    // Static variable
    static int count = 0;

    // Static block
    static {
        // This block is executed only once when the class is loaded
        System.out.println("Static block executed.");
        count = 100; // Initialize static variable
    }

    // Static method
    static void display() {
        System.out.println("Static method executed. Count is: " + count);
    }

    // Instance method
    void instanceMethod() {
        System.out.println("Instance method executed.");
    }

    public static void main(String[] args) {
        // Access static variable and method directly through the class
        System.out.println("Initial count: " + UseStatic.count);
        
        // Calling the static method
        UseStatic.display();

        // Creating an object of the class to access instance methods
        UseStatic obj = new UseStatic();
        obj.instanceMethod();

        // Modify the static variable using the class name
        UseStatic.count = 200;
        System.out.println("Updated count: " + UseStatic.count);
        
        // Calling static method after modifying the static variable
        UseStatic.display();
    }
}
