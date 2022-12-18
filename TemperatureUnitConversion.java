import java.util.Scanner;
import java.lang.Math;

public class TemperatureUnitConversion{
	public static void main(String[] args){
		double f, c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the temperature in Celcius : ");
		c = sc.nextDouble();
			
		//formula to convert the temperature Celcius to fahrenheit
		f= 1.8*c + 32;
		
		System.out.println("Temperature in fahrenheit is : "+f);
		sc.close();
		
	}
}