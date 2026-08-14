package mortgageCalculator;

public class MortgageCalculator {

    private final int principal;
    private final double annualInterestRate;
    private final int period;

    public MortgageCalculator(int principal, double annualInterestRate, int period) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.period = period;
    }

    public double calculateMortgage() {

        double monthlyInterestRate = getMonthlyInterestRate(annualInterestRate);
        int numberOfPayments = getNumberOfPayments();

        return principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
    }

    public double calculateBalance(int paymentsMade) {

        double monthlyInterestRate = getMonthlyInterestRate(annualInterestRate);
        int numberOfPayments = getNumberOfPayments();

        return principal
                * (Math.pow((1 + monthlyInterestRate), numberOfPayments)
                - Math.pow((1 + monthlyInterestRate), paymentsMade))
                / (Math.pow((1 + monthlyInterestRate), numberOfPayments) - 1);
    }

    public int getNumberOfPayments() {
        return period * 12;
    }

    private static double getMonthlyInterestRate(double annualInterestRate) {
        return annualInterestRate / 100 / 12;
    }

    public double[] getRemainingBalances() {
        var balances = new double[getNumberOfPayments()];
        for (int month = 1; month <= getNumberOfPayments(); month++) {
            double balance = calculateBalance(month);
            balances[month -1] = balance;
        }
        return balances;
    }
}
