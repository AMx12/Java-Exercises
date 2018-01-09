import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DoubleCharTest {

	DoubleChar doubleChar = new DoubleChar();

	@Test
	public void testInput() {
		assertEquals(doubleChar.doubleUp("dog"), "ddoogg");
	}
}
