import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CaculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 4321;
		int b =1234;
		
		Caculator cal = new Caculator();
		int actual = cal.add(a, b);
		
		int expected = 5555;
		assertEquals( expected,actual);
	}
	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		int a = 4321;
		int b =1234;
		
		Caculator cal = new Caculator();
		int actual = cal.subtract(a, b);
		
		int expected = 3087;
		assertEquals( expected,actual);
	}
	@Test
	public void testmultiply() {
		//fail("Not yet implemented");
		int a = 30;
		int b =5;
		
		Caculator cal = new Caculator();
		int actual = cal.multiply(a, b);
		
		int expected = 150;
		assertEquals( expected,actual);
	}
	@Test
	public void testdivide() {
		//fail("Not yet implemented");
		int a = 400;
		int b =5;
		
		Caculator cal = new Caculator();
		int actual = cal.divide(a, b);
		
		int expected = 80;
		assertEquals( expected,actual);
	}

}
