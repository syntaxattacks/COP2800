// Import tools
import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter three sides of a triangle a color 
		// and a Boolean value to indicate whether the triangle is filled
		System.out.print("Enter three sides of the triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		
		System.out.print("Enter a color: ");
		String color = input.next();

		System.out.print("Is the triangle filled (true / false)? ");
		boolean filled = input.nextBoolean();

		// Create a Triangle
		Triangle triangle = new Triangle(side1, side2, side3, color, filled);

		System.out.println("Side 1 is " + triangle.side1);
		System.out.println("Side 2 is " + triangle.side2);
		System.out.println("Side 3 is " + triangle.side3);
		System.out.println("Color is " + triangle.getColor());
		System.out.println("Is the triangle filled? " + triangle.isFilled());
		System.out.println("Area is " + triangle.getArea());
		System.out.println("Perimeter is " + triangle.getPerimeter());
		
		
		// Close Scanner
		input.close();

	}

}
