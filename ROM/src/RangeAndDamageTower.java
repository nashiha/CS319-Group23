public class RangeAndDamageTower extends Tower {

    public RangeAndDamageTower(Point location){
        super(location);
        range = 100;
        damage = 10;
        setupTime = 5;
        frequency = 3;
        super.setup(setupTime);
    }
}