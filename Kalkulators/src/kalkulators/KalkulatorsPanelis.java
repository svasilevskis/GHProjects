package kalkulators;

public class KalkulatorsPanelis extends javax.swing.JPanel {

    private String skaitlis;
    private String skaitlis2;
    private String pakape;
    private String darbiba = "";
    private boolean parbaude;
    private boolean izvDarbiba;

    public KalkulatorsPanelis() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        izvade = new javax.swing.JTextField();
        poga1 = new javax.swing.JButton();
        poga2 = new javax.swing.JButton();
        poga3 = new javax.swing.JButton();
        poga4 = new javax.swing.JButton();
        poga5 = new javax.swing.JButton();
        poga6 = new javax.swing.JButton();
        poga7 = new javax.swing.JButton();
        poga8 = new javax.swing.JButton();
        poga9 = new javax.swing.JButton();
        pogaplus = new javax.swing.JButton();
        pogaminus = new javax.swing.JButton();
        pogareizinat = new javax.swing.JButton();
        pogadalit = new javax.swing.JButton();
        pogarezultats = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        pogapunkts = new javax.swing.JButton();
        poga10 = new javax.swing.JButton();
        pogakapinat = new javax.swing.JButton();

        izvade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izvadeActionPerformed(evt);
            }
        });

        poga1.setText("1");
        poga1.setMargin(new java.awt.Insets(15, 15, 15, 15));
        poga1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poga1ActionPerformed(evt);
            }
        });

        poga2.setText("2");
        poga2.setMargin(new java.awt.Insets(15, 15, 15, 15));
        poga2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poga2ActionPerformed(evt);
            }
        });

        poga3.setText("3");
        poga3.setMargin(new java.awt.Insets(15, 15, 15, 15));
        poga3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poga3ActionPerformed(evt);
            }
        });

        poga4.setText("4");
        poga4.setMargin(new java.awt.Insets(15, 15, 15, 15));
        poga4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poga4ActionPerformed(evt);
            }
        });

        poga5.setText("5");
        poga5.setMargin(new java.awt.Insets(15, 15, 15, 15));
        poga5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poga5ActionPerformed(evt);
            }
        });

        poga6.setText("6");
        poga6.setMargin(new java.awt.Insets(15, 15, 15, 15));
        poga6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poga6ActionPerformed(evt);
            }
        });

        poga7.setText("7");
        poga7.setMargin(new java.awt.Insets(15, 15, 15, 15));
        poga7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poga7ActionPerformed(evt);
            }
        });

        poga8.setText("8");
        poga8.setMargin(new java.awt.Insets(15, 15, 15, 15));
        poga8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poga8ActionPerformed(evt);
            }
        });

        poga9.setText("9");
        poga9.setMargin(new java.awt.Insets(15, 15, 15, 15));
        poga9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poga9ActionPerformed(evt);
            }
        });

        pogaplus.setText("+");
        pogaplus.setMargin(new java.awt.Insets(15, 15, 15, 15));
        pogaplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pogaplusActionPerformed(evt);
            }
        });

        pogaminus.setText("-");
        pogaminus.setMargin(new java.awt.Insets(15, 15, 15, 15));
        pogaminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pogaminusActionPerformed(evt);
            }
        });

        pogareizinat.setText("*");
        pogareizinat.setMargin(new java.awt.Insets(15, 15, 15, 15));
        pogareizinat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pogareizinatActionPerformed(evt);
            }
        });

        pogadalit.setText("/");
        pogadalit.setMargin(new java.awt.Insets(15, 15, 15, 15));
        pogadalit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pogadalitActionPerformed(evt);
            }
        });

        pogarezultats.setText("Rezultats");
        pogarezultats.setMargin(new java.awt.Insets(15, 15, 15, 15));
        pogarezultats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pogarezultatsActionPerformed(evt);
            }
        });

        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        pogapunkts.setText(".");
        pogapunkts.setMargin(new java.awt.Insets(15, 15, 15, 15));
        pogapunkts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pogapunktsActionPerformed(evt);
            }
        });

        poga10.setText("0");
        poga10.setMargin(new java.awt.Insets(15, 15, 15, 15));
        poga10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poga10ActionPerformed(evt);
            }
        });

        pogakapinat.setText("^");
        pogakapinat.setMargin(new java.awt.Insets(15, 15, 15, 15));
        pogakapinat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pogakapinatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(izvade, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(poga4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(poga5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(poga6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(pogaminus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(poga1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(poga2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(poga3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(pogaplus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(poga7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(poga8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(poga9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(pogapunkts, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(63, 63, 63)
                                    .addComponent(pogakapinat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pogadalit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pogareizinat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(poga10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pogarezultats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(izvade, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(poga1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(poga2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(poga3)
                    .addComponent(pogaplus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(poga4)
                    .addComponent(poga5)
                    .addComponent(poga6)
                    .addComponent(pogaminus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(poga7)
                    .addComponent(poga8)
                    .addComponent(poga9)
                    .addComponent(pogareizinat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pogadalit)
                    .addComponent(pogapunkts)
                    .addComponent(poga10)
                    .addComponent(pogakapinat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pogarezultats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void izvadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izvadeActionPerformed

    }//GEN-LAST:event_izvadeActionPerformed

    private void poga1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poga1ActionPerformed
        setElementText("1");
    }//GEN-LAST:event_poga1ActionPerformed

    private void poga2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poga2ActionPerformed
        setElementText("2");
    }//GEN-LAST:event_poga2ActionPerformed

    private void poga3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poga3ActionPerformed
        setElementText("3");
    }//GEN-LAST:event_poga3ActionPerformed

    private void poga4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poga4ActionPerformed
        setElementText("4");
    }//GEN-LAST:event_poga4ActionPerformed

    private void poga5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poga5ActionPerformed
        setElementText("5");
    }//GEN-LAST:event_poga5ActionPerformed

    private void poga6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poga6ActionPerformed
        setElementText("6");
    }//GEN-LAST:event_poga6ActionPerformed

    private void poga7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poga7ActionPerformed
        setElementText("7");
    }//GEN-LAST:event_poga7ActionPerformed

    private void poga8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poga8ActionPerformed
        setElementText("8");
    }//GEN-LAST:event_poga8ActionPerformed

    private void poga9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poga9ActionPerformed
        setElementText("9");
    }//GEN-LAST:event_poga9ActionPerformed

    private void pogapunktsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pogapunktsActionPerformed
        setElementText(".");
    }//GEN-LAST:event_pogapunktsActionPerformed

    private void poga10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poga10ActionPerformed
        setElementText("0");
    }//GEN-LAST:event_poga10ActionPerformed

    private void pogarezultatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pogarezultatsActionPerformed
        skaitlis2 = izvade.getText();
        pakape = izvade.getText();
        double sk1 = Double.valueOf(skaitlis);
        double sk2 = Double.valueOf(skaitlis2);
        int sk3 = Integer.valueOf(pakape);
        calcfuncitions apr = new calcfuncitions();
        double result = 0.0;

        if (!parbaude) {
            switch (darbiba) {
                case "+":
                    result = apr.saskaitit(sk1, sk2);
                    break;

                case "-":
                    result = apr.atnemt(sk1, sk2);
                    break;

                case "*":
                    result = apr.reiz(sk1, sk2);
                    break;

                case "/":
                    result = apr.dal(sk1, sk2);
                    break;
                    
                case "^":
                    result = apr.kap(sk1, sk3);
                    break;

            }
            izvade.setText(String.valueOf(result));
    }//GEN-LAST:event_pogarezultatsActionPerformed
        if (parbaude) {
            izvade.setText("");
        }
        parbaude = true;
    }

    private void pogaplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pogaplusActionPerformed
        skaitlis = izvade.getText();
        darbiba = "+";
        izvDarbiba = true;
    }//GEN-LAST:event_pogaplusActionPerformed

    private void pogaminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pogaminusActionPerformed
        skaitlis = izvade.getText();
        darbiba = "-";
        izvDarbiba = true;
    }//GEN-LAST:event_pogaminusActionPerformed

    private void pogareizinatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pogareizinatActionPerformed
        skaitlis = izvade.getText();
        darbiba = "*";
        izvDarbiba = true;
    }//GEN-LAST:event_pogareizinatActionPerformed

    private void pogadalitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pogadalitActionPerformed
        skaitlis = izvade.getText();
        darbiba = "/";
        izvDarbiba = true;
    }//GEN-LAST:event_pogadalitActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        skaitlis2 = "0";
        izvade.setText("");
    }//GEN-LAST:event_btnCActionPerformed

    private void pogakapinatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pogakapinatActionPerformed
        skaitlis = izvade.getText();
        darbiba = "^";
        izvDarbiba = true;
    }//GEN-LAST:event_pogakapinatActionPerformed

    private void setElementText(String value) {
        if (parbaude) {
            if (value.equals("0")) {
                izvade.setText("");
            }
            izvade.setText("");
            parbaude = false;
        }
        if(izvDarbiba){
            izvade.setText("");
            izvDarbiba = false;
        }
        if (!parbaude) {
            if (value.equals("0") && izvade.getText().equals("")) {
                izvade.setText("");
            } else {
                value = izvade.getText() + value;
                izvade.setText(value);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnC;
    private javax.swing.JTextField izvade;
    private javax.swing.JButton poga1;
    private javax.swing.JButton poga10;
    private javax.swing.JButton poga2;
    private javax.swing.JButton poga3;
    private javax.swing.JButton poga4;
    private javax.swing.JButton poga5;
    private javax.swing.JButton poga6;
    private javax.swing.JButton poga7;
    private javax.swing.JButton poga8;
    private javax.swing.JButton poga9;
    private javax.swing.JButton pogadalit;
    private javax.swing.JButton pogakapinat;
    private javax.swing.JButton pogaminus;
    private javax.swing.JButton pogaplus;
    private javax.swing.JButton pogapunkts;
    private javax.swing.JButton pogareizinat;
    private javax.swing.JButton pogarezultats;
    // End of variables declaration//GEN-END:variables

}
