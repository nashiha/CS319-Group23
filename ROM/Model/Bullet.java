import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

public class Bullet {

	private int speedX;
	private int speedY;
	private int x, y;
	private int angle;
	private int speed, ttl;

	public Bullet(int x, int y, int speed){

		this.x = x;
		this.y = y;
		this.speed= speed;
		this.ttl = 250;


	}

	public int Move(){
		this.speed -= (ttl / 100);
		y += this.speed;
		ttl--;
		return y;
	}

	public void moveForward(int speed) {
		x += Math.cos(angle)*speed;
		y += Math.sin(angle)*speed;
	}

}


