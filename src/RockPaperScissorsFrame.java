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
        createButtonsPanel();

        add(mainPanel);

    }

    //makes the stats panel at the north end of the frame
    private void createStatsPanel() {

        //making new stats jpanel with a grid layout
        JPanel statsPanel = new JPanel();
        statsPanel.setLayout(new GridLayout(2,3));

        //jlabels for results of game
        playerWinsLabel = new JLabel("Player Wins!", JLabel.CENTER);
        compWinsLabel = new JLabel("Comp Wins!", JLabel.CENTER);
        tieLabel = new JLabel("Tie!", JLabel.CENTER);

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

    private void createButtonsPanel() {
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 4));

        //setting and scaling all icons
        rockIcon = new ImageIcon("src/rock.png");
        Image rockImage = rockIcon.getImage();
        Image rockIconImage = rockImage.getScaledInstance(350, 350, Image.SCALE_SMOOTH);
        rockIcon.setImage(rockIconImage);

        paperIcon = new ImageIcon("src/paper.png");
        Image paperImage = paperIcon.getImage();
        Image paperIconImage = paperImage.getScaledInstance(350, 350, Image.SCALE_SMOOTH);
        paperIcon.setImage(paperIconImage);

        scissorsIcon = new ImageIcon("src/scissors.png");
        Image scissorsImage = scissorsIcon.getImage();
        Image scissorsIconImage = scissorsImage.getScaledInstance(350, 350, Image.SCALE_SMOOTH);
        scissorsIcon.setImage(scissorsIconImage);

        //creating buttons
        rockBtn = new JButton(rockIcon);
        paperBtn = new JButton(paperIcon);
        scissorsBtn = new JButton(scissorsIcon);
        quitBtn = new JButton("Quit");

        //adding action listeners to make buttons functional
        rockBtn.addActionListener(e -> gameMove("R"));
        paperBtn.addActionListener(e -> gameMove("P"));
        scissorsBtn.addActionListener(e -> gameMove("S"));
        quitBtn.addActionListener(e -> System.exit(0));

        //adding buttons to the panel
        buttonPanel.add(rockBtn);
        buttonPanel.add(paperBtn);
        buttonPanel.add(scissorsBtn);

        //adding a border to this panel
        Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
        buttonPanel.setBorder(border);

        //adding button panel to main panel
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
    }

    //now we need moves from the player and computer to determine winner and play game
    private void gameMove(String move) {
        final int ROCK = 0;
        final int PAPER = 1;
        final int SCISSORS = 2;

        //userMove that corresponds to the index to get correct move
        int userMove;

        if(move.equals("R")) {
            userMove = ROCK;
        } else if(move.equals("P")) {
            userMove = PAPER;
        } else {
            userMove = SCISSORS;
        }

        //need variables to generate random move for comp
        Random rnd = new Random();
        int i = 0;
        ArrayList<>
    }
}
