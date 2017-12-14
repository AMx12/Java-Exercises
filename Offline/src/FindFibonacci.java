
public class FindFibonacci {

	public static void main(String[] args) {
		FindFibonacci result = new FindFibonacci();
		System.out.println(result.Fibonacci(13));
	}

	public String Fibonacci(int numberInput) {
		int fibonacciSecondPrevious = 0;
		int fibonacciPrevious = 1;
		int fibonacciNumber = 1;
		String theMaths = "0 >> ";

		if (numberInput == 0) {
			fibonacciNumber = 0;
		} else {
			for (int i = 1; i < numberInput; i++) {
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
