package Exercise_9_1;

public class Rectangle {
	// The default length and width
	double width = 1;
	double height = 1;
	
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
		return width + width + height + height;
	}
	
}
