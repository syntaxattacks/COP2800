package Exercise_9_1;

public class Test {
	public static void main(String[]args) {
		// Create a rectangle with specified values
		Rectangle rectangle0 = new Rectangle();
		
		System.out.println("The getWidth of the default rectangle is " + rectangle0.getWidth() + ".");
		System.out.println("The getHeight of the default rectangle is " + rectangle0.getHeight() + ".");
		System.out.println("The area of the default rectangle is " + rectangle0.getArea() + ".");
		System.out.println("The perimeter of the default rectangle is " + rectangle0.getPerimeter() + ".");

		
		Rectangle rectangle1 = new Rectangle(4, 40);
		
		System.out.println("The getWidth of the first rectangle is " + rectangle1.getWidth() + ".");
		System.out.println("The getHeight of the first rectangle is " + rectangle1.getHeight() + ".");
		System.out.println("The area of the first rectangle is " + rectangle1.getArea() + ".");
		System.out.println("The perimeter of the first rectangle is " + rectangle1.getPerimeter() + ".");
		
		Rectangle rectangle2 = new Rectangle(3.5,35.9);
		
		System.out.println("The getWidth of the second rectangle is " + rectangle2.getWidth() + ".");
		System.out.println("The getHeight of the second rectangle is " + rectangle2.getHeight() + ".");
		System.out.println("The area of the second rectangle is " + rectangle2.getArea() + ".");
		System.out.println("The perimeter of the second rectangle is " + rectangle2.getPerimeter() + ".");	
	}
}
