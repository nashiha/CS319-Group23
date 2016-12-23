import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by mac on 12/24/16.
 */
public class TowerManager {
    private static TowerManager towerManager = new TowerManager();


    ArrayList<Tower> towers = new ArrayList<Tower>();
    private int temp = 1;

    public static TowerManager getInstance() {
        return towerManager;
    }

    private TowerManager(){
        Timer timer = new Timer();
        timer.schedule(new checkTimer(), 0, 1000);
        WaveManager waveManager = WaveManager.getInstance();

    }

    public void checkRanges(){

    }

    public void addTower(int type, int x, int y){
        Tower created;
        if (type == 1){
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
