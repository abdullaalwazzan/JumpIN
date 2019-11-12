package jumpIn;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SquareTest {
	
	Square mush = null;
	Square emp = null;
	Square hole = null;

	@Before
	public void setUp() throws Exception {
		mush = new Square(1,1,"m");
		hole = new Square(2,1,"h");
		emp = new Square(4,4,"e");
	}

	@Test
	public void testIsEmpty() {
		assertFalse(mush.isEmpty());
		assertFalse(hole.isEmpty());
		assertTrue(emp.isEmpty());
	}

	@Test
	public void testMakeEmpty() {
		assertFalse(mush.isEmpty());
		mush.makeEmpty();
		assertTrue(mush.isEmpty());
	}

	@Test
	public void testIsHole() {
		assertFalse(mush.isHole());
		assertFalse(emp.isHole());
		assertTrue(hole.isHole());
	}

	@Test
	public void testMakeHole() {
		assertFalse(emp.isHole());
		emp.makeHole();
		assertTrue(emp.isHole());
	}

	@Test
	public void testIsMushroom() {
		assertFalse(hole.isMushroom());
		assertFalse(emp.isMushroom());
		assertTrue(mush.isMushroom());
	}

	@Test
	public void testMakeMushroom() {
		assertFalse(hole.isMushroom());
		hole.makeMushroom();
		assertTrue(hole.isMushroom());
	}
	
	@After
	public void tearDown() throws Exception {
		
	}

	

}
