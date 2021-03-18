package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divTest {

	@Test
	void test() {
		Calculator cal = new Calculator(3,3);
		int result = cal.div();
		
		assertEquals(1 , result);
	}

}
