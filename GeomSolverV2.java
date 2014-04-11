import java.util.*;

public class GeomSolverV2{

	public static void main(String argsss[]){
	
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a shape: <Enter the corresponding number to select shape>");
		System.out.println("<1> Circle");
		System.out.println("<2> Triangle");
		System.out.println("<3> Square");
		System.out.println("<4> Rectangle");
		System.out.println("<5> N-Gon");
		
		int ch = sc.nextInt();
		
		switch(ch){
			case 1: //circleOption(); break;
			case 2: //TriangleOption();break;
			case 3: //polygonOption(ch); break;
			case 4: //rectangleOption(); break;
			case 5: //polygonOption(ch); break;
			default: System.out.println("Shape not found.\nExiting...");  break;
			
		}
	
	}
	
	public static void circleOption(){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Find the \n<1>Circumference\n<2>Area");
		int ch = sc.nextInt();
	//	Circle c = new Circle();
		switch(ch){
			case 1: //c.getCircumference(); break;
			case 2: //c.getCircleArea(); break;
			default: System.out.println("Option not found. Exiting.."); break;
		}
	}//circleOption
	public static void TriangleOption(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Find the \n<1>Perimeter\n<2>Area");
		int ch = sc.nextInt();
		switch(ch){
			case 1: //getTrianglePerimeter(); break;
			case 2: //getTriangleArea(); break;
			default: System.out.println("Option not found. Exiting.."); break;
		}
	}//circleOption
	
	
	public static void polygonOption(int shape){
		Scanner sc = new Scanner(System.in);
		System.out.println("Find the \n<1>Perimeter\n<2>Area");
		int ch = sc.nextInt();
		switch(ch){
			case 1: //getPolygonPerimeter(shape); break;
			case 2: //getPolygonArea(shape); break;
			default: System.out.println("Option not found. Exiting.."); break;
		}		
	
	}//polygonOption
	
	public static void rectangleOption(){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Find the \n<1>Area\n<2>Perimeter");
		int ch = sc.nextInt();
		switch(ch){
			case 1: //getRectangleArea(); break;
			case 2: //getRectanglePerimeter(); break;
			default: System.out.println("Option not found. Exiting.."); break;
		}
	}//rectangleOption
	

	public static void getPolygonPerimeter(int sh){
	
		switch(sh){
			case 2: //getTrianglePerimeter(); break;
			case 3: //getSquarePerimeter(); break; 
			case 4: //getRectanglePerimeter(); break;
			case 5: //getNGonPerimeter(); break;
			default: System.out.println("Option not found. Exiting.."); break;
		}
	
	}//getPolygonPerimeter
	
	


}