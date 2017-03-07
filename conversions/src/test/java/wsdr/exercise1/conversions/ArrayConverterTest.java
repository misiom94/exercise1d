package wsdr.exercise1.conversions;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;


import wdsr.exercise1.conversions.ArrayConverter;

public class ArrayConverterTest {
	private ArrayConverter arrayConverter;

	@Before
	public void setUp() {
		
		arrayConverter = new ArrayConverter();
		
	}

	@Test(expected = NumberFormatException.class)
	public void test_noIntegerValue() {
		//given
		String values[] = {"first","second","yolo"};
		//then
		arrayConverter.convertToInts(values);
			
	}
	@Test(expected= NumberFormatException.class)
	public void test_validAndInvalidValues(){
		String values[] = {"first","1","second","2","yolo"};
		//then
		arrayConverter.convertToInts(values);
			
		
	}
	
	@Test(expected = NullPointerException.class)
	public void test_nullValue() {
		//given
		String values[] = null;
		//then
		arrayConverter.convertToInts(values);
			
	}
	
	@Test
	public void test_correctArrayValues(){
		//given
		String values[] = {"1","6","7"};
		int result[] = {1,6,7};
		//when
		
		//then
		assertThat(result, is(arrayConverter.convertToInts(values)));
	}
	
	
	

}
