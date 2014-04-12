import java.util.*;

public class Circle {
	private static double cDiameter = 0;
	private static double cPerimeter = 0;
	private static double cArea = 0;
	
	public static void getCircumference() {
	Scanner inp = new Scanner(System.in);
	System.out.println("\nComputing for Circle's Circumference\n");
	System.out.print("Enter circle's diameter: ");
	
	try {
		cDiameter = inp.nextDouble();
		cPerimeter = cDiameter*2;
		}

	catch(Exception e){}
	
	System.out.println("Perimeter: "+cPerimeter);
		
	}

	

	public static void getCircleArea() {
	Scanner inp = new Scanner(System.in);

	}
}