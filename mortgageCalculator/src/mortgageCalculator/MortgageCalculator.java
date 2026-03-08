package mortgageCalculator;

import java.util.Scanner;

// Mortgage =principal[ i(1 + i)^n ] / [ (1 + i)^n – 1 ]
// M = Monthly Payment (Principal & Interest)
//principal= Principal Loan Amount (the total borrowed)
// i = Monthly Interest Rate (Annual Rate / 12)
// n = Total Number of Payments (Loan Term in Years * 12)

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
		Scanner scanner = new Scanner(System.in);

		int principal = readPrincipal(scanner);
		double annualInterestRate = readAnnualInterestRate(scanner);
		int period = readPeriod(scanner);

		double mortgage = calculateMortgage(principal, annualInterestRate, period);

		System.out.printf("Mortgage: $%.2f%n", mortgage);

		scanner.close();
	}

	/**
	 * @param scanner
	 * @return principal
	 */
	public static int readPrincipal(Scanner scanner) {
		int principal;
		while (true) {
			System.out.print("Principal ($1k - $1M): ");
			principal = scanner.nextInt();
			if (principal >= 1000 && principal <= 1000000)
				break;
			System.out.println("Enter a number between 1000 and 1000000.");
		}
		return principal;
	}

	/**
	 * @param scanner
	 * @return annualInterestRate
	 */
	public static double readAnnualInterestRate(Scanner scanner) {
		double annualInterestRate;
		while (true) {
			System.out.println("Annual Interest Rate: ");
			annualInterestRate = scanner.nextDouble();
			if (annualInterestRate <= 30 && annualInterestRate > 0)
				break;
			System.out.println("Please enter a value greater than 0 and less than or equal to 30!");
		}
		return annualInterestRate;
	}

	/**
	 * @param scanner
	 * @return period
	 */
	public static int readPeriod(Scanner scanner) {
		int period;
		while (true) {
			System.out.println("Period (Years): ");
			period = scanner.nextInt();
			if (period >= 1 && period <= 30)
				break;
			System.out.println("Enter a value between 1 and 30!");
		}
		return period;
	}

	/**
	 * @param principal
	 * @param annualInterestRate
	 * @param period
	 * @return mortgage
	 */
	public static double calculateMortgage(int principal, double annualInterestRate, int period) {
		double i = annualInterestRate / 100 / 12;
		int n = period * 12;

		double mortgage = principal * (i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);
		return mortgage;
	}

}
