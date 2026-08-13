package mortgageCalculator;

import static mortgageCalculator.Console.readNumber;
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

		MortgageCalculator calculator = new MortgageCalculator(principal, annualInterestRate, period);
		double mortgage = calculator.calculateMortgage();
		MortgageReport report = new MortgageReport();
		report.printOutput(calculator, mortgage);
	}

}
