public class DamageTower extends Tower {
    public DamageTower(Point location){
        super(location);
        range = 100;
        damage = 50;
        setupTime = 30;
        frequency = 1;
    }
}