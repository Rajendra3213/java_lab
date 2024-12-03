import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Declare and initialize the array
        double[] numbers = new double[n];

        // Input values into the array
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        // Calculate the sum of the numbers
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }

        // Calculate and print the average
        double average = sum / n;
        System.out.println("The average of the given numbers is: " + average);

        scanner.close();
    }
}
