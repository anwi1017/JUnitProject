package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AsssumptionsExample {
	
	@BeforeEach
	public void setup() {
		
		System.setProperty("ENV", "DEV");
	}
	
	@Test
	public void test1() {
		
		Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
		Assertions.assertTrue(StringFunctions.isPalindrome("madam"));
		
	}
	
	@Test
	public void test2() {
		
		Assumptions.assumeFalse("PROD".equals(System.getProperty("ENV")));
		Assertions.assertFalse(StringFunctions.isPalindrome("nikunj"));
		
	}
	
}
