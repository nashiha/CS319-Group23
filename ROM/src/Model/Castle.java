package Model;

public class Castle {

	private int initialHealth;
	private int currentHealth;
	private static Castle castle = new Castle();

	private Castle(){
		initialHealth = 1000;
		currentHealth = 1000;
	}

	public static Castle getInstance( ) {
		return castle;
	}

	public void damageCastle(int damage){
		this.currentHealth -= damage;
		if(currentHealth < 0){
			// TODO end game
		}
	}
}