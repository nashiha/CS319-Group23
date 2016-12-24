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
	protected Image myImage;
	int randomMe;
	private boolean isGenerated;
	public int loc;
	private boolean destroyed;

	public Monster(){
		isGenerated = false;
		loc = 0;
		randomMe = 0;
		xLoc = 0;
		this.destroyed = false;
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

	public Image getMyImage() {
		return myImage;
	}
	public void setMyImage(String name){
		this.myImage = new ImageIcon(this.getClass().getResource("/"+name+".png")).getImage();
	}

	public void destroy(){
		destroyed = true;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void moveLeft(int howMuch) {

		xLoc = xLoc - howMuch;
		int x;

	}

	public boolean isDestroyed() {
		return destroyed;
	}

	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
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
			this.destroy();
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