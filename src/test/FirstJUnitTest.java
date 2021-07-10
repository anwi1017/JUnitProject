package test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FirstJUnitTest {
	
	@BeforeAll
	public static void beforeAllMethod() {
		
		System.out.println("Inside before all");
		
	}
	
	@BeforeEach
	public void beforeEachMethod() {
		
		System.out.println("Inside before each");
		
	}
	
	@Test
	public void testcase1() {
		
		//System.out.println("Inside Testcase 1");
		boolean flag = true;
		
		Assertions.assertTrue(flag);
		
	}
	
	@AfterEach
	public void afterEachMethod() {
		
		System.out.println("Inside after each");
		
	}

	@AfterAll
	public static void afterAllMethod() {
		
		System.out.println("Inside after all");
		
	}
}
