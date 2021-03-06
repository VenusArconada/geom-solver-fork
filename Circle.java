import java.util.InputMismatchException;
import java.util.Scanner;

public class Circle {
	private static double cDiameter = 0;
	private static double cCircumf = 0;
	private static double cArea = 0;
	private static Scanner inp;
	private static double pi = 3.1416;
	private String isCircumf = "circumference";
	private String isCArea = "area";
	
	public static void main (String[] args) {
	inp = new Scanner(System.in);
	}
	
	public static void getCircumference() {
	System.out.println("\nComputing for Circle's Circumference\n");
	System.out.print("Enter circle's diameter: ");
	
		if (isInputMatched(inp)) {
			cCircumf = cDiameter*pi;
			System.out.println("\nThe circle's circumference is =" + cCircumf);}
		else
			System.out.println("Invalid input. Exiting...");
}

	
	
	public static void getCircleArea() {
		System.out.println("\nComputing for Circle's Area\n");
		System.out.print("Enter circle's diameter: ");
		
		if(isInputMatched(inp)) {
			cArea = pi*(Math.pow((cDiameter/2), 2));
			System.out.println("\nThe circle's area is = " + cArea);}
		else
			System.out.println("Invalid input. Exiting...");
	}
	
	private static boolean isInputMatched(Scanner i) {
		try {
			cDiameter = inp.nextDouble();
			return true;	}
		
		catch(InputMismatchException nfe) {
			inp.next();
			return false;	
		}
	}	
}