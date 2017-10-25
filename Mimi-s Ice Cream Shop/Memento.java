/* Jon Ham
 * Kristen Mae Hernandez
 * October 26, 2017
 * Purpose: The purpose of this program is to create a memento of
 * the Originator (AdvancedIceCreamCone)
 */
package IceCreamCone;
import java.io.*;
import java.util.ArrayList;

/**
 * This program creates a memento the AdvancedIceCreamCone class
 * @author Jon Ham
 * @author Kristen Mae Hernandez
 */
public class Memento implements Serializable{
    private int numberOfScoops;
    private String flavor;
    private String typeOfCone;
    private ArrayList<String> toppings = new ArrayList<String>();

    /**
     * Default Constructor
     * @param scoop number of ice cream scoops
     * @param flavor flavor of the ice cream
     * @param typeOfCone the type of ice cream cone
     * @param toppings toppings on the ice cream cone
     */
    public Memento(int scoop, String flavor, String typeOfCone, ArrayList<String> toppings){
        numberOfScoops = scoop;
        this.flavor = flavor;
        this.typeOfCone = typeOfCone;
        this.toppings = toppings;
    }

    /** @return the ice cream cone flavor */
    public String getFlavor(){
        return flavor;
    }

    /** @return the ice cream cone's number of scoops */
    public int getScoops(){
        return numberOfScoops;
    }

    /** @return the ice cream cone's type of cone */
    public String getCone(){
        return typeOfCone;
    }

    /** @return the ice cream cone's toppings */
    public ArrayList<String> getToppings(){
        return toppings;
    }

    /** Sets the flavor 
     * @param flavor ice cream flavor
     */
    public void setFlavor(String flavor){
        this.flavor = flavor;
    }

    /** Sets the number of ice cream scoops 
     * @param scoops number of ice cream scoops
     */
    public void setScoops(int scoops){
        numberOfScoops = scoops;
    }

    /** Sets the type of cone
     * @param cone type of ice cream cone
     */
    public void setCone(String cone){
        typeOfCone = cone;
    }

    /** Sets the toppings on the ice cream cone
     * @param topings toppings of the ice cream cone
     */
    public void setToppings(ArrayList<String> toppings){
        this.toppings = toppings;
    }
}
