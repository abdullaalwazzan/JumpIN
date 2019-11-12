package jumpIn;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AnimalTest {
	Animal rabbit = null;
	Animal fox = null;

	@Before
	public void setUp() throws Exception {
		rabbit = new Animal(1,1,"r");
		fox = new Animal(2,2,"f");
	}

	@Test
	public void testIsRabbit() {
		assertFalse(fox.isRabbit());
		assertTrue(rabbit.isRabbit());
	}

	@Test
	public void testMakeRabbit() {
		assertFalse(fox.isRabbit());
		fox.makeRabbit();
		assertTrue(fox.isRabbit());
	}

	@Test
	public void testIsFox() {
		assertFalse(rabbit.isFox());
		assertTrue(fox.isFox());
	}

	@Test
	public void testMakeFox() {
		assertFalse(rabbit.isFox());
		rabbit.makeFox();
		assertTrue(rabbit.isFox());
	}

}
