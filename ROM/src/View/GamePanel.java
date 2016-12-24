package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Created by Shiha on 12/14/2016.
 */
public class GamePanel extends JPanel {
	Image game_background;
	private JButton coinImage;
	private JPanel innerPanel;
	private JButton castleImage;
	private JButton pauseButton;
	private JLabel waveLabel;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;


	public GamePanel() {
		game_background = new ImageIcon(this.getClass().getResource("images/game_background.png")).getImage();
		add(innerPanel);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(game_background, 0, 0, null);
	}

}