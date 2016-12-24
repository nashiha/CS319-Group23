/**
 * Created by Seyitoglu on 19.12.2016.
 * Moves the monsters
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.Timer;
import java.util.*;

public class MonsterPath extends JPanel implements ActionListener {
    Image game_background;
    private Timer timer = new Timer();
    private TimerTask task = new TimerTask() {
        @Override
        public void run() {
            doTask();
        }
    };

    private Timer timer2;
    private TimerTask task2;
    private int currentCheck2;
    private int pathCheck;
    private int startCheck;
    private int currentCheck = 0;
    private ArrayList<Monster> myMonsters = new ArrayList<Monster>();
    private ArrayList<MonsterPanel> mnsPanel = new ArrayList<MonsterPanel>();
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
    private GameEngine gm;


    public MonsterPath(GameEngine gm) {
        this.gm = gm;
        game_background = new ImageIcon(this.getClass().getResource("/game_background.png")).getImage();
        currentCheck2 = 0;

        game_background = new ImageIcon(this.getClass().getResource("images/game_background.png")).getImage();
        tower1 = new JButton("add tower");
        tower3 = new JButton("add tower");
        tower2 = new JButton("add tower");
        tower4 = new JButton("add tower");
        tower5 = new JButton("add tower");
        setLayout(null);
        tower1.setBounds(100, 200, 100, 20);
        tower2.setBounds(275, 300, 100, 20);
        tower3.setBounds(300, 400, 100, 20);
        tower4.setBounds(270, 200, 100, 20);
        tower5.setBounds(0, 500, 100, 20);


        //tower1 action listener
        tower1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == tower1) {
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
                if (e.getSource() == tower2) {
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
                if (e.getSource() == tower3) {
                    isTower3Ready = true;
                    repaint();
                }
            }
        });
        add(tower3);

        tower4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == tower4) {
                    isTower4Ready = true;
                    repaint();
                }
            }
        });
        add(tower4);

        tower5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == tower5) {
                    isTower5Ready = true;
                    repaint();
                }
            }
        });
        add(tower5);


//        add(innerPanel);
        pathCheck = 0;
        startCheck = 0;
        Wave cur = gm.createWave();

        myMonsters = cur.getMonsters();

        for (Monster m : myMonsters) {
            mnsPanel.add(new MonsterPanel(m.getType(), m));
        }

    }

        public void doTask() {
            for (int i = 0; i < myMonsters.size(); i++) {
                myMonsters.get(i).setGeneratedMonster(true);

                    if (myMonsters.get(i).loc < 135) {
                        myMonsters.get(i).moveRight(1);
                    } else if (myMonsters.get(i).loc < 355) {
                        myMonsters.get(i).moveDown(1);

                    } else if (myMonsters.get(i).loc < 650) {
                        myMonsters.get(i).moveRight(1);
                    } else if (myMonsters.get(i).loc < 970) {
                        myMonsters.get(i).moveUp(1);
                    } else if (myMonsters.get(i).loc < 1250) {
                        myMonsters.get(i).moveRight(1);
                    } else if (myMonsters.get(i).loc < 1610) {
                        myMonsters.get(i).moveDown(1);
                    } else if (myMonsters.get(i).loc > 1700) {
                        myMonsters.get(i).moveRight(1);
                    } else {
                        JOptionPane.showMessageDialog(null, "Model.Monster Reached the castle!!");
                    }

                    currentCheck++;
                    myMonsters.get(i).loc++;
                    repaint();

            }
        }



    public void move() {
        new TimerTask() {
            @Override
            public void run() {
                doTask();
            }
        };
        timer.scheduleAtFixedRate(task,20,20);
    }




    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(game_background, 0, 0, null);

        for (int i = 0 ; i < mnsPanel.size() ;i++)
            g.drawImage(mnsPanel.get(i).returnMonsterImage(), myMonsters.get(i).getXloc(), myMonsters.get(i).getYLoc(), null);

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

        for(int i = 0; i < myMonsters.size(); i++) {
            if(myMonsters.get(i).isGeneratedMonster())
                g.drawImage(mnsPanel.get(i).returnMonsterImage(), myMonsters.get(i).getXloc(), myMonsters.get(i).getYLoc(), null);
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
       /* JFrame f = new JFrame();
        MonsterPath p = new MonsterPath();
        p.move();
        f.add(p);
        f.setVisible(true);*/

    }
}
