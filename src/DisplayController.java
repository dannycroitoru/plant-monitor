
public class DisplayController {
	
	public String getDisplayLine1(int moisturePercent) {
        return "Moisture: " + moisturePercent + "%";
    }
    
    public String getDisplayLine2(int moisturePercent, WateringAlert wateringAlert) {
        return wateringAlert.getStatusMessage(moisturePercent);
    }

}
