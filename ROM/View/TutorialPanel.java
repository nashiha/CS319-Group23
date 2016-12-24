import javax.swing.*;
import java.awt.*;

public class TutorialPanel extends JPanel {
	Image background;
	private JPanel innerPanel;
	private JButton button2;
	private JTextArea textArea1;

	public TutorialPanel() {
		background = new ImageIcon(this.getClass().getResource("images/Menu_main_no_buttons.png")).getImage();
		add(innerPanel);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(background, 0, 0, null);
	}
}