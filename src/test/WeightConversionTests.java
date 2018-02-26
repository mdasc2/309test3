package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import logic.WeightConversion;

class WeightConversionTests {

	@Test
	void KiloToPoundsTest() 
	{
		WeightConversion wc = new WeightConversion();
		
		double kilos = 25;
		
		double testPounds = wc.KilosToPounds(kilos);
		
		double correctPounds = 25.0/0.454;
		assertEquals(testPounds, correctPounds,0.1);
	}
	
	@Test
	void PoundsToKiloTest()
	{
		WeightConversion wc = new WeightConversion();
		double pounds = 155;		
		double testKilos = wc.PoundsToKilos(pounds);
		
		double correctKilos = 155.0 * 0.454;
		
		assertEquals(testKilos, correctKilos, 0.1);
		
	}

}
