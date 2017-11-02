
public class TestRectangle_9_1 {

	public static void main(String[]args) {
		// Create a rectangle with specified values
		SimpleRectangle rectangle0 = new SimpleRectangle();
		
		System.out.println("The width of the default rectangle is " + rectangle0.width + ".");
		System.out.println("The height of the default rectangle is " + rectangle0.height + ".");
		System.out.println("The area of the default rectangle is " + rectangle0.getArea() + ".");
		System.out.println("The perimeter of the default rectangle is " + rectangle0.getPerimeter() + ".");

		
		
		SimpleRectangle rectangle1 = new SimpleRectangle(4, 40);
		
		System.out.println("The width of the first rectangle is " + rectangle1.width + ".");
		System.out.println("The height of the first rectangle is " + rectangle1.height + ".");
		System.out.println("The area of the first rectangle is " + rectangle1.getArea() + ".");
		System.out.println("The perimeter of the first rectangle is " + rectangle1.getPerimeter() + ".");
		
		SimpleRectangle rectangle2 = new SimpleRectangle(3.5,35.9);
		
		System.out.println("The width of the second rectangle is " + rectangle2.width + ".");
		System.out.println("The height of the second rectangle is " + rectangle2.height + ".");
		System.out.println("The area of the second rectangle is " + rectangle2.getArea() + ".");
		System.out.println("The perimeter of the second rectangle is " + rectangle2.getPerimeter() + ".");
		
	}
	
}


class SimpleRectangle {
	// The default length and width
	double width = 1;
	double height = 1;
	
	// Construct a no-arg rectangle object
	SimpleRectangle() {
		
	} // End Default Rectangle
	
	// Construct a rectangle with specified dimensions
	SimpleRectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	} // End Rectangle
	
	// Return area of rectangle
	double getArea() {
		return width * height;
	}
	
	double getPerimeter() {
		return width + width + height + height;
	}
	
	
}

