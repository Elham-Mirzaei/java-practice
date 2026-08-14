package mortgageCalculator;

public class MortgageReport  {
    void printOutput(MortgageCalculator calculator, double mortgage) {
        System.out.printf("MORTGAGE%n");
        System.out.printf("-----------%n");
        System.out.printf("Monthly Payments: $%.2f%n%n", mortgage);
        System.out.printf("PAYMENT SCHEDULE%n");
        System.out.printf("----------------%n");
        for (double balance : calculator.getRemainingBalances())
            System.out.printf("$%.2f%n", balance);
    }
}
