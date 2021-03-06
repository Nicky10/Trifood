package Admin;

import Otros.Limpiar_txt;
import Otros.imgTabla;
import Restaurants.Restaurant_Node;
import Restaurants.RestaurantProcess;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Restaurants_Options extends javax.swing.JFrame {

    Limpiar_txt lt = new Limpiar_txt();

    private String ruta_txt = "Restaurants.txt";

    Restaurant_Node p;
    RestaurantProcess rp = new RestaurantProcess();

    int clic_tabla;

    public Restaurants_Options() {
        cargar_txt();
        initComponents();
        listarRegistro();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btn_Guardar = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_BuscarFoto = new javax.swing.JButton();
        txtRuta = new javax.swing.JTextField();
        lblFoto = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        cb_Calificacion = new javax.swing.JComboBox<>();
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
                "Nombre", "Descripción", "Calificación", "foto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        txtDescripcion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Descripcion:");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("Calificación:");

        txtNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        txtCodigo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Codigo:");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("Foto:");

        btn_BuscarFoto.setText("Buscar foto...");
        btn_BuscarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarFotoActionPerformed(evt);
            }
        });

        txtRuta.setEditable(false);
        txtRuta.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N

        lblFoto.setBackground(new java.awt.Color(204, 255, 204));
        lblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoto.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        cb_Calificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        cb_Calificacion.setSelectedItem(5);
        cb_Calificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_CalificacionActionPerformed(evt);
            }
        });

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
                                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                            .addComponent(cb_Calificacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PanelLayout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn_BuscarFoto))
                                            .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(btn_Guardar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Modificar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_Volver)
                .addGap(38, 38, 38))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(btn_BuscarFoto))
                                .addGap(13, 13, 13)
                                .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cb_Calificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Guardar)
                    .addComponent(btn_Modificar)
                    .addComponent(btn_Eliminar)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Volver)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cargar_txt() {
        File ruta = new File(ruta_txt);
        try {
            FileReader fr = new FileReader(ruta);
            BufferedReader br = new BufferedReader(fr);

            String input = br.readLine();

            while (input != null) {
                String[] p2 = input.split(",");
                rp.agregarRegistro(new Restaurant_Node(Integer.parseInt(p2[0]), Integer.parseInt(p2[1]), p2[2], p2[3], p2[4]));
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

    public void ingresarRegistro(String ruta) {

        if (leerCodigo() == -666) {
            mensaje("Ingresar codigo entero");
        } else if ("".equals(leerNombre())) {
            mensaje("Ingresar Nombre");
        } else if ("".equals(leerDescripcion())) {
            mensaje("Ingresar Descripcion");
        } else if ("".equals(txtRuta)) {
            mensaje("Ingresar Imagen.");
        } else {
            p = new Restaurant_Node(leerCodigo(), leerCalificacion(), (String) leerDescripcion(), leerNombre(), ruta);
            if (rp.buscaId(p.getId()) != -1) {
                mensaje("Este codigo ya existe");
            } else {
                rp.agregarRegistro(p);
            }

            grabar_txt();
            listarRegistro();
            lt.limpiar_texto(Panel);
        }
    }

    public void modificarRegistro(String ruta) {
        try {
            if (leerCodigo() == -666) {
                mensaje("Ingresar codigo entero");
            } else if ("".equals(leerNombre())) {
                mensaje("Ingresar Nombre");
            } else if ("".equals(leerDescripcion())) {
                mensaje("Ingresar Descripcion");
            } else {
                int codigo = rp.buscaId(leerCodigo());
                if (txtRuta.getText().equalsIgnoreCase("")) {
                    p = new Restaurant_Node((int) leerCodigo(), leerCalificacion(), (String) leerDescripcion(), leerNombre(), leerFoto2(codigo));
                } else {
                    p = new Restaurant_Node((int) leerCodigo(), leerCalificacion(), (String) leerDescripcion(), leerNombre(), ruta);
                }

                if (codigo == -1) {
                    rp.agregarRegistro(p);
                } else {
                    rp.modificarRegistro((int) leerCodigo(), p);
                }

                grabar_txt();
                listarRegistro();
                lt.limpiar_texto(Panel);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
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
        dt.addColumn("Descripcion");
        dt.addColumn("Calificacion");
        dt.addColumn("Foto");

        tabla.setDefaultRenderer(Object.class, new imgTabla());

        Object fila[] = new Object[dt.getColumnCount()];
        for (int i = 0; i < rp.cantidadRegistro(); i++) {
            p = rp.obtenerRegistro(i);
            fila[0] = p.getNombre();
            fila[1] = p.getDetalles();
            fila[2] = p.getCalificación();
            try {
                byte[] bi = leerFoto(new File(p.getFoto()));
                BufferedImage image = null;
                InputStream in = new ByteArrayInputStream(bi);
                image = ImageIO.read(in);
                ImageIcon img = new ImageIcon(image.getScaledInstance(126, 126, 0));
                fila[3] = new JLabel(img);

            } catch (Exception e) {
                fila[3] = "No imagen";
            }

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

    public Object leerDescripcion() {
        try {
            Object descripcion = txtDescripcion.getText().trim();
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

    public String leerFoto2(int codigo) {
        p = rp.obtenerRegistro(codigo);
        try {
            return p.getFoto();
        } catch (Exception ex) {
            return null;
        }
    }

    public int leerCalificacion() {
        int number = Integer.parseInt((String) cb_Calificacion.getSelectedItem());
        return number;
    }

    public void mensaje(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

        clic_tabla = tabla.rowAtPoint(evt.getPoint());

        String nombre = "" + tabla.getValueAt(clic_tabla, 0);
        int calificacion = (int) tabla.getValueAt(clic_tabla, 2);
        Object descripcion = "" + tabla.getValueAt(clic_tabla, 1);

        txtNombre.setText(nombre);
        cb_Calificacion.setSelectedItem(calificacion);
        txtDescripcion.setText(String.valueOf(descripcion));

        try {
            JLabel lbl = (JLabel) tabla.getValueAt(clic_tabla, 3);
            lblFoto.setIcon(lbl.getIcon());
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        this.ingresarRegistro(txtRuta.getText());

    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarActionPerformed
        this.modificarRegistro(txtRuta.getText());

    }//GEN-LAST:event_btn_ModificarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        this.eliminarRegistro();

    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_BuscarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarFotoActionPerformed
        JFileChooser jf = new JFileChooser();
        FileNameExtensionFilter fil = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        jf.setFileFilter(fil);
        jf.setCurrentDirectory(new File("Fotos"));
        int el = jf.showOpenDialog(this);
        if (el == JFileChooser.APPROVE_OPTION) {
            txtRuta.setText(jf.getSelectedFile().getAbsolutePath());
            lblFoto.setIcon(new ImageIcon(txtRuta.getText()));
        }
    }//GEN-LAST:event_btn_BuscarFotoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Limpiar_txt lp = new Limpiar_txt();
        lp.limpiar_texto(Panel);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void cb_CalificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_CalificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_CalificacionActionPerformed

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
            java.util.logging.Logger.getLogger(Restaurants_Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Restaurants_Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Restaurants_Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Restaurants_Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Restaurants_Options().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton btn_BuscarFoto;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JComboBox<String> cb_Calificacion;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}
