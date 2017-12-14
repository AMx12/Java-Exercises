
public class Exercise {

	public static void main(String[] args) {

		// Objects
		Exercise obj = new Exercise();
		Goldi g_obj = new Goldi(100, 120);

		// Find Seats goldilocks can sit at and return them in a string
		System.out.println(obj.availableSeats(g_obj.getG_weight(), g_obj.getG_maxTemp()));

	}

	public String availableSeats(int goldiWeight, int goldiTemp) {

		Seats sm1 = new Seats();
		String a_Seats = "";

		// Populate List
		sm1.populateSeats();

		for (int i = 0; i < sm1.seats.size(); i++) {
			// If Goldilocks is lighter than the seat and she can handle a temperature
			// hotter than the porridge at that seat
			if (goldiWeight <= sm1.seats.get(i).maxWeight && goldiTemp > sm1.seats.get(i).pTemp) {
				a_Seats += ((i + 1) + " ");
			}
		}

		return a_Seats;

	}

}
