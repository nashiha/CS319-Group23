import javax.swing.*;
import java.awt.*;

/**
 * Created by Seyitoglu on 24.12.2016.
 */

public class Monster {

	protected int initialHealth;
	protected int currentHealth;
	protected int speed;
	protected int type;
	protected int damage;
	private int xLoc;
	private int yLoc;
	private Image myImage;
	int randomMe;
	private boolean isGenerated;
	public int loc;

	public Monster(){
		isGenerated = false;

		loc = 0;
		randomMe = 0;
		xLoc = 0;
		yLoc = 220;
		myImage =  new ImageIcon(this.getClass().getResource("/play.png")).getImage();
	}

	public boolean isGeneratedMonster() {
		return isGenerated;
	}
	public void setGeneratedMonster(boolean g) {
		isGenerated = g;
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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void moveLeft(int howMuch) {

		xLoc = xLoc - howMuch;
		int x;

	}

	public void moveRight(int howMuch) {
			xLoc = xLoc  + howMuch;
	}

	public Image getImage() {
		return myImage;
	}

	public void moveDown(int howMuch) {
		yLoc = yLoc + howMuch;
	}

	public void moveUp(int howMuch) {
		yLoc = yLoc - howMuch;
	}

	public void kill() {


	}

	public void damageMonster(int damageTaken){
		currentHealth = currentHealth - damageTaken;
		if(currentHealth <= 0) {
			this.kill();
			WaveManager w = WaveManager.getInstance();
			w.remove(this);
			CoinManager c = CoinManager.getInstance();
		}
	}

	public void damageCastle() {
		// TODO - implement Model.Monster.damageCastle
		throw new UnsupportedOperationException();
	}

	public int getInitialHealth() {
		return initialHealth;
	}

}