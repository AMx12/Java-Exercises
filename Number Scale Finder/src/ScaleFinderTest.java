import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ScaleFinderTest {

	ScaleFinder main = new ScaleFinder();

	@Test
	public void testSaveInput() {
		main.findScale("123456789");
		assertEquals("Not correct", 123456789, 123456789);
	}

	public void testOutput() {
		main.findScale("123456789");
		assertEquals("Output incorrect", "123 million 456 thousand and 789\r\n" + "123 million 456 thousand and 789",
				"what");
	}

}
