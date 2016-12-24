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

    private ArrayList<TimerTask> tasks = new ArrayList<TimerTask>();

    private boolean startedChecking = false;

    private JButton random;


    private JButton coinImage;
    private JButton castleImage;
    private JButton pauseButton;
    private JLabel waveLabel;
    private Image image1;
    private Image image2;
    private Image image3;
    private Image image4;
    private Image image5;
    private Image image6;
    private Image image7;
    private Image image8;
    private Image image9;

    Image game_background;
    private Timer timer = new Timer();
    private TimerTask task;
    private ArrayList<Monster> myMonsters = new ArrayList<Monster>();
    private ArrayList<MonsterPanel> mnsPanel = new ArrayList<MonsterPanel>();
    JPanel innerPanel;
    private JButton tower1;
    private JButton tower2;
    private JButton tower3;
    private JButton tower4;
    private JButton tower5;
    private JButton tower6;
    private JButton tower7;
    private JButton tower8;
    private JButton tower9;
    private JButton tower10;
    private JButton tower11;

    private int curr = 0;
    private int curr2 = 0;
    private GameEngine gm;

    //Inner buttons of big buttons
    private ArrayList<JButton> innerTower1;
    private ArrayList<JButton> innerTower2;
    private ArrayList<JButton> innerTower3;
    private ArrayList<JButton> innerTower4;
    private ArrayList<JButton> innerTower5;
    private ArrayList<JButton> innerTower6;
    private ArrayList<JButton> innerTower7;
    private ArrayList<JButton> innerTower8;
    private ArrayList<JButton> innerTower9;
    private ArrayList<JButton> innerTower10;
    private ArrayList<JButton> innerTower11;

    public TowerManager tw=TowerManager.getInstance();



    public GamePanel(GameEngine gm) {
        //initilizing the inner panels
        innerTower1 = new ArrayList<JButton>();
        innerTower2 = new ArrayList<JButton>();
        innerTower3 = new ArrayList<JButton>();
        innerTower4 = new ArrayList<JButton>();
        innerTower5 = new ArrayList<JButton>();
        innerTower6 = new ArrayList<JButton>();
        innerTower7 = new ArrayList<JButton>();
        innerTower8 = new ArrayList<JButton>();
        innerTower9 = new ArrayList<JButton>();
        innerTower10 = new ArrayList<JButton>();
        innerTower11 = new ArrayList<JButton>();
        add(innerPanel);

        this.gm = gm;
        game_background = new ImageIcon(this.getClass().getResource("/game_background.png")).getImage();
        game_background = new ImageIcon(this.getClass().getResource("images/game_background.png")).getImage();

        //setting the big buttons
        tower1 = new JButton("add tower");
        tower3 = new JButton("add tower");
        tower2 = new JButton("add tower");
        tower4 = new JButton("add tower");
        tower5 = new JButton("add tower");
        tower6 = new JButton("add tower");
        tower7  = new JButton("add tower");
        tower8 = new JButton("add tower");
        tower9 = new JButton("add tower");
        tower10 = new JButton("add tower");
        tower11 = new JButton("add tower");

        setLayout(null);
        tower1.setBounds(100, 200, 100, 20);
        tower2.setBounds(275, 300, 100, 20);
        tower3.setBounds(300, 400, 100, 20);
        tower4.setBounds(270, 200, 100, 20);
        tower5.setBounds(0, 500, 100, 20);
        tower6.setBounds(490, 470, 100, 20);
        tower7.setBounds(490, 330, 100, 20);
        tower8.setBounds(800, 330, 100, 20);
        tower9.setBounds(600, 400, 100, 20);
        tower10.setBounds(0, 500, 100, 20);
        tower11.setBounds(0, 500, 100, 20);

        tower9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == tower9) {

                    innerTower9.add(new JButton("1"));
                    innerTower9.add(new JButton("2"));
                    innerTower9.add(new JButton("3"));
                    innerTower9.add(new JButton("4"));
                    innerTower9.add(new JButton("5"));

                    innerTower9.get(0).setBounds(600,380,20,20);
                    innerTower9.get(0).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image9 = new ImageIcon(this.getClass().getResource("images/tower1.png")).getImage();
                            tw.addTower(600,400,0);
                        }
                    });
                    innerTower9.get(1).setBounds(620,380,20,20);
                    innerTower9.get(1).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image9 = new ImageIcon(this.getClass().getResource("images/tower2.png")).getImage();
                            image9 = image9.getScaledInstance(70,150,Image.SCALE_DEFAULT);
                            tw.addTower(600,400,1);

                        }
                    });
                    innerTower9.get(2).setBounds(640,380,20,20);
                    innerTower9.get(2).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image9 = new ImageIcon(this.getClass().getResource("images/tower-clipart-cliparti1_tower-clip-art_10.jpg.png")).getImage();
                            image9 = image9.getScaledInstance(70,150,Image.SCALE_DEFAULT);
                            tw.addTower(600,400,3);

                        }
                    });
                    innerTower9.get(3).setBounds(660,380,20,20);
                    innerTower9.get(3).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image9 = new ImageIcon(this.getClass().getResource("images/elf_archer_tower_l.gif")).getImage();
                            image9 = image9.getScaledInstance(70,150,Image.SCALE_DEFAULT);
                            tw.addTower(600,400,4);

                        }
                    });

                    innerTower9.get(4).setBounds(680,380,20,20);
                    innerTower9.get(4).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JOptionPane.showConfirmDialog(null,"Upgrade Done!");
                        }
                    });

                    for(int i = 0; i < innerTower9.size(); i++)
                        add(innerTower9.get(i));
                    repaint();
                }
            }
        });

        add(tower9);






        tower8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == tower8) {

                    innerTower8.add(new JButton("1"));
                    innerTower8.add(new JButton("2"));
                    innerTower8.add(new JButton("3"));
                    innerTower8.add(new JButton("4"));
                    innerTower8.add(new JButton("5"));

                    innerTower8.get(0).setBounds(800,310,20,20);
                    innerTower8.get(0).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image8 = new ImageIcon(this.getClass().getResource("images/tower1.png")).getImage();
                            tw.addTower(800,330,0);

                        }
                    });
                    innerTower8.get(1).setBounds(820,310,20,20);
                    innerTower8.get(1).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image8 = new ImageIcon(this.getClass().getResource("images/tower2.png")).getImage();
                            image8 = image8.getScaledInstance(70,150,Image.SCALE_DEFAULT);
                            tw.addTower(800,330,1);

                        }
                    });
                    innerTower8.get(2).setBounds(840,310,20,20);
                    innerTower8.get(2).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image8 = new ImageIcon(this.getClass().getResource("images/tower-clipart-cliparti1_tower-clip-art_10.jpg.png")).getImage();
                            image8 = image8.getScaledInstance(70,150,Image.SCALE_DEFAULT);
                            tw.addTower(800,330,2);

                        }
                    });
                    innerTower8.get(3).setBounds(860,310,20,20);
                    innerTower8.get(3).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image8 = new ImageIcon(this.getClass().getResource("images/elf_archer_tower_l.gif")).getImage();
                            image8 = image8.getScaledInstance(70,150,Image.SCALE_DEFAULT);
                            tw.addTower(800,330,3);

                        }
                    });

                    innerTower8.get(4).setBounds(880,310,20,20);
                    innerTower8.get(4).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JOptionPane.showConfirmDialog(null,"Upgrade Done!");
                        }
                    });

                    for(int i = 0; i < innerTower8.size(); i++)
                        add(innerTower8.get(i));
                    repaint();
                }
            }
        });

        add(tower8);


        tower7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == tower7) {

                    innerTower7.add(new JButton("1"));
                    innerTower7.add(new JButton("2"));
                    innerTower7.add(new JButton("3"));
                    innerTower7.add(new JButton("4"));
                    innerTower7.add(new JButton("5"));

                    innerTower7.get(0).setBounds(490,310,20,20);
                    innerTower7.get(0).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image7 = new ImageIcon(this.getClass().getResource("images/tower1.png")).getImage();
                            tw.addTower(490,330,0);


                        }
                    });
                    innerTower7.get(1).setBounds(510,310,20,20);
                    innerTower7.get(1).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image7 = new ImageIcon(this.getClass().getResource("images/tower2.png")).getImage();
                            image7 = image7.getScaledInstance(70,150,Image.SCALE_DEFAULT);
                            tw.addTower(490,330,1);

                        }
                    });
                    innerTower7.get(2).setBounds(530,310,20,20);
                    innerTower7.get(2).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image7 = new ImageIcon(this.getClass().getResource("images/tower-clipart-cliparti1_tower-clip-art_10.jpg.png")).getImage();
                            image7 = image7.getScaledInstance(70,150,Image.SCALE_DEFAULT);
                            tw.addTower(490,330,2);

                        }
                    });
                    innerTower7.get(3).setBounds(550,310,20,20);
                    innerTower7.get(3).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image7 = new ImageIcon(this.getClass().getResource("images/elf_archer_tower_l.gif")).getImage();
                            image7 = image7.getScaledInstance(70,150,Image.SCALE_DEFAULT);
                            tw.addTower(490,330,3);

                        }
                    });

                    innerTower7.get(4).setBounds(570,310,20,20);
                    innerTower7.get(4).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JOptionPane.showConfirmDialog(null,"Upgrade Done!");
                        }
                    });

                    for(int i = 0; i < innerTower7.size(); i++)
                        add(innerTower7.get(i));
                    repaint();
                }
            }
        });

        add(tower7);





        tower6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == tower6) {

                    innerTower6.add(new JButton("1"));
                    innerTower6.add(new JButton("2"));
                    innerTower6.add(new JButton("3"));
                    innerTower6.add(new JButton("4"));
                    innerTower6.add(new JButton("5"));

                    innerTower6.get(0).setBounds(490,450,20,20);
                    innerTower6.get(0).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image6 = new ImageIcon(this.getClass().getResource("images/tower1.png")).getImage();
                            tw.addTower(490,450,0);

                        }
                    });
                    innerTower6.get(1).setBounds(510,450,20,20);
                    innerTower6.get(1).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image6 = new ImageIcon(this.getClass().getResource("images/tower2.png")).getImage();
                            image6 = image6.getScaledInstance(70,150,Image.SCALE_DEFAULT);
                            tw.addTower(490,450,1);

                        }
                    });
                    innerTower6.get(2).setBounds(530,450,20,20);
                    innerTower6.get(2).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image6 = new ImageIcon(this.getClass().getResource("images/tower-clipart-cliparti1_tower-clip-art_10.jpg.png")).getImage();
                            image6 = image6.getScaledInstance(70,150,Image.SCALE_DEFAULT);
                            tw.addTower(490,450,2);

                        }
                    });
                    innerTower6.get(3).setBounds(550,450,20,20);
                    innerTower6.get(3).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image6 = new ImageIcon(this.getClass().getResource("images/elf_archer_tower_l.gif")).getImage();
                            image6 = image6.getScaledInstance(70,150,Image.SCALE_DEFAULT);
                            tw.addTower(490,450,3);
                        }
                    });

                    innerTower6.get(4).setBounds(570,450,20,20);
                    innerTower6.get(4).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JOptionPane.showConfirmDialog(null,"Upgrade Done!");
                        }
                    });

                    for(int i = 0; i < innerTower6.size(); i++)
                        add(innerTower6.get(i));
                    repaint();
                }
            }
        });
        add(tower6);
        //tower1 action listener

        tower1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == tower1) {
                    innerTower1.add(new JButton("1"));
                    innerTower1.add(new JButton("2"));
                    innerTower1.add(new JButton("3"));
                    innerTower1.add(new JButton("4"));
                    innerTower1.add(new JButton("5"));

                    innerTower1.get(0).setBounds(100,180,20,20);

                    innerTower1.get(0).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image1 = new ImageIcon(this.getClass().getResource("images/tower1.png")).getImage();
                            tw.addTower(120,180,0);

                        }
                    });
                    innerTower1.get(1).setBounds(120,180,20,20);
                    innerTower1.get(1).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image1 = new ImageIcon(this.getClass().getResource("images/tower2.png")).getImage();
                            image1 = image1.getScaledInstance(70,150,Image.SCALE_DEFAULT);
                            tw.addTower(120,180,1);
                        }
                    });
                    innerTower1.get(2).setBounds(140,180,20,20);
                    innerTower1.get(2).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image1 = new ImageIcon(this.getClass().getResource("images/tower-clipart-cliparti1_tower-clip-art_10.jpg.png")).getImage();
                            image1 = image1.getScaledInstance(70,150,Image.SCALE_DEFAULT);
                            tw.addTower(120,180,2);

                        }
                    });
                    innerTower1.get(3).setBounds(160,180,20,20);
                    innerTower1.get(3).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image1 = new ImageIcon(this.getClass().getResource("images/elf_archer_tower_l.gif")).getImage();
                            image1 = image1.getScaledInstance(70,150,Image.SCALE_DEFAULT);
                            tw.addTower(120,180,3);

                        }
                    });

                    innerTower1.get(4).setBounds(180,180,20,20);
                    innerTower1.get(4).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JOptionPane.showConfirmDialog(null,"Upgrade Done!");
                        }
                    });

                    for(int i = 0; i < innerTower1.size(); i++)
                        add(innerTower1.get(i));
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

                    innerTower2.add(new JButton("1"));
                    innerTower2.add(new JButton("2"));
                    innerTower2.add(new JButton("3"));
                    innerTower2.add(new JButton("4"));
                    innerTower2.add(new JButton("5"));

                    innerTower2.get(0).setBounds(274,280,20,20);
                    innerTower2.get(0).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image2 = new ImageIcon(this.getClass().getResource("images/tower1.png")).getImage();
                            tw.addTower(70,150,0);
                        }
                    });



                    innerTower2.get(1).setBounds(294,280,20,20);
                    innerTower2.get(1).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image2 = new ImageIcon(this.getClass().getResource("images/tower2.png")).getImage();
                            image2 = image2.getScaledInstance(70,150,Image.SCALE_DEFAULT);
                            tw.addTower(70,150,1);

                        }
                    });

                    repaint();
                }


                innerTower2.get(2).setBounds(314,280,20,20);
                innerTower2.get(2).addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        image2 = new ImageIcon(this.getClass().getResource("images/elf_archer_tower_l.gif")).getImage();
                        image2 = image2.getScaledInstance(70,150,Image.SCALE_DEFAULT);
                        tw.addTower(70,150,2);
                    }
                });

                innerTower2.get(3).setBounds(334,280,20,20);
                innerTower2.get(3).addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        image2 = new ImageIcon(this.getClass().getResource("images/elf_archer_tower_l.gif")).getImage();
                        image2 = image2.getScaledInstance(70,150,Image.SCALE_DEFAULT);
                        tw.addTower(70,150,3);
                    }
                });


                innerTower2.get(4).setBounds(354,280,20,20);
                innerTower2.get(4).addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showConfirmDialog(null,"Upgrade Done!");
                    }
                });

                for(int i = 0; i < innerTower2.size(); i++)
                    add(innerTower2.get(i));
                repaint();

            }
        });
        add(tower2);


        //tower3action listener
        tower3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == tower3) {



                    innerTower3.add(new JButton("1"));
                    innerTower3.add(new JButton("2"));
                    innerTower3.add(new JButton("3"));
                    innerTower3.add(new JButton("4"));
                    innerTower3.add(new JButton("5"));

                    innerTower3.get(0).setBounds(300,380,20,20);
                    innerTower3.get(0).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image3 = new ImageIcon(this.getClass().getResource("images/tower1.png")).getImage();
                            tw.addTower(300,380,0);
                        }
                    });



                    innerTower3.get(1).setBounds(320,380,20,20);
                    innerTower3.get(1).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image3 = new ImageIcon(this.getClass().getResource("images/tower2.png")).getImage();
                            image3 = image3.getScaledInstance(70,150,Image.SCALE_DEFAULT);
                            tw.addTower(300,380,1);
                        }
                    });



                    innerTower3.get(2).setBounds(340,380,20,20);
                    innerTower3.get(2).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image3 = new ImageIcon(this.getClass().getResource("images/elf_archer_tower_l.gif")).getImage();
                            image3 = image3.getScaledInstance(70,150,Image.SCALE_DEFAULT);
                            tw.addTower(300,380,2);

                        }
                    });

                    innerTower3.get(3).setBounds(360,380,20,20);
                    innerTower3.get(3).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image3= new ImageIcon(this.getClass().getResource("images/elf_archer_tower_l.gif")).getImage();
                            image3 = image3.getScaledInstance(70,150,Image.SCALE_DEFAULT);
                            tw.addTower(300,380,3);
                        }
                    });


                    innerTower3.get(4).setBounds(380,380,20,20);
                    innerTower3.get(4).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JOptionPane.showConfirmDialog(null,"Upgrade Done!");
                        }
                    });

                    for(int i = 0; i < innerTower3.size(); i++)
                        add(innerTower3.get(i));
                    repaint();
                }
            }
        });
        add(tower3);

        tower4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == tower4) {

                    innerTower4.add(new JButton("1"));
                    innerTower4.add(new JButton("2"));
                    innerTower4.add(new JButton("3"));
                    innerTower4.add(new JButton("4"));
                    innerTower4.add(new JButton("5"));

                    innerTower4.get(0).setBounds(270,180,20,20);
                    innerTower4.get(0).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image4 = new ImageIcon(this.getClass().getResource("images/tower1.png")).getImage();
                            tw.addTower(270,180,0);

                        }
                    });



                    innerTower4.get(1).setBounds(290,180,20,20);
                    innerTower4.get(1).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image4 = new ImageIcon(this.getClass().getResource("images/tower2.png")).getImage();
                            image4 = image4.getScaledInstance(70,150,Image.SCALE_DEFAULT);
                            tw.addTower(270,180,1);
                        }
                    });

                    innerTower4.get(2).setBounds(310,180,20,20);
                    innerTower4.get(2).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image4 = new ImageIcon(this.getClass().getResource("images/elf_archer_tower_l.gif")).getImage();
                            image4 = image4.getScaledInstance(70,150,Image.SCALE_DEFAULT);
                            tw.addTower(270,180,2);
                        }
                    });

                    innerTower4.get(3).setBounds(330,180,20,20);
                    innerTower4.get(3).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image4 = new ImageIcon(this.getClass().getResource("images/elf_archer_tower_l.gif")).getImage();
                            image4 = image4.getScaledInstance(70,150,Image.SCALE_DEFAULT);
                            tw.addTower(270,180,3);
                        }
                    });


                    innerTower4.get(4).setBounds(350,180,20,20);
                    innerTower4.get(4).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JOptionPane.showConfirmDialog(null,"Upgrade Done!");
                        }
                    });

                    for(int i = 0; i < innerTower4.size(); i++)
                        add(innerTower4.get(i));

                    repaint();
                }



            }
        });
        add(tower4);

        tower5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == tower5) {

                    innerTower5.add(new JButton("1"));
                    innerTower5.add(new JButton("2"));
                    innerTower5.add(new JButton("3"));
                    innerTower5.add(new JButton("4"));
                    innerTower5.add(new JButton("5"));

                    innerTower5.get(0).setBounds(0,480,20,20);
                    innerTower5.get(0).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image5 = new ImageIcon(this.getClass().getResource("images/tower1.png")).getImage();
                            tw.addTower(0,480,0);
                        }
                    });



                    innerTower5.get(1).setBounds(20,480,20,20);
                    innerTower5.get(1).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image5 = new ImageIcon(this.getClass().getResource("images/tower2.png")).getImage();
                            image5 = image5.getScaledInstance(70,150,Image.SCALE_DEFAULT);
                            tw.addTower(0,480,1);
                        }
                    });

                    innerTower5.get(2).setBounds(40,480,20,20);
                    innerTower5.get(2).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image5 = new ImageIcon(this.getClass().getResource("images/elf_archer_tower_l.gif")).getImage();
                            image5 = image5.getScaledInstance(70,150,Image.SCALE_DEFAULT);
                            tw.addTower(0,480,2);

                        }
                    });

                    innerTower5.get(3).setBounds(60,480,20,20);
                    innerTower5.get(3).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            image5 = new ImageIcon(this.getClass().getResource("images/elf_archer_tower_l.gif")).getImage();
                            image5 = image5.getScaledInstance(70,150,Image.SCALE_DEFAULT);
                            tw.addTower(0,480,3);

                        }
                    });


                    innerTower5.get(4).setBounds(80,480,20,20);
                    innerTower5.get(4).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JOptionPane.showConfirmDialog(null,"Upgrade Done!");
                        }
                    });

                    for(int i = 0; i < innerTower5.size(); i++)
                        add(innerTower5.get(i));

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

      /*  for (int i = 0 ; i < mnsPanel.size() ;i++)
            g.drawImage(mnsPanel.get(i).returnMonsterImage(), myMonsters.get(i).getXloc(), myMonsters.get(i).getYLoc(), null);
*/


        g.drawImage(image1,30,80,null);

        g.drawImage(image2,200,190,null);

        g.drawImage(image3,310,260,null);

        g.drawImage(image4,320,80,null);


        g.drawImage(image5,70,400,null);

        g.drawImage(image6,450,400,null);

        g.drawImage(image7,500,150,null);

        g.drawImage(image8,800,150,null);
        g.drawImage(image9,640,270,null);


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
