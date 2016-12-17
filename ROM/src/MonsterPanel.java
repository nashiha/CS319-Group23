import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MonsterPanel extends JPanel implements ActionListener{

    private Image monsterImage;
    private Monster monster;
    private Timer timer;


    public MonsterPanel() {
        timer = new Timer(100,this);
        timer.start();
        try{
            monsterImage = new ImageIcon(this.getClass().getResource("images/play.png")).getImage();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Error occured in loading background!");
        }
        monster = new Monster();
        repaint();
        repaint();


        /*timer = new Timer(5, e -> {
                moveTheMonster(0);
        });
        timer.start();*/
    }

    public void moveTheMonster(int where) {
        if(where == 0)
            monster.moveUp();
        else if(where == 1)
            monster.moveDown();
        else if(where == 2)
            monster.moveLeft();
        else
            monster.moveRight();
        repaint();
    }//according to value in where moves the monster

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(monsterImage, monster.getXloc(), monster.getYLoc(), null);
        System.out.print("qqq");
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        moveTheMonster(1);
        moveTheMonster(1);
        moveTheMonster(1);
        moveTheMonster(1);
        moveTheMonster(8);
        moveTheMonster(8);
        moveTheMonster(8);
        moveTheMonster(8);
        repaint();

    }
}
