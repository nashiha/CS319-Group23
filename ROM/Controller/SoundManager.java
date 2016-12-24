import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.applet.AudioClip;
import java.io.InputStream;

public class SoundManager {

	private int sound;
	private int music;
	private static SoundManager soundManager = new SoundManager();
	public static SoundManager getInstance() {
		return soundManager;
	}
	private Clip clip;
	private AudioInputStream inputStream;

	private SoundManager(){
		try{
		clip = AudioSystem.getClip();
		InputStream in = SoundManager.class.getClassLoader().getResourceAsStream("sounds/GameMusic.wav");
		inputStream = AudioSystem.getAudioInputStream(in);}
		catch (Exception e){

		}
	}



	public void playSound() {
		// TODO - implement Controller.SoundManager.playSound
		throw new UnsupportedOperationException();
	}

	public void playMusic() {
		new Thread(new Runnable() {

			public void run() {
				try {
					clip.open(inputStream);
					clip.start();
					clip.loop(999);
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			}
		}).start();
	}
	public void stopMusic(){
		clip.close();
	}
}