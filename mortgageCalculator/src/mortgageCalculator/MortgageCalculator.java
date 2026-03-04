package mortgageCalculator;

import java.util.Scanner;

//M = P [ i(1 + i)^n ] / [ (1 + i)^n – 1 ]
//M = Monthly Payment (Principal & Interest)
//P = Principal Loan Amount (the total borrowed)
//i = Monthly Interest Rate (Annual Rate / 12)
//n = Total Number of Payments (Loan Term in Years * 12) 

public class MortgageCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int principal = principle(scanner);
		float anualInterestRate = annualInterestRate(scanner);
		int period = period(scanner);

		double M = mortgageCalculator(principal, anualInterestRate, period);

		System.out.println("Mortgate: " + "$" + M);

		scanner.close();
	}

	public static double mortgageCalculator(int principal, float anualInterestRate, int period) {
		int P = principal;
		double i = anualInterestRate / 100 / 12;
		int n = period * 12;

		double M = P * (i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);
		return M;
	}

	public static int period(Scanner scanner) {
		System.out.println("Period (Years): ");
		int period = scanner.nextInt();
		while (period > 30 || period < 1) {
			System.out.println("please enter a value between 1 and 30");
			System.out.println("Period (Years): ");
			period = scanner.nextInt();
		}
		System.out.println("Period (Years): " + period);
		return period;
	}

	public static float annualInterestRate(Scanner scanner) {
		System.out.println("Annual Interest Rate: ");
		float anualInterestRate = scanner.nextFloat();
		while (anualInterestRate >= 30 || anualInterestRate < 0) {
			System.out.println("please enter a valid value greaterthan 0, and less than or equal to 30");
			System.out.println("Annual Interest Rate: ");
			anualInterestRate = scanner.nextFloat();
		}
		System.out.println("Annual Interest Rate: " + anualInterestRate);
		return anualInterestRate;
	}

	public static int principle(Scanner scanner) {
		System.out.println("Principal ($1k - $1M): ");
		int principal = scanner.nextInt();
		while (principal > 1000000 || principal < 1000) {
			System.out.println("Enter a number between 1000 and 1000000.");
			System.out.println("Principal ($1k - $1M): ");
			principal = scanner.nextInt();
		}
		System.out.println("Principal entered: " + principal);
		return principal;
	}
}