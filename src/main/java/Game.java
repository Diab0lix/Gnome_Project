import javax.swing.*;
import java.awt.*;
public class Game extends JFrame {


    private CommandPanel command;
    private ScreenPanel Screen;
    private Infoscreen Info;
    public Client Player;
    public Game(int difficulty) {
        super();
        if(difficulty==1){
            Player = new Client("Harry", "Potter", 1000);
        }
        else{
            Player = new Hunter("Geralt","Of Rivia", 20);
        }
        command = new CommandPanel();// Creation of the Jpanel for buttons
        Screen = new ScreenPanel();    // creation of the upper container
        Info = new Infoscreen();
        setTitle("GnomeTale");
        // Clicking on the close cross on the up left of the window will close, both, the window and the program
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(Info, BorderLayout.NORTH);
        getContentPane().add(Screen, BorderLayout.CENTER);
        getContentPane().add(command, BorderLayout.SOUTH);
        setVisible(true);
        setSize(800,500);
        //setResizable(false);
    }
}