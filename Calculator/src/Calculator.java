import java.util.ArrayList;
import java.util.Collections;

public class Calculator {

	public static void main(String[] args) {

		Calculator calc = new Calculator();

		System.out.println(calc.possibilities(4, 2, 5));

	}

	public String possibilities(int a, int b, int c) {

		ArrayList<Integer> values = new ArrayList<Integer>();

		values.add(a);
		values.add(b);
		values.add(c);
		Collections.sort(values);

		int lowest = values.get(0);
		int mid = values.get(1);
		int biggest = values.get(2);
		String possible1 = "";
		String possible2 = "";

		String solutions = "";

		if (mid * lowest == biggest) {
			// a_Seats += ((i + 1) + " "
			possible1 = lowest + " * " + mid + " = " + biggest + ", " + mid + " * " + lowest + " = " + biggest + ", "
					+ biggest + " / " + mid + " = " + lowest + ", " + biggest + " / " + lowest + " = " + mid;

			solutions = possible1;

		} else if (mid + lowest == biggest) {
			possible2 = lowest + " + " + mid + " = " + biggest + ", " + mid + " + " + lowest + " = " + biggest + ", "
					+ biggest + " - " + mid + " = " + lowest + ", " + biggest + " - " + lowest + " = " + mid;

			solutions = possible2;
		} else {

			solutions = "No Match";
		}

		return solutions;
	}

}
