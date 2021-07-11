package test;

import java.time.LocalDate;
import java.time.Month;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametersExample {

	@ParameterizedTest
	@ValueSource(strings = {"radar","madam","nikunj"})
	public void PalindromeCheck(String name) {
		
		Assertions.assertTrue(StringFunctions.isPalindrome(name));
		
	}
	
	@ParameterizedTest
	@ValueSource(ints = {2,4,6,9})
	public void OddNumCheck(int num) {
		
		Assertions.assertTrue(num%2 !=0);
		
	}
	
	@ParameterizedTest
    @EnumSource(Month.class) // passing all 12 months
    void MonthTest(Month month) {
		
        int monthNumber = month.getValue();
        Assertions.assertTrue(monthNumber >= 1 && monthNumber <= 12);
        
    }
	
	@ParameterizedTest
    @EnumSource(value = Month.class, names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
    void someMonths_Are30DaysLong(Month month) {
        
        Assertions.assertEquals(30, month.length(false));
        
    }

	@ParameterizedTest
    @EnumSource(value = Month.class, names = {"FEBRUARY"})
    void LeapYearTest(Month month) {
        
		boolean flag = false;
        Assertions.assertEquals(28, month.length(flag));
        
    }
	
	@ParameterizedTest
    @CsvSource(value = {"test:test", "tEst:test", "Java:java"}, delimiter = ':')
    void toLowerCase_ShouldGenerateTheExpectedLowercaseValue(String expected, String actual) {
        
        Assertions.assertEquals(expected, actual);
        
    }
	
	@ParameterizedTest
    @MethodSource("DPMethod")
    void MethodSourceExample(String str) {
        
        Assertions.assertNotNull(str);
        Assertions.assertTrue(StringFunctions.isPalindrome(str));
        
    }
	
	
	static Stream<String> DPMethod () {
		
		return Stream.of("racecar","radar","mom","dad");
		
	}
	
	@ParameterizedTest
    @CsvSource({"2018/12/25,2018", "2019/02/11,2019"})
    void getYear(
      @ConvertWith(DateConverter.class) LocalDate date, int expected) {
        Assertions.assertEquals(expected, date.getYear());
    }
	
	
	/*@ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void toUpperCase_ShouldGenerateTheExpectedUppercaseValueCSVFile(
      String input, String expected) {
        String actualValue = input.toUpperCase();
        Assertions.assertEquals(expected, actualValue);
    }*/
}
