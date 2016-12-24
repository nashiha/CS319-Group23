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
import java.util.concurrent.TimeUnit;

public class GamePanel extends JPanel implements ActionListener {
    private JButton coinImage;
    private JButton castleImage;
    private JButton pauseButton;
    private JLabel waveLabel;

    Image game_background;
    private Timer timer = new Timer();
    private TimerTask task;
    private ArrayList<Monster> myMonsters = new ArrayList<Monster>();
    private ArrayList<MonsterPanel> mnsPanel = new ArrayList<MonsterPanel>();
    private ArrayList<TimerTask> tasks = new ArrayList<TimerTask>();
    JPanel innerPanel;
    private JButton tower1;
    private JButton tower2;
    private JButton tower3;
    private JButton tower4;
    private boolean startedChecking = false;
    private JButton tower5;
    private GameEngine gm;


    public GamePanel(GameEngine gm) {
        this.gm = gm;
        game_background = new ImageIcon(this.getClass().getResource("/game_background.png")).getImage();
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
                    repaint();
                }
            }
        });
        add(tower3);

        tower4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == tower4) {
                    repaint();
                }
            }
        });
        add(tower4);

        tower5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == tower5) {
                    repaint();
                }
            }
        });
        add(tower5);
    }
    public void gameLoop(){

        Wave cur = gm.createWave();

        myMonsters = cur.getMonsters();

        for (Monster m : myMonsters) {
            mnsPanel.add(new MonsterPanel(m.getType(), m));
        }
        TowerManager tw=TowerManager.getInstance();
        tw.addTower(390,420,1);
        this.move();

        if (!startedChecking){
            tw.startChecking();
            startedChecking = true;
        }

        //todo wait 1 min
        new java.util.Timer().schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        for (TimerTask t : tasks) {
                            t.cancel();
                            t = null;
                        }

                        timer.cancel();

                        for (int i = mnsPanel.size(); i>0; i--)
                            mnsPanel.remove(0);

                        for (int i = myMonsters.size(); i>0; i--)
                            myMonsters.remove(0);

                        gameLoop();
                    }
                },
               20000 //setup time seconds
        );



    }
    public void doTask(int count) {
        Monster m = myMonsters.get(count);
        if (m == null) { return;}
        if (m.isDestroyed()) {
            m.loc = 3600;
            m.setYLoc(3000);
            m.setXloc(3000);
        }
        else {
            m.setGeneratedMonster(true);
            int speed = 1;
            if (m.loc < 135) {
                m.moveRight(speed);
            } else if (m.loc < 355) {
                m.moveDown(speed);
            } else if (m.loc < 650) {
                m.moveRight(speed);
            } else if (m.loc < 970) {
                m.moveUp(speed);
            } else if (m.loc < 1250) {
                m.moveRight(speed);
            } else if (m.loc < 1610) {
                m.moveDown(speed);
            } else if (m.loc > 1700) {
                m.moveRight(speed);
            } else {
                // JOptionPane.showMessageDialog(null, "Model.Monster Reached the castle!!");
            }
            m.loc++;
        }
        repaint();
    }



    public void move() {
        System.out.print("Move is called");


        for (int monsterCount =0; monsterCount < myMonsters.size(); monsterCount++) {
            System.out.print("Monster incoming");
            int finalMonsterCount = monsterCount;
            task = new TimerTask() {
                @Override
                public void run() {
                    doTask(finalMonsterCount);
                }
            };
            tasks.add(task);
            timer = new Timer();
            if(myMonsters.get(monsterCount).getType() == 1)
                timer.scheduleAtFixedRate(task, 10, 25);
            else
                timer.scheduleAtFixedRate(task, 10, 20);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(game_background, 0, 0, null);

        for (int i = 0 ; i < mnsPanel.size() ;i++)
            g.drawImage(mnsPanel.get(i).returnMonsterImage(), myMonsters.get(i).getXloc(), myMonsters.get(i).getYLoc(), null);


            Image image1 = new ImageIcon(this.getClass().getResource("images/animated_tower_4[1].gif")).getImage();
            g.drawImage(image1,30,80,null);

            g.drawImage(image1,200,190,null);

            g.drawImage(image1,310,260,null);

            g.drawImage(image1,320,80,null);

           // image1 = image1.getScaledInstance(100, 100,Image.SCALE_DEFAULT);
            g.drawImage(image1,70,400,null);


        for(int i = 0; i < myMonsters.size(); i++) {
            if(myMonsters.get(i).isGeneratedMonster())
                g.drawImage(mnsPanel.get(i).returnMonsterImage(), myMonsters.get(i).getXloc(), myMonsters.get(i).getYLoc(), null);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //repaint();
    }
    public static void main(String args[]){
       /* JFrame f = new JFrame();
        GamePanel p = new GamePanel();
        p.move();
        f.add(p);
        f.setVisible(true);*/

    }
}
