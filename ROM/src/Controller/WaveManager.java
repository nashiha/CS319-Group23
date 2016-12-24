package Controller;

import Model.Wave;

import java.util.ArrayList;

public class WaveManager {

	private int currentWave;

	private static WaveManager manager = new WaveManager( );
	protected ArrayList<Wave> waves = new ArrayList<Wave>();

	private WaveManager() {
		currentWave = 1;
	}

	public static WaveManager getInstance( ) {
		return manager;
	}

	public void createWave() {
		//TODO get difficulty from game engine
		int dummy = 0;
		Wave created = new Wave(currentWave, dummy);
		currentWave++;
		waves.add(created);
	}
	public ArrayList<Wave> getWaves(){
		return waves;
	}
}