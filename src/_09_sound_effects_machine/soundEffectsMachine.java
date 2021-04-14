package _09_sound_effects_machine;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class soundEffectsMachine implements ActionListener {
	JButton button1=new JButton();
	JButton button2=new JButton();
	 public void showButton() {
         System.out.println("Button clicked");
         JFrame frame=new JFrame();
         frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         JPanel panel=new JPanel();
         frame.add(panel);
         panel.add(button1);
         frame.pack();
         button1.addActionListener(this);
         
         panel.add(button2);
         button2.addActionListener(this);
         button1.setText("Dog!");
         button2.setText("Cat!");
         frame.pack();
    }
void playSound(String soundmessage) {
	JOptionPane.showMessageDialog(null, soundmessage);
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1) {
			playSound("Woah Woah");
		} 
		else if(e.getSource()==button2) {
			playSound("Meow Meow");
		}
	}
}
