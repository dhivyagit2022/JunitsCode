package junits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringFunctionsTest {
	
	
	@Test
	public void test1() {
		
		assertTrue(StringFunctions.isPalindrome("madam"));
		assertTrue(StringFunctions.isPalindrome("racecar"));
		
	}
	
	@Test
	public void test2() {
		
		assertFalse(StringFunctions.isPalindrome("nikunj"));
		
	}

}
