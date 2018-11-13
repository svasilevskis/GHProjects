package blackjack;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Blackjack {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.getContentPane().add(new bjPanel());
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
