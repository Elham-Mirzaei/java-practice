package mortgageCalculator;

import static mortgageCalculator.GetInput.readNumber;
import static mortgageCalculator.MortgageCalculator.calculateMortgage;
import static mortgageCalculator.PrintOutput.printOutput;

/**
 * here we calculate the mortgage based on Principal (the amount) and
 * annual interest and the period of the mortgage.
 *
 * @author Elham.Mirzaei
 */
public class Main {

	public static void main(String[] args) {

		int principal = (int) readNumber("Principal:", 1000, 1000000);
		double annualInterestRate = readNumber("Annual Interest Rate:", 1, 30);
		int period = (int) readNumber("Period (Years):", 1, 30);

		double mortgage = calculateMortgage(principal, annualInterestRate, period);

		printOutput(principal, annualInterestRate, period, mortgage);
	}

}
