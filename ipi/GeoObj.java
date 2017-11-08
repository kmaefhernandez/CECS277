package ipi;
/**
 * Geometric Object parent abstract class
 * @author JonHam
 *
 */
public abstract class GeoObj implements Comparable<GeoObj>{
	/** used to set color of shapes */
	private String color = "white";
	/** used to see if shaped is filled or not */
	private boolean filled;
	/** used to see when the shape was created */
	private java.util.Date dateCreated;
	/** name of shape */
	private String name = "noname";
		
	/**
	 * Default constructor
	 */
	GeoObj(){
		dateCreated = new java.util.Date();
	}
	
	/**
	 * Overloaded constructor 
	 * @param c color of shape
	 * @param f fill of shape
	 * @param n name of shape
	 */
	GeoObj(String c, boolean f, String n){
		dateCreated = new java.util.Date();
		color = c;
		filled = f;
		name = n;
	}
	
	/**
	 * gets the color of the shape
	 * @return color of shape
	 */
	public String getColor(){
		return color;
	}
	
	/**
	 * sets a new color to the shape
	 * @param c new color of shape
	 */
	public void setColor(String c){
		color = c;
	}
	
	/**
	 * checks to see if shape is filled or not
	 * @return true if filled, false otherwise
	 */
	public boolean isFilled(){
		return filled;
	}
	
	/**
	 * sets the fill status of shape
	 * @param f fill
	 */
	public void setFilled(boolean f){
		filled = f;
	}
	
	/**
	 * gets the date of creation
	 * @return date of creation
	 */
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	
	/**
	 * gets the name of the shape
	 * @return name of shape
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * sets a new name for the shape
	 * @param n new name of shape
	 */
	public void setName(String n){
		name = n;
	}
	
	/**
	 * String representation of the shape
	 */
	public String toString(){
		return name + " was created on " + dateCreated + "\nColor: " + color +
				 "\nFilled: " + filled + "\n";
	}
	
	/**
	 * determines the larger of the two objects
	 * @param obj1 first object to compare
	 * @param obj2 second object to compare
	 * @return 1 if implicit is larger than explicit, -1 if vice versa, and 0 if equal
	 */
	public int max(GeoObj obj1, GeoObj obj2){
		return obj1.compareTo(obj2);
	}
	
	/**
	 * compares the area of two objects
	 * @return 1 if implicit is larger than explicit, -1 if vice versa, and 0 if equal
	 */
	@Override
	public int compareTo(GeoObj other){
		if(this.getArea() > other.getArea()){
			return 1;
		}
		if(this.getArea() < other.getArea()){
			return -1;
		}else{
			return 0;
		}
	}
	
	/**
	 * gets the area of the specified shape
	 * @return area
	 */
	abstract double getArea();
	
	/**
	 * gets the perimeter of specified shape
	 * @return perimeter
	 */
	abstract double getPerimeter();
}
