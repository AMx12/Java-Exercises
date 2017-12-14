
abstract class PaintInfo {

	abstract String paintName();

	abstract int paintSize();

	abstract int maxCoverage();

	abstract double paintPrice();

	// Paint() {
	// System.out.println("Paint up!");
	// }

	public String toString() {
		// return paintName() + ": " + paintSize() + " Litre, Covers: " + maxCoverage()
		// + "m^2, " + "Price: "
		// + paintPrice();
		return "Whoa!";
	}
}
