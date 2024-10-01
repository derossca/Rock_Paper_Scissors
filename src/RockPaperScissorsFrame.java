import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RockPaperScissorsFrame extends JFrame {

    //Fields
    JPanel mainPnl;
    JPanel btnPnl;
    JPanel statsPnl;
    JPanel resultsPnl;

    JButton rockBtn;
    JButton paperBtn;
    JButton scissorsBtn;
    JButton quitBtn;

    ImageIcon rockIcon;
    ImageIcon paperIcon;
    ImageIcon scissorsIcon;
    ImageIcon quitIcon;

    JLabel titleLabel;
    JLabel playerWinsLabel;
    JLabel computerWinsLabel;
    JLabel tieLabel;

    JTextField playerWinsField;
    JTextField computerWinsField;
    JTextField tieField;

    int winscnt;

    JTextArea results;

    JScrollPane scroll;

    //main panel that encapsulates all other panels
    public RockPaperScissorsFrame() {

        centerFrame();

        mainPnl = new JPanel();
        mainPnl.setLayout(new BorderLayout());

        buttonsPanel();
        mainPnl.add(btnPnl, BorderLayout.SOUTH);
        statsPanel();
        mainPnl.add(statsPnl, BorderLayout.NORTH);
        resultsPanel();
        mainPnl.add(resultsPnl, BorderLayout.CENTER);

        add(mainPnl);
        setTitle("Rock Paper Scissors");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    //method to make buttons for game play
    private void buttonsPanel() {
        btnPnl = new JPanel();
        btnPnl.setLayout(new GridLayout(1, 4));

        rockIcon = new ImageIcon(new ImageIcon("src/rock.jpg").getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
        paperIcon = new ImageIcon(new ImageIcon("src/paper.jpg").getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
        scissorsIcon = new ImageIcon(new ImageIcon("src/scissors.jpg").getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));

        rockBtn = new JButton(rockIcon);
        rockBtn.addActionListener(e -> {gameLogic("R")});



        paperBtn = new JButton(paperIcon);
        scissorsBtn = new JButton(scissorsIcon);


        quitBtn = new JButton("Quit");
        quitBtn.addActionListener(e -> {System.exit(0);});
    }

    private void statsPanel() {

    }

    private void resultsPanel() {

    }

    //method to center frame
    private void centerFrame() {
        //getting toolkit and dimensions of screen
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        //centering frame
        setSize(screenWidth * 3 / 4, screenHeight * 3 / 4);
        setLocation(screenWidth / 8 , screenHeight / 8);
    }

    private void gameLogic(String move) {

    }
}
