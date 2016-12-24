package View;

import Model.Monster;

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



    public MonsterPanel() {

        timer = new Timer(100,this);
        moveTracker = 0;
        timer.start();
        try{
            monsterImage = new ImageIcon(this.getClass().getResource("images/Monster 3.png")).getImage();
            monsterImage = monsterImage.getScaledInstance(50, 50,Image.SCALE_DEFAULT);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Error occured in loading background!");
        }
        monster = new Monster();
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
         /*
        try {

            TimeUnit.SECONDS.sleep(1);

        } catch (InterruptedException e1) {

            e1.printStackTrace();

        }        */
    /*
       if(moveTracker == 0)    {
        monster.moveRight(10);
        moveTracker = 1;
       } else if(moveTracker == 1) {
         moveTracker = 0;
         monster.moveDown(5);
       }



         */




        //monster.moveDown(11);


        //monster.moveDown(5);






        //monster.moveDown(5);







         revalidate();
        repaint();

    }
}
