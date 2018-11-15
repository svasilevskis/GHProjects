package xogame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game extends JFrame {

    private final int BOARD_WIDTH = 20 * 30;
    private final int BOARD_HEIGHT = 20 * 30;
    private final int TILE_SIZE = 20;
    private final int ALL_TILES = 900; // kopejais izmers
    private final int DELAY = 50;

    private int[] xCoor = new int[ALL_TILES];
    private int[] yCoor = new int[ALL_TILES];

    private int target_x, target_y;

    int pressedKey = KeyEvent.VK_DOWN;
    int oldPressedKey;
    private int snakeSize = 2;
    private boolean inGame = true;

    public class Board extends JPanel implements KeyListener, ActionListener {

        Board() {
            setBackground(Color.GRAY);
            // sakuma koordinates
            for (int i = 0; i < snakeSize; i++) {
                yCoor[i] = 140 - (i * 30);
                xCoor[i] = 140;
            }

            spawnTargetCoor();
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            if (inGame) {

                g.setColor(Color.red);
                g.fillRect(target_x, target_y, TILE_SIZE, TILE_SIZE);

                for (int i = 0; i < snakeSize; i++) {

                    g.fillRect(xCoor[i], yCoor[i], TILE_SIZE, TILE_SIZE);
                }
            } else {
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        }

        public void actionPerformed(ActionEvent e) {

            checkTile();
            moveSnakeCoor();
            repaint();

        }

        public void keyPressed(KeyEvent e) {
            oldPressedKey = pressedKey;
            pressedKey = e.getKeyCode();
        }

        public void keyReleased(KeyEvent e) {
        }

        public void keyTyped(KeyEvent e) {
        }

        private void checkTile() {
            if (xCoor[0] > BOARD_WIDTH || xCoor[0] < 0 || yCoor[0] > BOARD_HEIGHT || yCoor[0] < 0) {
                inGame = false;
            }

            for (int i = 1; i < xCoor.length; i++) {
                if (xCoor[0] == xCoor[i] && yCoor[0] == yCoor[i]) {
                    inGame = false;
                }
            }

            if ((xCoor[0] == target_x) && (yCoor[0] == target_y)) {
                snakeSize++;
                spawnTargetCoor();
            }
        }

        private void spawnTargetCoor() {
            int r = (int) (Math.random() * Math.sqrt(ALL_TILES) - 1);
            target_x = ((r * TILE_SIZE));

            r = (int) (Math.random() * Math.sqrt(ALL_TILES) - 1);
            target_y = ((r * TILE_SIZE));
        }

        private void moveSnakeCoor() {

            for (int i = snakeSize; i > 0; i--) {
                xCoor[i] = xCoor[(i - 1)];
                yCoor[i] = yCoor[(i - 1)];
            }

            switch (pressedKey) {
                case KeyEvent.VK_DOWN:
                    yCoor[0] += TILE_SIZE;
                    break;
                case KeyEvent.VK_UP:
                    yCoor[0] -= TILE_SIZE;
                    break;
                case KeyEvent.VK_LEFT:
                    xCoor[0] -= TILE_SIZE;
                    break;
                case KeyEvent.VK_RIGHT:
                    xCoor[0] += TILE_SIZE;
                    break;
            }
        }
    }

    public Game() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(BOARD_WIDTH, BOARD_HEIGHT);
        setResizable(false);
        setLocation(20, 20);

        Board b = new Board();
        addKeyListener(b);
        add(b);
        setVisible(true);

        Timer t = new Timer(DELAY, b);
        t.start();
    }

    public static void main(String[] args) {

    }
}
