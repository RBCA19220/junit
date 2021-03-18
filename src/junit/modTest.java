package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class modTest {

	@Test
	void test() {
		Calculator cal = new Calculator(3,3);
		int result = cal.mod();
		
		assertEquals(0 , result);
	}

}
