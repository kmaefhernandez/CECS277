package IceCreamCone;

import java.sql.SQLOutput;

public class IceCreamConeTester {
    /* This class is used to test the functionality of the IceCreamCone class */

    public static void displayCurrentCone(AdvancedIceCreamCone ICC){
        System.out.println("Current Cone:\n" +
                "-------------");
        System.out.println(ICC);
    }

    public static void displayNewCone(AdvancedIceCreamCone ICC){
        System.out.println("New Cone:\n" +
                "-------------");
        System.out.println(ICC);
    }

    public static void main(String [] args) {
        Caretaker caretaker = new Caretaker();
        AdvancedIceCreamCone ICC = new AdvancedIceCreamCone();

        displayNewCone(ICC);
        System.out.println("Adding scoop...");
        ICC.addScoop();
        System.out.println("# of scoops is now: " + ICC.getNumberOfScoops());
        System.out.println();

        System.out.println("Adding toppings: oreos, mochi");
        ICC.addToppings("oreos");
        ICC.addToppings("mochi");
        System.out.println();

        System.out.println("Setting type of cone...");
        ICC.setTypeOfCone("sugar");
        System.out.println("Cone is now type: " + ICC.getTypeOfCone());
        System.out.println();

        displayCurrentCone(ICC);

        System.out.println("SAVING CONE...\n");
        caretaker.addMemento(ICC.save());

        System.out.println("CREATING NEW CONE...");
        ICC = new AdvancedIceCreamCone(3, "strawberry", "waffle");
        displayNewCone(ICC);

        System.out.println("Adding scoop..");
        ICC.addScoop();
        System.out.println("# of scoops is now: " + ICC.getNumberOfScoops());
        System.out.println();

        System.out.println("Changing flavor...");
        ICC.setFlavor("chocolate");
        System.out.println("Flavor is now: " + ICC.getFlavor());
        System.out.println();

        displayCurrentCone(ICC);

        String[] toppings = {"sprinkles","chocolate chips","marshmallows",
                "oreo cookies","nuts","cherry"};
        for (int i = 0; i < toppings.length; i++){
            ICC.addToppings(toppings[i]);
        }

        System.out.println("Adding toppings: sprinkles, chocolate chips, marshmallows, " +
                "oreo cookies, nuts, cherry");
        System.out.println();

        displayCurrentCone(ICC);
        System.out.println("SAVING CONE...\n");
        caretaker.addMemento(ICC.save());

        System.out.println("CREATING NEW CONE...");
        ICC = new AdvancedIceCreamCone(2, "vanilla", "regular");
        displayNewCone(ICC);

        System.out.println("Adding toppings: fruity pebbles, blueberries, banana");
        ICC.addToppings("fruity pebbles");
        ICC.addToppings("blueberries");
        System.out.println();

        System.out.println("Adding scoop..");
        ICC.addScoop();
        System.out.println("# of scoops is now: " + ICC.getNumberOfScoops());
        System.out.println();

        System.out.println("Changing flavor...");
        ICC.setFlavor("mint");
        System.out.println("Flavor is now: " + ICC.getFlavor());
        System.out.println();

        displayCurrentCone(ICC);
        System.out.println("SAVING CONE...\n");
        caretaker.addMemento(ICC.save());

        System.out.println("User restored to chocolate ice cream.");
        ICC.restore(caretaker.getMemento("chocolate"));
        displayCurrentCone(ICC);

    }
}

