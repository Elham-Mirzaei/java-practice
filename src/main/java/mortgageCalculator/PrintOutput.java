package mortgageCalculator;

import static mortgageCalculator.Balance.calculateBalance;

public class PrintOutput {
    static void printOutput(int principal, double annualInterestRate, int period, double mortgage) {
        System.out.printf("MORTGAGE%n");
        System.out.printf("-----------%n");
        System.out.printf("Monthly Payments: $%.2f%n%n", mortgage);
        System.out.printf("PAYMENT SCHEDULE%n");
        System.out.printf("----------------%n");
        for (int month = 1; month <= period * 12; month++) {
            double balance = calculateBalance(principal, annualInterestRate, period, month);
            System.out.printf("$%.2f%n", balance);
        }
    }
}
