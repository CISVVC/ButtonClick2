import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClickListener implements ActionListener {
    
    JLabel label;
    public ClickListener(JLabel label) {
        this.label = label;
    }

    private int count=0;
    public void actionPerformed(ActionEvent e)
    {
            count++;
            label.setText("Button was clicked " + count + " times.");
            System.out.println("Button was clicked " + count + " times.");
    }
}
