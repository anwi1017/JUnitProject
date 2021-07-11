package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(EnvCheck.class)

public class ExtentionPointExample {

	@CustomAnnotation
	public void test1() {
		
		Assertions.assertTrue(StringFunctions.isPalindrome("madam"));
		
	}
	
	@DisplayName("Negative Test")
	@RepeatedTest(5)
	@Test
	public void test2() {
		
		Assertions.assertFalse(StringFunctions.isPalindrome("nikunj"));
		
	}
}
