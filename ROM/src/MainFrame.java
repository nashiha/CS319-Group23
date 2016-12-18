import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JPanel;

/**
 * Created by Shiha on 12/14/2016.
 */
public class MainFrame {
	public JFrame frame;
	public GamePanel panel;//MainMenuPanel panel;
	public void createFrame() {
		frame = new JFrame( "Redeemers of the Monarchy");
		frame.setDefaultCloseOperation( frame.EXIT_ON_CLOSE);
		frame.setMinimumSize( new Dimension(1006,590));
		panel = new GamePanel();//new MainMenuPanel();
		frame.add( panel);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible( true);
		frame.setResizable(false);
	}
	public static void main(String[] args )
	{
		MainFrame frame;
		frame = new MainFrame();
		frame.createFrame();
		System.out.println( "Hello.");
	}
}
