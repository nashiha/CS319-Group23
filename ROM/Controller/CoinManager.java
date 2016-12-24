/**
 * Created by mac on 12/24/16.
 */
public class CoinManager {
    private static CoinManager ourInstance = new CoinManager();

    public static CoinManager getInstance() {
        return ourInstance;
    }

    private int coin;
    private CoinManager() {
        coin = 200;
        updateCoinPanel(coin);

    }

    public void reset(){
        coin = 200;
        updateCoinPanel(coin);
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
        updateCoinPanel(coin);

    }

    public void monsterKilled(){
        coin =+ 50;
        updateCoinPanel(coin);
    }

    public void updateCoinPanel(int coin){
        //todo coin panel update
    }

}
