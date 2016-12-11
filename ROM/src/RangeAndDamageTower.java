public class RangeAndDamageTower extends Tower {

    public RangeAndDamageTower(Point location){
        super(location);
        range = 100;
        damage = 10;
        setupTime = 30;
        frequency = 3;
    }
}