package blackjack;

import java.util.Random;
import javax.swing.JOptionPane;

public class bjPanel extends javax.swing.JPanel {

    public bjPanel() {
        initComponents();
    }
    
    private void gamble(){
  
    }

    private void checkWinner() {
        if (randomHouse() > randomPlayer()) {
            JOptionPane.showMessageDialog(null, "HOUSE WON");

        } else {
            JOptionPane.showMessageDialog(null, "PLAYER WON");
        }
    }

    private int randomHouse() {
        Random rand = new Random();
        int card1 = rand.nextInt(11) + 1;
        HouseCardOne.setText(String.valueOf(card1));
        int card2 = rand.nextInt(11) + 1;
        HouseCardTwo.setText(String.valueOf(card2));

        return card1 + card2;
    }

    private int randomPlayer() {
        Random rand = new Random();
        int pcard1 = rand.nextInt(11) + 1;
        PlayerCardOne.setText(String.valueOf(pcard1));
        int pcard2 = rand.nextInt(11) + 1;
        PlayerCardTwo.setText(String.valueOf(pcard2));

        return pcard1 + pcard2;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        player = new javax.swing.JLabel();
        player1 = new javax.swing.JLabel();
        moneylbl = new javax.swing.JLabel();
        moneylbl1 = new javax.swing.JLabel();
        moneyCountHouse = new javax.swing.JLabel();
        moneyCountPlayer = new javax.swing.JLabel();
        btnBet = new javax.swing.JButton();
        betSum = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        HouseCardOne = new javax.swing.JLabel();
        HouseCardTwo = new javax.swing.JLabel();
        PlayerCardOne = new javax.swing.JLabel();
        PlayerCardTwo = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();

        player.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        player.setText("PLAYER");

        player1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        player1.setText("HOUSE");

        moneylbl.setText("MONEY:");

        moneylbl1.setText("MONEY:");

        moneyCountHouse.setText("50000");

        moneyCountPlayer.setText("100");

        btnBet.setText("BET");
        btnBet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBetActionPerformed(evt);
            }
        });

        HouseCardOne.setText("Card 1");

        HouseCardTwo.setText("Card 2");

        PlayerCardOne.setText("Card 1");

        PlayerCardTwo.setText("Card 2");

        btnStart.setText("START");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(player)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(moneylbl1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(moneyCountPlayer))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBet)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(betSum, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(HouseCardOne)
                                    .addComponent(player1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(moneylbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(moneyCountHouse)
                                    .addComponent(HouseCardTwo)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(PlayerCardOne)
                        .addGap(56, 56, 56)
                        .addComponent(PlayerCardTwo))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnStart)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player1)
                    .addComponent(moneylbl)
                    .addComponent(moneyCountHouse))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HouseCardOne)
                            .addComponent(HouseCardTwo))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PlayerCardOne)
                            .addComponent(PlayerCardTwo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBet)
                            .addComponent(betSum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player)
                    .addComponent(moneylbl1)
                    .addComponent(moneyCountPlayer))
                .addGap(58, 58, 58))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBetActionPerformed
        betSum.getText();
    }//GEN-LAST:event_btnBetActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        randomHouse();
        randomPlayer();
        checkWinner();
    }//GEN-LAST:event_btnStartActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HouseCardOne;
    private javax.swing.JLabel HouseCardTwo;
    private javax.swing.JLabel PlayerCardOne;
    private javax.swing.JLabel PlayerCardTwo;
    private javax.swing.JTextField betSum;
    private javax.swing.JButton btnBet;
    private javax.swing.JButton btnStart;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel moneyCountHouse;
    private javax.swing.JLabel moneyCountPlayer;
    private javax.swing.JLabel moneylbl;
    private javax.swing.JLabel moneylbl1;
    private javax.swing.JLabel player;
    private javax.swing.JLabel player1;
    // End of variables declaration//GEN-END:variables
}
