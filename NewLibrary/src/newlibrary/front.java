/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newlibrary;

/**
 *
 * @author USER
 */
public class front extends javax.swing.JFrame {

    /**
     * Creates new form front
     */
    public front() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        front_panel_side = new javax.swing.JPanel();
        front_wel1 = new javax.swing.JLabel();
        front_wel2 = new javax.swing.JLabel();
        front_contact_button = new javax.swing.JButton();
        front_wel3 = new javax.swing.JLabel();
        front_about_button = new javax.swing.JButton();
        front_panel_below = new javax.swing.JPanel();
        front_email_label = new javax.swing.JLabel();
        front_email_text = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        front_pass_label = new javax.swing.JLabel();
        front_pass_text = new javax.swing.JPasswordField();
        front_signin_button = new javax.swing.JButton();
        front_signup_button = new javax.swing.JButton();
        front_img = new javax.swing.JLabel();
        front_panel_top = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        front_admin_button = new javax.swing.JButton();
        front_user_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        front_panel_side.setBackground(new java.awt.Color(51, 51, 51));
        front_panel_side.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        front_wel1.setBackground(new java.awt.Color(51, 51, 51));
        front_wel1.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        front_wel1.setForeground(new java.awt.Color(255, 255, 255));
        front_wel1.setText("Welcome To");
        front_panel_side.add(front_wel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        front_wel2.setBackground(new java.awt.Color(51, 51, 51));
        front_wel2.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        front_wel2.setForeground(new java.awt.Color(255, 255, 255));
        front_wel2.setText("Our");
        front_panel_side.add(front_wel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        front_contact_button.setBackground(new java.awt.Color(255, 255, 255));
        front_contact_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        front_contact_button.setText("Contact Us");
        front_contact_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                front_contact_buttonActionPerformed(evt);
            }
        });
        front_panel_side.add(front_contact_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, -1));

        front_wel3.setBackground(new java.awt.Color(51, 51, 51));
        front_wel3.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        front_wel3.setForeground(new java.awt.Color(255, 255, 255));
        front_wel3.setText("Library");
        front_panel_side.add(front_wel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        front_about_button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        front_about_button.setText("About Us");
        front_panel_side.add(front_about_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 90, -1));

        front_panel_below.setBackground(new java.awt.Color(255, 255, 255));
        front_panel_below.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        front_email_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        front_email_label.setText("Email:");
        front_panel_below.add(front_email_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 60, 30));

        front_email_text.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        front_email_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                front_email_textActionPerformed(evt);
            }
        });
        front_panel_below.add(front_email_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 276, -1));

        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        front_panel_below.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 276, 20));

        front_pass_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        front_pass_label.setText("Password:");
        front_panel_below.add(front_pass_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        front_pass_text.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        front_pass_text.setText("Password");
        front_panel_below.add(front_pass_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 270, -1));

        front_signin_button.setBackground(new java.awt.Color(51, 51, 255));
        front_signin_button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        front_signin_button.setForeground(new java.awt.Color(204, 204, 255));
        front_signin_button.setText("Sign In");
        front_panel_below.add(front_signin_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        front_signup_button.setBackground(new java.awt.Color(51, 51, 255));
        front_signup_button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        front_signup_button.setForeground(new java.awt.Color(204, 204, 255));
        front_signup_button.setText("Sign Up");
        front_panel_below.add(front_signup_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, -1, -1));

        front_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newlibrary/signup-library-icon.png"))); // NOI18N
        front_img.setText("jLabel6");
        front_panel_below.add(front_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 770, 640));

        front_panel_top.setBackground(new java.awt.Color(157, 157, 213));
        front_panel_top.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Book Destiny");
        front_panel_top.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        front_admin_button.setBackground(new java.awt.Color(0, 51, 255));
        front_admin_button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        front_admin_button.setForeground(new java.awt.Color(255, 255, 255));
        front_admin_button.setText("Admin");
        front_admin_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                front_admin_buttonActionPerformed(evt);
            }
        });
        front_panel_top.add(front_admin_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 80, 30));

        front_panel_below.add(front_panel_top, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1140, 80));

        front_user_label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        front_user_label.setText("User");
        front_panel_below.add(front_user_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(front_panel_side, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(front_panel_below, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(front_panel_side, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(front_panel_below, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void front_admin_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_front_admin_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_front_admin_buttonActionPerformed

    private void front_email_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_front_email_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_front_email_textActionPerformed

    private void front_contact_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_front_contact_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_front_contact_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new front().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton front_about_button;
    private javax.swing.JButton front_admin_button;
    private javax.swing.JButton front_contact_button;
    private javax.swing.JLabel front_email_label;
    private javax.swing.JTextField front_email_text;
    private javax.swing.JLabel front_img;
    private javax.swing.JPanel front_panel_below;
    private javax.swing.JPanel front_panel_side;
    private javax.swing.JPanel front_panel_top;
    private javax.swing.JLabel front_pass_label;
    private javax.swing.JPasswordField front_pass_text;
    private javax.swing.JButton front_signin_button;
    private javax.swing.JButton front_signup_button;
    private javax.swing.JLabel front_user_label;
    private javax.swing.JLabel front_wel1;
    private javax.swing.JLabel front_wel2;
    private javax.swing.JLabel front_wel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}