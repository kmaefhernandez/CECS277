package IceCreamCone;
import java.io.*;
import java.util.ArrayList;

public class Memento implements Serializable{
    private int numberOfScoops;
    private String flavor;
    private String typeOfCone;
    private ArrayList<String> toppings = new ArrayList<String>();

    public Memento(int scoop, String flavor, String typeOfCone, ArrayList<String> toppings){
        numberOfScoops = scoop;
        this.flavor = flavor;
        this.typeOfCone = typeOfCone;
        this.toppings = toppings;
    }

    public String getFlavor(){
        return flavor;
    }

    public int getScoops(){
        return numberOfScoops;
    }

    public String getCone(){
        return typeOfCone;
    }

    public ArrayList<String> getToppings(){
        return toppings;
    }

    public void setFlavor(String flavor){
        this.flavor = flavor;
    }

    public void setScoops(int scoops){
        numberOfScoops = scoops;
    }

    public void setCone(String cone){
        typeOfCone = cone;
    }

    public void setToppings(ArrayList<String> toppings){
        this.toppings = toppings;
    }
}
