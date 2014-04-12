import java.lang.Math;
import java.util.*;
import java.text.*;

class NGon{

	public static void main(String cha){
		
		Scanner sc = new Scanner(System.in);
		String ch = cha;
		System.out.println("N-Gon "+ch+" Calculator");
		System.out.println("Enter # of sides:");
		int n = sc.nextInt();
		System.out.println("Enter measurement of each side: ");
		double m = sc. nextDouble();
		
		switch(ch){
			case "Perimeter": getP(n,m); break;
			case "Area": getA(n,m); break;
		
		}
	
	}

	
	public static void getP(int n, double m){
		// This functions computes the perimeter of a N-Gon.
		// n - # of sides ; m = measurement 4 each side
		
		System.out.println("Perimeter = "+(n*m));	
	}
	
	public static void getA(int n, double m){
	

		double a = m/(2 * (Math.tan(Math.toRadians(180/n)))); //apothem
		double area = (n * m * a) / 2.0; 
		NumberFormat formatter = new DecimalFormat("#0.00");  
		System.out.println("Area "+formatter.format(area));
	
		
		
	
	}
	



}