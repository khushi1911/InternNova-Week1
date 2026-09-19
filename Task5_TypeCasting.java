public class Task5_TypeCasting {

    public static void main(String[] args) {

        // Implicit Type Casting
        int num = 25;
        double implicit = num;

        System.out.println("Implicit Type Casting:");
        System.out.println("Before: " + num);
        System.out.println("After: " + implicit);

        // Explicit Type Casting
        double value = 25.75;
        int explicit = (int) value;

        System.out.println("\nExplicit Type Casting:");
        System.out.println("Before: " + value);
        System.out.println("After: " + explicit);
    }
}