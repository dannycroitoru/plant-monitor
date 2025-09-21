#include <LiquidCrystal.h>

LiquidCrystal lcd(12, 11, 5, 4, 3, 2);

const int moistureSensorPin = A0;
const int ledPin = 7;

// Variables
int sensorValue = 0;
int moisturePercent = 0;

void setup() {

  lcd.begin(16, 2);
  lcd.print("Plant Monitor");
  
  pinMode(ledPin, OUTPUT);
  
  // Serial communication for debugging
  Serial.begin(9600);
  delay(1000);
  lcd.clear();
}

void loop() {
  // Read moisture sensor
  sensorValue = analogRead(moistureSensorPin);
  
  // Convert to percentage (adjust these values based on your sensor calibration)
  moisturePercent = map(sensorValue, 0, 1023, 0, 100);
  moisturePercent = constrain(moisturePercent, 0, 100);
  
  lcd.setCursor(0, 0);
  lcd.print("Moisture: ");
  lcd.print(moisturePercent);
  lcd.print("% ");
  
  // Check if plant needs water
  if (moisturePercent < 30) {
    lcd.setCursor(0, 1);
    lcd.print("Need Water!    ");
    digitalWrite(ledPin, HIGH);  // Turn on alert LED
  } else {
    lcd.setCursor(0, 1);
    lcd.print("Soil OK        ");
    digitalWrite(ledPin, LOW);   // Turn off alert LED
  }
  
  Serial.print("Moisture: ");
  Serial.print(moisturePercent);
  Serial.println("%");
  
  delay(2000);  // Wait 2 seconds between readings
}