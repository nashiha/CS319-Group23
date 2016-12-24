/**
 * Created by mac on 12/24/16.
 */
public class SettingsManager {
    protected int difficulty;
    protected int soundLevel;
    protected int musicLevel;
    public SoundManager sn = SoundManager.getInstance();

    private static SettingsManager ourInstance = new SettingsManager();

    public static SettingsManager getInstance() {
        return ourInstance;
    }

    private SettingsManager() {
        difficulty = 0;
    }

    public int getMusicLevel() {
        return musicLevel;
    }

    public void setMusicLevel(int musicLevel) {
        this.musicLevel = musicLevel;
    }

    public int getSoundLevel() {
        return soundLevel;
    }

    public void setSoundLevel(int soundLevel, GameEngine g) {
        if (soundLevel == 0)
            sn.stopMusic();
        else if(soundLevel == 1)
            if (this.soundLevel!=1)
                sn.playMusic();
        this.soundLevel = soundLevel;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty,GameEngine g) {
        g.setDifficulty(difficulty);
        this.difficulty = difficulty;
    }
}
