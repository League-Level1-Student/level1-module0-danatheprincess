package _07_fortune_cookie;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookies implements ActionListener {
	public void showButton() {
        System.out.println("Button clicked");
        
        JFrame frame=new JFrame();
        frame.setVisible(true);
        JButton button=new JButton();
        frame.add(button);
        frame.pack();
        button.addActionListener(this);
        int rand = new Random().nextInt(5);
        if(rand==1) {
        	JOptionPane.showMessageDialog(null, "You are going to have a really good day");
        }else if(rand==2) {
        	JOptionPane.showMessageDialog(null, "A lifetime of happieness lies ahead of you");
        }else if(rand==3) {
        	JOptionPane.showMessageDialog(null, "Accept somethng that you can't change and you'll feel better");
        }else {
        	JOptionPane.showMessageDialog(null, "All your hard work will pay off");
        }
        
        
        
        
        
        
        
        
   }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
	}
}
