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
public class Busqueda extends javax.swing.JFrame {

    /**
     * Creates new form Food_Options
     */
    public Busqueda() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_Precio = new javax.swing.JRadioButton();
        btn_Calificacion = new javax.swing.JRadioButton();
        btn_Recomendado = new javax.swing.JRadioButton();
        btn_Nombre = new javax.swing.JRadioButton();
        btn_Volver = new javax.swing.JButton();
        btn_Continuar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jButton1.setText("Restaurante");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 150, 30));

        jButton2.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jButton2.setText("Comida");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 120, 30));

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar por:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 130, 20));

        btn_Precio.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_Precio.setText("Precio");
        getContentPane().add(btn_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 140, 30));

        btn_Calificacion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_Calificacion.setText("Calificación");
        getContentPane().add(btn_Calificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 140, 30));

        btn_Recomendado.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_Recomendado.setText("Recomendado");
        getContentPane().add(btn_Recomendado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 140, 30));

        btn_Nombre.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_Nombre.setText("Nombre");
        getContentPane().add(btn_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 140, 30));

        btn_Volver.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        btn_Volver.setText("Volver");
        getContentPane().add(btn_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 120, 30));

        btn_Continuar.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        btn_Continuar.setText("Continuar");
        getContentPane().add(btn_Continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 120, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mujerpensando.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 250, 250));

        jLabel3.setFont(new java.awt.Font("Adobe Naskh Medium", 1, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Busqueda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btn_Calificacion;
    private javax.swing.JButton btn_Continuar;
    private javax.swing.JRadioButton btn_Nombre;
    private javax.swing.JRadioButton btn_Precio;
    private javax.swing.JRadioButton btn_Recomendado;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
