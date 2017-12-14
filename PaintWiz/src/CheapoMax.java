
public class CheapoMax extends PaintInfo {

	String paintName() {
		return "Cheapo";
	}

	int paintSize() {
		return 20;
	}

	int maxCoverage() {
		return 10;
	}

	double paintPrice() {
		return 19.99;
	}

	public String toString() {
		return paintName() + ": " + paintSize() + " Litre, Covers: " + maxCoverage() + "m^2, " + "Price: "
				+ paintPrice();
	}

}
