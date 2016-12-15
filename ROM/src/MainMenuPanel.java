import java.awt.*;
import javax.swing.*;

/**
 * Created by Shiha on 12/14/2016.
 */
public class MainMenuPanel extends JPanel {
	Image background;
	private JButton button1;
	private JButton settings;
	private JButton tutorial;
	private JButton hscores;
	private JButton credits;
	private JButton quit;

	public MainMenuPanel() {
		setLayout( new BoxLayout(this, BoxLayout.Y_AXIS));
		background = new ImageIcon("\\images\\Menu_main_no_buttons.png").getImage();

		//play
		button1 = new JButton();
		button1.setOpaque(false);
		//button1.setBorderPainted(false);
		button1.setContentAreaFilled(false);
		button1.setIcon(new ImageIcon("\\images\\play.png"));
		button1.setAlignmentX(Component.CENTER_ALIGNMENT);

		//settings
		settings = new JButton();
		settings.setIcon(new ImageIcon("\\images\\settings.png"));
		settings.setOpaque(false);
		settings.setRolloverIcon(new ImageIcon("\\images\\tutorial.png"));
		settings.setPressedIcon(new ImageIcon("\\images\\tutorial.png"));
		//settings.setBorderPainted(false);
		settings.setContentAreaFilled(false);
		settings.setAlignmentX(Component.CENTER_ALIGNMENT);
		//tutorial
		tutorial = new JButton();
		tutorial.setIcon(new ImageIcon("\\images\\tutorial.png"));
		tutorial.setOpaque(false);
		//tutorial.setBorderPainted(false);
		tutorial.setContentAreaFilled(false);
		tutorial.setAlignmentX(Component.CENTER_ALIGNMENT);
		//highscores
		hscores = new JButton();
		hscores.setIcon(new ImageIcon("\\images\\hscores.png"));
		hscores.setOpaque(false);
		hscores.setBorderPainted(false);
		hscores.setContentAreaFilled(false);
		hscores.setAlignmentX(Component.CENTER_ALIGNMENT);
		//credits
		credits = new JButton();
		credits.setIcon(new ImageIcon("\\images\\credits.png"));
		credits.setOpaque(false);
		credits.setBorderPainted(false);
		credits.setContentAreaFilled(false);
		credits.setAlignmentX(Component.CENTER_ALIGNMENT);
		//quit
		quit = new JButton();
		quit.setIcon(new ImageIcon("\\images\\quit.png"));
		quit.setOpaque(false);
		quit.setBorderPainted(false);
		quit.setContentAreaFilled(false);
		quit.setAlignmentX(Component.CENTER_ALIGNMENT);

		//add the buttons
		add(Box.createRigidArea(new Dimension(0,160)));
		add( button1);
		add(Box.createRigidArea(new Dimension(0,5)));
		add( settings);
		add(Box.createRigidArea(new Dimension(0,5)));
		add( tutorial);
		add(Box.createRigidArea(new Dimension(0,5)));
		add( hscores);
		add(Box.createRigidArea(new Dimension(0,5)));
		add( credits);
		add(Box.createRigidArea(new Dimension(0,5)));
		add( quit);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(background, 0, 0, null);
	}
}