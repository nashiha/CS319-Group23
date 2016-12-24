import javax.swing.*;
import java.awt.*;

public class HighScorePanel extends JPanel {
    Image background;
    private JButton title;
    private JTable table1;
    private JPanel innerPanel;
    private JTextArea textArea1;
    private JButton back;

    public HighScorePanel() {
        background = new ImageIcon(this.getClass().getResource("images/Menu_main_no_buttons.png")).getImage();
        add(innerPanel);
    }
    public JButton getBack() {
        return back;
    }
    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(background, 0, 0, null);
    }
}