import javax.swing.*;
import java.awt.*;

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

    private void buttonsPanel() {
        btnPnl = new JPanel();

        rockIcon = new ImageIcon("src/")
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
}
