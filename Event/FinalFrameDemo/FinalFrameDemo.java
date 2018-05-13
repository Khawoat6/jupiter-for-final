import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class FinalFrameDemo
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Frame Demo");
        JLabel label = new JLabel("Enter something:");
        JTextField text = new JTextField();
        JButton button = new JButton("Click!");
        frame.add(label, BorderLayout.NORTH);
        frame.add(text, BorderLayout.CENTER);
        frame.add(button, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }
}
