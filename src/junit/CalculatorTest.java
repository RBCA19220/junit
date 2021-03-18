package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		Calculator cal = new Calculator(3,3);
		cal.AllocateMemory();
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
		Calculator cal = new Calculator(3,3);
		cal.ReleaseMemory();
	}
	
	@Before
	public static void setUp() throws Exception{
		Calculator cal = new Calculator(3,3);
		cal.ClearMemory();
	}
	
	@After
	public static void tearDown() throws Exception{
		Calculator cal = new Calculator(3,3);
		cal.Reset();
	}


	@Test
	void testAdd() {
		Calculator cal = new Calculator(3,3);
		int result = cal.add();
		
		assertEquals(6,result);
	}

	@Test
	void testSub() {
		Calculator cal = new Calculator(3,3);
		int result = cal.sub();
		
		assertEquals(0 , result);
	}

	@Test
	void testDiv() {
		Calculator cal = new Calculator(3,3);
		int result = cal.div();
		
		assertEquals(1 , result);
	}

	@Test
	void testMult() {
		Calculator cal = new Calculator(3,3);
		int result = cal.mult();
		
		assertEquals(9 , result);
	}

	@Test
	void modTest() {
		Calculator cal = new Calculator(3,3);
		int result = cal.mod();
		
		assertEquals(0 , result);
	}


	@Test
	public void testValidate()
	{
		Calculator cal = new Calculator(1,3);
		assertFalse(cal.validate());
	}
}
