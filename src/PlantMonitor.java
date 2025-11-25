
public class PlantMonitor {
	
	private MoistureCalculator moistureCalculator;
    private WateringAlert wateringAlert;
    private DisplayController displayController;
    
    public PlantMonitor() {
        this.moistureCalculator = new MoistureCalculator();
        this.wateringAlert = new WateringAlert();
        this.displayController = new DisplayController();
    }
    
    public String[] checkPlant(int sensorValue) {
        // Calculate moisture percentage
        int moisturePercent = moistureCalculator.calculatePercentage(sensorValue);
        
        // Get display lines
        String line1 = displayController.getDisplayLine1(moisturePercent);
        String line2 = displayController.getDisplayLine2(moisturePercent, wateringAlert);
        
        return new String[]{line1, line2};
    }

}
