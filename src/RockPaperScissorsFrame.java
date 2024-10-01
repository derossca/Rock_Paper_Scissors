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

    JLabel p1Lbl;
    JLabel p2Lbl;
    JLabel tieLbl;

    JTextField p1Field;
    JTextField p2Field;
    JTextField tieField;

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

    }

    private void statsPanel() {

    }

    private void resultsPanel() {

    }

    private void centerFrame() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setSize(screenWidth * 3 / 4, screenHeight * 3 / 4);
        setLocation(screenWidth / 8 , screenHeight / 8);
    }
}
