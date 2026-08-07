package mortgageCalculator;

import java.util.Scanner;

/**
 * TODO here we calculate the mortgage based on Principal (the amount) and
 * annual interest and the period of the mortgage.
 *
 * @author Elham.Mirzaei
 */
public class MortgageCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int principal = (int) readNumber("Principal:", 1000, 1000000);
		double annualInterestRate = readNumber("Annual Interest Rate:", 1, 30);
		int period = (int) readNumber("Period (Years):", 1, 30);

		double mortgage = calculateMortgage(principal, annualInterestRate, period);

		printOutput(principal, annualInterestRate, period, mortgage);
	}

	private static void printOutput(int principal, double annualInterestRate, int period, double mortgage) {
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

	/**
	 * @param principal
	 * @param annualInterestRate
	 * @param period
	 * @return mortgage
	 */
	public static double calculateMortgage(int principal, double annualInterestRate, int period) {

		double monthlyInterestRate = annualInterestRate / 100 / 12;
		int numberOfPayments = period * 12;

		double mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
				/ (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
		return mortgage;
	}

	public static double calculateBalance(int principal, double annualInterestRate, int period, int paymentsMade) {

		double monthlyInterestRate = annualInterestRate / 100 / 12;
		int numberOfPayments = period * 12;

		double balance = principal
				* (Math.pow((1 + monthlyInterestRate), numberOfPayments)
						- Math.pow((1 + monthlyInterestRate), paymentsMade))
				/ (Math.pow((1 + monthlyInterestRate), numberOfPayments) - 1);

		return balance;
	}

}
