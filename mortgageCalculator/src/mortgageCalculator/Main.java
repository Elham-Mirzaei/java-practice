package mortgageCalculator;

public class Main {
	public static void main(String[] args) {
		String firstName = "Elham";
		String lastName = "Miezaei";
		String message = greetUser(firstName, lastName);
	}
	
	public static String greetUser(String firstName, String lastName) {
		return ("Hello " + firstName + " " + lastName);
	}
}
