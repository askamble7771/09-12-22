import java.util.Scanner;

public class WallPainting{
	public static void main(String[] args){
		double l, b, h, surfaceArea, paintArea, paintAmount;
		int doors, windows;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length, width and height of the room:");
		l = sc.nextDouble();
		b = sc.nextDouble();
		h = sc.nextDouble();
		
		surfaceArea = 2*(l*b+b*h+l*h);
		
		System.out.println("Total surface area of the room: " + surfaceArea);
		System.out.println("Total floor area of the room: " + l*b);
		System.out.println("Total ceiling area of the room: " + l*b);
		
		System.out.println("Enter total number of doors of the room: ");
		doors = sc.nextInt();
		
		System.out.println("Enter total number of windows of the room: ");
		windows = sc.nextInt();
		
		paintArea = surfaceArea - (20*doors) - (15*windows) - (l*b);
		
		System.out.println("Total room area required to paint (in sqft): " + paintArea);
		
		paintAmount = paintArea/350;
		
		System.out.println("Total amount of paint required (in gallons): " + paintAmount);
		
	
	}
}