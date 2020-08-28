
package yaksha;


import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import yaksha.*;



public class MainClassTest {
	
	@Test
	public void testValidateDates_success() throws IOException {
	
		
	
		TestUtils.yakshaAssert(TestUtils.currentTest(),  DateValidator.validateParseDate("11.04.1978")== true ?"true":"false", TestUtils.businessTestFile );
		
	
		
	
	}
	
	
	@Test
	public void testValidateDates_failure() throws IOException {
	
	//	Assertions.assertEquals(true ,DateValidator.validateParseDate("11.04.1978"));
	//	Assertions.assertEquals(false,DateValidator.validateParseDate("22.4.1978"));
	//	Assertions.assertEquals(true ,DateValidator.validateParseDate("11-04-1978"));
	//	Assertions.assertEquals(false,DateValidator.validateParseDate("22/4/1978"));
	//	Assertions.assertEquals(false ,DateValidator.validateParseDate("15.04.1978"));
	//	Assertions.assertEquals(true,DateValidator.validateParseDate("12.24.2020"));
	
		TestUtils.yakshaAssert(TestUtils.currentTest(),  DateValidator.validateParseDate("22.4.1978")== false ?"false":"false", TestUtils.businessTestFile );
		
	
	
	}
	
	
	@Test
	public void testcalculateAge_success() throws IOException {
	
		
		TestUtils.yakshaAssert(TestUtils.currentTest(),  DateValidator.calculateAge("11.04.1978")== 41 ? "true":"false", TestUtils.businessTestFile );
		

		/*
		 * Assertions.assertEquals(41 ,DateValidator.calculateAge("11.04.1978"));
		 * Assertions.assertEquals(41,DateValidator.calculateAge("12.04.1978"));
		 * Assertions.assertEquals(41 ,DateValidator.calculateAge("11-04-1978"));
		 * Assertions.assertEquals(41,DateValidator.calculateAge("12/04/1978"));
		 * Assertions.assertEquals(42 ,DateValidator.calculateAge("07.04.1978"));
		 * Assertions.assertEquals(0,DateValidator.calculateAge("01.01.2020"));
		 */
	
	}
	
	
	
	
	
	
	
	

}
