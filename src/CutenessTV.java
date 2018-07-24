import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	public static void main(String[] args) {
		CutenessTV CTV = new CutenessTV();
		CTV.showButton();
	}

	JFrame windowsxp = new JFrame();
	JPanel panel1 = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();

	public void showButton() {

		windowsxp.add(panel1);
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		windowsxp.setVisible(true);
		windowsxp.pack();
		windowsxp.setSize(200, 200);
		System.out.println("Button Pressed");
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();
		if (b.equals(button1)) {
			showDucks();
		} else if (b.equals(button2)) {
			showFrog();
		} else if (b.equals(button3)) {
			showFluffyUnicorns();
		}
	}

	void showDucks() {
		playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
		playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
		playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI(videoID);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
