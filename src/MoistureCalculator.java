
public class MoistureCalculator {
	
	    private static final int MIN_SENSOR_VALUE = 0;
	    private static final int MAX_SENSOR_VALUE = 1023;
	    private static final int MIN_PERCENTAGE = 0;
	    private static final int MAX_PERCENTAGE = 100;
	    
	    public int calculatePercentage(int sensorValue) {
	        // Map from sensor range to percentage range
	        int percentage = map(sensorValue, MIN_SENSOR_VALUE, MAX_SENSOR_VALUE, 
	                           MIN_PERCENTAGE, MAX_PERCENTAGE);
	        
	        // Constrain to valid range (0-100)
	        return constrain(percentage, MIN_PERCENTAGE, MAX_PERCENTAGE);
	    }
	    
	    private int map(int value, int fromLow, int fromHigh, int toLow, int toHigh) {
	        return (value - fromLow) * (toHigh - toLow) / (fromHigh - fromLow) + toLow;
	    }
	    
	    private int constrain(int value, int min, int max) {
	        if (value < min) return min;
	        if (value > max) return max;
	        return value;
	}

}
