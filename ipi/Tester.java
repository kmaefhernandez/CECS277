/*
 * Jon Ham
 * Mimi Opkins - CECS 277
 * October 12, 2017
 * 
 * This program applies the concept of Polymorphism, Abstract, Interface, and Inheritance.
 * Specific shape objects are created by extending from the abstract general Geometric Object class. 
 * These objects are stored in an array, compared by its area, and sorted in increasing order.
 * 
 * Inputs: computer-generated date, color, name, measurements, and fill
 * Outputs: String representation of each Object
 */

package ipi;
import java.util.*;

public class Tester {

	public static void main(String[] args) {
		//Instantiate Rectangles
		Rectangle rect = new Rectangle();
		Rectangle rect2 = new Rectangle(7.5, 5.3);
		Rectangle rect3 = new Rectangle(2.5, 4.1, "Red", true, "Rory");
		
		//Instantiate Triangles
		Triangle tri = new Triangle();
		Triangle tri2 = new Triangle(1.3, 1.4, 2.0);
		Triangle tri3 = new Triangle(1, 2.0, 1.4, "Blue", false, "Tracy");
		
		//Instantiate Circles
		Circle circ = new Circle();
		Circle circ2 = new Circle(6.7);
		Circle circ3 = new Circle(5.4, "Black", true, "Claire");
		
		//Create ArrayList for Geometric Objects
		ArrayList<GeoObj> objArray = new ArrayList<GeoObj>();

		//TEST METHODS
		//Rectangle - get height/width
		System.out.println("Printing default Width and Height:");
		System.out.println("RECT1 HEIGHT: " + rect.getHeight());
		System.out.println("RECT1 WIDTH: " + rect.getWidth());
		System.out.println("RECT2 HEIGHT: " + rect2.getHeight());
		System.out.println("RECT2 WIDTH: " + rect2.getWidth());
		System.out.println("RECT3 HEIGHT: " + rect3.getHeight());
		System.out.println("RECT3 WIDTH: " + rect3.getWidth());
		System.out.println();
		
		//Rectangle - set height/width/name/fill/color
		System.out.println("Printing new Width and Height:");
		rect.setHeight(5.0);
		rect.setWidth(7.5);
		rect.setColor("Green");
		rect.setFilled(false);
		rect.setName("Ryan");
		
		rect2.setColor("Pink");
		rect2.setFilled(true);
		rect2.setName("Ruby");
		System.out.println("RECT1 HEIGHT: " + rect.getHeight());
		System.out.println("RECT1 WIDTH: " + rect.getWidth());
		System.out.println();
		
		//Triangle - get sides
		System.out.println("Printing default sides:");
		System.out.println("TRIANGLE1 SIDE 1: " + tri.getSide1());
		System.out.println("TRIANGLE1 SIDE 2: " + tri.getSide2());
		System.out.println("TRIANGLE1 SIDE 3: " + tri.getSide3());
		System.out.println("TRIANGLE2 SIDE 1: " + tri2.getSide1());
		System.out.println("TRIANGLE2 SIDE 2: " + tri2.getSide2());
		System.out.println("TRIANGLE2 SIDE 3: " + tri2.getSide3());
		System.out.println("TRIANGLE3 SIDE 1: " + tri3.getSide1());
		System.out.println("TRIANGLE3 SIDE 2: " + tri3.getSide2());
		System.out.println("TRIANGLE3 SIDE 3: " + tri3.getSide3());
		System.out.println();
		
		//Triangle - set sides/name/fill/color
		System.out.println("Prinitng new sides:");
		tri.setSide1(6.4);
		tri.setSide2(3.8);
		tri.setSide3(2.8);
		tri.setColor("Orange");
		tri.setFilled(true);
		tri.setName("Tori");
		
		tri2.setColor("Yellow");
		tri2.setFilled(false);
		tri2.setName("Trisha");
		System.out.println("TRIANGLE1 SIDE 1: " + tri.getSide1());
		System.out.println("TRIANGLE1 SIDE 2: " + tri.getSide2());
		System.out.println("TRIANGLE1 SIDE 3: " + tri.getSide3());
		System.out.println();
		
		//Circle - get radius / diameter
		System.out.println("Printing default radius and diameter:");
		System.out.println("CIRCLE1 RADIUS: " + circ.getRadius());
		System.out.println("CIRCLE1 DIAMETER: " + circ.getDiameter());
		System.out.println("CIRCLE2 RADIUS: " + circ2.getRadius());
		System.out.println("CIRCLE2 DIAMETER: " + circ2.getDiameter());
		System.out.println("CIRCLE3 RADIUS: " + circ3.getRadius());
		System.out.println("CIRCLE3 DIAMETER: " + circ3.getDiameter());
		System.out.println();
		
		//Circle - set radius/name/fill/color
		System.out.println("Printing new radius and diameter:");
		circ.setRadius(5.9);
		circ.setColor("Purple");
		circ.setFilled(true);
		circ.setName("Carl");
		
		circ2.setColor("Brown");
		circ2.setFilled(true);
		circ2.setName("Christine");
		System.out.println("CIRCLE1 RADIUS: " + circ.getRadius());
		System.out.println("CIRCLE1 DIAMETER: " + circ.getDiameter());
		System.out.println();
		
		
		//Get perimeter/area
		System.out.println("Printing Perimeter:");
		System.out.println("RECT3 PERIM: " + rect3.getPerimeter());
		System.out.println("TRIANGLE3 PERIM: " + tri3.getPerimeter());
		System.out.println("CIRCLE3 PERIM: " + circ3.getPerimeter());
		System.out.println();
		System.out.println("Printing Area:");
		System.out.println("RECT3 AREA: " + rect3.getArea());
		System.out.println("TRIANGLE3 AREA: " + tri3.getArea());
		System.out.println("CIRCLE3 AREA: " + circ3.getArea());
		System.out.println();
		
		//Populate ArrayList
		objArray.add(circ3);
		objArray.add(rect);
		objArray.add(tri);
		objArray.add(rect3);
		objArray.add(circ2);
		objArray.add(tri2);
		objArray.add(rect2);
		objArray.add(circ);
		objArray.add(tri3);
		
		
		//print list
		for(int i = 0; i < objArray.size(); i++){
			System.out.println(objArray.get(i));
			System.out.println();
		}
		
		System.out.println();
		System.out.println("SORTING BY AREA:");
		//compare and sort ArrayList (least to greatest area)
		double max = 0.0;
		//iterate through each object to determine max area
		for(int i = 0; i < objArray.size(); i++){
			//loop until max value is the last object's area
			do{
				//iterate through each object to compare
				for(int j = 0; j < objArray.size(); j++){
					//keep from index out of bounds error
					while ((j+1) != 9){
						//compare two objects, and swap if necessary
						System.out.println("COMPARING OBJ " + (j + 1) + " AND OBJ " + (j + 2));
						if(objArray.get(j).compareTo(objArray.get(j+1)) == 1){
							GeoObj temp = objArray.remove(j);
							objArray.add(j+1, temp);
						}
						break;
					}
				}
				if (max < objArray.get(i).getArea()) { max = objArray.get(i).getArea(); };
			}while(max < objArray.get(i).getArea());
			
		}
		
		//print list in order
		System.out.println();
		for(int i = 0; i < objArray.size(); i++){
			System.out.println(objArray.get(i));
			System.out.println();
		}
	}
}
