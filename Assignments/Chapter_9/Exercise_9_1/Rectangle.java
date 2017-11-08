package Exercise_9_1;

public class Rectangle {
	// The default length and width
	private double width = 1;
	private double height = 1;
	
	// Construct a no-arg rectangle object
	Rectangle() {
		
	} // End Default Rectangle
	
	// Construct a rectangle with specified dimensions
	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	} // End Rectangle
	
	// Return area of rectangle
	double getArea() {
		return width * height;
	}
	
	double getPerimeter() {
		return 2 * (width + height);
	}
	
	public double getHeight(){
		return height;
	}
	
	public double getWidth(){
		return width;
	}
	
}
