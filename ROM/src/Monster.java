public class Monster {

	protected int initialHealth;
	protected int currentHealth;
	protected int speed;
	protected int damage;
	private int xLoc;
	private int yLoc;

	public Monster(){
		xLoc = 0;
		yLoc = 0;
	}

	public void setXloc(int x) {
		xLoc = x;
	}

	public void setYLoc(int y) {
		yLoc = y;
	}

	public int getXloc() {
		return xLoc;
	}

	public int getYLoc() {
		return yLoc;
	}

	public void moveLeft() {

		xLoc = xLoc -5;

	}

	public void moveRight() {

		xLoc = xLoc  + 5;

	}

	public void moveDown() {
		yLoc = yLoc + 5;
	}

	public void moveUp() {
		yLoc = yLoc - 5;
	}

	public void kill() {
		// TODO - implement Monster.kill
		throw new UnsupportedOperationException();
	}

	public void damageMonster(int damageTaken){
		currentHealth = currentHealth - damageTaken;
		if(currentHealth <= 0)
			this.kill();
	}

	public void damageCastle() {
		// TODO - implement Monster.damageCastle
		throw new UnsupportedOperationException();
	}

}