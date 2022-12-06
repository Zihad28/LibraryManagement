
package newlibrary;

public class signup extends javax.swing.JFrame {

    public signup() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signup_panel1 = new javax.swing.JPanel();
        signup_sign_label = new javax.swing.JLabel();
        signup_username_text = new javax.swing.JTextField();
        signup_mail_text = new javax.swing.JTextField();
        signup_male_button = new javax.swing.JRadioButton();
        signup_female_button = new javax.swing.JRadioButton();
        signup_contact_text = new javax.swing.JTextField();
        signup_passfield = new javax.swing.JPasswordField();
        signup_reg_button = new javax.swing.JButton();
        signup_address_txt = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        signup_cnfmpass_field = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        signup_panel1.setBackground(new java.awt.Color(153, 153, 255));
        signup_panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signup_sign_label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        signup_sign_label.setForeground(new java.awt.Color(255, 255, 255));
        signup_sign_label.setText("Sign Up");
        signup_panel1.add(signup_sign_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        signup_username_text.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        signup_username_text.setText("Enter Username..");
        signup_username_text.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        signup_panel1.add(signup_username_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 310, -1));

        signup_mail_text.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        signup_mail_text.setText("Enter Email..");
        signup_mail_text.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        signup_panel1.add(signup_mail_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 310, -1));

        signup_male_button.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        signup_male_button.setText("Male");
        signup_male_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_male_buttonActionPerformed(evt);
            }
        });
        signup_panel1.add(signup_male_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        signup_female_button.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        signup_female_button.setText("Female");
        signup_panel1.add(signup_female_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        signup_contact_text.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        signup_contact_text.setText("Contact No..");
        signup_contact_text.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        signup_contact_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_contact_textActionPerformed(evt);
            }
        });
        signup_panel1.add(signup_contact_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 310, -1));

        signup_passfield.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        signup_passfield.setText("Password..");
        signup_passfield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        signup_passfield.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        signup_passfield.setDragEnabled(true);
        signup_passfield.setEchoChar('\u0000');
        signup_passfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_passfieldActionPerformed(evt);
            }
        });
        signup_panel1.add(signup_passfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 310, -1));

        signup_reg_button.setBackground(new java.awt.Color(102, 0, 255));
        signup_reg_button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        signup_reg_button.setForeground(new java.awt.Color(255, 255, 255));
        signup_reg_button.setText("Register");
        signup_panel1.add(signup_reg_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, -1, -1));

        signup_address_txt.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        signup_address_txt.setText("Address..");
        signup_panel1.add(signup_address_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 310, 30));

        jComboBox1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Department of", "Computer Science & Engineering", "Electrical & Electronics Engineering", "Mechanical Engineering", "Civil Engineering", "Electronics & Telecommunication Engineering", "Biomedical Engineering", "Mechatronics & Industrial Engineering", "Petroleum & Mining Engineering", "Material Science & Engineering", "Water Research & Engineering", "Architecture" }));
        signup_panel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 310, -1));

        signup_cnfmpass_field.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        signup_cnfmpass_field.setText("Confirm Password..");
        signup_cnfmpass_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        signup_cnfmpass_field.setEchoChar('\u0000');
        signup_cnfmpass_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_cnfmpass_fieldActionPerformed(evt);
            }
        });
        signup_panel1.add(signup_cnfmpass_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 310, 20));

        jTextField1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTextField1.setText("Student ID..");
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        signup_panel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 310, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signup_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(signup_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signup_male_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_male_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signup_male_buttonActionPerformed

    private void signup_passfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_passfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signup_passfieldActionPerformed

    private void signup_cnfmpass_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_cnfmpass_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signup_cnfmpass_fieldActionPerformed

    private void signup_contact_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_contact_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signup_contact_textActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField signup_address_txt;
    private javax.swing.JPasswordField signup_cnfmpass_field;
    private javax.swing.JTextField signup_contact_text;
    private javax.swing.JRadioButton signup_female_button;
    private javax.swing.JTextField signup_mail_text;
    private javax.swing.JRadioButton signup_male_button;
    private javax.swing.JPanel signup_panel1;
    private javax.swing.JPasswordField signup_passfield;
    private javax.swing.JButton signup_reg_button;
    private javax.swing.JLabel signup_sign_label;
    private javax.swing.JTextField signup_username_text;
    // End of variables declaration//GEN-END:variables
}
