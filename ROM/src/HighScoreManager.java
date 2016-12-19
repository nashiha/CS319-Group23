import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class HighScoreManager {

	final private int SIZE = 10;
	private int highScore;
	private int scoreList;
	private int name;
	private static HighScoreManager manager = new HighScoreManager();
	private URL url;
	private File file;
	private String[] highScores;

	public HighScoreManager(){
		// opens and sets the file
		url = getClass().getResource("highscores");
		file = new File(url.getPath());
		highScores = new String[10];
		Scanner fileIn = null;
		try {
			fileIn = new Scanner(file);
			for (int i = 0; i < SIZE ;i++){
				if (fileIn.hasNext())
					highScores[i] = fileIn.nextLine();	// getting high scores from .txt file
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			fileIn.close();
		}
	}

	public static HighScoreManager getInstance( ) {
		return manager;
	}

	public void checkScore(String name, int score){

		Scanner fileIn = null;
		try {
			fileIn = new Scanner(file);
			for (int i = 0; i < SIZE  ;i++){
				String line = fileIn.nextLine();
				String[] parts = line.split(",");
				int currentScore = Integer.parseInt(parts[0]);
				if (currentScore < score) {
					for (int k = SIZE - 1; k + 1 != i && k > 0; k--){
						highScores[k] = highScores[k-1]; //shifting the old values
					}
					highScores[i] = score + "," + name;
					this.updateFile(); // the score will be written in .txt file
					break;
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			fileIn.close();
		}

	}

	public void updateFile() {
		FileWriter writer=null;
		try {
			writer = new FileWriter(file, false);
			for (int i = 0; i < SIZE ;i++){
				String temp = highScores[i]+"\n";
				writer.write(temp.toCharArray());
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String[] getHighScores() {
		return highScores;
	}

}