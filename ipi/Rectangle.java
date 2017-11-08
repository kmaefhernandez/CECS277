package ipi;

/**
 * Rectangle object class
 * @author JonHam
 *
 */
public class Rectangle extends GeoObj {
	/** height of rectangle */
	private double height;
	/** width of rectangle */
	private double width;
	
	/**
	 * Default constructor
	 */
	Rectangle(){
		super();
		height = 1.0;
		width = 1.0;
	}
	
	/**
	 * Overloaded constructor
	 * @param h new height of rectangle
	 * @param w new width of rectangle
	 */
	Rectangle(double h, double w){
		super();
		height = h;
		width = w;
	}
	
	/**
	 * Overloaded constructor 
	 * @param h new height of rectangle
	 * @param w new width of rectangle
	 * @param c new color of rectangle
	 * @param f new fill of rectangle
	 * @param n new name of rectangle
	 */
	Rectangle(double h, double w, String c, boolean f, String n){
		super(c, f, n);
		height = h;
		width = w;
	}
	
	/**
	 * gets the width of the rectangle
	 * @return width of rectangle
	 */
	public double getWidth(){
		return width;
	}
	
	/**
	 * sets a new width for the rectangle
	 * @param w new width of rectangle
	 */
	public void setWidth(double w){
		width = w;
	}
	
	/**
	 * gets the height of the rectangle
	 * @return height of rectangle
	 */
	public double getHeight(){
		return height;
	}
	
	/**
	 * sets a new height for the rectangle
	 * @param h new height for the rectangle
	 */
	public void setHeight(double h){
		height = h;
	}
	
	/**
	 * gets the area of the rectangle
	 * @return area of rectangle
	 */
	public double getArea(){
		return width * height;
	}
	
	/**
	 * gets the perimeter of the rectangle
	 * @return perimeter of rectangle
	 */
	public double getPerimeter(){
		return 2 * width + 2 * height;
	}
	
	/**
	 * String representation of the rectangle
	 */
	public String toString(){
		
		return super.toString() + "Width: " + width + "\nHeight: " + height + "\nPerimeter: " + getPerimeter() + "\nArea: " + getArea();
	}
}
