import java.util.Scanner;


public class rectangle {
  double recWidth,recLength,recArea,recPerimeter;
  int x = 2;
	public void rectangleArea()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length: ");
		try{
		recLength = sc.nextDouble();
		}
		catch(Exception e){
		System.out.println("Invalid input!");
		sc.next();
		}
		System.out.println("Enter Width: ");
		try{
		recWidth = sc.nextDouble();
		}
		catch(Exception e){
		System.out.println("Invalid input!");
		sc.next();
		}
		recArea = (recLength * recWidth);
		System.out.println("The Area is: " + recArea);		
	}
	
	public void rectanglePerimeter()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length: ");
		try{
		recLength = sc.nextDouble();
		}
		catch(Exception e){
		System.out.println("Invalid input!");
		sc.next();
		}
		System.out.println("Enter Width: ");
		try{
		recWidth = sc.nextDouble();
		}
		catch(Exception e){
		System.out.println("Invalid input!");
		sc.next();
		}
		recPerimeter = (2*(recLength + recWidth));
		System.out.println("The Perimeter is: " + recPerimeter);		
	}
	
}
