package mortgageCalculator;

import java.util.Scanner;

public class GetInput {
    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a number between " + min + "and " + max + ".");
        }
        return value;
    }
}
