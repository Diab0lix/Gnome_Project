import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {
    public CommandPanel command;
    public ScreenPanel Screen;
    public Infoscreen Info;
    public Game() {
        super();
        this.setBackground(Color.BLUE);
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
    public static void main(String[] args) {
        new Game();

    }
}