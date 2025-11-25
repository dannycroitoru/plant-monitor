import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlantMonitorTest {

	@Test
    public void shouldProcessSensorReadingAndReturnDisplayLines() {
        PlantMonitor monitor = new PlantMonitor();
        
        // Test with dry soil (25%)
        String[] result = monitor.checkPlant(250); // ~25% moisture
        
        assertEquals("Moisture: 25%", result[0]);
        assertEquals("Need Water!", result[1]);
    }
    
    @Test
    public void shouldProcessSensorReadingForHealthySoil() {
        PlantMonitor monitor = new PlantMonitor();
        
        // Test with moist soil (60%)
        String[] result = monitor.checkPlant(614); // ~60% moisture
        
        assertEquals("Moisture: 60%", result[0]);
        assertEquals("Soil OK", result[1]);
    }
	
}
