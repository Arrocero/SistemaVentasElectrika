
package com.electrika.tech.view;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class InterManageUser extends javax.swing.JInternalFrame {
    
    public InterManageUser() {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
//            IntelliJTheme.setup( NewJFrame.class.getResourceAsStream("/com/formdev/flatlaf/intellijthemes/themes/Carbon.theme.json" ));
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(HomeView.class.getName()).log(Level.SEVERE, "Failed to initialize LaF", ex);
        }
        //</editor-fold>
        initComponents(); 
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        txtApellido = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtContra = new javax.swing.JTextField();
        jComboCargo = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        registerEntryExit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableUsers = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnAceptarAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAceptarEditar = new javax.swing.JButton();
        btnAceptarEliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        txtFecha = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnGuardarEntryExit = new javax.swing.JButton();
        jFechaIngreso = new javax.swing.JFormattedTextField();
        jFechaSalida = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboValores1 = new javax.swing.JComboBox<>();
        btnAscendente = new javax.swing.JRadioButton();
        btnDescendente = new javax.swing.JRadioButton();
        btnOrdenar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        informe = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Gestionar Usuarios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        txtId.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtId.setEnabled(false);
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 50, 30));

        btnEliminar.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setFocusPainted(false);
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 480, 100, 30));

        txtNombre.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNombre.setEnabled(false);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 200, 160, 30));
//         txtNombre.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 txtNombreActionPerformed(evt);
//             }
//         });


        btnEditar.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setFocusPainted(false);
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 480, 100, 30));

        txtApellido.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtApellido.setEnabled(false);
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 200, 160, 30));

        txtUsuario.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtUsuario.setEnabled(false);
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 260, 160, 30));

        txtContra.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtContra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtContra.setEnabled(false);
        jPanel1.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 260, 160, 30));

        jComboCargo.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jComboCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vendedor", "Administrador", "Jefe", "Técnico" }));
        jComboCargo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboCargo.setEnabled(false);
        jComboCargo.setFocusable(false);
        jPanel1.add(jComboCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 320, 160, 30));

        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informacion.png"))); // NOI18N
        btnBuscar.setEnabled(false);
        btnBuscar.setFocusPainted(false);
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 110, 60, 60));

        btnAgregar.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setFocusPainted(false);
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 480, 100, 30));

        registerEntryExit.setBackground(new java.awt.Color(0, 0, 0));
        registerEntryExit.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        registerEntryExit.setForeground(new java.awt.Color(255, 255, 255));
        registerEntryExit.setText("Registrar Ingreso/Salida");
        registerEntryExit.setBorder(null);
        jPanel1.add(registerEntryExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 430, 190, 30));

        tableUsers.setAutoCreateRowSorter(true);
        tableUsers.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        tableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableUsers.setDragEnabled(true);
        jScrollPane2.setViewportView(tableUsers);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 630, 370));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendedor1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, -1, -1));

        btnAceptarAgregar.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnAceptarAgregar.setForeground(new java.awt.Color(51, 51, 51));
        btnAceptarAgregar.setText("Aceptar");
        btnAceptarAgregar.setEnabled(false);
        jPanel1.add(btnAceptarAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, 100, -1));

        btnCancelar.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(51, 51, 51));
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 370, 100, 30));

        btnAceptarEditar.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnAceptarEditar.setForeground(new java.awt.Color(51, 51, 51));
        btnAceptarEditar.setText("Aceptar");
        btnAceptarEditar.setEnabled(false);
        jPanel1.add(btnAceptarEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, 100, -1));

        btnAceptarEliminar.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnAceptarEliminar.setForeground(new java.awt.Color(51, 51, 51));
        btnAceptarEliminar.setText("Aceptar");
        btnAceptarEliminar.setEnabled(false);
        jPanel1.add(btnAceptarEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, 100, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 570, 10));

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 30, 50, 510));

        txtFecha.setEditable(false);
        txtFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFecha.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 30, 180, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingreso:");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Salida:");

        btnGuardarEntryExit.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnGuardarEntryExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/disquete.png"))); // NOI18N
        btnGuardarEntryExit.setText("Guardar");
        btnGuardarEntryExit.setEnabled(false);
        btnGuardarEntryExit.setFocusPainted(false);

        try {
            jFechaIngreso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFechaIngreso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFechaIngreso.setEnabled(false);

        try {
            jFechaSalida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFechaSalida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFechaSalida.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("yyyy-mm-dd");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnGuardarEntryExit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jFechaIngreso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(jFechaSalida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))
                        .addGap(73, 73, 73))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGuardarEntryExit)
                .addGap(30, 30, 30))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 80, 380, 220));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        jLabel12.setText("Registrar Ingreso y Salida");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 30, -1, 40));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel6.setText("Ordenar Tabla de Usuarios");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 330, -1, -1));

        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel7.setText("Tienes que elegir el valor que deseas ordenar");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 360, -1, -1));

        jComboValores1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir valor" }));
        jPanel1.add(jComboValores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 400, 170, -1));

        buttonGroup1.add(btnAscendente);
        btnAscendente.setSelected(true);
        btnAscendente.setText("Ascendente");
        btnAscendente.setBorder(null);
        jPanel1.add(btnAscendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 440, -1, -1));

        buttonGroup1.add(btnDescendente);
        btnDescendente.setText("Descendente");
        btnDescendente.setBorder(null);
        jPanel1.add(btnDescendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 440, -1, -1));

        btnOrdenar.setText("Ordenar");
        jPanel1.add(btnOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 470, -1, -1));

        informe.setEditable(false);
        informe.setColumns(20);
        informe.setRows(5);
        informe.setEnabled(false);
        jScrollPane1.setViewportView(informe);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, 630, 110));

        jLabel8.setText("Detalles");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, -1, -1));

        jLabel9.setText("Id");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 110, -1, -1));

        jLabel10.setText("Nombre");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, -1, -1));

        jLabel11.setText("Apellido");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 180, -1, -1));

        jLabel13.setText("Usuario");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 240, -1, -1));

        jLabel14.setText("Contraseña");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 240, -1, -1));

        jLabel15.setText("Cargo");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1843, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptarAgregar;
    public javax.swing.JButton btnAceptarEditar;
    public javax.swing.JButton btnAceptarEliminar;
    public javax.swing.JButton btnAgregar;
    public javax.swing.JRadioButton btnAscendente;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnCancelar;
    public javax.swing.JRadioButton btnDescendente;
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGuardarEntryExit;
    public javax.swing.JButton btnOrdenar;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JTextArea informe;
    public javax.swing.JComboBox<String> jComboCargo;
    public javax.swing.JComboBox<String> jComboValores1;
    public javax.swing.JFormattedTextField jFechaIngreso;
    public javax.swing.JFormattedTextField jFechaSalida;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator6;
    public javax.swing.JButton registerEntryExit;
    public javax.swing.JTable tableUsers;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtContra;
    public javax.swing.JTextField txtFecha;
    public javax.swing.JTextField txtId;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
