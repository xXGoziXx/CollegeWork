int ADC_value;
int DAC_value;
void setup()
{
}
void loop()
{
 ADC_value = analogRead(A0);
 DAC_value = map(ADC_value, 0, 1023, 0, 255);
 analogWrite(3, DAC_value);
 delay(10);
} 
