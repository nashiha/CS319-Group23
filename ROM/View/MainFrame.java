import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Shiha on 12/14/2016.
 */
public class MainFrame{
    public JFrame frame;
    public MainMenuPanel card1;
    public GamePanel card2;
    public JButton play;
    //public View.GamePanel panel;//View.MainMenuPanel panel;
    JPanel cards;
    public void createFrame() {
        frame = new JFrame( "Redeemers of the Monarchy");
        frame.setDefaultCloseOperation( frame.EXIT_ON_CLOSE);
        frame.setMinimumSize( new Dimension(1006,590));
        //panel = new View.GamePanel();//new View.MainMenuPanel();
        cards = new JPanel( new CardLayout());
        card1 = new MainMenuPanel();
        card2 = new GamePanel();
        play = new JButton();
        play = card1.getPlay();
        cards.add(card1, "View.MainMenuPanel");
        cards.add(card2, "View.GamePanel");
        frame.getContentPane().add(cards);
        play.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cardLayout = (CardLayout) cards.getLayout();
                cardLayout.show(cards, "View.GamePanel");
            }
        });
        //frame.add( panel);
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

		/* testing Controller.HighScoreManager
		Controller.HighScoreManager tmp = Controller.HighScoreManager.getInstance( );
		//tmp.checkScore("memi",23);
		//tmp.checkScore("ali",13);
		//tmp.checkScore("veli",53);
		//tmp.checkScore("kirkdokuz",49);
		tmp.checkScore("selam",1000);

		String[] a = tmp.getHighScores();
		for (int i = 0 ;i < 10 ; i++)
			System.out.println(a[i]);
			*/