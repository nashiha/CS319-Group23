import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Seyitoglu on 12.12.2016.
 */
public class HighScorePanel extends JFrame {

    private BackgroundImagePanel initialPanel;
    private JTable highScoreTable;
  //  private String backgroundImageURL;

    public HighScorePanel() {
        //Instance Variables
        JButton addButton;
        //Close The Panel
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //TextFields
        JTextField nameField = new JTextField(8);
        JTextField lastNameField = new JTextField(8);
        JTextField scoreField = new JTextField(8);
        addButton = new JButton("ADD");

        //Activation of the internal panel
        JPanel buttonAndTextFieldPanel = new JPanel();
        buttonAndTextFieldPanel.setBackground(Color.CYAN);
        buttonAndTextFieldPanel.setVisible(true);

        buttonAndTextFieldPanel.add(nameField);
        buttonAndTextFieldPanel.add(lastNameField);

        //For demo purposes
      //  backgroundImageURL =  "";
        //Initialize
        initialPanel = new BackgroundImagePanel();
        initialPanel.add(buttonAndTextFieldPanel);
        highScoreTable = new JTable();

        //Will not change
        String []headers = {"Name","Last Name", "Score"};
        //Demo
        String [][]demo = new String [1][3];
        demo[0][0] = "Name";
        demo[0][1] = "Last Name";
        demo[0][2] = "Score";

        DefaultTableModel myModel = new DefaultTableModel(demo,headers);
        highScoreTable.setModel(myModel);

        initialPanel.add(addButton);
        initialPanel.add(highScoreTable);
        this.add(initialPanel);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp[] = new String[3];
                temp[0] = nameField.getText();
                temp[1] = lastNameField.getText();
                temp[2] = "90"; //Score is initially 90
                myModel.addRow(temp);
            }
        });
    }

}
