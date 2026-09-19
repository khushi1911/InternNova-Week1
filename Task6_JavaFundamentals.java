import java.util.Scanner;

public class Task6_JavaFundamentals {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        int intValue = sc.nextInt();

        System.out.print("Enter a float value: ");
        float floatValue = sc.nextFloat();

        System.out.print("Enter a double value: ");
        double doubleValue = sc.nextDouble();

        System.out.println("\n--- Original Values ---");
        System.out.println("Integer: " + intValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);

        // Implicit Type Casting
        double intToDouble = intValue;
        double floatToDouble = floatValue;

        System.out.println("\n--- Implicit Type Casting ---");
        System.out.println("Integer before: " + intValue);
        System.out.println("Integer after converting to double: " + intToDouble);

        System.out.println("Float before: " + floatValue);
        System.out.println("Float after converting to double: " + floatToDouble);

        // Explicit Type Casting
        int doubleToInt = (int) doubleValue;
        int floatToInt = (int) floatValue;

        System.out.println("\n--- Explicit Type Casting ---");
        System.out.println("Double before: " + doubleValue);
        System.out.println("Double after converting to int: " + doubleToInt);

        System.out.println("Float before: " + floatValue);
        System.out.println("Float after converting to int: " + floatToInt);

        sc.close();
    }
}