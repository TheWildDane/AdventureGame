
    import javax.swing.*;
    import java.awt.*;

    public class Game {
    JFrame window;
    Container con; // laver en base, som der kan bruges til at bygge mere i og store min titel
    JPanel titleNamePanel, startButtonPanel; // laver en titel
         JLabel titleNameLabel;
         Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
    public static void main(String[] args) {
        new Game();

    }
    public Game() {
        window = new JFrame();
        window.setSize(800, 600); // sætter window til 800 x 600 pixels
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // tilføjer en sluk på lukning
        window.getContentPane().setBackground(Color.black); // sætter window som sort
        window.setLayout(null); // fjerner default layout så et custom kan bruges
        window.setVisible(true);
        con = window.getContentPane();
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 150);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("Dungeon Hell");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.blue);

        titleNamePanel.add(titleNameLabel);
        con.add(titleNamePanel);
        con.add(startButtonPanel);
    }
}
