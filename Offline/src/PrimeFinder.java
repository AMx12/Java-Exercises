
public class PrimeFinder {

	public static void main(String[] args) {
		PrimeFinder math = new PrimeFinder();
		System.out.println(math.doMath());
	}

	public String doMath() {
		String primeNumbers = "2, 3, ";
		for (int i = 4; i < 60; i++) {
			if (Math.sqrt(i) % 1 != 0 && i % 2 != 0 && i % 3 != 0) {
				primeNumbers += i + ", ";
			}
		}
		return primeNumbers;
	}

}
