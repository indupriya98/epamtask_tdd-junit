package epamtask.junit_tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAinfirst2CharsTest {

	
	/*TODO list
	 * 1."ABCD" => "BCD"  - success
	 * 2."AACD" => "CD"   - success
	 * 3."BACD" => "BCD"  - success
	 * 4."BBAA" => "BBAA" - success
	 * 5."AABAA" => "BAA" - success
	 */
	RemoveAinfirst2Chars removeAin1st2chars;
	
	@BeforeEach
	void initialise() {
		removeAin1st2chars = new RemoveAinfirst2Chars();
	}
	
	@Test
	void testfirst2Chars() {
		 assertEquals("BCD",removeAin1st2chars.remove("ABCD"));
	}
	
	@Test
	void testfirst2Chars1() {
		 assertEquals("CD",removeAin1st2chars.remove("AACD"));
	}
	
	@Test
	void testfirst2Chars2() {
		 assertEquals("BCD",removeAin1st2chars.remove("BACD"));
	}
	
	@Test
	void testfirst2Chars3() {
		 assertEquals("BBAA",removeAin1st2chars.remove("BBAA"));
	}
	
	@Test
	void testfirst2Chars4() {
		 assertEquals("BAA",removeAin1st2chars.remove("AABAA"));
	}
	
	

}
