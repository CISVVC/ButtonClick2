import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Main extends JFrame {
    private static JLabel label1;
    private static JLabel label2;

    public static void main(String[] args)
    {
        final int FRAME_WIDTH = 300;
        final int FRAME_HEIGHT = 400;

        JFrame frame = new Main();
        frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        frame.setTitle("Clicky GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button1 = new JButton("Button 1");
        label1 = new JLabel("Button 1 output");
        ClickListener listener1 = new ClickListener(label1);
        button1.addActionListener(listener1);
        JButton button2 = new JButton("Button 2");
        label2 = new JLabel("Button 2 output!");
        ClickListener listener2 = new ClickListener(label2);
        button2.addActionListener(listener2);

        JPanel panel = new JPanel();
        panel.add(button1);
        panel.add(label1);
        panel.add(button2);
        panel.add(label2);
        frame.add(panel);


        frame.setVisible(true);
    }
}
