import java.util.Scanner;

public class DoubleChar {

	public static void main(String[] args) {
		DoubleChar doubleChar = new DoubleChar();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input to double up: ");
		System.out.println(doubleChar.doubleUp(scanner.nextLine()));

		scanner.close();
	}

	public String doubleUp(String input) {
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			output += input.charAt(i);
			output += input.charAt(i);
		}
		return output;
	}
}
