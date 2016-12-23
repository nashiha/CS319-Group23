/**
 * Created by Seyitoglu on 19.12.2016.
 * Moves the monsters
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.util.*;
/**
 * Created by Seyitoglu on 24.12.2016.
 */

public class MonsterPath extends JPanel implements ActionListener {
    Image game_background;
    private Timer timer;
    private  MonsterPanel monsterPanel;
    private Monster monster;
    private int pathCheck;
    private TimerTask task;
    private int currentCheck = 0;


    public MonsterPath() {

        game_background = new ImageIcon(this.getClass().getResource("images/game_background.png")).getImage();

        pathCheck = 0;

        monsterPanel = new MonsterPanel();
        monster = monsterPanel.getMonster();

        timer = new Timer();
        task = new TimerTask() {
            @Override
            public void run() {
                if(currentCheck < 135)
                     monster.moveRight(1);
                else if(currentCheck < 355 )
                    monster.moveDown(1);
                else if(currentCheck < 650)
                    monster.moveRight(1);
                else if(currentCheck < 970)
                    monster.moveUp(1);
                else if (currentCheck < 1250)
                    monster.moveRight(1);
                else if (currentCheck < 1610)
                    monster.moveDown(1);
                else if(currentCheck > 1700)
                    monster.moveRight(1);
                else
                    JOptionPane.showMessageDialog(null,"Monster Reached the castle!!");
                currentCheck++;
                repaint();
            }
        };



    }

    public void move() {
        timer.scheduleAtFixedRate(task,100,100);
    }




    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(game_background, 0, 0, null);

        g.drawImage(monsterPanel.returnMonsterImage(), monster.getXloc(), monster.getYLoc(), null);





    }

    @Override
    public void actionPerformed(ActionEvent e) {



        //repaint();
    }
}
