// Base class: Shipment
class Shipment {
    protected String sender;
    protected String receiver;
    protected double weight;

    // Constructor to initialize Shipment details
    public Shipment(String sender, String receiver, double weight) {
        this.sender = sender;
        this.receiver = receiver;
        this.weight = weight;
    }

    // Method to display shipment details
    public void displayShipmentDetails() {
        System.out.println("Sender: " + sender);
        System.out.println("Receiver: " + receiver);
        System.out.println("Weight: " + weight + " kg");
    }
}

// Derived class: AirShipment extends Shipment
class AirShipment extends Shipment {
    private double airFare;

    // Constructor to initialize AirShipment details
    public AirShipment(String sender, String receiver, double weight, double airFare) {
        super(sender, receiver, weight); // Call the constructor of Shipment
        this.airFare = airFare;
    }

    // Method to display air shipment details
    @Override
    public void displayShipmentDetails() {
        super.displayShipmentDetails(); // Display details from the Shipment class
        System.out.println("Air Fare: $" + airFare);
    }
}

// Derived class: ExpressAirShipment extends AirShipment
class ExpressAirShipment extends AirShipment {
    private double expressCharge;

    // Constructor to initialize ExpressAirShipment details
    public ExpressAirShipment(String sender, String receiver, double weight, double airFare, double expressCharge) {
        super(sender, receiver, weight, airFare); // Call the constructor of AirShipment
        this.expressCharge = expressCharge;
    }

    // Method to display express air shipment details
    @Override
    public void displayShipmentDetails() {
        super.displayShipmentDetails(); // Display details from the AirShipment class
        System.out.println("Express Charge: $" + expressCharge);
    }
}

public class DemoShipment {
    public static void main(String[] args) {
        // Creating an instance of ExpressAirShipment
        ExpressAirShipment expressShipment = new ExpressAirShipment("John Doe", "Jane Smith", 10.5, 150.0, 50.0);

        // Displaying the shipment details
        expressShipment.displayShipmentDetails();
    }
}
