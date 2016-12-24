import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

/**
 * Created by Shiha on 12/14/2016.
 */
public class MainFrame{
    public JFrame frame;
    public MainMenuPanel card1;
    public CreditsPanel card3;
    //public GamePanel caqrd2;
    public HighScorePanel card4;
    public GamePanel card2;
    public TutorialPanel card5;
    //public GamePanel panel;//MainMenuPanel panel;
    JPanel cards;
    public void createFrame() {
        frame = new JFrame( "Redeemers of the Monarchy");
        frame.setDefaultCloseOperation( frame.EXIT_ON_CLOSE);
        frame.setMinimumSize( new Dimension(1006,590));
        //panel = new GamePanel();//new MainMenuPanel();
        cards = new JPanel( new CardLayout());
        GameEngine gm = new GameEngine();
        card1 = new MainMenuPanel(gm);
        card2 = new GamePanel(gm);
        card3 = new CreditsPanel();
        card4 = new HighScorePanel();
        card5 = new TutorialPanel();
        card2.move();
        JButton credits = card1.getCredits();
        JButton play = card1.getPlay();
        JButton hscores = card1.getHighScores();
        JButton quit = card1.getQuit();
        JButton tutorial = card1.getTutorial();
        cards.add(card1, "MainMenuPanel");
        cards.add(card2, "MonsterPanel");
        cards.add(card3, "CreditsPanel");
        cards.add(card4, "HighScoresPanel");
        cards.add(card5, "TutorialPanel");
        frame.getContentPane().add(cards);
        play.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cardLayout = (CardLayout) cards.getLayout();
                cardLayout.show(cards, "MonsterPanel");
            }
        });
        credits.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cardLayout = (CardLayout) cards.getLayout();
                cardLayout.show(cards, "CreditsPanel");
            }
        });
        hscores.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cardLayout = (CardLayout) cards.getLayout();
                cardLayout.show(cards, "HighScoresPanel");
            }
        });
        tutorial.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cardLayout = (CardLayout) cards.getLayout();
                cardLayout.show(cards, "TutorialPanel");
            }
        });
        quit.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
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
        GameEngine gm = new GameEngine();
        gm.startGame();
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