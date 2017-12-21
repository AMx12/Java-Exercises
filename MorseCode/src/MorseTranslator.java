import java.util.HashMap;
import java.util.Scanner;

public class MorseTranslator {

	private HashMap<Character, String> alphaToCode = new HashMap<>();
	private HashMap<String, Character> codeToAlpha = new HashMap<>();

	public MorseTranslator() {
		setup();
	}

	public static void main(String[] args) {
		MorseTranslator convert = new MorseTranslator();
		Scanner scan = new Scanner(System.in);
		String dicSelect;

		do {

			System.out.print("Would you like to translate (English) to Morse Code or (Morse) Code to English? ");
			dicSelect = scan.nextLine();

			if (dicSelect.equalsIgnoreCase("English")) {
				System.out.println();
				System.out.print("Enter input: ");
				String userInput = scan.nextLine();
				System.out.println(convert.alphaToMorse(userInput.toLowerCase()));
			}

			else if (dicSelect.equalsIgnoreCase("Morse")) {
				System.out.println();
				System.out.print("Enter input: ");
				String userInput = scan.nextLine();
				System.out.println(convert.morseToAlpha(userInput.toLowerCase()));
			}

			else if (!dicSelect.equalsIgnoreCase("quit")) {
				System.out.println();
				System.out.println("Invalid choice. Please enter English or Morse.");
			}
		} while (!dicSelect.equalsIgnoreCase("quit"));

		System.out.println("Program quit.");

		scan.close();
	}

	public void setup() {
		char[] Alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ' ' };

		String[] morseCode = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
				"--", "-.", "---", ".---.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
				".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "/" };

		// Links each alpha character to its morse equivalent in the hashmap and vice
		// versa
		for (int i = 0; i < Alphabet.length; i++) {
			alphaToCode.put(Alphabet[i], morseCode[i]);
			codeToAlpha.put(morseCode[i], Alphabet[i]);
		}

	}

	public String alphaToMorse(String userInput) {
		String temp = "";

		// Grabs every individual character, translates into morse and sticks it all
		// together in a string
		for (int j = 0; j < userInput.length(); j++) {
			char c = userInput.charAt(j);
			// If the character exists then return the translation ...
			if (alphaToCode.containsKey(c)) {
				temp += alphaToCode.get(c) + " ";
				// ... otherwise return whatever was entered
			} else {
				temp += c;
			}
		}

		// Removes spaces from start and end of string
		return temp.trim();
	}

	public String morseToAlpha(String userInput) {
		String temp = "";

		// Splits a string into an array using " " as the splitter
		// Try not to use regular expressions \ $ | .
		String[] parts = userInput.split(" ");

		// Translates every morse character back to English
		for (int j = 0; j < parts.length; j++) {
			if (codeToAlpha.containsKey(parts[j])) {
				temp += codeToAlpha.get(parts[j]);
			} else {
				temp += " *" + parts[j] + "* ";
			}
		}

		// Removes spaces from start and end of string
		return temp.trim();
	}

}
