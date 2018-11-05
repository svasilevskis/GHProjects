package day13;

public class IevadesParbaude extends javax.swing.JPanel {
    
    String savedUname = "AdminSandis";
    String savedPW = "Parole99999";
    
    public IevadesParbaude() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        output = new javax.swing.JLabel();
        btnlogin = new javax.swing.JButton();
        textUname = new javax.swing.JTextField();
        textPW = new javax.swing.JTextField();
        lblUname = new javax.swing.JLabel();
        lblPW = new javax.swing.JLabel();
        btnTest = new javax.swing.JButton();
        testtext = new javax.swing.JTextField();

        output.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        btnlogin.setText("Submit");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        textUname.setPreferredSize(new java.awt.Dimension(250, 30));
        textUname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUnameActionPerformed(evt);
            }
        });

        textPW.setPreferredSize(new java.awt.Dimension(250, 30));
        textPW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPWActionPerformed(evt);
            }
        });

        lblUname.setText("Username");

        lblPW.setText("Password");

        btnTest.setText("Test");
        btnTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestActionPerformed(evt);
            }
        });

        testtext.setMinimumSize(new java.awt.Dimension(45, 20));
        testtext.setPreferredSize(new java.awt.Dimension(45, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPW))
                    .addComponent(btnlogin)
                    .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(btnTest))
                            .addComponent(textUname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblUname))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(testtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTest)
                    .addComponent(testtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textUname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUname))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPW))
                .addGap(29, 29, 29)
                .addComponent(btnlogin)
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textUnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUnameActionPerformed

    }//GEN-LAST:event_textUnameActionPerformed

    private void textPWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPWActionPerformed

    }//GEN-LAST:event_textPWActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        String inputUname = textUname.getText();
        String inputpw = textPW.getText();
        
        if (inputUname.length() > 7 && inputpw.length() > 9) {
            if (inputpw.contains("123")) {
                output.setText("Nelegale ievade!");
            } else {
                if (inputUname.equals(savedUname) && inputpw.equals(savedPW)) {
                    output.setText("Pareizi");
                } else {
                    output.setText("Nepareizi");
                }
            }
        } else {
            output.setText("Ievades garums nav pareizs");
        }
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestActionPerformed
        String a = testtext.getText();
        try {
            int sk = Integer.valueOf(a);
            int result = sk * sk;
            testtext.setText(String.valueOf(result));
    }//GEN-LAST:event_btnTestActionPerformed
    catch (Exception ex) {
            testtext.setText("Kluda");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTest;
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel lblPW;
    private javax.swing.JLabel lblUname;
    private javax.swing.JLabel output;
    private javax.swing.JTextField testtext;
    private javax.swing.JTextField textPW;
    private javax.swing.JTextField textUname;
    // End of variables declaration//GEN-END:variables
}
