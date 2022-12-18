import java.util.Scanner;
import java.lang.Math;

public class TriangleArea{
	public static void main(String[] args){
		double s, area, a, b, c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three sides of the triangle: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		s = (a+b+c)/2;
		
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("Area of the triangle is : "+area);
		sc.close();
		
	}
}