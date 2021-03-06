
public class Dog {

	private int position;
	private String dogName;
	private int dogAge;
	private double dogHeight;

	public Dog(String dogName, int dogAge, double dogHeight) {
		// this.position = position;
		this.dogName = dogName;
		this.dogAge = dogAge;
		this.dogHeight = dogHeight;
	}

	public Dog(int position, String dogName, int dogAge, double dogHeight) {
		this.position = position;
		this.dogName = dogName;
		this.dogAge = dogAge;
		this.dogHeight = dogHeight;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public int getDogAge() {
		return dogAge;
	}

	public void setDogAge(int dogAge) {
		this.dogAge = dogAge;
	}

	public double getDogHeight() {
		return dogHeight;
	}

	public void setDogHeight(double dogHeight) {
		this.dogHeight = dogHeight;
	}
}
