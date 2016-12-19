import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class HighScoreManager {

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
			for (int i = 0; i < 10;i++){
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
			for (int i = 0; i < 10;i++){
				String line = fileIn.nextLine();
				int currentScore = Integer.parseInt(line.substring(0,line.indexOf(",")));
				if (currentScore > score) {
					for ( ; i + 1 < 10 ; i++){
						highScores[i+1] = highScores[i];
					}
					highScores[i] = name + "," + score;
					this.writeFile(i,name,score); // the score will be written in .txt file
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			fileIn.close();
		}

		for (int i = 0 ; i < 10 ; i++){
			System.out.println(highScores[i]);
		}

	}

	public void writeFile(int index, String name, int score) {
		try {
			FileWriter fw = new FileWriter(file, false);
			fw.write("test");

			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String[] getHighScores() {
		return highScores;
	}

}