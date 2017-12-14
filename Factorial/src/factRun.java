public class factRun {
	public static void main(String[] args) {
		factRun calculate = new factRun();
		System.out.println(calculate.checkFactorial(2));
	}

	public String checkFactorial(int num) {
		double divideBy = num;
		for (int i = 1; i < num; i++) {
			divideBy = divideBy / i;
			if (divideBy == 1) {
				return num + " is equal to " + i + "!";
			} else if (divideBy < 1) {
				return num + " is not a factorial!";
			}
		}
		return "None!";
	}
}
