public class FindFibonacci {

	public static void main(String[] args) {
		FindFibonacci result = new FindFibonacci();
		// Scanner userScanner = new Scanner(System.in);
		// System.out.print("Enter the nth fibonacci number you would like to know: ");
		// String numInput = userScanner.nextLine();
		// System.out.println(result.Fibonacci(numInput));
		System.out.println(result.Fibonacci(15));
	}

	public String Fibonacci(long numberInput) {
		long fibonacciSecondPrevious = 0;
		long fibonacciPrevious = 1;
		long fibonacciNumber = 1;
		String theMaths = "0 >> ";

		if (numberInput == 0) {
			fibonacciNumber = 0;
		} else {
			for (long i = 1; i < numberInput; i++) {
				fibonacciNumber = fibonacciPrevious + fibonacciSecondPrevious;
				if (i == (numberInput - 1)) {
					theMaths += fibonacciPrevious + " >> " + "***" + fibonacciNumber + "***";
				} else {
					theMaths += fibonacciPrevious + " >> ";
				}
				fibonacciSecondPrevious = fibonacciPrevious;
				fibonacciPrevious = fibonacciNumber;
			}
		}
		return theMaths;
	}
}
