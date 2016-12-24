public class GameEngine {

	private int score;
	private int waveNo;
	private int gameStatus;
	private int coinCount;
	private int difficulty;
	private int soundLevel;
	private int musicLevel;
	private HighScoreManager highScoreManager = HighScoreManager.getInstance( );
	private TowerManager towerManager = TowerManager.getInstance();
	private WaveManager waveManager = WaveManager.getInstance();
	private SoundManager soundManager = SoundManager.getInstance();
	private SettingsManager settingsManager = SettingsManager.getInstance();
	private Castle castle = Castle.getInstance();

	public static void main(String[] args )
	{
		GameEngine gameEngine = new GameEngine();
		gameEngine.startGame();
	}

	public void startGame() {
		this.difficulty = settingsManager.getDifficulty();
		this.waveNo = 0;
		this.coinCount = 200;
		this.soundLevel = settingsManager.getSoundLevel();
		this.musicLevel = settingsManager.getMusicLevel();
		soundManager.playMusic();


	}

	public boolean pauseGame() {
		// TODO - implement GameEngine.pauseGame
		throw new UnsupportedOperationException();
	}

	public void endGame() {
		String name = null;
		// TODO - popup for name
		highScoreManager.checkScore(name,score);
	}

	public void resumeGame() {
		// TODO - implement GameEngine.resumeGame
		throw new UnsupportedOperationException();
	}

	public Monster checkCollisions() {
		// TODO - implement GameEngine.checkCollisions
		throw new UnsupportedOperationException();
	}

	public void addTower() {
		// TODO - implement GameEngine.addTower
		throw new UnsupportedOperationException();
	}

	public void upgradeTower() {
		// TODO - implement GameEngine.upgradeTower
		throw new UnsupportedOperationException();
	}

	public void startWave() {
		// TODO - implement GameEngine.startWave
		throw new UnsupportedOperationException();
	}

	public int[] updateHighScore() {
		// TODO - implement GameEngine.updateHighScore
		throw new UnsupportedOperationException();
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getWaveNo() {
		return waveNo;
	}

	public void setWaveNo(int waveNo) {
		this.waveNo = waveNo;
	}

	public int getGameStatus() {
		return gameStatus;
	}

	public void setGameStatus(int gameStatus) {
		this.gameStatus = gameStatus;
	}

	public int getCoinCount() {
		return coinCount;
	}

	public void setCoinCount(int coinCount) {
		this.coinCount = coinCount;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	public int getSoundLevel() {
		return soundLevel;
	}

	public void setSoundLevel(int soundLevel) {
		this.soundLevel = soundLevel;
	}

	public int getMusicLevel() {
		return musicLevel;
	}

	public void setMusicLevel(int musicLevel) {
		this.musicLevel = musicLevel;
	}
}