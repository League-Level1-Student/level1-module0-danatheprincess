package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
String image="https://www.planetware.com/wpimages/2019/10/switzerland-in-pictures-most-beautiful-places-matterhorn.jpg";
// 2. create a variable of type "Component" that will hold your image
Component picture;
		// 3. use the "createImage()" method below to initialize your Component
picture=createImage(image);
		// 4. add the image to the quiz window
quizWindow.add(picture);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String question=JOptionPane.showInputDialog("Where is this mountain located?");
		// 7. print "CORRECT" if the user gave the right answer
if(question.equalsIgnoreCase("Switzerland")) {
	JOptionPane.showMessageDialog(null, "CORRECT");
}
		// 8. print "INCORRECT" if the answer is wrong
else {
	JOptionPane.showMessageDialog(null,"INCORRECT, better LUCK next time");
}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(picture);
		// 10. find another image and create it (might take more than one line
		// of code)
String different="https://cdn.pixabay.com/photo/2015/02/24/15/41/wolf-647528__340.jpg";
Component illustration;
illustration=createImage(different);
		// 11. add the second image to the quiz window
quizWindow.add(illustration);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String ques=JOptionPane.showInputDialog("who or what is holwing at the moon?");
		// 14+ check answer, say if correct or incorrect, etc.
if(ques.equalsIgnoreCase("a wolf")) {
	JOptionPane.showMessageDialog(null, "CORRECT");
}else {
	JOptionPane.showMessageDialog(null, "INCORRECT, better LUCK this time");
}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
