
public class PrimeFinder {

	public static void main(String[] args) {
		PrimeFinder math = new PrimeFinder();
		System.out.println(math.doMath());
	}

	public String doMath() {
		int[] numbers = new int[1000];
		int whileCount = 0;
		String primeNumbers = "";

		// Initialises the array with every number required.
		while (whileCount < numbers.length) {
			numbers[whileCount] = whileCount;
			whileCount++;
		}

		for (int i = 2; i < numbers.length; i++) {
			if (numbers[i] % i == 0) {
				for (int j = 2; i * j < numbers.length; j++) {
					numbers[i * j] = 0;
				}
			}
			if (numbers[i] != 0) {
				primeNumbers += numbers[i] + ", ";
			}
		}

		return primeNumbers;
	}

}
