
public class PrimeFinder {

	public static void main(String[] args) {
		PrimeFinder math = new PrimeFinder();
		System.out.println(math.doMath());
	}

	public String doMath() {
		long[] numbers = new long[3000000];
		int whileCount = 0;
		String primeNumbers = "";

		// Initialises the array with every number required
		while (whileCount < numbers.length) {
			numbers[whileCount] = whileCount;
			whileCount++;
		}

		// Starting at 2, loops through all numbers in the array ...
		for (int i = 2; i < numbers.length; i++) {
			// ... finds any number that is a modulus of itself ...
			if (numbers[i] % i == 0) {
				// ... and sets their multiples to 0
				for (int j = 2; i * j < numbers.length; j++) {
					numbers[i * j] = 0;
				}
			}
			// Returns any number in the array that has not been set to zero
			// i.e. any number that does not have a multiple that is not itself
			if (numbers[i] != 0) {
				primeNumbers += numbers[i] + ", ";
			}
		}

		return primeNumbers;
	}

}
