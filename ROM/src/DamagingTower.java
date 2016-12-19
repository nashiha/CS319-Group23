public class DamagingTower extends Tower {

    public DamagingTower(Point location){
        super(location);
        range = 100;
        damage = 50;
        setupTime = 30;
        frequency = 1;
        super.setup(setupTime);
    }
}