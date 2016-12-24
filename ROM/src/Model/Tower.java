package Model;

import java.util.Timer;

public class Tower {

	protected int x;
	protected int y;
	protected int range;
	protected int damage;
    protected boolean ready;
    protected int setupTime;
    protected int frequency;
    private int cost;
	private int upgradeNo;

	public Tower(){
	    upgradeNo = 0;
    }

	public Tower(int x,int y){
	    this.x = x;
	    this.y = y;
	    upgradeNo = 0;                  //tower is not upgraded
        ready = false;
    }

    public void setup(int time){
        new java.util.Timer().schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        ready = true;
                    }
                },
                time * 1000 //setup time seconds
        );
    }

    public int getX(){return x;}
    public int getY(){return y;}
    public int getRange(){return range;}

    public void upgrade() {
		upgradeNo++;
		switch (upgradeNo) {
            case (1):
                range = range + (range * 10)/100;
                damage = damage + (damage * 10)/100;
                break;
            case (2):
                range = range + (range * 20)/100;
                damage = damage + (damage * 20)/100;
                break;
            case(3):
                range = range + (range * 40)/100;
                damage = damage + (damage * 40)/100;
                break;
            case(4):
                range = range + (range * 80)/100;
                damage = damage + (damage * 80)/100;
                break;
            default:
                break;
        }
	}

	public void attack(Monster monster) {
		// TODO - implement Model.Tower.attack
        monster.damageMonster(this.damage);
	}

	public boolean isReady() {
		return ready;
	}

}