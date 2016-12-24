public class RangeAndDamageTower extends Tower {

    public RangeAndDamageTower(int x, int y){
        super(x,y);
        range = 100;
        damage = 10;
        setupTime = 5;
        frequency = 3;
        cost = 100;
        super.setup(setupTime);
    }
}