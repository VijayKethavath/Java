package Functional;
import java.util.function.Function;

class SensorData{
	private double temperature;
	private double humidity;
	public SensorData(double temperature, double humidity) {
		super();
		this.temperature = temperature;
		this.humidity = humidity;
	}
	
	public double getTemperature() {
		return temperature;
	}
	public void setTemparature(double temperature) {
		this.temperature=temperature;
	}
	
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity=humidity;
	}
	
}

public class Temparature {

	public static void main(String[] args) {
		SensorData senddata=new SensorData(26.3,65);
		
		Function<SensorData,Double> gettemp=new Function<SensorData,Double>(){
			
			public Double apply(SensorData data) {
				return data.getTemperature();
				
			}
			
		};
		
		Double tempa=gettemp.apply(senddata);
		System.out.println(tempa);
		
	
	Function<Double,Boolean> threshold=new Function<Double,Boolean>(){
		public Boolean apply(Double temp) {
			return temp>25;
		}
	};
	Boolean Tem=threshold.apply(tempa);
	System.out.println("Is temperature is above threshold :"+Tem);
	}
   
}
