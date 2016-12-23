public class WaveManager {

	private int currentWave;

	private static WaveManager manager = new WaveManager( );

	private WaveManager() {
		currentWave = 1;
	}

	public static WaveManager getInstance( ) {
		return manager;
	}

	public Wave createWave() {
		//get difficulty from game engine
		int dummy = 0;
		return new Wave(currentWave++,dummy);
	}
}