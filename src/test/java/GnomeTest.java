import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static java.lang.System.out;
class GnomeTest{

    @org.junit.jupiter.api.Test
    void getPrice() {
        Gnome michel = new Handicaped(1,"michel",8,"red","small","thin","female",0);
        michel.setPrice();// pour les caractéristiques le résultat sera de (5+666+3+1+69)*0.5=372
        if(michel.Price ==372){
            out.println("Test Ok");}
        else{
            out.println("Test Fail");
        }
    }


    @org.junit.jupiter.api.Test
    void testCreationOfGnomes() { //testing the creation and the id setting
        Gnome Handicaped = new Handicaped();
        Handicaped.setId();
        Handicaped.setName("Handicaped");
        Handicaped.setAge();
        Handicaped.setBuild();
        Handicaped.setSex();
        Handicaped.setSize();
        Handicaped.setSkinColour();
        Handicaped.setPrice();
        out.println("Gnome "+ Handicaped.Name + " " + Handicaped.Id +  ":" + Handicaped.SkinColour +' ' + Handicaped.Sex +' ' + Handicaped.Build +' ' + Handicaped.Size+' '+Handicaped.Price  );

        Gnome Shiny = new Shiny();
        Shiny.setId();
        Shiny.setName("Shiny");
        Shiny.setAge();
        Shiny.setBuild();
        Shiny.setSex();
        Shiny.setSize();
        Shiny.setSkinColour();
        Shiny.setPrice();
        Shiny.Idle();
        out.println("Gnome "+ Shiny.Name + " " + Shiny.Id +  ":" + Shiny.SkinColour +' ' + Shiny.Sex +' ' + Shiny.Build +' ' + Shiny.Size+' '+Shiny.Price  );

        Gnome Handicaped1 = new Handicaped();
        Handicaped1.setId();
        Handicaped1.setName("Handicaped");
        Handicaped1.setAge();
        Handicaped1.setBuild();
        Handicaped1.setSex();
        Handicaped1.setSize();
        Handicaped1.setSkinColour();
        Handicaped1.setPrice();
        out.println("Gnome "+ Handicaped1.Name + " " + Handicaped1.Id +  ":" + Handicaped1.SkinColour +' ' + Handicaped1.Sex +' ' + Handicaped1.Build +' ' + Handicaped1.Size+' '+Handicaped1.Price  );
    }


}