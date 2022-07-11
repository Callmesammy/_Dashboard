
package javaapplication44;

import components.PublicEvent;


public class Panel_Login extends javax.swing.JPanel {

  
    public Panel_Login() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ibname = new javax.swing.JLabel();
        ibtitle = new javax.swing.JTextField();
        ibpassword = new javax.swing.JLabel();
        ibpasstitle = new javax.swing.JPasswordField();
        ibregister = new javax.swing.JButton();
        iblogin = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");

        ibname.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        ibname.setText("UserName:");

        ibtitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ibtitleActionPerformed(evt);
            }
        });

        ibpassword.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        ibpassword.setText("Password:");

        ibregister.setBackground(new java.awt.Color(92, 221, 255));
        ibregister.setForeground(new java.awt.Color(51, 206, 253));
        ibregister.setText("Register");
        ibregister.setContentAreaFilled(false);
        ibregister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ibregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ibregisterActionPerformed(evt);
            }
        });

        iblogin.setText("LOGIN");
        iblogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ibloginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ibregister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iblogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ibtitle)
                            .addComponent(ibpasstitle)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ibpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ibname, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 30, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(ibname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ibtitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ibpassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ibpasstitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(iblogin)
                .addGap(18, 18, 18)
                .addComponent(ibregister)
                .addGap(52, 52, 52))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ibtitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ibtitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ibtitleActionPerformed

    private void ibregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ibregisterActionPerformed
    PublicEvent.install().getEventLogin().GoRegister();
    }//GEN-LAST:event_ibregisterActionPerformed

    private void ibloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ibloginActionPerformed
    PublicEvent.install().getEventLogin().Login();
    }//GEN-LAST:event_ibloginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton iblogin;
    private javax.swing.JLabel ibname;
    private javax.swing.JPasswordField ibpasstitle;
    private javax.swing.JLabel ibpassword;
    private javax.swing.JButton ibregister;
    private javax.swing.JTextField ibtitle;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
