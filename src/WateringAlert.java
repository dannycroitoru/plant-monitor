
public class WateringAlert {
	
private static final int WATER_THRESHOLD = 30;
    
    public boolean needsWater(int moisturePercent) {
        return moisturePercent < WATER_THRESHOLD;
    }
    
    public String getStatusMessage(int moisturePercent) {
        if (needsWater(moisturePercent)) {
            return "Need Water!";
        } else {
            return "Soil OK";
        }
    }
}
