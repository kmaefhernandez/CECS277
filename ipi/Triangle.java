package ipi;

/**
 * Triangle object Class
 * @author JonHam
 *
 */
public class Triangle extends GeoObj{
	/** side 1 of triangle */
	private double side1;
	/** side 2 of triangle */
	private double side2;
	/** side 3 of triangle */
	private double side3;
	
	/**
	 * Default constructor
	 */
	Triangle(){
		super();
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	/**
	 * Overloaded constructor
	 * @param s1 new side 1 of triangle
	 * @param s2 new side 2 of triangle
	 * @param s3 new side 3 of triangle
	 */
	Triangle(double s1, double s2, double s3){
		super();
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	
	/**
	 * Overloaded constructor
	 * @param s1 new side 1 of triangle
	 * @param s2 new side 2 of triangle
	 * @param s3 new side 3 of triangle
	 * @param c new color of triangle
	 * @param f new fill of triangle
	 * @param n new name of triangle
	 */
	Triangle(double s1, double s2, double s3, String c, boolean f, String n){
		super(c, f, n);
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	
	/**
	 * gets the side 1 length of triangle
	 * @return side1 length of triangle
	 */
	public double getSide1(){
		return side1;
	}
	
	/**
	 * gets the side 2 length of triangle
	 * @return side2 length of triangle
	 */
	public double getSide2(){
		return side2;
	}
	
	/**
	 * gets the side 3 length of triangle
	 * @return side3 length of triangle
	 */
	public double getSide3(){
		return side3;
	}
	
	/**
	 * sets a new side 1 length for triangle
	 * @param s1 new side 1 length of triangle
	 */
	public void setSide1(double s1){
		side1 = s1;
	}
	
	/**
	 * sets a new side 2 length for triangle
	 * @param s2 new side 2 length of triangle
	 */
	public void setSide2(double s2){
		side2 = s2;
	}
	
	/**
	 * sets a new side 3 length for triangle
	 * @param s3 new side 3 length of triangle
	 */
	public void setSide3(double s3){
		side3 = s3;
	}
	
	/**
	 * gets the perimeter of the triangle
	 * @return perimeter of triangle
	 */
	public double getPerimeter(){
		return side1 + side2 + side3;
	}
	
	/**
	 * gets the area of the triangle
	 * @return area of triangle
	 */
	public double getArea(){
		double p = getPerimeter();
		double s = p / 2;
		return Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
	}
	
	/**
	 * String representation for the triangle
	 */
	public String toString(){
		
		return super.toString() + "Sides: " + side1 + ", " + side2 + ", and " + side3 + "\nPerimeter: " + getPerimeter() + "\nArea: " + getArea();
	}
}
