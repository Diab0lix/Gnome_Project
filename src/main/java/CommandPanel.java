import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CommandPanel extends JPanel implements ActionListener{
    JButton BuyButton, SellButton, HireButton, Pass, Huntbutton;
    ImageIcon Buy, hire, hunt, pass, sell;
    JLabel text_to_print = new JLabel("Welcome to the Gnome Game");

    public CommandPanel(){
        this.setLayout(new FlowLayout());
        initialize();
        setBackground(Color.BLACK);
    }

    private void initialize() {
        Buy = new ImageIcon("src/Resources/buybutton.png");
        pass = new ImageIcon("src/Resources/Passbutton.png");
        hire = new ImageIcon("src/Resources/locationbutton.png");
        hunt = new ImageIcon("src/Resources/huntbutton.png");
        sell = new ImageIcon("src/Resources/Sellbutton.png");

        Buy = new ImageIcon(Buy.getImage().getScaledInstance(90,35,Image.SCALE_DEFAULT));
        pass = new ImageIcon(pass.getImage().getScaledInstance(90,35,Image.SCALE_DEFAULT));
        hire = new ImageIcon(hire.getImage().getScaledInstance(90,35,Image.SCALE_DEFAULT));
        hunt = new ImageIcon(hunt.getImage().getScaledInstance(90,35,Image.SCALE_DEFAULT));
        sell = new ImageIcon(sell.getImage().getScaledInstance(90,35,Image.SCALE_DEFAULT));

        BuyButton = new JButton(Buy);
        HireButton = new JButton(hire);
        SellButton = new JButton(sell);
        Pass = new JButton(pass);
        Huntbutton = new JButton(hunt);
        BuyButton.addActionListener(this); BuyButton.setBackground(Color.BLACK); BuyButton.setBorderPainted(false);
        SellButton.addActionListener( this); SellButton.setBackground(Color.BLACK); SellButton.setBorderPainted(false);
        HireButton.addActionListener(this); HireButton.setBorderPainted(false); HireButton.setBackground(Color.BLACK);
        Pass.addActionListener(this); Pass.setBackground(Color.BLACK); Pass.setBorderPainted(false);
        Huntbutton.addActionListener(this); Huntbutton.setBorderPainted(false); Huntbutton.setBackground(Color.BLACK);

        this.add(Huntbutton); this.add(BuyButton); this.add(HireButton);this.add(SellButton);this.add(Pass);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        System.out.println(source.toString());

    }
}
