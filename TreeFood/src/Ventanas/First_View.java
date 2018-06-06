/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 * @author ADMIN
 */
public class First_View extends javax.swing.JFrame {

    /**
     * Creates new form First_View
     */
    public First_View() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TriFood_image = new javax.swing.JLabel();
        btn_Usuario = new javax.swing.JButton();
        btn_Registro = new javax.swing.JButton();
        btn_Admin = new javax.swing.JButton();
        lbl_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(387, 488));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TriFood_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Trifood logo.jpg"))); // NOI18N
        getContentPane().add(TriFood_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 190, 170));

        btn_Usuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Usuario.setText("Usuario");
        btn_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 100, -1));

        btn_Registro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Registro.setText("Registrarse");
        getContentPane().add(btn_Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 120, -1));

        btn_Admin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Admin.setText("Admin");
        btn_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdminActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 100, -1));

        lbl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(lbl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 387, 488));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UsuarioActionPerformed
        
        new Users.User_Login().setVisible(true);
        
    }//GEN-LAST:event_btn_UsuarioActionPerformed

    private void btn_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdminActionPerformed
        
        new Admin.Admin_Login().setVisible(true);
        
    }//GEN-LAST:event_btn_AdminActionPerformed

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
            java.util.logging.Logger.getLogger(First_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(First_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(First_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(First_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new First_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TriFood_image;
    private javax.swing.JButton btn_Admin;
    private javax.swing.JButton btn_Registro;
    private javax.swing.JButton btn_Usuario;
    private javax.swing.JLabel lbl_Fondo;
    // End of variables declaration//GEN-END:variables
}
