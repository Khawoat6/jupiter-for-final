import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;


public class AnotherFrameDemo
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Frame Demo");
        JLabel label = new JLabel("Click below:");
        JButton button = new JButton("Click!");
        frame.add(label);
        frame.add(button);
        frame.pack();
        frame.setVisible(true);
    }
}
