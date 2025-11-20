import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
		
public class MoistureCalculatorTest {

		    @Test
		    public void shouldCalculate0PercentForMinSensorValue() {
		        MoistureCalculator calculator = new MoistureCalculator();
		        assertEquals(0, calculator.calculatePercentage(0));
		    }
		    
		    @Test
		    public void shouldCalculate100PercentForMaxSensorValue() {
		        MoistureCalculator calculator = new MoistureCalculator();
		        assertEquals(100, calculator.calculatePercentage(1023));
		    }
		    
		    @Test
		    public void shouldCalculate50PercentForMidRangeValue() {
		        MoistureCalculator calculator = new MoistureCalculator();
		        assertEquals(50, calculator.calculatePercentage(512));
		    }
		    
		    @Test
		    public void shouldConstrainValuesBelowZeroToZero() {
		        MoistureCalculator calculator = new MoistureCalculator();
		        assertEquals(0, calculator.calculatePercentage(-100));
		    }
		    
		    @Test
		    public void shouldConstrainValuesAbove1023To100() {
		        MoistureCalculator calculator = new MoistureCalculator();
		        assertEquals(100, calculator.calculatePercentage(1200));

	}

}
