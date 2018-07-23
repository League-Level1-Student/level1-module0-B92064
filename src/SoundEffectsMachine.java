import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
public static void main(String[] args) {
	SoundEffectsMachine SEM = new SoundEffectsMachine();
	SEM.showButton();
}
public void showButton() {
	JFrame windowsxp = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	windowsxp.add(button);
	windowsxp.setVisible(true);
	windowsxp.setSize(100, 100);
	button.addActionListener(this);
	playSound("Jumpscare.wav");
	System.out.println("Button pressed");
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
private void playSound(String Jumpscare) {
	AudioClip sound = 
	JApplet.newAudioClip(getClass().getResource("Jumpscare.wav"));
	sound.play();
}
}
