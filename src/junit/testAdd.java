package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAdd {

	@Test
	void Test() {
		Calculator cal = new Calculator(3,3);
		int result = cal.add();
		
		assertEquals(6,result);
		
	}

}
