import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JackInTheBox implements ActionListener {
public static void main(String[] args) {
	JackInTheBox JITB = new JackInTheBox();
	JITB.showButton();
}
public void showButton() {
	JFrame windowsxp = new JFrame();
	JButton button = new JButton();
	windowsxp.add(button);
	windowsxp.setVisible(true);
	windowsxp.setSize(100, 100);
	button.addActionListener(this);
	System.out.println("Button Pressed");
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "Woohoo!");
	
}
private void showPicture(String JackInTheBox) {
	try {
		JLabel label = createLabelImage(JackInTheBox);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(label);
		frame.setVisible(true);
		frame.pack();
	}catch(Exception e) {
		e.printStackTrace();
	}
}
private JLabel createLabelImage(String jackInTheBox) {
	// TODO Auto-generated method stub
	try {
		URL jack = getClass().getResource(jackInTheBox);
		if(jack == null) {
			System.err.println("Could not find image "+ jackInTheBox);
			return new JLabel();
		} else {
			Icon icon = new ImageIcon(jack);
			JLabel jackl = new JLabel(icon);
			return new JLabel();
		}
	}catch(Exception e) {
		System.err.println("Could not find image "+ jackInTheBox);
		return new JLabel();
	}
}
private void playSound(String homer) {
	try {
		AudioClip sound = 
				JApplet.newAudioClip(getClass().getResource(homer));
		sound.play();
	}catch (Exception e) {
		e.printStackTrace();
	}
}

}
