package _08_jack_in_the_box;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JackintheBox implements ActionListener {
	int buttonPressed=0;
	 public void showButton() {
         
         JFrame frame=new JFrame();
         frame.setVisible(true);
         JButton button=new JButton();
         button.setText("Suprise");
         frame.add(button);
         frame.pack();
         button.addActionListener(this);
        
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
       
        buttonPressed+=1;
        if(buttonPressed==5) {
        	 //JOptionPane.showMessageDialog(null,"Hello" );
        	showPicture("jackInTheBox.png");
        }
		
	}
	private void showPicture(String fileName) { 
	     try {
	          JLabel imageLabel = createLabelImage(fileName);
	          JFrame frame = new JFrame();
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	private JLabel createLabelImage(String fileName) {
	     try {
	          URL imageURL = getClass().getResource(fileName);
	          if (imageURL == null) {
	               System.err.println("Could not find image " + fileName);
	               return new JLabel();
	          } else {
	               Icon icon = new ImageIcon(imageURL);
	               JLabel imageLabel = new JLabel(icon);
	               return imageLabel;
	          }
	     } catch (Exception e) {
	          System.err.println("Could not find image " + fileName);
	          return new JLabel();
	     }
	}
}
