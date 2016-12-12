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

	public static void damageCastle(int damage){
		int health = Castle.getInstance().currentHealth;
		health -= damage;
		if(health < 0){
			// TODO end game
		}

	}
}