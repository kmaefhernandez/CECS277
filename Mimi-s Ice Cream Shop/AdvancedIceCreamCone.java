package IceCreamCone;
/* This class is used to model the properties and behaviors of an ice cream cone.
   There are currently restriction on the construction of the cone: only one
   flavor of ice cream is allowed. */
import java.util.*;

public class AdvancedIceCreamCone{
    private int numberOfScoops;
    private String flavor;
    private String typeOfCone;
    private ArrayList<String> toppings = new ArrayList<String>();


    public AdvancedIceCreamCone() {
        numberOfScoops=1;
        flavor="vanilla";
        typeOfCone="regular";
    }

    public AdvancedIceCreamCone(int ns,String flv,String cone) {
        numberOfScoops=ns;
        flavor=flv;
        typeOfCone=cone;
    }

    public int getNumberOfScoops () {
        return numberOfScoops;
    }

    public String getFlavor() {
        return flavor;
    }

    public String getTypeOfCone() {
        return typeOfCone;
    }

    public void addScoop() {
        numberOfScoops=numberOfScoops+1;
    }

    public void setFlavor(String flv) {
        flavor=flv;
    }

    public void setTypeOfCone(String cone) {
        typeOfCone=cone;
    }

    public void addToppings(String top) {
        toppings.add(top);
    }

    public ArrayList<String> getToppings () {
        return toppings;
    }

    public Memento save(){
        return new Memento(numberOfScoops, flavor, typeOfCone, toppings);
    }

    public void restore(Memento m){
        this.flavor = m.getFlavor();
        this.numberOfScoops = m.getScoops();
        this.typeOfCone = m.getCone();
        this.toppings = m.getToppings();
    }

    public String toString() {
        return ("Flavor: " + flavor + "\n" +
                "Number of Scoops: " + numberOfScoops + "\n" +
                "Type of Cone: " + typeOfCone + "\n" +
                "Toppings: " + toppings + "\n");
    }

}
