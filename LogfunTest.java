package logFunction;

import logFunction.Logfun;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LogfunTest {

	@Test
	void testLogCalculate1() {
        assertEquals(5, Logfun.logCalculate(32,2));
    }
	
	@Test
	void testLogCalculate2() {
        assertEquals(2, Logfun.logCalculate(45786.25,83.5));
    }
	
	@Test
	void testLogCalculate3() {
        assertEquals(2, Logfun.logCalculate(846652128,1025));
    }
	
	@Test
	void testValidateX1() {								//Testing for integer input value
	    assertEquals(5, Logfun.validateX());			//user's first input should be an integer value 5
	}
	
	@Test
	void testValidateX2() {								//Testing for decimal digit input value
		assertEquals(83.58, Logfun.validateX());		//user's second input should be an integer value 83.58
	}
	
	@Test
	void testValidateX3() {								//Testing for multiple digit input value
		assertEquals(100001, Logfun.validateX());		//user's third input should be an integer value 100001
	}

	@Test
	void testValidateBase1() {							//Testing for integer input value
		assertEquals(5, Logfun.validateBase());			//user's fourth input should be an integer value 5
	}
	
	@Test
	void testValidateBase2() {							//Testing for decimal digit input value
		assertEquals(83.58, Logfun.validateBase());		//user's fifth input should be an integer value 83.58
	}
	
	@Test
	void testValidateBase3() {							//Testing for multiple digit input value
		assertEquals(100001, Logfun.validateBase());	//user's sixth input should be an integer value 100001
	}
	
	@Test
	void testFloorCeil1() {
        assertEquals(0, Logfun.floorCeil(5, 32, 2));
    }
	
	@Test
	void testFloorCeil2() {
        assertEquals(1, Logfun.floorCeil(2,45786.25,83.5));
    }
	
	@Test
	void testFloorCeil3() {
        assertEquals(1, Logfun.floorCeil(1,220,15));
    }

}
