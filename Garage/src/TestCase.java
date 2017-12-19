import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class TestCase {
	@Test
	public void testVehicleAdd() {
		Car testCar = new Car(5, 5, 5, true);
		assertNull(Main.main(g.addVehicle(testCar)));
	}
}
