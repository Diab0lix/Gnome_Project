import javax.swing.*;
import java.awt.*;


public class Infoscreen extends JPanel{
    public JLabel score = new JLabel();
    public JLabel Gold = new JLabel();
    Infoscreen(){
        super();
        setBackground(Color.BLACK);
        setSize(90,35);
        Gold.setFont(Font.getFont("Comic Sans MS"));
        Gold.setForeground(Color.WHITE);
        add(score, BorderLayout.CENTER);
        add(Gold, BorderLayout.EAST);
    }
    public void update_wallet(double amount){
            Gold.setText("Gold = " + amount);
    }
    public void update_score(double amount){
        score.setText("Score : " + amount);
    }

}
