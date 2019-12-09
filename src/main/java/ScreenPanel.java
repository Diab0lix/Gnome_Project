import javax.swing.*;
import java.awt.*;
public class ScreenPanel extends JPanel {
    ScreenPanel(){
        setBackground(Color.BLACK);
        setSize(500,465);
        ImageIcon Image = new ImageIcon("src/Resources/dwarf.png");
        JLabel img = new JLabel(Image);
        add(img);
    }
}
