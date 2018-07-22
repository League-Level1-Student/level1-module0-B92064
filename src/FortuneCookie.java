import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
public static void main(String[] args) {
	FortuneCookie fc = new FortuneCookie();
	fc.showButton();
	
}

public void showButton() {
	JFrame windowsxp = new JFrame();
	JButton button = new JButton();
	windowsxp.add(button);
	windowsxp.setVisible(true);
	windowsxp.setSize(100, 100);
	button.addActionListener(this);
	System.out.println("Button Clicked");
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "Woohoo!");
	int rand = new Random().nextInt(5);
	if(rand==1) {
		System.out.println("You will find $100 today");
	}
	else if(rand==2) {
		System.out.println("Some fortune cookies retain no fortunes.");
	}
	else if (rand==3) {
		System.out.println("Keep trying and you will succeed");
	}
	else if (rand==4) {
		System.out.println("You are unlucky today");
	}
	else if (rand==5) {
		System.out.println("Your code will be good today");
	}
}
}