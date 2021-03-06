
public class Boat extends Vehicle {
	public boolean hasSail;
	public int rudderSize;
	int price;

	public Boat(int engineSize, int wheelCount, int rudderSize, boolean hasSail) {
		super(engineSize, wheelCount);
		this.hasSail = hasSail;
		this.rudderSize = rudderSize;
	}

	int boatPrice() {
		if (hasSail) {
			price = 100 + engineSize + (wheelCount + (rudderSize * 5));
		} else {
			price = engineSize + (wheelCount + (rudderSize * 5));
		}
		return price;
	}

	public String toString() {
		return "Boat -- Engine Size: " + super.engineSize + ", Wheels: " + super.wheelCount + ", Rudder size: "
				+ this.rudderSize + ", Sail? " + this.hasSail + ", Price: " + boatPrice();
	}
}
