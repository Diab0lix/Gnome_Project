
import java.util.*;

/**
 * 
 */
public class Hunter extends Client {

    /**
     * Default constructor
     */
    public Hunter(String name, String surname, double wallet) {
        super(name, surname, wallet);
    }

    /**
     * 
     */
    @Override
    public void Hunt() {

        String gnomeCaracteristic = HuntRandomGnome();

        switch(gnomeCaracteristic) {
            case "Shiny":
                Shiny shiny = new Shiny();
                CreateGnome(shiny, this.name);
                stock.addGnome(shiny);
                break;
            case "DelicateHands":
                DelicateHands delicateHands = new DelicateHands();
                CreateGnome(delicateHands, this.name);
                stock.addGnome(delicateHands);
                break;
            case "Handicaped":
                Handicaped handicaped = new Handicaped();
                CreateGnome(handicaped, this.name);
                stock.addGnome(handicaped);
                break;
            case "Special":
                Special special = new Special();
                CreateGnome(special, this.name);
                stock.addGnome(special);
                break;
            case "Normal":
                Normal normal = new Normal();
                CreateGnome(normal, this.name);
                stock.addGnome(normal);
                break;
            default:
                // code block
        }
    }

    private void CreateGnome(Gnome gnome, String name) {
        gnome.setId();
        gnome.setName(name);
        gnome.setAge();
        gnome.setBuild();
        gnome.setSex();
        gnome.setSize();
        gnome.setSkinColour();
    }

    private String HuntRandomGnome() {
        Random rand = new Random();
        List<String> givenList = Arrays.asList("Shiny", "DelicateHands", "Handicaped", "Special", "Normal");

        return givenList.get(rand.nextInt(givenList.size()));
    }

}
