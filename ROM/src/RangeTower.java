public class RangeTower extends Tower {

    public RangeTower(Point location){
        super(location);
        range = 200;
        damage = 25;
        setupTime = 30;
        frequency = 1;
    }
}