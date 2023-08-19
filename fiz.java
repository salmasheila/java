import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        
        try {
            int number = scanner.nextInt();
            String result = fizzBuzz(number);
            System.out.println(result);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Input must be an integer.");
        }
    }
    
    public static String fizzBuzz(int number) {
        number = Math.abs(number);
        
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(number);
        }
    }
}