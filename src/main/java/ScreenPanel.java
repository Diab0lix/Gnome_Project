import javax.swing.*;
import java.awt.*;
public class ScreenPanel extends JPanel {
    ScreenPanel(){
        setBackground(Color.BLACK);
        setSize(500,465);

        ImageIcon Sans = new ImageIcon("src/Resources/dwarf.png");
        JLabel sanslab = new JLabel(Sans);
        add(sanslab);
    }
}
