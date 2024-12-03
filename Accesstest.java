// Class to demonstrate public and private access
class TestClass {
    // Public field
    public String publicField = "I am public!";
    
    // Private field
    private String privateField = "I am private!";

    // Public method
    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    // Private method
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    // Method to access privateField and privateMethod from within the class
    public void accessPrivateMembers() {
        System.out.println("Accessing private field: " + privateField);
        privateMethod();
    }
}

public class Accesstest {
    public static void main(String[] args) {
        // Create an instance of TestClass
        TestClass testObj = new TestClass();

        // Access the public field
        System.out.println(testObj.publicField);

        // Access the public method
        testObj.publicMethod();

        // Try to access the private field (this will cause a compile-time error)
        // System.out.println(testObj.privateField); // Uncomment to see the error

        // Try to access the private method (this will cause a compile-time error)
        // testObj.privateMethod(); // Uncomment to see the error

        // Access private members using a public method
        testObj.accessPrivateMembers();
    }
}
