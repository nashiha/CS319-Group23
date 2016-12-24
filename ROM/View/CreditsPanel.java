import javax.swing.*;
import java.awt.*;

public class CreditsPanel extends JPanel {
	Image background;
	private JPanel panel1;
	private JButton button1;
	private JTextArea gameCreatorsNashihaAhmedTextArea;
	private JTextArea textArea1;
	private JButton back;
	private JTextField creatorsOfTheGameTextField;
	public JButton getBack() {
		return back;
	}

	public CreditsPanel() {
		background = new ImageIcon(this.getClass().getResource("images/Menu_main_no_buttons.png")).getImage();
		add(panel1);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage( background, 0, 0, null);
	}
}