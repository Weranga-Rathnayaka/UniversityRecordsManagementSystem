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
 * @author nilakshi
 */
public class ChangeAdminPass2 extends javax.swing.JFrame {

    /**
     * Creates new form ChangePass2
     */
    public ChangeAdminPass2() {
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

        txtid = new javax.swing.JTextField();
        renewp = new javax.swing.JPasswordField();
        newp = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Change Admin Password");
        setMinimumSize(new java.awt.Dimension(450, 435));
        setResizable(false);
        getContentPane().setLayout(null);

        txtid.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // NOI18N
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid);
        txtid.setBounds(290, 100, 143, 34);

        renewp.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // NOI18N
        renewp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renewpActionPerformed(evt);
            }
        });
        getContentPane().add(renewp);
        renewp.setBounds(290, 200, 143, 34);

        newp.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // NOI18N
        newp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpActionPerformed(evt);
            }
        });
        getContentPane().add(newp);
        newp.setBounds(290, 150, 143, 34);

        jButton3.setBackground(new java.awt.Color(255, 102, 0));
        jButton3.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // NOI18N
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(340, 340, 81, 37);

        jButton2.setBackground(new java.awt.Color(255, 102, 0));
        jButton2.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 340, 75, 37);

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // NOI18N
        jButton1.setText("Change Password");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(130, 280, 183, 37);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Password Change");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(110, 0, 220, 100);

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("Re-enter New Password :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 210, 218, 28);

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("Enter New Password :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 150, 196, 26);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Enter ID :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 110, 196, 22);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -10, 0, 420);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg3.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -10, 500, 430);

        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(310, 170, 41, 16);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this,"Thank You For Using" + "\n"
                                        + "Good Bye" + "\n");
                                       
         System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new AdminHomePage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String id = txtid.getText();
        String npass = newp.getText();
        String rnpass = renewp.getText();
        if(id.isEmpty()||npass.isEmpty()||rnpass.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please fill all the Entries","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            try{
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin",
                "root",
                "");
            Statement stmt = con.createStatement();

            String query = "Select * from adminlogin where ID = '"  +id+ "'";

            ResultSet rs = stmt.executeQuery(query);

            if (rs.next())
            {
                if (npass.equals(rnpass))
                {
                    String update = "update adminlogin set Password = '" +npass+ "' where ID = '" +id+ "'";
                    stmt.executeUpdate(update);
                    JOptionPane.showMessageDialog(this, "Password Changed Successfully");
                    new AdminHomePage().setVisible(true);
                    this.dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Password did not match","Error",JOptionPane.ERROR_MESSAGE);
                    newp.setText("");
                    renewp.setText("");
                }
            }
            else
            {
               JOptionPane.showMessageDialog(this,"id not found","Error",JOptionPane.ERROR_MESSAGE); 
            }
            }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this, e,"Error",JOptionPane.ERROR_MESSAGE);}
        }    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void renewpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renewpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_renewpActionPerformed

    private void newpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newpActionPerformed

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
            java.util.logging.Logger.getLogger(ChangeAdminPass2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeAdminPass2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeAdminPass2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeAdminPass2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeAdminPass2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField newp;
    private javax.swing.JPasswordField renewp;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
