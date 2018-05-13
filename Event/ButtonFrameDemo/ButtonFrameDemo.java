import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.*;

public class ButtonFrameDemo
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Frame Demo");
        JButton button = new JButton("Click!");
        frame.add(button);
        frame.pack();
        frame.setVisible(true);
    }
}
