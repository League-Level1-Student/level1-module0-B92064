/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
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

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
                // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
String image = "http://www.unc.edu/~unclng/internet-map.gif";
		// 2. create a variable of type "Component" that will hold your image
Component c;
		// 3. use the "createImage()" method below to initialize your Component
c = createImage(image);
		// 4. add the image to the quiz window
quizWindow.add(c);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String question = JOptionPane.showInputDialog("What is this a picture of?");
		// 7. print "CORRECT" if the user gave the right answer
if(question.equalsIgnoreCase("the whole internet")) {
	System.out.println("Correct!!");
}
else {
	System.out.println("WrOnG!!!!");
}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(c);
		// 10. find another image and create it (might take more than one line of code)
String image2 = "http://i0.kym-cdn.com/photos/images/newsfeed/000/096/044/trollface.jpg?1296494117";
Component c2 = createImage(image2);
		// 11. add the second image to the quiz window
quizWindow.add(c2);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String question2 = JOptionPane.showInputDialog("What meme is this?");
if(question2.equalsIgnoreCase("trollface")) {
	System.out.println("Correct!!");
}
else {
	System.out.println("WrOnG!!!!");
}

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





