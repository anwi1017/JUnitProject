package test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTestExample {
	
	@TestFactory
	public Collection<DynamicTest> method1() {
		
		return Arrays.asList(
                  	DynamicTest.dynamicTest("Positive Test",
                          () -> Assertions.assertTrue(StringFunctions.isPalindrome("madam"))),
                    DynamicTest.dynamicTest("Negative Test Test",
                      () -> Assertions.assertFalse(StringFunctions.isPalindrome("nikunj")))
        );
       		
	}

}
