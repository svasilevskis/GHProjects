package xogame;

import javax.swing.JOptionPane;
import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class XOPanel extends javax.swing.JPanel {

    private String startGame = "X";
    private int xCounter = 0;
    private int oCounter = 0;

    public XOPanel() {
        initComponents();
    }

    private void score() {
        playerOneCounter.setText(String.valueOf(xCounter));
        playerTwoCounter.setText(String.valueOf(oCounter));
    }

    private void player() {
        if (startGame.equalsIgnoreCase("X")) {
            startGame = "0";
        } else {
            startGame = "X";
        }
    }

    private void sound() {
        try {
            String audioFile = "C:\\Users\\LD\\Desktop\\baby_x.wav";
            InputStream in = new FileInputStream(audioFile);
            AudioStream audioStream = new AudioStream(in);
            AudioPlayer.player.start(audioStream);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    private void wonGame() {
        String f1 = btn1.getText();
        String f2 = btn2.getText();
        String f3 = btn3.getText();
        String f4 = btn4.getText();
        String f5 = btn5.getText();
        String f6 = btn6.getText();
        String f7 = btn7.getText();
        String f8 = btn8.getText();
        String f9 = btn9.getText();

        // Player X
        if (f1 == "X" && f2 == "X" && f3 == "X") {
            JOptionPane.showMessageDialog(null, "Player X WON THE GAME");
            sound();
            xCounter++;
            score();
            btnReset.doClick();
        }

        if (f4 == "X" && f5 == "X" && f6 == "X") {
            JOptionPane.showMessageDialog(null, "Player X WON THE GAME");
            sound();
            xCounter++;
            score();
            btnReset.doClick();
        }
        if (f7 == "X" && f8 == "X" && f9 == "X") {
            JOptionPane.showMessageDialog(null, "Player X WON THE GAME");
            sound();
            xCounter++;
            score();
            btnReset.doClick();
        }
        if (f1 == "X" && f4 == "X" && f7 == "X") {
            JOptionPane.showMessageDialog(null, "Player X WON THE GAME");
            sound();
            xCounter++;
            score();
            btnReset.doClick();
        }
        if (f2 == "X" && f5 == "X" && f8 == "X") {
            JOptionPane.showMessageDialog(null, "Player X WON THE GAME");
            sound();
            xCounter++;
            score();
            btnReset.doClick();
        }
        if (f3 == "X" && f6 == "X" && f9 == "X") {
            JOptionPane.showMessageDialog(null, "Player X WON THE GAME");
            sound();
            xCounter++;
            score();
            btnReset.doClick();
        }
        if (f1 == "X" && f5 == "X" && f9 == "X") {
            JOptionPane.showMessageDialog(null, "Player X WON THE GAME");
            sound();
            xCounter++;
            score();
            btnReset.doClick();
        }
        if (f3 == "X" && f5 == "X" && f7 == "X") {
            JOptionPane.showMessageDialog(null, "Player X WON THE GAME");
            sound();
            xCounter++;
            score();
            btnReset.doClick();
        }

        // Player O
        if (f1 == "O" && f2 == "O" && f3 == "O") {
            JOptionPane.showMessageDialog(null, "Player O WON THE GAME");
            sound();
            oCounter++;
            score();
            btnReset.doClick();
        }

        if (f4 == "O" && f5 == "O" && f6 == "O") {
            JOptionPane.showMessageDialog(null, "Player O WON THE GAME");
            sound();
            oCounter++;
            score();
            btnReset.doClick();
        }
        if (f7 == "O" && f8 == "O" && f9 == "O") {
            JOptionPane.showMessageDialog(null, "Player O WON THE GAME");
            sound();
            oCounter++;
            score();
            btnReset.doClick();
        }
        if (f1 == "O" && f4 == "O" && f7 == "O") {
            JOptionPane.showMessageDialog(null, "Player O WON THE GAME");
            sound();
            oCounter++;
            score();
            btnReset.doClick();
        }
        if (f2 == "O" && f5 == "O" && f8 == "O") {
            JOptionPane.showMessageDialog(null, "Player O WON THE GAME");
            sound();
            oCounter++;
            score();
            btnReset.doClick();
        }
        if (f3 == "O" && f6 == "O" && f9 == "O") {
            JOptionPane.showMessageDialog(null, "Player O WON THE GAME");
            sound();
            oCounter++;
            score();
            btnReset.doClick();
        }
        if (f1 == "O" && f5 == "O" && f9 == "O") {
            JOptionPane.showMessageDialog(null, "Player O WON THE GAME");
            sound();
            oCounter++;
            score();
            btnReset.doClick();
        }
        if (f3 == "O" && f5 == "O" && f7 == "O") {
            JOptionPane.showMessageDialog(null, "Player O WON THE GAME");
            sound();
            oCounter++;
            score();
            btnReset.doClick();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        playerOne = new javax.swing.JLabel();
        playerTwo = new javax.swing.JLabel();
        playerOneCounter = new javax.swing.JLabel();
        playerTwoCounter = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btn1.setBackground(new java.awt.Color(102, 204, 255));
        btn1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(102, 204, 255));
        btn2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(102, 204, 255));
        btn3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(102, 204, 255));
        btn4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(102, 204, 255));
        btn5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(102, 204, 255));
        btn6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(102, 204, 255));
        btn7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(102, 204, 255));
        btn8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(102, 204, 255));
        btn9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 255, 255));
        btnReset.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        playerOne.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        playerOne.setText("Player X:");

        playerTwo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        playerTwo.setText("Player O:");

        playerOneCounter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        playerOneCounter.setText("0");

        playerTwoCounter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        playerTwoCounter.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(playerOne)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(playerOneCounter))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(playerTwo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(playerTwoCounter))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(playerOne)
                            .addComponent(playerOneCounter))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(playerTwo)
                            .addComponent(playerTwoCounter))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        btn1.setText(startGame);
        player();
        wonGame();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        btn2.setText(startGame);
        player();
        wonGame();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        btn3.setText(startGame);
        player();
        wonGame();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        btn4.setText(startGame);
        player();
        wonGame();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        btn5.setText(startGame);
        player();
        wonGame();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        btn6.setText(startGame);
        player();
        wonGame();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        btn7.setText(startGame);
        player();
        wonGame();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        btn8.setText(startGame);
        player();
        wonGame();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        btn9.setText(startGame);
        player();
        wonGame();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

    }//GEN-LAST:event_btnExitActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
    }//GEN-LAST:event_btnResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel playerOne;
    private javax.swing.JLabel playerOneCounter;
    private javax.swing.JLabel playerTwo;
    private javax.swing.JLabel playerTwoCounter;
    // End of variables declaration//GEN-END:variables
}
