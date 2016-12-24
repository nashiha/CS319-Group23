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
    public GamePanel caqrd2;
    public MonsterPath card2;
    public JButton play;
    //public GamePanel panel;//MainMenuPanel panel;
    JPanel cards;
    public void createFrame(GameEngine gm) {
        gm.startGame();

        frame = new JFrame( "Redeemers of the Monarchy");
        frame.setDefaultCloseOperation( frame.EXIT_ON_CLOSE);
        frame.setMinimumSize( new Dimension(1006,590));
        //panel = new GamePanel();//new MainMenuPanel();
        cards = new JPanel( new CardLayout());
        card1 = new MainMenuPanel(gm);
        card2 = new MonsterPath(gm);
        card2.move();
        play = new JButton();
        play = card1.getPlay();
        cards.add(card1, "MainMenuPanel");
        cards.add(card2, "MonsterPanel");
        frame.getContentPane().add(cards);
        play.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cardLayout = (CardLayout) cards.getLayout();
                cardLayout.show(cards, "MonsterPanel");
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
        GameEngine gm = new GameEngine();
        SoundManager sm = SoundManager.getInstance();
        sm.playMusic();
        frame = new MainFrame();
        frame.createFrame(gm);
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