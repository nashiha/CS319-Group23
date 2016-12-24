/**
 * Created by Seyitoglu on 19.12.2016.
 * Moves the monsters
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.*;

public class MonsterPath extends JPanel implements ActionListener {
    Image game_background;
    private Timer timer;
    private Timer timer2;
    private TimerTask task2;
    private boolean isSecMonsterTReady;
    private boolean isThirdMonsterReady;
    private int currentCheck2;
    private MonsterPanel monsterPanel;
    private MonsterPanel monsterPanel2;
    private MonsterPanel monsterPanel3;
    private Monster monster;
    private Monster[] myMonsters;
    private int pathCheck;
    private int startCheck;
    private TimerTask task;
    private int currentCheck = 0;
    private boolean isTower1Ready;
    private boolean isTower2Ready;
    private boolean isTower3Ready;
    private boolean isTower4Ready;
    private boolean isTower5Ready;
    JPanel innerPanel;
    private JButton tower1;
    private JButton tower2;
    private JButton tower3;
    private JButton tower4;
    private JButton tower5;
    private int curr = 0;
    private int curr2 = 0;


    public MonsterPath() {

        game_background = new ImageIcon(this.getClass().getResource("/game_background.png")).getImage();
        isSecMonsterTReady = false;
        isThirdMonsterReady = false;
        currentCheck2 = 0;

        //tower set to false initially
        isTower1Ready = false;
        isTower2Ready = false;
        isTower3Ready = false;
        isTower4Ready = false;
        isTower5Ready = false;

        game_background = new ImageIcon(this.getClass().getResource("images/game_background.png")).getImage();
        tower1 = new JButton("add tower");
        tower3 = new JButton("add tower");
        tower2 = new JButton("add tower");
        tower4 = new JButton("add tower");
        tower5 = new JButton("add tower");
        setLayout(null);
        tower1.setBounds(100,200,100,20);
        tower2.setBounds(275,300,100,20);
        tower3.setBounds(300,400,100,20);
        tower4.setBounds(270,200,100,20);
        tower5.setBounds(0,500,100,20);


        //tower1 action listener
        tower1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == tower1) {
                    isTower1Ready = true;
                    repaint();
                }
            }
        });
        add(tower1);

        //tower2 action listener
        tower2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == tower2) {
                    isTower2Ready = true;
                    repaint();
                }

            }
        });
        add(tower2);


        //tower3action listener
        tower3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == tower3) {
                    isTower3Ready = true;
                    repaint();
                }
            }
        });
        add(tower3);

       tower4.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               if(e.getSource() == tower4) {
                   isTower4Ready = true;
                   repaint();
               }
           }
       });
        add(tower4);

        tower5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == tower5) {
                    isTower5Ready = true;
                    repaint();
                }
            }
        });
        add(tower5);


//        add(innerPanel);
        pathCheck = 0;
        startCheck = 0;
        monsterPanel = new MonsterPanel();
        monsterPanel2 = new MonsterPanel();
        monsterPanel3 = new MonsterPanel();
        monster = monsterPanel.getMonster();
        myMonsters = new Monster[5];
        myMonsters[0] = monsterPanel2.getMonster();
        myMonsters[1] = monsterPanel3.getMonster();
        myMonsters[2] = monsterPanel2.getMonster();
        myMonsters[3] = monsterPanel3.getMonster();
        myMonsters[4] = monsterPanel3.getMonster();
        //JOptionPane.showMessageDialog(null,"you have 30 seconds to set up towers before the game begins!");


        timer = new Timer();
        task = new TimerTask() {
            @Override
            public void run() {
              /*  if(startCheck < 30)
           /*         startCheck++;
                else {*/


            for(int i = 0; i < 5; i++) {
                myMonsters[i].setGeneratedMonster(true);
                System.out.println(currentCheck);
               // if(currentCheck>60) {
                    if(myMonsters[i].loc < 135) {
                        myMonsters[i].moveRight(1);
                    }
                    else if(myMonsters[i].loc  < 355 ){
                        myMonsters[i].moveDown(1);

                    }
                    else if(myMonsters[i].loc  < 650) {
                        myMonsters[i].moveRight(1);
                    }
                    else if(myMonsters[i].loc  < 970) {
                        myMonsters[i].moveUp(1);
                    }
                    else if (myMonsters[i].loc  < 1250) {
                        myMonsters[i].moveRight(1);
                    }
                    else if (myMonsters[i].loc < 1610) {
                        myMonsters[i].moveDown(1);
                    }
                    else if(myMonsters[i].loc < 1700) {
                        myMonsters[i].moveRight(1);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Model.Monster Reached the castle!!");
                    }
                    currentCheck++;
                    myMonsters[i].loc++;
                    repaint();
             //   }

           // }
                

             /*   if(currentCheck>160) {
                    isThirdMonsterReady = true;
                    if(curr2 < 135) {
                        myMonsters[1].moveRight(1);
                    }
                    else if(curr2 < 355 ){
                        myMonsters[1].moveDown(1);
                        System.out.println(currentCheck);

                    }
                    else if(curr2 < 650) {
                        myMonsters[1].moveRight(1);
                    }
                    else if(curr2 < 970) {
                        myMonsters[1].moveUp(1);
                    }
                    else if (curr2 < 1250) {
                        myMonsters[1].moveRight(1);
                    }
                    else if (curr2 < 1610) {
                        myMonsters[1].moveDown(1);
                    }
                    else if(curr2 > 1700) {
                        myMonsters[1].moveRight(1);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Model.Monster Reached the castle!!");
                    }

                    curr2++;
                    repaint();
                }


*/


/*
                if(currentCheck < 135) {
                        monster.moveRight(1);
                    }
                    else if(currentCheck < 355 ){
                        monster.moveDown(1);
                        System.out.println(currentCheck);

                    }
                    else if(currentCheck < 650) {
                        monster.moveRight(1);
                    }
                    else if(currentCheck < 970) {
                        monster.moveUp(1);
                    }
                    else if (currentCheck < 1250) {
                        monster.moveRight(1);
                    }
                    else if (currentCheck < 1610) {
                        monster.moveDown(1);
                    }
                    else if(currentCheck > 1700) {
                        monster.moveRight(1);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Model.Monster Reached the castle!!");
                    }

                    currentCheck++;
                    repaint();

              //  }  */
              }

            }
        };


    }

    public void move() {
        timer.scheduleAtFixedRate(task,100,100);
       // if(isSecMonsterTReady)
        //    timer.scheduleAtFixedRate(task2,30,30);
    }




    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(game_background, 0, 0, null);

  //      g.drawImage(monsterPanel.returnMonsterImage(), monster.getXloc(), monster.getYLoc(), null);

        if(isTower1Ready) {
            Image image1 = new ImageIcon(this.getClass().getResource("images/animated_tower_4[1].gif")).getImage();
            g.drawImage(image1,30,80,null);

        }

        if(isTower2Ready) {
            Image image1 = new ImageIcon(this.getClass().getResource("images/animated_tower_4[1].gif")).getImage();
            g.drawImage(image1,200,190,null);
        }

        if(isTower3Ready) {
            Image image1 = new ImageIcon(this.getClass().getResource("images/animated_tower_4[1].gif")).getImage();
            g.drawImage(image1,310,260,null);
        }

        if(isTower4Ready) {
            Image image1 = new ImageIcon(this.getClass().getResource("images/animated_tower_4[1].gif")).getImage();
            g.drawImage(image1,320,80,null);
        }

        if(isTower5Ready) {
            Image image1 = new ImageIcon(this.getClass().getResource("images/animated_tower_4[1].gif")).getImage();
           // image1 = image1.getScaledInstance(100, 100,Image.SCALE_DEFAULT);
            g.drawImage(image1,70,400,null);
        }

        for(int i = 0; i < myMonsters.length; i++) {
            if(myMonsters[i].isGeneratedMonster())
                g.drawImage(monsterPanel.returnMonsterImage(), myMonsters[i].getXloc(), myMonsters[i].getYLoc(), null);
        }

        /*if(isSecMonsterTReady) {
            g.drawImage(monsterPanel2.returnMonsterImage(), myMonsters[0].getXloc(), myMonsters[0].getYLoc(), null);
        }*/


      /*  if(isThirdMonsterReady) {
            g.drawImage(monsterPanel3.returnMonsterImage(), myMonsters[1].getXloc(), myMonsters[1].getYLoc(), null);
        }*/


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //repaint();
    }
    public static void main(String args[]){
        JFrame f = new JFrame();
        MonsterPath p = new MonsterPath();
        p.move();
        f.add(p);
        f.setVisible(true);

    }
}
