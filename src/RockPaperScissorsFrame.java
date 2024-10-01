import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class RockPaperScissorsFrame extends JFrame {

    JFrame frame;

    JPanel mainPanel;
    JPanel buttonPanel;
    JPanel statsPanel;
    JPanel resultsPanel;

    JButton rockBtn;
    JButton paperBtn;
    JButton scissorsBtn;
    JButton quitBtn;

    ImageIcon rockIcon;
    ImageIcon paperIcon;
    ImageIcon scissorsIcon;

    JLabel playerWinsLabel;
    JLabel compWinsLabel;
    JLabel tieLabel;

    JTextField playerWinsField;
    JTextField compWinsField;
    JTextField tieField;

    JTextArea resultsArea;

    JScrollPane scroll;

    int numPlayerWinCnt = 0;
    int numCompWinCnt = 0;
    int numTieCnt = 0;

    ArrayList<Integer> playerMove = new ArrayList<>();

    //constructor for RPS Frame
    public RockPaperScissorsFrame() {

        //createCenterFrame();

        setTitle("Rock Paper Scissors");

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        createStatsPanel();
        createResultsPanel();
        //createButtonsPanel();

        add(mainPanel);

    }

    //makes the stats panel at the north end of the frame
    private void createStatsPanel() {

        //making new stats jpanel with a grid layout
        JPanel statsPanel = new JPanel();
        statsPanel.setLayout(new GridLayout(2,3));

        //jlabels for results of game
        JLabel playerWinsLabel = new JLabel("Player Wins!", JLabel.CENTER);
        JLabel compWinsLabel = new JLabel("Comp Wins!", JLabel.CENTER);
        JLabel tieLabel = new JLabel("Tie!", JLabel.CENTER);

        //text fields for keeping count of player/comp wins and ties
        playerWinsField =  new JTextField("0", 4);
        playerWinsField.setEditable(false);
        compWinsField =  new JTextField("0", 4);
        compWinsField.setEditable(false);
        tieField =  new JTextField("0", 4);
        tieField.setEditable(false);

        //adding everything to stats panel
        statsPanel.add(playerWinsLabel);
        statsPanel.add(playerWinsField);
        statsPanel.add(compWinsLabel);
        statsPanel.add(compWinsField);
        statsPanel.add(tieLabel);
        statsPanel.add(tieField);

        mainPanel.add(statsPanel, BorderLayout.NORTH);
    }

    //shows results of game
    private void createResultsPanel() {

        //making new panel for results to be dispalyed in
        JPanel resultsPanel = new JPanel();

        resultsArea = new JTextArea(7,60);
        resultsArea.setEditable(false);
        resultsArea.setLineWrap(true);
        resultsArea.setWrapStyleWord(true);
        resultsArea.setFont(new Font("Arial", Font.PLAIN, 18));

        //makes it so you can scroll thru game results played
        scroll = new JScrollPane(resultsArea);

        mainPanel.add(scroll, BorderLayout.CENTER);
    }
}
