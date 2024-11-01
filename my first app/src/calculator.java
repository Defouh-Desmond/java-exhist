import java.util.Scanner; // Import Scanner class

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object
        
        // Get first number
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        // Get operation sign
        System.out.print("Enter operation (+, -, *, /): ");
        String sign = scanner.next();

        if (sign.equals("+") ||sign.equals("-")||sign.equals("*") ||sign.equals("/")) {
            System.out.println("No such entries! Please use +, -, *, or /");
        }

        // Get second number
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        if (sign.equals("+")) {
            int answer = num1 + num2;
            System.out.println("Result: " + answer);
        } else if (sign.equals("-")) {
            int answer = num1 - num2;
            System.out.println("Result: " + answer);
        } else if (sign.equals("*")) {
            int answer = num1 * num2;
            System.out.println("Result: " + answer);
        } else if (sign.equals("/")) {
            if (num2 != 0) {
                int answer = num1 / num2;
                System.out.println("Result: " + answer);
            } else {
                System.out.println("Error: Cannot divide by zero!");
            }
        } else {
            System.out.println("No such entries! Please use +, -, *, or /");
        }
        
        scanner.close(); // Close the scanner
    }
}
