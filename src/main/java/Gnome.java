import java.util.*;
import static java.lang.System.out;

public abstract class Gnome {
    // abstract class to override method class from subclass

    public static int IdSetter = 0;
    private static Map<String,Map<String, Double>> PriceMap = new HashMap<String, Map<String, Double>>();
    private static Map<String, Double> CaractColour = new HashMap<String, Double>();
    private static Map<String, Double> CaractSex = new HashMap<String, Double>();
    private static Map<String, Double> CaractSize = new HashMap<String, Double>();
    private static Map<String, Double> CaractBuild = new HashMap<String, Double>();
    private static Map<String, Double> CaractAge = new HashMap<String, Double>();
        static {
        CaractColour.put("blue",69.0);
        CaractColour.put("red",666.0);
        CaractColour.put("white",1.0);
        CaractColour.put("black",1.0);
        CaractColour.put("yellow",1.0);
        CaractColour.put("metis",1.0);
        PriceMap.put("Colour",CaractColour);
        CaractSex.put("female",69.0);
        CaractSex.put("male",666.0);
        CaractSex.put("other",1.0);
        PriceMap.put("Sex",CaractSex);
        CaractSize.put("extra_small",1.0);
        CaractSize.put("small",3.0);
        CaractSize.put("medium",2.0);
        CaractSize.put("large",1.0);
        CaractSize.put("extra_large",0.5);
        PriceMap.put("Size",CaractSize);
        CaractBuild.put("thin",1.0);
        CaractBuild.put("normal",2.0);
        CaractBuild.put("thick",3.0);
        CaractBuild.put("obese",0.5);
        PriceMap.put("Build",CaractBuild);
        CaractAge.put("less5",15.0);
        CaractAge.put("more5less8",10.0);
        CaractAge.put("more8less12",5.0);
        CaractAge.put("more12",1.0);
        PriceMap.put("Age",CaractAge);

    }

    // set to protected to allow subclasses to access variables
    protected int Age;
    protected String SkinColour;
    protected String Size;
    protected String Build;
    protected String Sex;
    protected String Name;
    protected double Price;
    protected int Id;
    private List<String> TalkList = Arrays.asList("J'ai fait un menhir", "J'ai fait une chaussure","J'ai fait du boudin noire");

     /**
     * Default constructor
     */
    public Gnome(int id, String name, int age, String skincolour, String size, String build, String sex,double price) {
        this.Id = id;
        this.Name = name;
        this.Age = age;
        this.SkinColour = skincolour;
        this.Size=size;
        this.Build=build;
        this.Sex=sex;
        this.Price=price;
    }

    final void setId() {
        this.Id = this.IdSetter;
        IdSetter += 1;
    }

    final void setName(String name)
    {
        this.Name = name;
    }

    public abstract void setAge();

    public abstract void setSkinColour();

    public abstract void setSize();

    public abstract void setBuild();

    public abstract void setSex();

    public abstract void setPrice();

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getSkinColour(){
        return SkinColour;
    }

    public String getSize() {
        return Size;
    }

    public String getBuild() {
        return Build;
    }

    public String getSex() {
        return Sex;
    }

    public double getPrice() { return Price;}

    protected String RandomGnomeString(List<String> givenList) {
        Random rand = new Random();
        return givenList.get(rand.nextInt(givenList.size()));
    }

    protected int RandomGnomeInt(List<Integer> givenList) {
        Random rand = new Random();
        return givenList.get(rand.nextInt(givenList.size()));
    }

    public void Work() {
        out.println(RandomGnomeString(TalkList));
    }

    public void Idle() {
        out.println(RandomGnomeString(TalkList));
    }

    public void HandCrafting() {
        out.println(RandomGnomeString(TalkList));

    }

    public double calculatePrice(double multiplier) {
        double Price = 0;

        Price += PriceMap.get("Sex").get(this.Sex);
        Price += PriceMap.get("Build").get(this.Build);
        Price += PriceMap.get("Size").get(this.Size);
        Price += PriceMap.get("Colour").get(this.SkinColour);
        if (this.Age < 5) {

            Price += PriceMap.get("Age").get("less5");
        }else if (this.Age<8) {
            Price += PriceMap.get("Age").get("more5less8");
        }else if (this.Age<12) {
            Price += PriceMap.get("Age").get("more8less12");
        }else{
            Price += PriceMap.get("Age").get("more12");
        }

        return Price*multiplier;
    }

}
