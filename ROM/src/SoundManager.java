public class SoundManager {

	private int sound;
	private int music;
	private static SoundManager soundManager = new SoundManager();
	public static SoundManager getInstance() {
		return soundManager;
	}


	private SoundManager(){
	}

	public void playSound() {
		// TODO - implement SoundManager.playSound
		throw new UnsupportedOperationException();
	}

	public void playMusic() {
		// TODO - implement SoundManager.playMusic
		throw new UnsupportedOperationException();
	}

}