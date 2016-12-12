public class Wave {

	private int waveNo;
	private int noOfMonsters;
	private int monsterFreq;
	private int waveTimer;
	private int waveDuration;
	protected Monster[] monsters;

	public Wave(int waveNo, int difficulty){
		if (difficulty == 1) { // hard
			monsters = new Monster[waveNo*4];
		}
		else if (difficulty == 0){ // medium
			monsters = new Monster[waveNo*3];
		}
		else if (difficulty == -1){// easy
			monsters = new Monster[waveNo*2];
		}

		for (int i = 0; i < monsters.length; i++ ){
			int num = 1 + (int)(Math.random() * 5);

			// creating list with 0.2 probability of speedy and damaging monster, 0.4 damaging monster and 0.4 speedy monster
			if(num ==5)
				monsters[i] = new SpeedyAndDamagingMonster();
			else if ( num > 2)
				monsters[i] = new DamagingMonster();
			else
				monsters[i] = new SpeedyMonster();
		}
	}

}