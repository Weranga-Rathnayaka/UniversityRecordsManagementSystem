/*NIBM EAD CW2 Group Project*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;
import java.sql.*;

import javax.swing.JOptionPane;
/**
 *
 * @author chanaka
 */
public class AdminLogin extends javax.swing.JFrame {
    String id1;
    /**
     * Creates new form AdminLogin
     */
    public AdminLogin() {
        initComponents();
    }
    public AdminLogin(String id) throws Exception
    {
     initComponents(); 
     id1 = id;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        StrID = new javax.swing.JTextField();
        StrPass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        StrAdp = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Login");
        setLocation(new java.awt.Point(700, 300));
        setMinimumSize(new java.awt.Dimension(560, 555));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jLabel1.setText("Enter ID :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 160, 190, 33);

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jLabel2.setText("Enter Password :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 210, 190, 34);

        StrID.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        StrID.setForeground(new java.awt.Color(153, 153, 153));
        StrID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StrIDMouseClicked(evt);
            }
        });
        StrID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StrIDActionPerformed(evt);
            }
        });
        getContentPane().add(StrID);
        StrID.setBounds(200, 160, 290, 40);

        StrPass.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        getContentPane().add(StrPass);
        StrPass.setBounds(200, 210, 290, 40);

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 310, 140, 50);

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jButton2.setText("Forgot Password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(280, 380, 141, 20);

        jButton3.setBackground(new java.awt.Color(255, 102, 0));
        jButton3.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(400, 440, 110, 37);

        jButton5.setBackground(new java.awt.Color(0, 204, 204));
        jButton5.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jButton5.setText("SignUp");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(350, 310, 140, 50);

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jLabel6.setText("Admin Password :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 260, 180, 40);

        StrAdp.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        StrAdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StrAdpActionPerformed(evt);
            }
        });
        getContentPane().add(StrAdp);
        StrAdp.setBounds(200, 260, 290, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Admin Login");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 10, 270, 90);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img2.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -10, 570, 550);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        id1 = StrID.getText(); //CAPS are not cared
        String pass = StrPass.getText();
        String adpass = StrAdp.getText(); //Admin Password will have no appearance
        if(adpass.equals("1234"))
        {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin",
                                                         "root",
                                                         "");
            
            Statement stmt = con.createStatement();
            
            String query = "Select * from adminlogin where ID = '" +id1+ "' and Password = '" +pass+ "'";
            
            ResultSet rs = stmt.executeQuery(query);
            
            if(rs.next())
            {
                new AdminHomePage().setVisible(true);
                this.dispose();
            }
                else
                JOptionPane.showMessageDialog(this, "Incorrect ID/Password");
                 
            StrID.setText("");
            StrPass.setText("");
        }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this,e);}
        
        }
        else
                {
                 JOptionPane.showMessageDialog(this, "Incorrect Admin Password"); 
                 
                }
        StrID.setText("");
        StrPass.setText("");
        StrAdp.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                 JOptionPane.showMessageDialog(this,"Thank You For Using" + "\n"
                                        + "Good Bye" + "\n");
                                        
         System.exit(0);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new ForgotPass().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new AdminSignUp().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void StrAdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StrAdpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StrAdpActionPerformed

    private void StrIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StrIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StrIDActionPerformed

    private void StrIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StrIDMouseClicked
                       // TODO add your handling code here:
            
    }//GEN-LAST:event_StrIDMouseClicked

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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField StrAdp;
    private javax.swing.JTextField StrID;
    private javax.swing.JPasswordField StrPass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
