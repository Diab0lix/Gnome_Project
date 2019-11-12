import java.util.*;

import static java.lang.System.out;

/**
 *
 */
public class Shiny extends Gnome {

    public float PriceMultiplier = 3;
    private List<String> ColourList = Arrays.asList("red", "blue", "white");
    private List<Integer> AgeList = Arrays.asList(5,6,7,8,9,10);
    private List<String> SizeList = Arrays.asList("extra_small","extra_large", "medium");
    private List<String> BuildList = Arrays.asList("normal", "thick");
    private List<String> SexList = Arrays.asList("female", "male","other");
    private List<String> TalkList = Arrays.asList("I AM BATMAN!!", "PIKA PIKA","un Choumarin");

    /**
     * Default constructor
     */
    public Shiny(int id, String name, int age, String skincolour,String size,String build,String sex, double price) {
        super(id, name, age, skincolour, size, build, sex, price);
    }

    // void constructor to create new instance without parameters
    public Shiny() {
        super(0, null, 0, null, null, null, null,0);
    }

    @Override
    public void setAge(){
        this.Age = RandomGnomeInt(AgeList);
    }

    @Override
    public void setSkinColour() {
        this.SkinColour = RandomGnomeString(ColourList);
    }

    @Override
    public void setSize(){
        this.Size = RandomGnomeString(SizeList);
    }

    @Override
    public void setBuild() {
        this.Build = RandomGnomeString(BuildList);
    }

    @Override
    public void setSex(){
        this.Sex = RandomGnomeString(SexList);
    }

    @Override
    public void setPrice() {
        this.Price = calculatePrice(PriceMultiplier);
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
        out.println(this.Name + " dit " +RandomGnomeString(TalkList));
    }

}
