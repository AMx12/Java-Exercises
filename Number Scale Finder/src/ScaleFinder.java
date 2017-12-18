import java.util.Scanner;

public class ScaleFinder {
	public static void main(String[] args) {
		ScaleFinder find = new ScaleFinder();
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter a number: ");
		String strInput = userInput.nextLine();
		System.out.println(find.findScale(strInput));

		userInput.close();

		// System.out.println(find.findScale("123456789123456789123456"));

	}

	public String findScale(String input) {
		String shortScale = "";
		String longScale = "";
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) % input.charAt(i) == 0) {
				shortScale += input.charAt(i);
				switch (input.length() - i) {
				case 22: // 22~24 digits
					shortScale += " sextillion ";
					break;
				case 19: // 19~21 digits
					shortScale += " quintillion ";
					break;
				case 16: // 16~18 digits
					shortScale += " quadrillion ";
					break;
				case 13: // 13~15 digits
					shortScale += " trillion ";
					break;
				case 10: // 10~12 digits
					shortScale += " billion ";
					break;
				case 7: // 7~9 digits
					shortScale += " million ";
					break;
				case 4: // 4~6 digits
					shortScale += " thousand and ";
				}
			} else {
				output = "Please enter an actual number.";
			}
		}
		for (int j = 0; j < input.length(); j++) {
			if (input.charAt(j) % input.charAt(j) == 0) {
				longScale += input.charAt(j);
				switch (input.length() - j) {
				case 22: // 22~24 digits
					longScale += " trilliard ";
					break;
				case 19: // 19~21 digits
					longScale += " trillion ";
					break;
				case 16: // 16~18 digits
					longScale += " billiard ";
					break;
				case 13: // 13~15 digits
					longScale += " billion ";
					break;
				case 10: // 10~12 digits
					longScale += " milliard ";
					break;
				case 7: // 7~9 digits
					longScale += " million ";
					break;
				case 4: // 4~6 digits
					longScale += " thousand and ";
				}
			} else {
				output = "Please enter an actual number.";
			}
		}
		output = shortScale + "\n" + longScale;
		return output;
	}
}
