import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	private String difficultyMode;
	private String soundMode;

	public JButton getBack() {
		return back;
	}
	public SettingsPanel() {
		background = new ImageIcon(this.getClass().getResource("images/Menu_main_no_buttons.png")).getImage();
		add(innerPanel);
		easy.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (easy.isSelected())
					difficultyMode = "easy";
			}
		});
		medium.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (medium.isSelected())
					difficultyMode = "medium";
			}
		});
		hard.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (hard.isSelected())
					difficultyMode = "hard";
			}
		});

		on.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (on.isSelected())
					soundMode = "on";
			}
		});
		off.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (off.isSelected())
					soundMode = "off";
			}
		});
	}
	public String getDifficultyMode(){
		return difficultyMode;
	}
	public String getSoundMode(){
		return soundMode;
	}
	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(background, 0, 0, null);
	}
}