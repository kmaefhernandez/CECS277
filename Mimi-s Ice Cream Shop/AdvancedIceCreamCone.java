package IceCreamCone;
/* This class is used to model the properties and behaviors of an ice cream cone.
   There are currently restriction on the construction of the cone: only one
   flavor of ice cream is allowed. */
import java.util.*;

/**
 * This program creates an AdvancedIceCreamCone object.
 * @author Mimi Opkins
 * @author Jon Ham
 * @author Kristen Mae Hernandez
 */
public class AdvancedIceCreamCone{
    private int numberOfScoops;
    private String flavor;
    private String typeOfCone;
    private ArrayList<String> toppings = new ArrayList<String>();


    /** Default Constructor */
    public AdvancedIceCreamCone() {
        numberOfScoops=1;
        flavor="vanilla";
        typeOfCone="regular";
    }

    /**
     * Overloaded Constructor
     * @param ns number of scoops
     * @param flv ice cream cone flavor
     * @param cone type of ice cream cone
     */
    public AdvancedIceCreamCone(int ns,String flv,String cone) {
        numberOfScoops=ns;
        flavor=flv;
        typeOfCone=cone;
    }

    /** @return the number of ice cream scoops */
    public int getNumberOfScoops () {
        return numberOfScoops;
    }

    /** @return the ice cream flavor */
    public String getFlavor() {
        return flavor;
    }

    /** @return the type of ice cream cone */
    public String getTypeOfCone() {
        return typeOfCone;
    }

    /** Adds an ice cream scoop */
    public void addScoop() {
        numberOfScoops=numberOfScoops+1;
    }

    /**
     * Sets the ice cream flavor
     * @param flv ice cream flavor
     */
    public void setFlavor(String flv) {
        flavor=flv;
    }

    /**
     * Sets the type of ice cream cone
     * @param cone cone type
     */
    public void setTypeOfCone(String cone) {
        typeOfCone=cone;
    }

    /**
     * Adds a topping to the ice cream cone
     * @param top ice cream cone topping
     */
    public void addToppings(String top) {
        toppings.add(top);
    }

    /** @return the ice cream cone toppings */
    public ArrayList<String> getToppings () {
        return toppings;
    }

    /**
     * Saves a memento of an AdvancedIceCreamCone object
     * @return a memento of the ice cream cone
     */
    public Memento save(){
        return new Memento(numberOfScoops, flavor, typeOfCone, toppings);
    }

    /**
     * Restores a previously saved ice cream cone memento
     * @param m memento of the ice cream cone
     */
    public void restore(Memento m){
        this.flavor = m.getFlavor();
        this.numberOfScoops = m.getScoops();
        this.typeOfCone = m.getCone();
        this.toppings = m.getToppings();
    }

    /** @return a formatted String of an ice cream cone */
    @Override
    public String toString() {
        return ("Flavor: " + flavor + "\n" +
                "Number of Scoops: " + numberOfScoops + "\n" +
                "Type of Cone: " + typeOfCone + "\n" +
                "Toppings: " + toppings + "\n");
    }

}
