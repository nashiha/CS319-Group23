import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Seyitoglu on 24.12.2016.
 */


public class MonsterPanel extends JPanel implements ActionListener{

    private Image monsterImage;
    private Monster monster;
    private Timer timer;
    private int moveTracker;
    private GameEngine gm;
    private JButton coin;
    private JButton castle;
    private JButton pause;
    private JLabel wave;
    private JPanel inner;
    private JPanel innerPanel;

    public MonsterPanel(int type, Monster mon) {
        this.add(inner);
        this.gm = gm;
        timer = new Timer(100,this);
        moveTracker = 0;
        timer.start();
        this.monster = mon;
        try{
            if (type == 1)
                monsterImage = new ImageIcon(this.getClass().getResource("/Monster 1.png")).getImage();
            else if (type ==2)
                monsterImage = new ImageIcon(this.getClass().getResource("/Monster 2.png")).getImage();
            else if (type == 3)
                monsterImage = new ImageIcon(this.getClass().getResource("/Monster 3.png")).getImage();
            monsterImage = monsterImage.getScaledInstance(50, 50,Image.SCALE_DEFAULT);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Error occured in loading background!");
        }
        repaint();

        /*timer = new Timer(5, e -> {
                moveTheMonster(0);
        });
        timer.start();*/
    }

    public Image returnMonsterImage() {
        return monsterImage;
    }

    public Monster getMonster()  {
        return monster;
    }

    public void moveTheMonster(int where) {
        if(where == 0)
            monster.moveUp(5);
        else if(where == 1)
            monster.moveDown(5);
        else if(where == 2)
            monster.moveLeft(5);
        else
            monster.moveRight(5);
        repaint();
    }//according to value in where moves the monster

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(monsterImage, monster.getXloc(), monster.getYLoc(), null);
        monster.moveRight(100);
        g.drawImage(monsterImage, monster.getXloc(), 500, null);
        int x = 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        revalidate();
        repaint();
    }
}
