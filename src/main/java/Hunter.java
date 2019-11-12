
import java.util.*;

/**
 * 
 */
public class Hunter extends Client {

    /**
     * Default constructor
     */
    public Hunter(String name, String surname) {
        super(name, surname);
    }

    /**
     * 
     */
    public void Hunt(String name) {

        String gnomeCaracteristic = HuntRandomGnome();

        switch(gnomeCaracteristic) {
            case "Shiny":
                Shiny shiny = new Shiny();
                shiny.setId();
                shiny.setName(name);
                shiny.setAge();
                shiny.setBuild();
                shiny.setSex();
                shiny.setSize();
                shiny.setSkinColour();
                stock.addGnome(shiny);
                break;
            case "DelicateHands":
                DelicateHands delicateHands = new DelicateHands();
                stock.addGnome(delicateHands);
                break;
            case "Handicaped":
                Handicaped handicaped = new Handicaped();
                stock.addGnome(handicaped);
                break;
            case "Special":
                Special special = new Special();
                stock.addGnome(special);
                break;
            case "Normal":
                break;
            default:
                // code block
        }
    }

    private String HuntRandomGnome() {
        Random rand = new Random();
        List<String> givenList = Arrays.asList("Shiny", "DelicateHands", "Handicaped", "Special", "Normal");

        return givenList.get(rand.nextInt(givenList.size()));
    }

}