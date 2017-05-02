import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutExample
{
    private JPanel contentPane;
    private CreateAccount panel1;
    private Login panel2;
    private JoinTeam panel3;
    private CreateTeam panel4;

    private void displayGUI()
    {
        JFrame frame = new JFrame("Card Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        contentPane.setBorder(
            BorderFactory.createEmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new CardLayout());
        
        panel2 = new Login(contentPane);
        panel1 = new CreateAccount(contentPane);
        panel3 = new JoinTeam(contentPane);
        panel4 = new CreateTeam(contentPane);
        
        contentPane.add(panel2, "Login");
        contentPane.add(panel1, "Panel 2");
        contentPane.add(panel3, "Panel 3");
        contentPane.add(panel4, "Panel 4");
        
        frame.setContentPane(contentPane);
        frame.pack();   
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public static void main(String... args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new CardLayoutExample().displayGUI();
            }
        });
    }
}