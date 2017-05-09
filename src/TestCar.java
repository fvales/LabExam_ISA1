import static org.junit.Assert.*;

import org.junit.Test;

public class TestCar {

	@Test
	public void test() {
		Car c = new Car();
		c.setEngineCapacity(120);
		assertEquals(200,c.getEngineCapacity());
	}

}
