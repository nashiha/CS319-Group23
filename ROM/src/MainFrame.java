import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JPanel;

/**
 * Created by Shiha on 12/14/2016.
 */
public class MainFrame {
	public JFrame frame;
	public MainMenuPanel panel;
	public void createFrame() {
		frame = new JFrame( "Redeemers of the Monarchy");
		frame.setDefaultCloseOperation( frame.EXIT_ON_CLOSE);
		frame.setMinimumSize( new Dimension(1016,602));
		panel = new MainMenuPanel();
		frame.add( panel);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible( true);
	}
	public static void main(String[] args )
	{
		MainFrame frame;
		frame = new MainFrame();
		frame.createFrame();
		System.out.println( "Hello.");
	}
}
