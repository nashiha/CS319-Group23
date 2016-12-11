public class Monster {

	protected int initialHealth;
	protected int currentHealth;
	protected int speed;
	protected int damage;

	public Monster(){
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