import javax.swing.*;
import java.awt.*;

/**
 * Created by Shiha on 12/14/2016.
 */
public class MainFrame {
    public JFrame frame;
    public MainMenuPanel panel;//GamePanel panel;//MainMenuPanel panel;
    public void createFrame() {
        frame = new JFrame( "Redeemers of the Monarchy");
        frame.setDefaultCloseOperation( frame.EXIT_ON_CLOSE);
        frame.setMinimumSize( new Dimension(1006,590));
        panel = new MainMenuPanel();// new GamePanel();//new MainMenuPanel();
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

		/* testing HighScoreManager
		HighScoreManager tmp = HighScoreManager.getInstance( );
		//tmp.checkScore("memi",23);
		//tmp.checkScore("ali",13);
		//tmp.checkScore("veli",53);
		//tmp.checkScore("kirkdokuz",49);
		tmp.checkScore("selam",1000);

		String[] a = tmp.getHighScores();
		for (int i = 0 ;i < 10 ; i++)
			System.out.println(a[i]);
			*/