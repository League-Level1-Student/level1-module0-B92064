import javax.swing.JButton;
import javax.swing.JFrame;

public class FortuneCookie {
public static void main(String[] args) {
	FortuneCookie fc = new FortuneCookie();
	fc.showButton();
	
}

public void showButton() {
	JFrame windowsxp = new JFrame();
	JButton button = new JButton();
	windowsxp.add(button);
	windowsxp.setVisible(true);
	System.out.println("Button Clicked");
}
}