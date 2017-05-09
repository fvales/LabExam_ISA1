import static org.junit.Assert.*;

import org.junit.Test;

public class TestCar {

	@Test
	public void testForFail() {
		Car c = new Car();
		c.setEngineCapacity(120);
		assertEquals(200,c.getEngineCapacity());
	}
	
	@Test
	public void testForSuccess() {
		Car c = new Car();
		c.setEngineCapacity(120);
		assertEquals(120,c.getEngineCapacity());
	}
	
	@Test
	public void testForTrue() {
		Car c = new Car();
		c.setEngineCapacity(120);
		assertTrue(c.getEngineCapacity() > 100);
	}
	
	@Test
	public void testForFalse() {
		Car c = new Car();
		c.setEngineCapacity(120);
		assertTrue(c.getEngineCapacity() < 100);
	}

}
