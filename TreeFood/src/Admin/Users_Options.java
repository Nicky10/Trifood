package Admin;

import Otros.Limpiar_txt;
import Otros.imgTabla;
import Users.UsersNode;
import Users.UsersProcess;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Users_Options extends javax.swing.JFrame {

    Limpiar_txt lt = new Limpiar_txt();

    private String ruta_txt = "Users.txt";

    UsersNode p;
    UsersProcess rp = new UsersProcess();

    int clic_tabla;

    public Users_Options() {
        cargar_txt();
        initComponents();
        listarRegistro();
        this.setLocationRelativeTo(null);
    }

    public void cargar_txt() {
        File ruta = new File(ruta_txt);
        try {
            FileReader fr = new FileReader(ruta);
            BufferedReader br = new BufferedReader(fr);

            String input = br.readLine();

            while (input != null) {
                String[] p2 = input.split(",");
                rp.agregarRegistro(new UsersNode(Integer.parseInt(p2[0]), p2[1], p2[2], p2[3], p2[4]));
                input = br.readLine();
            }

            br.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void grabar_txt() {
        try {
            FileWriter file = new FileWriter(ruta_txt);
            BufferedWriter bw = new BufferedWriter(file);

            for (int i = 0; i < rp.cantidadRegistro(); i++) {
                bw.write(rp.obtenerRegistro(i).toString());
            }

            bw.flush();
            bw.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void ingresarRegistro() {
        try {
            if (leerCodigo() == -666) {
                mensaje("Ingresar codigo entero");
            } else if ("".equals(leerNombre())) {
                mensaje("Ingresar Nombre");
            } else if (leerApellido() == "") {
                mensaje("Ingresar Apellido");
            } else if ("".equals(leerUsuario())) {
                mensaje("Ingresar Usuario");
            } else if ("".equals(leerContraseña())) {
                mensaje("Ingresar Contraseña");
            } else {
                p = new UsersNode((int) leerCodigo(), "" + leerNombre(), "" + leerApellido(), "" + leerUsuario(), "" + leerContraseña());
                if (rp.buscaId(p.getId()) != -1) {
                    mensaje("Este codigo ya existe");
                } else {
                    rp.agregarRegistro(p);
                }

                grabar_txt();
                listarRegistro();
                lt.limpiar_texto(Panel);
            }
        } catch (Exception ex) {
            mensaje(ex.getMessage());
        }
    }

    public void modificarRegistro() {
        try {
            if (leerCodigo() == -666) {
                mensaje("Ingresar codigo entero");
            } else if (leerNombre() == null) {
                mensaje("Ingresar Nombre");
            } else if (leerApellido() == null) {
                mensaje("Ingresar Apellido");
            } else if (leerUsuario() == null) {
                mensaje("Ingresar Usuario");
            } else if (leerContraseña() == null) {
                mensaje("Ingresar Descripcion");
            } else {
                int codigo = rp.buscaId(leerCodigo());
                p = new UsersNode(leerCodigo(), leerNombre(), "" + leerApellido(), (String) leerUsuario(), "" + leerContraseña());

                if (codigo == -1) {
                    rp.agregarRegistro(p);
                } else {
                    rp.modificarRegistro(codigo, p);
                }

                grabar_txt();
                listarRegistro();
                lt.limpiar_texto(Panel);
            }
        } catch (Exception ex) {
            mensaje(ex.getMessage());
        }
    }

    public void eliminarRegistro() {
        try {
            if (leerCodigo() == -666) {
                mensaje("Ingrese codigo entero");
            } else {
                int codigo = rp.buscaId(leerCodigo());
                if (codigo == -1) {
                    mensaje("codigo no existe");
                } else {
                    int s = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar este producto", "Si/No", 0);
                    if (s == 0) {
                        rp.eliminarRegistro(codigo);

                        grabar_txt();
                        listarRegistro();
                        lt.limpiar_texto(Panel);
                    }
                }

            }
        } catch (Exception ex) {
            mensaje(ex.getMessage());
        }
    }

    public void listarRegistro() {
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        dt.addColumn("Nombre");
        dt.addColumn("Apellido");
        dt.addColumn("Usuario");
        dt.addColumn("Contraseña");

        tabla.setDefaultRenderer(Object.class, new imgTabla());

        Object fila[] = new Object[dt.getColumnCount()];
        for (int i = 0; i < rp.cantidadRegistro(); i++) {
            p = rp.obtenerRegistro(i);
            fila[0] = p.getNombre();
            fila[1] = p.getApellido();
            fila[2] = p.getUsuario();
            fila[3] = p.getContraseña();
            dt.addRow(fila);
        }
        tabla.setModel(dt);
        tabla.setRowHeight(60);
    }

    public int leerCodigo() {
        try {
            int codigo = Integer.parseInt(txtCodigo.getText().trim());
            return codigo;
        } catch (Exception ex) {
            return -666;
        }
    }

    public String leerNombre() {
        try {
            String nombre = txtNombre.getText().trim().replace(" ", "_");
            return nombre;
        } catch (Exception ex) {
            return null;
        }
    }

    public String leerContraseña() {
        try {
            String contraseña = txtContraseña.getText().trim().replace(" ", "_");
            return contraseña;
        } catch (Exception ex) {
            return null;
        }
    }

    public Object leerApellido() {
        try {
            Object descripcion = txtApellido.getText().trim();
            return descripcion;
        } catch (Exception ex) {
            return null;
        }
    }

    public byte[] leerFoto(File ruta) {
        try {
            byte[] icono = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(icono);
            return icono;
        } catch (Exception ex) {
            return null;
        }
    }

    public String leerUsuario() {
        String number = txtUsuario.getText().trim();
        return number;
    }

    public void mensaje(String texto) {
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

        Panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btn_Guardar = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        txtContraseña = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_Volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(204, 204, 255));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Usuario", "Contraseña"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        btn_Guardar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btn_Guardar.setText("Guardar");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });

        btn_Modificar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btn_Modificar.setText("Modificar");
        btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarActionPerformed(evt);
            }
        });

        btn_Eliminar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        txtUsuario.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("Apellido:");

        txtApellido.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        txtNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        txtCodigo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Codigo:");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txtContraseña.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("Contraseña:");

        btn_Volver.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btn_Volver.setText("Volver");
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel4)))
                                .addGap(42, 42, 42)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                    .addComponent(txtApellido)
                                    .addComponent(txtUsuario))
                                .addGap(28, 28, 28)
                                .addComponent(jLabel6)
                                .addGap(8, 8, 8)
                                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(btn_Guardar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Modificar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Eliminar)
                        .addGap(107, 107, 107)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_Volver)
                .addGap(22, 22, 22))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_Guardar)
                        .addComponent(btn_Modificar)
                        .addComponent(btn_Eliminar)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Volver)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

        clic_tabla = tabla.rowAtPoint(evt.getPoint());

        String nombre = "" + tabla.getValueAt(clic_tabla, 0);
        String usuario = "" + tabla.getValueAt(clic_tabla, 2);
        String apellido = "" + tabla.getValueAt(clic_tabla, 1);
        String contraseña = "" + tabla.getValueAt(clic_tabla, 3);

        txtNombre.setText(nombre);
        txtUsuario.setText(usuario);
        txtApellido.setText(apellido);
        txtContraseña.setText(contraseña);

    }//GEN-LAST:event_tablaMouseClicked

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed

        this.ingresarRegistro();

    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarActionPerformed

        this.modificarRegistro();

    }//GEN-LAST:event_btn_ModificarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        this.eliminarRegistro();

    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Limpiar_txt lp = new Limpiar_txt();
        lp.limpiar_texto(Panel);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Users_Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Users_Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Users_Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Users_Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Users_Options().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
