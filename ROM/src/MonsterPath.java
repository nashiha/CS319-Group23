/**
 * Created by Seyitoglu on 19.12.2016.
 * Moves the monsters
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MonsterPath extends JPanel implements ActionListener {
    Image game_background;
    private Timer timer;
    private  MonsterPanel p;
    private Monster monster;


    public MonsterPath() {

        game_background = new ImageIcon(this.getClass().getResource("images/game_background.png")).getImage();
        p = new MonsterPanel();
        monster = p.getMonster();

        timer = new Timer(10000,this);
        timer.start();
        //repaint();
        //	add(innerPanel);
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(game_background, 0, 0, null);

        g.drawImage(p.getImage(), monster.getXloc(), monster.getYLoc(), null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        monster.moveRight();
        repaint();
        monster.moveLeft();
        repaint();
    }
}
