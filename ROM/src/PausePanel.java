import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Seyitoglu on 14.12.2016.
 */
public class PausePanel extends BackgroundImagePanel{

    private JButton continueButton;

    public PausePanel() {
        continueButton = new JButton("Continue");
        continueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*New Panel will be instantiated*/
            }
        });
    }

}
