package Exercise_9_1;

public class Test {
	public static void main(String[]args) {
		// Create a rectangle with specified values
		Rectangle rectangle0 = new Rectangle();
		
		System.out.println("The width of the default rectangle is " + rectangle0.width + ".");
		System.out.println("The height of the default rectangle is " + rectangle0.height + ".");
		System.out.println("The area of the default rectangle is " + rectangle0.getArea() + ".");
		System.out.println("The perimeter of the default rectangle is " + rectangle0.getPerimeter() + ".");

		
		
		Rectangle rectangle1 = new Rectangle(4, 40);
		
		System.out.println("The width of the first rectangle is " + rectangle1.width + ".");
		System.out.println("The height of the first rectangle is " + rectangle1.height + ".");
		System.out.println("The area of the first rectangle is " + rectangle1.getArea() + ".");
		System.out.println("The perimeter of the first rectangle is " + rectangle1.getPerimeter() + ".");
		
		Rectangle rectangle2 = new Rectangle(3.5,35.9);
		
		System.out.println("The width of the second rectangle is " + rectangle2.width + ".");
		System.out.println("The height of the second rectangle is " + rectangle2.height + ".");
		System.out.println("The area of the second rectangle is " + rectangle2.getArea() + ".");
		System.out.println("The perimeter of the second rectangle is " + rectangle2.getPerimeter() + ".");
		
	}
}
