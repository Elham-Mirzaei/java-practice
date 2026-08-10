package mortgageCalculator;

public class Balance {
    public static double calculateBalance(int principal, double annualInterestRate, int period, int paymentsMade) {

        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int numberOfPayments = period * 12;

        return principal
                * (Math.pow((1 + monthlyInterestRate), numberOfPayments)
                - Math.pow((1 + monthlyInterestRate), paymentsMade))
                / (Math.pow((1 + monthlyInterestRate), numberOfPayments) - 1);
    }
}
