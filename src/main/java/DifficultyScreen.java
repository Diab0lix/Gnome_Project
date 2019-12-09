import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DifficultyScreen implements ActionListener {

    private JFrame menu;
    private JButton Difficultesimple, Difficultehard;
    public Game game;

    public DifficultyScreen() {
        menu = new JFrame("Difficulty Menu");
        menu.setBackground(Color.BLACK);
        FlowLayout layou=new FlowLayout();
        layou.setHgap(10);layou.setVgap(30);
        menu.setLayout(layou);
        initialisemenu();
        menu.setVisible(true);
        menu.add(Difficultehard);
        menu.add(Difficultesimple);
    }
    public static void main(String[] args) {
        new DifficultyScreen();
    }

    private  void initialisemenu()
    {
        ImageIcon normal = new ImageIcon("src/Resources/Normal.png");
        Difficultesimple = new JButton(normal);
        Difficultesimple.setBorderPainted(false);
        Difficultesimple.setBackground(Color.BLACK);
        Difficultesimple.addActionListener(this);
        ImageIcon difficile = new ImageIcon("src/Resources/Hard.png");
        Difficultehard = new JButton(difficile);
        Difficultehard.setBorderPainted(false);
        Difficultehard.setBackground(Color.BLACK);
        Difficultehard.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource()==Difficultehard){
            game = new Game(1);
        }
        else{
            game = new Game(0);
        }
        menu.dispose();
    }



}
