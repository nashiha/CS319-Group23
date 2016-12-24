import java.util.ArrayList;

public class Wave {

	private int waveNo;
	private int noOfMonsters;
	private int monsterFreq;
	private int waveTimer;
	private int waveDuration;
	protected ArrayList<Monster> monsters;

	public Wave(int waveNo, int difficulty){
		int size = 0;
		if (difficulty == 1) { // hard
			size = waveNo*4;
		}
		else if (difficulty == 0){ // medium
			size = waveNo*3;
		}
		else if (difficulty == -1){// easy
			size = waveNo*2;
		}

		for (int i = 0; i < size; i++ ){
			int num = 1 + (int)(Math.random() * 5);

			// creating list with 0.2 probability of speedy and damaging monster, 0.4 damaging monster and 0.4 speedy monster
			if(num ==5)
				monsters.add(new SpeedyAndDamagingMonster());
			else if ( num > 2)
				monsters.add(new DamagingMonster());
			else
				monsters.add(new SpeedyMonster());
		}
	}

	public ArrayList<Monster> getMonsters(){
		return monsters;
	}



}