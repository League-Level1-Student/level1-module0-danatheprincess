package _08_jack_in_the_box;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JackintheBox {
	 public void showButton() {
         
         JFrame frame=new JFrame();
         frame.setVisible(true);
         JButton button=new JButton();
         button.setText("Suprise");
         frame.add(button);
         frame.pack();
         
    }
}
