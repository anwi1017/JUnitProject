package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public interface TestInterface {
	
	public void method1();
	
	@Test
	default void test1 () {
		
		Assertions.assertTrue(StringFunctions.isPalindrome("madam"));
		
	}

}
