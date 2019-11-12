import java.util.*;

import static java.lang.System.out;

/**
 *
 */
public class Handicaped extends Gnome {

    public double PriceMultiplier = 0.5;
    private List<String> ColourList = Arrays.asList("red", "blue", "white","black","yellow","metis");
    private List<Integer> AgeList = Arrays.asList(5,6,7,8,9,10,11,12,13,14,15);
    private List<String> SizeList = Arrays.asList("extra_small","extra_large","small", "medium", "large");
    private List<String> BuildList = Arrays.asList("thin","obese","normal", "thick");
    private List<String> SexList = Arrays.asList("female", "male","other");
    private List<String> TalkList = Arrays.asList("J'ai un menhir", "J'ai fait une chanson","J'ai fait une replique de Mona Lisa");

    /**
     * Default constructor
     */
    public Handicaped(int id, String name, int age, String skincolour,String size,String build,String sex,double price) {
        super(id, name, age, skincolour, size, build, sex, price);
    }

    public Handicaped() {
        super(0, null, 0, null, null, null, null, 0);
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
        this.Sex = RandomGnomeString(SexList);;
    }

    @Override
    public void setPrice() {
        this.Price = calculatePrice(PriceMultiplier);
    }

    public void Work() {
        out.println(this.Name + " dit " +RandomGnomeString(TalkList));
    }

}