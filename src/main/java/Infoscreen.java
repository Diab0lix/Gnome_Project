import javax.swing.*;
import java.awt.*;


public class Infoscreen extends JPanel{
    JLabel score = new JLabel("0");
    JLabel Gold = new JLabel("Gold = ");
    Infoscreen(){
        setBackground(Color.BLACK);
        setSize(90,35);
        Gold.setFont(Font.getFont("Comic Sans MS"));
        Gold.setForeground(Color.WHITE);
        add(score, BorderLayout.CENTER);
        add(Gold, BorderLayout.EAST);
    }

}
