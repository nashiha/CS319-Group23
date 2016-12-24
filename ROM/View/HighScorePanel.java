import javax.swing.*;
import java.awt.*;

public class HighScorePanel extends JPanel {
    Image background;
    private JButton sampleTextLalalaButton;
    private JTable table1;
    private JPanel innerPanel;
    private JTextArea textArea1;

    public HighScorePanel() {
        background = new ImageIcon(this.getClass().getResource("images/Menu_main_no_buttons.png")).getImage();
        add(innerPanel);
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(background, 0, 0, null);
    }
}