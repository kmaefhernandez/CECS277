package ipi;

/**
 * Circle object class
 * @author JonHam
 *
 */
public class Circle extends GeoObj{
	/** radius of circle */
	private double radius;
	/** constant pi to calculate area */
	private double pi = 3.14;
	
	/**
	 * Default constructor
	 */
	Circle(){
		super();
		radius = 1.0;
	}
	
	/**
	 * Overloaded constructor
	 * @param r new radius of circle
	 */
	Circle(double r){
		super();
		radius = r;
	}
	
	/**
	 * Overloaded constructor
	 * @param r new radius of circle
	 * @param c new color of circle
	 * @param f new fill of circle
	 * @param n new name of circle
	 */
	Circle(double r, String c, boolean f, String n){
		super(c, f, n);
		radius = r;
	}
	
	/**
	 * gets the radius of the circle
	 * @return radius of circle
	 */
	public double getRadius(){
		return radius;
	}
	
	/**
	 * sets a new radius for the circle
	 * @param r new radius for circle
	 */
	public void setRadius(double r){
		radius = r;
	}
	
	/**
	 * gets the diameter of the circle
	 * @return diameter of circle
	 */
	public double getDiameter(){
		return radius * 2;
	}
	
	/**
	 * gets the area of the circle
	 * @return area of circle
	 */
	public double getArea(){
		return pi * (Math.pow(radius, 2));
		
	}
	
	/**
	 * gets the perimeter of the circle
	 * @return perimeter of circle
	 */
	public double getPerimeter(){
		return 2 * pi * radius;
	}
	
	/**
	 * String representation of the circle
	 */
	public String toString(){
		
		return super.toString() + "Radius: " + radius + "\nDiameter: " + getDiameter() + "\nPerimeter: " + getPerimeter() + "\nArea: " + getArea();
	}
}
