package mortgageCalculator;

public class MortgageCalculator {
    public static double calculateMortgage(int principal, double annualInterestRate, int period) {

        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int numberOfPayments = period * 12;

        return principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
    }
}
