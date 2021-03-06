
public class Main {

	public static void main(String[] args) {

		// Creates vehicles
		Car c = new Car(200, 4, 12, true);
		Car c2 = new Car(255, 4, 16, false);
		Boat b = new Boat(330, 0, 6, false);
		Tank t = new Tank(800, 2, 3, true);
		Tank t2 = new Tank(255, 4, 16, false);

		// Creates a garage called "g" to add vehicles to
		// Functions within Garage can be called with "g."
		Garage g = new Garage();

		// Adds vehicles to the garage
		g.addVehicle(c);
		g.addVehicle(b);
		g.addVehicle(t);
		g.addVehicle(c2);
		g.addVehicle(t2);

		// Removes a vehicle from the garage
		g.removeVehicle();

		// Uses the outputVehicles function from the Garage class to print results
		g.outputVehicles();
	}
}
