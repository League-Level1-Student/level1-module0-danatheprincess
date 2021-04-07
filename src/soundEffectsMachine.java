import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class soundEffectsMachine implements ActionListener {
	 public void showButton() {
         System.out.println("Button clicked");
         JFrame frame=new JFrame();
         frame.setVisible(true);
         JButton button=new JButton();
         JPanel panel=new JPanel();
         frame.add(panel);
         panel.add(button);
         frame.pack();
         button.addActionListener(this);
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
