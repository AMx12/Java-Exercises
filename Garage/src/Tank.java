
public class Tank extends Vehicle {
	public boolean ammoLoaded;
	public int armourThickness;
	int price;

	public Tank(int engineSize, int wheelCount, int armourThickness, boolean ammoLoaded) {
		super(engineSize, wheelCount);
		this.ammoLoaded = ammoLoaded;
		this.armourThickness = armourThickness;
	}

	int tankPrice() {
		if (ammoLoaded) {
			price = 1200 + engineSize + (wheelCount * (armourThickness * 75));
		} else {
			price = engineSize + (wheelCount * (armourThickness * 25));
		}
		return price;
	}

	public String toString() {
		return "Tank -- Engine Size: " + super.engineSize + ", Wheels: " + super.wheelCount + ", Armour Thickness: "
				+ this.armourThickness + ", Ammo Loaded? " + this.ammoLoaded + ", Price: " + tankPrice();
	}

}
