import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	 JButton button1=new JButton();
	 JButton button2=new JButton();
	JButton button3=new JButton();
	 public void showButton() {
         System.out.println("Button clicked");
         
         JFrame frame=new JFrame();
         frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
         button1.addActionListener(this);
         JPanel panel=new JPanel();
         frame.add(panel);
         panel.add(button1);
        
         button2.addActionListener(this);
         panel.add(button2);
         
         button3.addActionListener(this);
         panel.add(button3);
         button1.setText("Quack Quack!");
         button2.setText("Woah Woah!");
         button3.setText("Neigh Neigh!");
         frame.pack();
    }

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getSource()==button1) {
			playVideo("Cute Feathery Ducks!");
		}
		else if(event.getSource()==button2) {
			playVideo("Cute Furry Dogs");
		}
		else if(event.getSource()==button3) {
			playVideo("Cute Fluffy Unicorns");
		}
	}
	void playVideo(String videoID) {
	 JOptionPane.showMessageDialog(null, videoID);    
	}  
	  }
