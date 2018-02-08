
public class Triangle 
	extends GeometricObject {
	
	///// DATA FIELDS /////
	double side1 = 0;
	double side2 = 0;
	double side3 = 0;
//	public String getPerimeter;
//	public String getArea;
//	public String color;
//	private boolean filled;
	
	
	///// CONSTRUCTORS /////
	
	// Default
	public Triangle() {
		
	} // End Default Constructor
	
	public Triangle(double side1, double side2, double side3) {
		// Set Data Fields
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	} // End Triangle(double side1, double side2, double side3)
	
	public Triangle (double side1, double side2, double side3, String color, boolean filled) {
		super(color,filled);
		// Set Data Fields
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		setColor(color);
		setFilled(filled);
	} // End Triangle (double side1, double side2, double side3, String color, boolean filled)
	
	///// SETTERS AND GETTERS /////
	
	public double getSide1(){
		return side1;
	} // End getSide1
	public double getSide2(){
		return side2;
	} // End getSide2
	public double getSide3(){
		return side3;
	} // End getSide3
	
	public void setSide1(double side1) {
		this.side1 = side1;
	} // End setSide1
	public void setSide2(double side2) {
		this.side2 = side2;
	} // End setSide2
	public void setSide3(double side3) {
		this.side3 = side3;
	} // End setSide3
	

//	public String getColor() {
//		return color;
//	}
	
	
	// Calculate Area and Perimeter
	public double getPerimeter() {
		return side1 + side2 + side3;
	} // End getArea
	
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	} // End getPerimeter
	
	

} // End Triangle
