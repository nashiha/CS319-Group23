import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by mac on 12/24/16.
 */
public class TowerManager {
    private static TowerManager towerManager = new TowerManager();
    public static TowerManager getInstance() {
        return towerManager;
    }


    protected ArrayList<Tower> towers = new ArrayList<Tower>();
    protected WaveManager waveManager = WaveManager.getInstance();
    protected ArrayList<Monster> monsters;
    private int waveNo;

    private TowerManager(){

    }
    public void startChecking(){
        Timer timer = new Timer();
        timer.schedule(new checkTimer(), 0, 2000);
    }

    public void checkRanges(){
        System.out.println("check");
        for (Tower t : towers) {
            t.setReady(true);
        }
        for (int i = 0 ;i < waveManager.getWaves().size();i++) {
            Wave w = waveManager.getWaves().get(i);
            //if (w.getMonsters().size() == 0){ waveManager.getWaves().remove(w); }
            for (Monster m : w.getMonsters()) {
                int mX = m.getXloc();
                int mY = m.getYLoc();
                if (m.isDestroyed()) continue;
                for (Tower t : towers) {
                    if(t.isReady()) {
                        int tX = t.getX();
                        int tY = t.getY();
                        double distance = Math.sqrt((tX - mX) * (tX - mX) + (tY - mY) * (tY - mY));
                        if (t.getRange() > (int) distance) {
                            System.out.println("hit1");
                            System.out.println(m.currentHealth);
                            t.attack(m);
                            System.out.println("hit2");
                            System.out.println(m.currentHealth);
                            System.out.println(m.getXloc()+"  "+ m.getYLoc() );


                            t.setReady(false);
                            break;
                        }
                    }
                }
            }
        }
    }

    public void addTower(int x, int y, int type){
        Tower created;
        if(type == 0){
            created = new EasilyGeneratedTower(x,y);
        }
        else if (type == 1){
            created = new DamagingTower(x,y);
        }
        else if (type == 2){
            created = new RangeTower(x,y);
        }
        else if (type == 3){
            created = new RangeAndDamageTower(x,y);
        }
        else
            throw new IndexOutOfBoundsException();

        towers.add(created);
    }

    class checkTimer extends TimerTask {
        public void run() {
            checkRanges();
        }
    }

    // And From your main() method or any other method
    public static void main(String[] args){
        TowerManager t = TowerManager.getInstance();
    }

}
