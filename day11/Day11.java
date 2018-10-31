package day11;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Day11 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.getContentPane().add(new day11_panelis());
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

}
