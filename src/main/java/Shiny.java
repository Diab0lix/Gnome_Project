import java.util.*;

/**
 * 
 */
public class Shiny extends Gnome {

    public float PriceMultiplier = 3;

    /**
     * Default constructor
     */
    public Shiny(int id, String name, int age, String skincolour,String size,String build,String sex) {
        super(id, name, age, skincolour, size, build, sex);
    }

    // void constructor to create new instance without parameters
    public Shiny() {
        super(0, null, 0, null, null, null, null);
    }

    @Override
    public void setAge(){
        List<Integer> givenList = Arrays.asList(6, 7, 8);
        int age = RandomGnomeInt(givenList);
        this.Age = age;
    }

    @Override
    public void setSkinColour() {
        List<String> givenList = Arrays.asList("red", "blue", "white");
        this.SkinColour = RandomGnomeString(givenList);
    }

    @Override
    public void setSize(){
        List<String> givenList = Arrays.asList("small", "medium", "large");
        this.Size = RandomGnomeString(givenList);
    }

    @Override
    public void setBuild() {
        List<String> givenList = Arrays.asList("normal", "thick");
        this.Build = RandomGnomeString(givenList);
    }

    @Override
    public void setSex(){
        List<String> givenList = Arrays.asList("female", "male");
        this.Sex = RandomGnomeString(givenList);
    }


    public String RandomGnomeString(List<String> givenList) {
        Random rand = new Random();
        return givenList.get(rand.nextInt(givenList.size()));
    }

    public int RandomGnomeInt(List<Integer> givenList) {
        Random rand = new Random();
        return givenList.get(rand.nextInt(givenList.size()));
    }

    public void Idle() {
        // TODO implement here
    }

}