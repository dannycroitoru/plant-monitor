import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DisplayControllerTest {
	
	@Test
    public void shouldShowMoisturePercentageOnFirstLine() {
        DisplayController display = new DisplayController();
        String result = display.getDisplayLine1(42);
        assertEquals("Moisture: 42%", result);
    }
    
    @Test
    public void shouldShowNeedWaterMessageWhenBelowThreshold() {
        DisplayController display = new DisplayController();
        WateringAlert alert = new WateringAlert();
        String result = display.getDisplayLine2(25, alert);
        assertEquals("Need Water!", result);
    }
    
    @Test
    public void shouldShowSoilOKMessageWhenAboveThreshold() {
        DisplayController display = new DisplayController();
        WateringAlert alert = new WateringAlert();
        String result = display.getDisplayLine2(45, alert);
        assertEquals("Soil OK", result);
    }

}
