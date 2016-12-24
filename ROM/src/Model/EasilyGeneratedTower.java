package Model;

public class EasilyGeneratedTower extends Tower {

    public EasilyGeneratedTower(int x,int y){
        range = 100;
        damage = 10;
        setupTime = 1;
        frequency = 1;
        super.setup(setupTime);
    }

}