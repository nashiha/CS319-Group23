package Model;

import Model.Tower;

public class RangeTower extends Tower {

    public RangeTower(int x, int y){
        super(x,y);
        range = 200;
        damage = 25;
        setupTime = 30;
        frequency = 1;
    }
}