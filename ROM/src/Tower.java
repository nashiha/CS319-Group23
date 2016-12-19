import java.util.Timer;

public class Tower {

	private Point towerPosition;
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

	public Tower(Point position){
	    towerPosition.x = position.x;
	    towerPosition.y = position.y;
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
                setupTime * 1000 //setup time seconds
        );
    }


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

	public void attack() {
		// TODO - implement Tower.attack
		throw new UnsupportedOperationException();
	}

	public boolean isReady() {
		return ready;
	}

}