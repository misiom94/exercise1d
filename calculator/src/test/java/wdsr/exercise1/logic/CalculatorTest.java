package wdsr.exercise1.logic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Assert;

public class CalculatorTest {
	private Calculator calculator;

	@Before
	public void setup() {
		calculator = new Calculator();
	}
	
	@Test
	public void testMin_shouldReturnTheOnlyValue() {
		// given
		int[] values = { -5 };
		
		// when
		int min = calculator.min(values);
		
		// then
		assertEquals(values[0], min);
	}
	
	@Test
	public void testMin_shouldReturnTheSmallestOfAllValues() {
		// given
		int[] values = { 2, -3, 5 };
		
		// when
		int min = calculator.min(values);
		
		// then
		assertEquals(-3, min);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMin_shouldRaiseAnExceptionForNullArgument() {
		// given
		int[] values = null;
		
		// when
		calculator.min(values);
		
		// then
		// empty
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMin_shouldRaiseAnExceptionForEmptyArgument() {
		// given
		int[] values = {};
		
		// when
		calculator.min(values);
		
		// then
		// empty
	}
	
	@Test
	public void testMax_shouldReturnHighestOfAllValues(){
		//giver
		int [] values = {-5,-3,10};
		//when
		Assert.assertThat(10, is(calculator.max(values)));
		
	}
	
	@Test
	public void testMax_shouldReturnHighestOfNegativeValues(){
		//given
		int [] values = {-5,-10,-20};
		//when
		Assert.assertThat(-5, is(calculator.max(values)));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMax_emptyValuesTab(){
		//given
		int [] values = {};
		//when
		calculator.max(values);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMax_nullValueTab(){
		//given
		int [] values = null;
		//when
		calculator.max(values);
	}
	
	@Test
	public void testMax_shouldReturnTheOnlyValue() {
		// given
		int[] values = { -5 };
		
		// when
		int min = calculator.min(values);
		
		// then
		assertEquals(values[0], min);
	}
	
	
}
