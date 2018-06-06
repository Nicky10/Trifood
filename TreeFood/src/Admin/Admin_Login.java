/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Ventanas.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class Admin_Login extends javax.swing.JFrame {

    
    Node p;
    Proceso rp = new Proceso();
    
    /**
     * Creates new form Admin_Login
     */
    public Admin_Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public String leerUsuario()
    {
        try{
            String usuario = tf_Usuario.getText().trim().replace(" ", "_");
            return usuario;
        }catch(Exception ex){
            return null;
        }
    }
    
    public String leerContraseña(){
        try{
            String contraseña = jp_Contraseña.getText().trim().replace(" ", "_");
            return contraseña;
        }catch(Exception ex){
            return null;
        }
    }
    
    public void Ingreso(Proceso rp)
    {
        for (int i = 0; i < rp.cantidadRegistro(); i++) {
            if(rp.obtenerRegistro(i).Usuario.equals(leerUsuario()) && rp.obtenerRegistro(i).Contraseña.equals(leerContraseña()))
            {
                new Admin_Options().setVisible(true);
                break;
            }
        }
    }
    
    public void mensaje(String texto){
        JOptionPane.showMessageDialog(null, texto);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Admin_Image = new javax.swing.JLabel();
        btn_Volver = new javax.swing.JButton();
        lbl_Usuario = new javax.swing.JLabel();
        tf_Usuario = new javax.swing.JTextField();
        lbl_Usuario1 = new javax.swing.JLabel();
        jp_Contraseña = new javax.swing.JPasswordField();
        btn_Continuar = new javax.swing.JButton();
        lbl_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Admin_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Admin.png"))); // NOI18N
        getContentPane().add(Admin_Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 200, 170));

        btn_Volver.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Volver.setText("Volver");
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, -1, -1));

        lbl_Usuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_Usuario.setText("Contraseña:");
        getContentPane().add(lbl_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        tf_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_UsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(tf_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 170, -1));

        lbl_Usuario1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_Usuario1.setText("Usuario:");
        getContentPane().add(lbl_Usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));
        getContentPane().add(jp_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 170, -1));

        btn_Continuar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Continuar.setText("Continuar");
        btn_Continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, -1));

        lbl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(lbl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 387, 488));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_UsuarioActionPerformed

    private void btn_ContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ContinuarActionPerformed
        
        String usu = "Nicolas", cont = "Nicolas";
        if(tf_Usuario.getText().equals(usu) && jp_Contraseña.getText().equals(cont)){
            Admin_Options ao = new Admin_Options();
            ao.setVisible(true);
        }
        else
            mensaje("Usuario y/o contraseña inválidos");
        
    }//GEN-LAST:event_btn_ContinuarActionPerformed

    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_VolverActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Admin_Image;
    private javax.swing.JButton btn_Continuar;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JPasswordField jp_Contraseña;
    private javax.swing.JLabel lbl_Fondo;
    private javax.swing.JLabel lbl_Usuario;
    private javax.swing.JLabel lbl_Usuario1;
    private javax.swing.JTextField tf_Usuario;
    // End of variables declaration//GEN-END:variables
}
