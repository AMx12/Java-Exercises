
public class ArrayExample {

	public static void main(String[] args) {
		int[] exArrayOne = { 1, 2, 3, 4, 5 };
		// int[] exArrayTwo = { 0, 9, 3, 2, 8 };
		for (int i : exArrayOne) {
			System.out.println(i);
		}
		for (int i : exArrayOne) {
			// System.out.println(i = i * 10);
		}
		for (int i = 0; i < exArrayOne.length; i++) {
			exArrayOne[i] = exArrayOne[i] * 10;
			System.out.println(exArrayOne[i]);
		}
	}

}