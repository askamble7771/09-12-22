import java.util.Scanner;

public class Circle{
	public static void main(String[] args){
		double radius, area, circum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle: ");
		radius = sc.nextDouble();
		
		area = (Math.PI)*radius*radius;
		
		circum = 2*(Math.PI)*radius;
		
		System.out.println("Area of th circle is : "+area);
		System.out.println("Circumference of th circle is : "+circum);
		
		
	}
}