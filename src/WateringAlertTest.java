import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WateringAlertTest {
	
	 @Test
	    public void shouldReturnNeedsWaterWhenBelow30Percent() {
	        WateringAlert alert = new WateringAlert();
	        assertTrue(alert.needsWater(25));
	    }
	    
	    @Test
	    public void shouldReturnNoWaterNeededWhen30PercentOrAbove() {
	        WateringAlert alert = new WateringAlert();
	        assertFalse(alert.needsWater(30));
	        assertFalse(alert.needsWater(50));
	    }
	    
	    @Test
	    public void shouldReturnCorrectStatusMessage() {
	        WateringAlert alert = new WateringAlert();
	        assertEquals("Need Water!", alert.getStatusMessage(25));
	        assertEquals("Soil OK", alert.getStatusMessage(40));
	    }

}
