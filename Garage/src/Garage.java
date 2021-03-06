import java.util.ArrayList;

public class Garage {
	// Creates a new ArrayList called "garage"
	public ArrayList<Vehicle> garage = new ArrayList<>();

	// Function to add a vehicle to the garage
	public void addVehicle(Vehicle store) {
		garage.add(store);
	}

	// Function to remove a vehicle from the garage
	public void removeVehicle(Vehicle store) {
		garage.remove(store);
	}

	public void removeVehicle() {
	}

	// Function to output all vehicles in the array
	public void outputVehicles() {
		for (Vehicle v : garage) {
			System.out.println(v);
		}
	}

}