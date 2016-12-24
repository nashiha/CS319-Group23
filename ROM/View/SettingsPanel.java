import javax.swing.*;
import java.awt.*;

public class SettingsPanel extends JPanel {

	Image background;
	private JButton settings;
	private JRadioButton easy;
	private JRadioButton hard;
	private JRadioButton medium;
	private JRadioButton on;
	private JLabel difficulty;
	private JLabel sound;
	private JRadioButton off;
	private JPanel innerPanel;
	private JButton back;
	private JTextArea textArea1;
	private JTextArea textArea2;

	public JButton getBack() {
		return back;
	}
	public SettingsPanel() {
		background = new ImageIcon(this.getClass().getResource("images/Menu_main_no_buttons.png")).getImage();
		add(innerPanel);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(background, 0, 0, null);
	}
}