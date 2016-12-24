import javax.sound.sampled.Clip;

public class SoundManager {

	private int sound;
	private int music;
	private static SoundManager soundManager = new SoundManager();
	public static SoundManager getInstance() {
		return soundManager;
	}
	private Clip clip;

	private SoundManager(){
	}



	public void playSound() {
		// TODO - implement Controller.SoundManager.playSound
		throw new UnsupportedOperationException();
	}

	public void playMusic() {
		// TODO - implement Controller.SoundManager.playMusic
		throw new UnsupportedOperationException();
	}

}