package xogame;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class XOgame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.getContentPane().add(new XOPanel());
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

}
