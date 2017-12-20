import java.util.HashMap;
import java.util.Scanner;

public class MorseTranslator {

	public static void main(String[] args) {
		MorseTranslator convert = new MorseTranslator();
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a word: ");
		String userInput = scan.nextLine();
		System.out.println(convert.morseToAlpha(userInput.toLowerCase()));
		scan.close();
	}

	public String alphaToMorse(String userInput) {
		HashMap<Character, String> translator = new HashMap<>();

		char[] Alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ' ' };

		String[] morseCode = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
				"--", "-.", "---", ".---.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
				".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "/" };

		// Links each alpha character to its morse equivalent in the hashmap
		for (int i = 0; i < Alphabet.length; i++) {
			translator.put(Alphabet[i], morseCode[i]);
		}

		String temp = "";

		// Grabs every individual character, translates into morse and sticks it all
		// together in a string
		for (int j = 0; j < userInput.length(); j++) {
			char c = userInput.charAt(j);
			// If the character exists then return the translation ...
			if (translator.containsKey(c)) {
				temp += translator.get(c) + " ";
				// ... otherwise return whatever was entered
			} else {
				temp += c;
			}
		}

		return temp;

	}

	public String morseToAlpha(String userInput) {
		HashMap<String, Character> translator = new HashMap<>();

		char[] Alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ' ' };

		String[] morseCode = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
				"--", "-.", "---", ".---.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
				".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "/" };

		for (int i = 0; i < Alphabet.length; i++) {
			translator.put(morseCode[i], Alphabet[i]);
		}

		String temp = "";

		// Splits a string into an array using " " as the splitter
		// Try not to use regular expressions \ $ | .
		String[] parts = userInput.split(" ");

		// Translates every morse character back to English
		for (int j = 0; j < parts.length; j++) {
			if (translator.containsKey(parts[j])) {
				temp += translator.get(parts[j]);
			} else {
				temp += " *" + parts[j] + "* ";
			}
		}

		return temp;
	}

}
