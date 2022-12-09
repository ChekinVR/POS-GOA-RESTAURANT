/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Login.Login;
import Modelo.Config;
import Modelo.DetallePedido;
import Modelo.Eventos;
import Modelo.LoginDao;
import Modelo.Pedidos;
import Modelo.PedidosDao;
import Modelo.Platos;
import Modelo.PlatosDao;
import Modelo.Salas;
import Modelo.SalasDao;
import Modelo.Tables;
import Modelo.login;
import com.mysql.cj.log.Log;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public final class SistemaSave extends javax.swing.JFrame {

    Salas sl = new Salas();
    SalasDao slDao = new SalasDao();
    Config conf = new Config();
    Eventos event = new Eventos();

    Platos pla = new Platos();
    PlatosDao plaDao = new PlatosDao();

    Pedidos ped = new Pedidos();
    PedidosDao pedDao = new PedidosDao();
    DetallePedido detPedido = new DetallePedido();

    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel tmp = new DefaultTableModel();

    LoginDao lgDao = new LoginDao();
    int item;
    double Totalpagar = 0.00;

    Date fechaActual = new Date();
    String fechaFormato = new SimpleDateFormat("yyyy-MM-dd").format(fechaActual);

    public SistemaSave(login priv) {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        ImageIcon img = new ImageIcon(getClass().getResource("/Img/Home2.png"));
        Image igmEscalada = img.getImage().getScaledInstance(labelLogo.getWidth(), labelLogo.getHeight(), Image.SCALE_SMOOTH);
        Icon icono = new ImageIcon(igmEscalada);
        labelLogo.setIcon(icono);
        ImageIcon img2 = new ImageIcon(getClass().getResource("/Img/logo.png"));
        this.setIconImage(img2.getImage());
        this.setLocationRelativeTo(null);
        txtIdHistorialPedido.setVisible(false);
        txtIdConfig.setVisible(false);
        if (priv.getRol().equals("Mesero")) {
            btnSala.setEnabled(false);
            btnConfig.setEnabled(false);
            btnPlatos.setEnabled(false);
            btnUsuarios.setEnabled(false);
            btnUsuarios.setVisible(false);
            btnPlatos.setVisible(false);
            btnConfig.setVisible(false);
            btnSala.setVisible(false);
            LabelVendedor.setText(priv.getNombre());
            txtRolUser.setText(priv.getRol());
            btnElimPlati.setVisible(false);
            btnDescuento.setVisible(false);
            
        } else {
            LabelVendedor.setText(priv.getNombre());
            txtRolUser.setText(priv.getRol());
        }
        
        LabelConection.setText("jdbc:mysql://localhost:3306/restaurant_goa");
        txtIdConfig.setVisible(false);
        txtIdHistorialPedido.setVisible(false);
        txtIdPedido.setVisible(false);
        txtIdPlato.setVisible(false);
        txtIdSala.setVisible(false);
        txtTempIdSala.setVisible(false);
        txtHId.setVisible(false);
        txtTempNumMesa.setVisible(false);
        jTabbedPane1.setEnabled(false);
        txtTempCateg.setVisible(false);
        txtIdPlat.setVisible(false);
        txtRolUser.setVisible(false);
        panelSalas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        btnSala = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnConfig = new javax.swing.JButton();
        LabelVendedor = new javax.swing.JLabel();
        tipo = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JButton();
        btnPlatos = new javax.swing.JButton();
        LabelConection = new javax.swing.JLabel();
        btnUsuarios1 = new javax.swing.JButton();
        txtRolUser = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        PanelSalas = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableSala = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtNombreSala = new javax.swing.JTextField();
        btnRegistrarSala = new javax.swing.JButton();
        btnActualizarSala = new javax.swing.JButton();
        btnNuevoSala = new javax.swing.JButton();
        btnEliminarSala = new javax.swing.JButton();
        txtIdSala = new javax.swing.JTextField();
        jPanel35 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        txtMesas = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        PanelMesas = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        btnFinalizar = new javax.swing.JButton();
        totalFinalizar = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tableFinalizar = new javax.swing.JTable();
        txtIdPedido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFechaHora = new javax.swing.JTextField();
        txtSalaFinalizar = new javax.swing.JTextField();
        txtNumMesaFinalizar = new javax.swing.JTextField();
        btnPdfPedido = new javax.swing.JButton();
        txtIdHistorialPedido = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        btnElimPlati = new javax.swing.JButton();
        btnDescuento = new javax.swing.JButton();
        txtIdPlat = new javax.swing.JTextField();
        btnImprimir = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablePedidos = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        txtHId = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnVerPedido = new javax.swing.JButton();
        btnEliminarPedido = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        txtIdConfig = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtTelefonoConfig = new javax.swing.JTextField();
        txtDireccionConfig = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtMensaje = new javax.swing.JTextField();
        btnActualizarConfig = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        txtRucConfig = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtNombreConfig = new javax.swing.JTextField();
        jPanel41 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TableUsuarios = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnIniciar = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        cbxRol = new javax.swing.JComboBox<>();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        txtNombrePlato = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtPrecioPlato = new javax.swing.JTextField();
        btnGuardarPlato = new javax.swing.JButton();
        btnEditarPlato = new javax.swing.JButton();
        btnEliminarPlato = new javax.swing.JButton();
        btnNuevoPlato = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        txtIdPlato = new javax.swing.JTextField();
        cbxCategoria = new javax.swing.JComboBox<>();
        cbxSubCategoria = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablePlatos = new javax.swing.JTable();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        txtBuscarPlato = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblTemPlatos = new javax.swing.JTable();
        btnAddPlato = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        tableMenu = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextPane();
        jLabel11 = new javax.swing.JLabel();
        totalMenu = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnEliminarTempPlato = new javax.swing.JButton();
        txtTempIdSala = new javax.swing.JTextField();
        txtTempNumMesa = new javax.swing.JTextField();
        txtTempIDPed = new javax.swing.JTextField();
        txtTempCateg = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnEspec = new javax.swing.JButton();
        btnEntradas = new javax.swing.JButton();
        btnEnsaladas = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnPostres = new javax.swing.JButton();
        btnExtras = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        btnAgregarPedido = new javax.swing.JButton();
        btnGenerarPedido = new javax.swing.JButton();
        btnFinalizarPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel de Adminstración");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(161, 48, 50));

        labelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLogoMouseClicked(evt);
            }
        });

        btnSala.setBackground(new java.awt.Color(199, 147, 22));
        btnSala.setFont(new java.awt.Font("Script MT Bold", 0, 24)); // NOI18N
        btnSala.setForeground(new java.awt.Color(0, 0, 0));
        btnSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/51882.png"))); // NOI18N
        btnSala.setText("Espacios");
        btnSala.setToolTipText("");
        btnSala.setBorder(null);
        btnSala.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSala.setFocusable(false);
        btnSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalaActionPerformed(evt);
            }
        });

        btnVentas.setBackground(new java.awt.Color(199, 147, 22));
        btnVentas.setFont(new java.awt.Font("Script MT Bold", 0, 24)); // NOI18N
        btnVentas.setForeground(new java.awt.Color(0, 0, 0));
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ordenar-comida.png"))); // NOI18N
        btnVentas.setText("Pedidos");
        btnVentas.setBorder(null);
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVentas.setFocusable(false);
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        btnConfig.setBackground(new java.awt.Color(199, 147, 22));
        btnConfig.setFont(new java.awt.Font("Script MT Bold", 0, 24)); // NOI18N
        btnConfig.setForeground(new java.awt.Color(0, 0, 0));
        btnConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/engranajes-de-configuracion.png"))); // NOI18N
        btnConfig.setText("Config");
        btnConfig.setBorder(null);
        btnConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnConfig.setFocusable(false);
        btnConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigActionPerformed(evt);
            }
        });

        LabelVendedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelVendedor.setForeground(new java.awt.Color(255, 255, 255));
        LabelVendedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelVendedor.setText("Administrador");

        tipo.setForeground(new java.awt.Color(255, 255, 255));

        btnUsuarios.setBackground(new java.awt.Color(199, 147, 22));
        btnUsuarios.setFont(new java.awt.Font("Script MT Bold", 0, 24)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/group.png"))); // NOI18N
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setBorder(null);
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuarios.setFocusable(false);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnPlatos.setBackground(new java.awt.Color(199, 147, 22));
        btnPlatos.setFont(new java.awt.Font("Script MT Bold", 0, 24)); // NOI18N
        btnPlatos.setForeground(new java.awt.Color(0, 0, 0));
        btnPlatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/indian.png"))); // NOI18N
        btnPlatos.setText("Platos");
        btnPlatos.setAutoscrolls(true);
        btnPlatos.setBorder(null);
        btnPlatos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPlatos.setFocusable(false);
        btnPlatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlatosActionPerformed(evt);
            }
        });

        LabelConection.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelConection.setFocusable(false);

        btnUsuarios1.setBackground(new java.awt.Color(199, 147, 22));
        btnUsuarios1.setFont(new java.awt.Font("Script MT Bold", 0, 24)); // NOI18N
        btnUsuarios1.setForeground(new java.awt.Color(0, 0, 0));
        btnUsuarios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/salir_Interfaz.png"))); // NOI18N
        btnUsuarios1.setBorder(null);
        btnUsuarios1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuarios1.setFocusable(false);
        btnUsuarios1.setLabel("Exit");
        btnUsuarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarios1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnConfig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LabelVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPlatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(tipo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelConection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(btnUsuarios1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(txtRolUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tipo)
                .addGap(18, 18, 18)
                .addComponent(LabelVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnPlatos, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSala, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUsuarios1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(txtRolUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(LabelConection, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 1080));

        jLabel38.setFont(new java.awt.Font("Script MT Bold", 1, 48)); // NOI18N
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo.png"))); // NOI18N
        jLabel38.setText("Goa Restaurant");
        jLabel38.setFocusable(false);
        jLabel38.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 10, 430, 90));
        jLabel38.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        PanelSalas.setBackground(new java.awt.Color(255, 255, 255));
        PanelSalas.setLayout(new java.awt.GridLayout(0, 5));
        jScrollPane8.setViewportView(PanelSalas);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(315, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Panel", jPanel9);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableSala.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "Mesas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableSala.setRowHeight(50);
        tableSala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSalaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableSala);
        if (tableSala.getColumnModel().getColumnCount() > 0) {
            tableSala.getColumnModel().getColumn(0).setMinWidth(80);
            tableSala.getColumnModel().getColumn(0).setPreferredWidth(80);
            tableSala.getColumnModel().getColumn(0).setMaxWidth(130);
            tableSala.getColumnModel().getColumn(1).setPreferredWidth(100);
            tableSala.getColumnModel().getColumn(2).setMinWidth(80);
            tableSala.getColumnModel().getColumn(2).setPreferredWidth(80);
            tableSala.getColumnModel().getColumn(2).setMaxWidth(150);
        }

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 860, 490));

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel18.setText("Nombre:");
        jPanel10.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtNombreSala.setBackground(new java.awt.Color(204, 204, 204));
        txtNombreSala.setBorder(null);
        txtNombreSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreSalaActionPerformed(evt);
            }
        });
        jPanel10.add(txtNombreSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 220, 30));

        btnRegistrarSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/GuardarTodo.png"))); // NOI18N
        btnRegistrarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarSalaActionPerformed(evt);
            }
        });
        jPanel10.add(btnRegistrarSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 140, 80));

        btnActualizarSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Actualizar (2).png"))); // NOI18N
        btnActualizarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarSalaActionPerformed(evt);
            }
        });
        jPanel10.add(btnActualizarSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 140, 80));

        btnNuevoSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nuevo.png"))); // NOI18N
        btnNuevoSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoSalaActionPerformed(evt);
            }
        });
        jPanel10.add(btnNuevoSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 140, 80));

        btnEliminarSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        btnEliminarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarSalaActionPerformed(evt);
            }
        });
        jPanel10.add(btnEliminarSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 140, 80));

        txtIdSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdSalaActionPerformed(evt);
            }
        });
        jPanel10.add(txtIdSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 24, -1));

        jPanel35.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 210, 2));

        jPanel38.setBackground(new java.awt.Color(0, 0, 0));
        jPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Nuevo Espacio");
        jPanel38.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 40));

        jPanel10.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 40));

        jPanel36.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 162, 210, 2));

        txtMesas.setBackground(new java.awt.Color(204, 204, 204));
        txtMesas.setBorder(null);
        jPanel10.add(txtMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 220, 30));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel19.setText("Mesas:");
        jPanel10.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jPanel4.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 370, 480));

        jTabbedPane1.addTab("Salas", jPanel4);

        PanelMesas.setLayout(new java.awt.GridLayout(0, 5));
        jScrollPane9.setViewportView(PanelMesas);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 1438, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(269, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mesas", jPanel22);

        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        jPanel25.add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 590, 130, 60));

        totalFinalizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totalFinalizar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalFinalizar.setText("00.00");
        jPanel25.add(totalFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 530, 120, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/money.png"))); // NOI18N
        jLabel17.setText("Total a Pagar");
        jPanel25.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 480, -1, -1));

        tableFinalizar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Plato", "Cant", "Precio", "SubTotal", "Comentario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableFinalizar.setRowHeight(50);
        tableFinalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableFinalizarMouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(tableFinalizar);
        if (tableFinalizar.getColumnModel().getColumnCount() > 0) {
            tableFinalizar.getColumnModel().getColumn(0).setMinWidth(30);
            tableFinalizar.getColumnModel().getColumn(0).setPreferredWidth(30);
            tableFinalizar.getColumnModel().getColumn(0).setMaxWidth(50);
            tableFinalizar.getColumnModel().getColumn(1).setPreferredWidth(100);
            tableFinalizar.getColumnModel().getColumn(2).setMinWidth(40);
            tableFinalizar.getColumnModel().getColumn(2).setPreferredWidth(40);
            tableFinalizar.getColumnModel().getColumn(2).setMaxWidth(50);
            tableFinalizar.getColumnModel().getColumn(3).setPreferredWidth(50);
            tableFinalizar.getColumnModel().getColumn(4).setPreferredWidth(60);
        }

        jPanel25.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 13, 1330, 460));
        jPanel25.add(txtIdPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 550, 50, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Fecha y Hora:");
        jPanel25.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Sala:");
        jPanel25.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("N° Mesa:");
        jPanel25.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, -1, -1));

        txtFechaHora.setEditable(false);
        jPanel25.add(txtFechaHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 240, 30));

        txtSalaFinalizar.setEditable(false);
        jPanel25.add(txtSalaFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, 240, 30));

        txtNumMesaFinalizar.setEditable(false);
        jPanel25.add(txtNumMesaFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 620, 240, 30));

        btnPdfPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pdf.png"))); // NOI18N
        btnPdfPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPdfPedidoActionPerformed(evt);
            }
        });
        jPanel25.add(btnPdfPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 670, 130, 60));
        jPanel25.add(txtIdHistorialPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 680, 50, -1));

        jPanel14.setOpaque(false);

        btnElimPlati.setText("Eliminar Plato");
        btnElimPlati.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimPlatiActionPerformed(evt);
            }
        });

        btnDescuento.setText("Descuento");
        btnDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescuentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(btnElimPlati, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnElimPlati, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel25.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, -1, -1));
        jPanel25.add(txtIdPlat, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 620, 50, -1));

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/print.png"))); // NOI18N
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        jPanel25.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 590, 130, 60));

        jTabbedPane1.addTab("Finalizar Pedido", jPanel25);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablePedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Sala", "Atendido", "N° Mesa", "Fecha", "Total", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablePedidos.setColumnSelectionAllowed(true);
        TablePedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TablePedidos.setRowHeight(50);
        TablePedidos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TablePedidos.getTableHeader().setReorderingAllowed(false);
        TablePedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePedidosMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(TablePedidos);
        if (TablePedidos.getColumnModel().getColumnCount() > 0) {
            TablePedidos.getColumnModel().getColumn(0).setMinWidth(80);
            TablePedidos.getColumnModel().getColumn(0).setPreferredWidth(80);
            TablePedidos.getColumnModel().getColumn(0).setMaxWidth(120);
            TablePedidos.getColumnModel().getColumn(2).setPreferredWidth(60);
            TablePedidos.getColumnModel().getColumn(3).setMinWidth(100);
            TablePedidos.getColumnModel().getColumn(3).setPreferredWidth(100);
            TablePedidos.getColumnModel().getColumn(3).setMaxWidth(150);
            TablePedidos.getColumnModel().getColumn(4).setPreferredWidth(60);
        }

        jPanel6.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 1380, 480));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Historial Pedidos");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 280, -1));

        txtHId.setEditable(false);
        txtHId.setEnabled(false);
        txtHId.setFocusable(false);
        txtHId.setRequestFocusEnabled(false);
        txtHId.setVerifyInputWhenFocusTarget(false);
        jPanel6.add(txtHId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, -1, -1));

        jPanel5.setOpaque(false);

        btnVerPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/sala.png"))); // NOI18N
        btnVerPedido.setText("VER PEDIDO");
        btnVerPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPedido(evt);
            }
        });

        btnEliminarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        btnEliminarPedido.setText("ELIMINAR PEDIDO");
        btnEliminarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimPedDao(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEliminarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnVerPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 550, 420, 110));

        jTabbedPane1.addTab("Historial Pedidos", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel32.setText("DATOS DEL RESTAURANTE");
        jPanel7.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdConfigActionPerformed(evt);
            }
        });
        jPanel8.add(txtIdConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 24, -1));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel30.setText("Dirección");
        jPanel8.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel29.setText("Teléfono");
        jPanel8.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        txtTelefonoConfig.setBackground(new java.awt.Color(204, 204, 204));
        txtTelefonoConfig.setBorder(null);
        jPanel8.add(txtTelefonoConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 218, 30));

        txtDireccionConfig.setBackground(new java.awt.Color(204, 204, 204));
        txtDireccionConfig.setBorder(null);
        jPanel8.add(txtDireccionConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 147, 30));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel31.setText("Mensaje");
        jPanel8.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        txtMensaje.setBackground(new java.awt.Color(204, 204, 204));
        txtMensaje.setBorder(null);
        jPanel8.add(txtMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 400, 30));

        btnActualizarConfig.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizarConfig.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        btnActualizarConfig.setText("Modificar");
        btnActualizarConfig.setBorder(null);
        btnActualizarConfig.setFocusable(false);
        btnActualizarConfig.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizarConfig.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnActualizarConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarConfigActionPerformed(evt);
            }
        });
        jPanel8.add(btnActualizarConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 405, 220, 50));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel27.setText("RFC");
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        txtRucConfig.setBackground(new java.awt.Color(204, 204, 204));
        txtRucConfig.setBorder(null);
        jPanel8.add(txtRucConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 147, 30));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel28.setText("Nombre");
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        txtNombreConfig.setBackground(new java.awt.Color(204, 204, 204));
        txtNombreConfig.setBorder(null);
        jPanel8.add(txtNombreConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 220, 30));

        jPanel41.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 147, 2));

        jPanel42.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 147, 2));

        jPanel43.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 400, 2));

        jPanel44.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 220, 2));

        jPanel45.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 220, 2));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 420, 470));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/undraw_special_event_4aj8.png"))); // NOI18N
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 10));

        jTabbedPane1.addTab("Datos del restaurante", jPanel7);

        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Correo", "Rol"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableUsuarios.setRowHeight(50);
        jScrollPane6.setViewportView(TableUsuarios);
        if (TableUsuarios.getColumnModel().getColumnCount() > 0) {
            TableUsuarios.getColumnModel().getColumn(0).setMinWidth(50);
            TableUsuarios.getColumnModel().getColumn(0).setPreferredWidth(50);
            TableUsuarios.getColumnModel().getColumn(0).setMaxWidth(80);
            TableUsuarios.getColumnModel().getColumn(3).setMinWidth(150);
            TableUsuarios.getColumnModel().getColumn(3).setPreferredWidth(150);
            TableUsuarios.getColumnModel().getColumn(3).setMaxWidth(200);
        }

        jPanel12.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 960, 520));

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel34.setText("Correo Electrónico");
        jPanel15.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 102, -1, -1));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel35.setText("Password");
        jPanel15.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 130, -1));

        txtCorreo.setBackground(new java.awt.Color(204, 204, 204));
        txtCorreo.setBorder(null);
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel15.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 126, 300, 30));

        txtPass.setBackground(new java.awt.Color(204, 204, 204));
        txtPass.setBorder(null);
        jPanel15.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 300, 30));

        btnIniciar.setBackground(new java.awt.Color(0, 0, 0));
        btnIniciar.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("Registrar");
        btnIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jPanel15.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 300, 50));

        jLabel36.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel36.setText("Nombre:");
        jPanel15.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        txtNombre.setBackground(new java.awt.Color(204, 204, 204));
        txtNombre.setBorder(null);
        jPanel15.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 300, 30));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel37.setText("Rol:");
        jPanel15.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 90, -1));

        cbxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Mesero" }));
        cbxRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxRolActionPerformed(evt);
            }
        });
        jPanel15.add(cbxRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 300, 50));

        jPanel16.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 156, 300, 2));

        jPanel17.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 300, 2));

        jPanel18.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 300, 2));

        jPanel21.setBackground(new java.awt.Color(0, 0, 0));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Nuevo Usuario");
        jPanel21.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 35));

        jPanel15.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 35));

        jPanel12.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 360, 520));

        jTabbedPane1.addTab("Usuarios", jPanel12);

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel23.setText("Nombre:");
        jPanel11.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        txtNombrePlato.setBackground(new java.awt.Color(204, 204, 204));
        txtNombrePlato.setBorder(null);
        txtNombrePlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePlatoActionPerformed(evt);
            }
        });
        jPanel11.add(txtNombrePlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 170, 70));

        jLabel25.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel25.setText("Precio:");
        jPanel11.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        txtPrecioPlato.setBackground(new java.awt.Color(204, 204, 204));
        txtPrecioPlato.setBorder(null);
        txtPrecioPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioPlatoActionPerformed(evt);
            }
        });
        txtPrecioPlato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioPlatoKeyTyped(evt);
            }
        });
        jPanel11.add(txtPrecioPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 170, 60));

        btnGuardarPlato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/GuardarTodo.png"))); // NOI18N
        btnGuardarPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPlatoActionPerformed(evt);
            }
        });
        jPanel11.add(btnGuardarPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 140, 70));

        btnEditarPlato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Actualizar (2).png"))); // NOI18N
        btnEditarPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPlatoActionPerformed(evt);
            }
        });
        jPanel11.add(btnEditarPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 140, 70));

        btnEliminarPlato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        btnEliminarPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPlatoActionPerformed(evt);
            }
        });
        jPanel11.add(btnEliminarPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 140, 70));

        btnNuevoPlato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nuevo.png"))); // NOI18N
        btnNuevoPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPlatoActionPerformed(evt);
            }
        });
        jPanel11.add(btnNuevoPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 140, 70));

        jPanel31.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 170, 2));

        jPanel33.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 170, 2));

        jPanel39.setBackground(new java.awt.Color(0, 0, 0));

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Platos del Día");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel11.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 50));
        jPanel11.add(txtIdPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 80, -1));

        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entradas", "Ensaladas Frias", "Especialidades", "Extras", "Postres", " " }));
        cbxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCategoriaActionPerformed(evt);
            }
        });
        jPanel11.add(cbxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 140, 60));

        cbxSubCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------", "Cordero", "Pescado y Camarones", "Vegetariano", "Biryani", "Arroz Especial" }));
        cbxSubCategoria.setToolTipText("");
        cbxSubCategoria.setName(""); // NOI18N
        cbxSubCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSubCategoriaActionPerformed(evt);
            }
        });
        jPanel11.add(cbxSubCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 140, 60));

        TablePlatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DESCRIPCIÓN", "PRECIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablePlatos.setRowHeight(50);
        TablePlatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePlatosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TablePlatos);
        if (TablePlatos.getColumnModel().getColumnCount() > 0) {
            TablePlatos.getColumnModel().getColumn(0).setMinWidth(100);
            TablePlatos.getColumnModel().getColumn(0).setPreferredWidth(100);
            TablePlatos.getColumnModel().getColumn(0).setMaxWidth(150);
            TablePlatos.getColumnModel().getColumn(2).setMinWidth(200);
            TablePlatos.getColumnModel().getColumn(2).setPreferredWidth(200);
            TablePlatos.getColumnModel().getColumn(2).setMaxWidth(300);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 996, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE))
                .addContainerGap(381, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Platos", jPanel2);

        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder("Platos del Dia"));

        txtBuscarPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarPlatoActionPerformed(evt);
            }
        });
        txtBuscarPlato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarPlatoKeyReleased(evt);
            }
        });

        jScrollPane10.setAutoscrolls(true);

        tblTemPlatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Nombre", "Precio", "Categoria", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTemPlatos.setRowHeight(50);
        tblTemPlatos.getTableHeader().setReorderingAllowed(false);
        jScrollPane10.setViewportView(tblTemPlatos);
        if (tblTemPlatos.getColumnModel().getColumnCount() > 0) {
            tblTemPlatos.getColumnModel().getColumn(0).setMinWidth(30);
            tblTemPlatos.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblTemPlatos.getColumnModel().getColumn(0).setMaxWidth(50);
            tblTemPlatos.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblTemPlatos.getColumnModel().getColumn(2).setMinWidth(50);
            tblTemPlatos.getColumnModel().getColumn(2).setPreferredWidth(50);
            tblTemPlatos.getColumnModel().getColumn(2).setMaxWidth(200);
            tblTemPlatos.getColumnModel().getColumn(3).setPreferredWidth(50);
            tblTemPlatos.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        btnAddPlato.setBackground(new java.awt.Color(0, 0, 0));
        btnAddPlato.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        btnAddPlato.setForeground(new java.awt.Color(255, 255, 255));
        btnAddPlato.setText("+");
        btnAddPlato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddPlato.setFocusable(false);
        btnAddPlato.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPlatoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtBuscarPlato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAddPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBuscarPlato, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btnAddPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
        );

        tableMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Plato", "Cant", "Precio", "SubTotal", "Comentario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMenu.setRowHeight(50);
        jScrollPane11.setViewportView(tableMenu);
        if (tableMenu.getColumnModel().getColumnCount() > 0) {
            tableMenu.getColumnModel().getColumn(0).setMinWidth(30);
            tableMenu.getColumnModel().getColumn(0).setPreferredWidth(30);
            tableMenu.getColumnModel().getColumn(0).setMaxWidth(50);
            tableMenu.getColumnModel().getColumn(1).setPreferredWidth(100);
            tableMenu.getColumnModel().getColumn(2).setMinWidth(40);
            tableMenu.getColumnModel().getColumn(2).setPreferredWidth(40);
            tableMenu.getColumnModel().getColumn(2).setMaxWidth(50);
            tableMenu.getColumnModel().getColumn(3).setPreferredWidth(50);
            tableMenu.getColumnModel().getColumn(4).setPreferredWidth(60);
        }

        jLabel6.setText("Comentario:");

        jScrollPane12.setViewportView(txtComentario);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/money.png"))); // NOI18N
        jLabel11.setText("Total a Pagar");

        totalMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totalMenu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalMenu.setText("00.00");

        jButton2.setText("Agregar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnEliminarTempPlato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        btnEliminarTempPlato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarTempPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTempPlatoActionPerformed(evt);
            }
        });

        txtTempIdSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTempIdSalaActionPerformed(evt);
            }
        });

        txtTempNumMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTempNumMesaActionPerformed(evt);
            }
        });

        txtTempIDPed.setEditable(false);
        txtTempIDPed.setBorder(null);
        txtTempIDPed.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTempIDPed.setEnabled(false);
        txtTempIDPed.setFocusable(false);
        txtTempIDPed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTempIDPedActionPerformed(evt);
            }
        });

        txtTempCateg.setEnabled(false);
        txtTempCateg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTempCategActionPerformed(evt);
            }
        });

        btnEspec.setText("ESPECIALIDADES");
        btnEspec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspecActionPerformed(evt);
            }
        });

        btnEntradas.setText("ENTRADAS");
        btnEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradasActionPerformed(evt);
            }
        });

        btnEnsaladas.setText("ENSALADAS FRIAS");
        btnEnsaladas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnsaladasActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnPostres.setText("POSTRES");
        btnPostres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostresActionPerformed(evt);
            }
        });

        btnExtras.setText("EXTRAS");
        btnExtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btnPostres, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEspec, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExtras, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEnsaladas, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnsaladas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEspec, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExtras, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPostres, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        btnAgregarPedido.setText("Actualizar Pedido");
        btnAgregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPedidoActionPerformed(evt);
            }
        });

        btnGenerarPedido.setText("Realizar Pedido");
        btnGenerarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPedidoActionPerformed(evt);
            }
        });

        btnFinalizarPedido.setText("Ver Pedido");
        btnFinalizarPedido.setToolTipText("");
        btnFinalizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGenerarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFinalizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGenerarPedido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFinalizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(119, 119, 119))
        );

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTempIdSala)
                                .addComponent(txtTempNumMesa, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                            .addComponent(txtTempCateg, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                                .addComponent(txtTempIDPed, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                .addGap(544, 544, 544)
                                .addComponent(jLabel11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane12)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(btnEliminarTempPlato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminarTempPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTempIdSala, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTempIDPed, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalMenu)
                                .addGap(4, 4, 4)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel23Layout.createSequentialGroup()
                                        .addComponent(txtTempNumMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTempCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Platos", jPanel23);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 1450, 980));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalaActionPerformed
        // TODO add your handling code here:
        LimpiarTable();
        ListarSalas();
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btnSalaActionPerformed

    private void btnConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(5);
        ListarConfig();
    }//GEN-LAST:event_btnConfigActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        // TODO add your handling code here:
        int rolcheck = RolCheck();
        if (rolcheck == 1){
            btnEliminarPedido.setVisible(false);
        } else{
            btnEliminarPedido.setVisible(true);
        }
        LimpiarTable();
        ListarPedidos();
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
        LimpiarTable();
        ListarUsuarios();
        jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnActualizarConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarConfigActionPerformed
        // TODO add your handling code here:
        if (!"".equals(txtRucConfig.getText()) || !"".equals(txtNombreConfig.getText()) || !"".equals(txtTelefonoConfig.getText()) || !"".equals(txtDireccionConfig.getText())) {
            conf.setRuc(txtRucConfig.getText());
            conf.setNombre(txtNombreConfig.getText());
            conf.setTelefono(txtTelefonoConfig.getText());
            conf.setDireccion(txtDireccionConfig.getText());
            conf.setMensaje(txtMensaje.getText());
            conf.setId(Integer.parseInt(txtIdConfig.getText()));
            lgDao.ModificarDatos(conf);
            JOptionPane.showMessageDialog(null, "Datos de la empresa modificado");
            //ListarConfig();
        } else {
            JOptionPane.showMessageDialog(null, "Los campos estan vacios");
        }
    }//GEN-LAST:event_btnActualizarConfigActionPerformed

    private void btnPdfPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdfPedidoActionPerformed

        if (txtIdHistorialPedido.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Selecciona una fila");
        } else {
            pedDao.pdfPedido(Integer.parseInt(txtIdHistorialPedido.getText()));
            txtIdHistorialPedido.setText("");
        }
    }//GEN-LAST:event_btnPdfPedidoActionPerformed

    private void TablePedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePedidosMouseClicked
        // TODO add your handling code here:
        int fila = TablePedidos.rowAtPoint(evt.getPoint());
        String filatxt = Integer.toString(fila);
        txtHId.setText(filatxt);
        int id_pedido = Integer.parseInt(TablePedidos.getValueAt(fila, 0).toString());
        txtIdPedido.setText(""+id_pedido);
        txtIdHistorialPedido.setText(""+id_pedido);
        /*int id_pedido = Integer.parseInt(TablePedidos.getValueAt(fila, 0).toString());
        LimpiarTable();
        verPedido(id_pedido);
        verPedidoDetalle(id_pedido);
        jTabbedPane1.setSelectedIndex(3);
        btnFinalizar.setEnabled(false);
        txtIdHistorialPedido.setText(""+id_pedido);*/
    }//GEN-LAST:event_TablePedidosMouseClicked

    private void tableSalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSalaMouseClicked
        // TODO add your handling code here:
        int fila = tableSala.rowAtPoint(evt.getPoint());
        txtIdSala.setText(tableSala.getValueAt(fila, 0).toString());
        txtNombreSala.setText(tableSala.getValueAt(fila, 1).toString());
        txtMesas.setText(tableSala.getValueAt(fila, 2).toString());
    }//GEN-LAST:event_tableSalaMouseClicked

    private void txtIdConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdConfigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdConfigActionPerformed

    private void btnRegistrarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarSalaActionPerformed
        // TODO add your handling code here:
        if (txtNombreSala.getText().equals("") || txtMesas.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Los campos esta vacios");
        } else {
            sl.setNombre(txtNombreSala.getText());
            sl.setMesas(Integer.parseInt(txtMesas.getText()));
            slDao.RegistrarSala(sl);
            JOptionPane.showMessageDialog(null, "Sala Registrado");
            LimpiarSala();
            LimpiarTable();
            ListarSalas();
        }
    }//GEN-LAST:event_btnRegistrarSalaActionPerformed

    private void btnActualizarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarSalaActionPerformed
        // TODO add your handling code here:
        if ("".equals(txtIdSala.getText())) {
            JOptionPane.showMessageDialog(null, "Seleecione una fila");
        } else {
            if (!"".equals(txtNombreSala.getText())) {
                sl.setNombre(txtNombreSala.getText());
                sl.setId(Integer.parseInt(txtIdSala.getText()));
                slDao.Modificar(sl);
                JOptionPane.showMessageDialog(null, "Sala Modificado");
                LimpiarSala();
                LimpiarTable();
                ListarSalas();
            }
        }
    }//GEN-LAST:event_btnActualizarSalaActionPerformed

    private void btnNuevoSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoSalaActionPerformed
        // TODO add your handling code here:
        LimpiarSala();
    }//GEN-LAST:event_btnNuevoSalaActionPerformed

    private void btnEliminarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarSalaActionPerformed
        // TODO add your handling code here:
        if (!"".equals(txtIdSala.getText())) {
            int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar");
            if (pregunta == 0) {
                int id = Integer.parseInt(txtIdSala.getText());
                slDao.Eliminar(id);
                LimpiarSala();
                LimpiarTable();
                ListarSalas();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
    }//GEN-LAST:event_btnEliminarSalaActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        if (txtNombre.getText().equals("") || txtCorreo.getText().equals("") || txtPass.getPassword().equals("")) {
            JOptionPane.showMessageDialog(null, "Todo los campos son requeridos");
        } else {
            login lg = new login();
            String correo = txtCorreo.getText();
            String pass = String.valueOf(txtPass.getPassword());
            String nom = txtNombre.getText();
            String rol = cbxRol.getSelectedItem().toString();
            lg.setNombre(nom);
            lg.setCorreo(correo);
            lg.setPass(pass);
            lg.setRol(rol);
            lgDao.Registrar(lg);
            JOptionPane.showMessageDialog(null, "Usuario Registrado");
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void txtBuscarPlatoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarPlatoKeyReleased
        LimpiarTable();
        ListarPlatos(tblTemPlatos);
    }//GEN-LAST:event_txtBuscarPlatoKeyReleased
    

    private void btnAddPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPlatoActionPerformed
        
        if (tblTemPlatos.getSelectedRow() >= 0) {
                    int id = Integer.parseInt(tblTemPlatos.getValueAt(tblTemPlatos.getSelectedRow(), 0).toString());
                    String descripcion = tblTemPlatos.getValueAt(tblTemPlatos.getSelectedRow(), 1).toString();
                    double precio = Double.parseDouble(tblTemPlatos.getValueAt(tblTemPlatos.getSelectedRow(), 2).toString());
                    double total = 1 * precio;
                    item = item + 1;
                    tmp = (DefaultTableModel) tableMenu.getModel();
                    ArrayList lista = new ArrayList();
                    lista.add(item);
                    lista.add(id);
                    lista.add(descripcion);
                    lista.add(1);
                    lista.add(precio);
                    lista.add(total);
                    Object[] O = new Object[6];
                    O[0] = lista.get(1);
                    O[1] = lista.get(2);
                    O[2] = lista.get(3);
                    O[3] = lista.get(4);
                    O[4] = lista.get(5);
                    O[5] = "";
                    tmp.addRow(O);
                    tableMenu.setModel(tmp);
                    TotalPagar(tableMenu, totalMenu);
            } else {
                JOptionPane.showMessageDialog(null, "SELECCIONA UNA FILA");
            }
    }//GEN-LAST:event_btnAddPlatoActionPerformed

    private void btnGenerarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPedidoActionPerformed
        if (tableMenu.getRowCount() > 0) {
            RegistrarPedido();
            detallePedido();
            LimpiarTableMenu();
            JOptionPane.showMessageDialog(null, "PEDIDO REGISTRADO");
            jTabbedPane1.setSelectedIndex(0);
        } else {
            JOptionPane.showMessageDialog(null, "NO HAY PRODUCTO EN LA PEDIDO");
        }
    }//GEN-LAST:event_btnGenerarPedidoActionPerformed

    private void btnEliminarTempPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTempPlatoActionPerformed
        modelo = (DefaultTableModel) tableMenu.getModel();
        modelo.removeRow(tableMenu.getSelectedRow());
        TotalPagar(tableMenu, totalMenu);
    }//GEN-LAST:event_btnEliminarTempPlatoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (txtComentario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "SELECCIONE UNA FILA");
        } else {
            int id = Integer.parseInt(tableMenu.getValueAt(tableMenu.getSelectedRow(), 0).toString());
            for (int i = 0; i < tableMenu.getRowCount(); i++) {
                if (tableMenu.getValueAt(i, 0).equals(id)) {
                    tmp.setValueAt(txtComentario.getText(), i, 5);
                    txtComentario.setText("");
                    tableMenu.clearSelection();
                    return;
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        // TODO add your handling code here:
        int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro de finalizar");
        if (pregunta == 0) {
            if (pedDao.actualizarEstado(Integer.parseInt(txtIdPedido.getText()))) {
                pedDao.pdfPedido(Integer.parseInt(txtIdPedido.getText()));
                jTabbedPane1.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnPlatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlatosActionPerformed
        jTabbedPane1.setSelectedIndex(7);
        LimpiarTable();
        ListarPlatos(TablePlatos);
    }//GEN-LAST:event_btnPlatosActionPerformed

    private void txtPrecioPlatoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioPlatoKeyTyped
        // TODO add your handling code here:
        event.numberDecimalKeyPress(evt, txtPrecioPlato);
    }//GEN-LAST:event_txtPrecioPlatoKeyTyped

    private void btnGuardarPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPlatoActionPerformed
        // TODO add your handling code here:
        if (!"".equals(txtNombrePlato.getText()) || !"".equals(txtPrecioPlato.getText())) {
            pla.setNombre(txtNombrePlato.getText());
            pla.setPrecio(Double.parseDouble(txtPrecioPlato.getText()));
            pla.setFecha(fechaFormato);
            pla.setCategoria(cbxCategoria.getSelectedItem().toString());
            pla.setSubCategoria(cbxSubCategoria.getSelectedItem().toString());
            if (plaDao.Registrar(pla)) {
                JOptionPane.showMessageDialog(null, "Plato Registrado");
                LimpiarTable();
                ListarPlatos(TablePlatos);
                LimpiarPlatos();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Los campos estan vacios");
        }
    }//GEN-LAST:event_btnGuardarPlatoActionPerformed

    private void btnEditarPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPlatoActionPerformed
        // TODO add your handling code here:
        if ("".equals(txtIdPlato.getText())) {
            JOptionPane.showMessageDialog(null, "Seleecione una fila");
        } else {
            if (!"".equals(txtNombrePlato.getText()) || !"".equals(txtPrecioPlato.getText())) {
                pla.setNombre(txtNombrePlato.getText());
                pla.setPrecio(Double.parseDouble(txtPrecioPlato.getText()));
                pla.setCategoria(cbxCategoria.getSelectedItem().toString());
                pla.setSubCategoria(cbxSubCategoria.getSelectedItem().toString());
                pla.setId(Integer.parseInt(txtIdPlato.getText()));
                if (plaDao.Modificar(pla)) {
                    JOptionPane.showMessageDialog(null, "Plato Modificado");
                    LimpiarTable();
                    ListarPlatos(TablePlatos);
                    LimpiarPlatos();
                }

            }
        }
    }//GEN-LAST:event_btnEditarPlatoActionPerformed

    private void btnEliminarPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPlatoActionPerformed
        // TODO add your handling code here:
        if (!"".equals(txtIdPlato.getText())) {
            int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar");
            if (pregunta == 0) {
                int id = Integer.parseInt(txtIdPlato.getText());
                plaDao.Eliminar(id);
                LimpiarTable();
                LimpiarPlatos();
                ListarPlatos(TablePlatos);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una fila");
        }
    }//GEN-LAST:event_btnEliminarPlatoActionPerformed

    private void btnNuevoPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPlatoActionPerformed
        // TODO add your handling code here:
        LimpiarPlatos();
    }//GEN-LAST:event_btnNuevoPlatoActionPerformed

    private void TablePlatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePlatosMouseClicked
        // TODO add your handling code here:
        int fila = TablePlatos.rowAtPoint(evt.getPoint());
        txtIdPlato.setText(TablePlatos.getValueAt(fila, 0).toString());
        txtNombrePlato.setText(TablePlatos.getValueAt(fila, 1).toString());
        txtPrecioPlato.setText(TablePlatos.getValueAt(fila, 2).toString());
    }//GEN-LAST:event_TablePlatosMouseClicked

    private void labelLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLogoMouseClicked
        jTabbedPane1.setSelectedIndex(1);
        jTabbedPane1.setSelectedIndex(0);
        PanelSalas.removeAll();
        panelSalas();
    }//GEN-LAST:event_labelLogoMouseClicked

    private void btnElimPedDao(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimPedDao
        // TODO add your handling code here:
       if (!"".equals(txtIdPedido.getText())) {
            int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar");
            if (pregunta == 0) {
                int id = Integer.parseInt(txtIdPedido.getText());
                pedDao.Eliminar(id);
                LimpiarTable();
                ListarPedidos();
                txtIdPedido.setText("");
            }else{
                txtIdPedido.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una fila");
            txtIdPedido.setText("");
        }
    }//GEN-LAST:event_btnElimPedDao

    private void cbxRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxRolActionPerformed

    private void btnAgregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPedidoActionPerformed
        String txt = txtTempIDPed.getText();
        if (tableMenu.getRowCount() > 0) {
            modificarDetallePedido();
            modificarTotalPedido();
            LimpiarTableMenu();
            JOptionPane.showMessageDialog(null, "PEDIDO REGISTRADO");
            jTabbedPane1.setSelectedIndex(0);
        } else {
            JOptionPane.showMessageDialog(null, "NO HAY PRODUCTO EN LA PEDIDO");
        }
    }//GEN-LAST:event_btnAgregarPedidoActionPerformed

    private void txtIdSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdSalaActionPerformed

    private void txtNombreSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreSalaActionPerformed

    private void txtPrecioPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioPlatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioPlatoActionPerformed

    private void txtNombrePlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePlatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrePlatoActionPerformed

    private void txtTempNumMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTempNumMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTempNumMesaActionPerformed

    private void txtTempIdSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTempIdSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTempIdSalaActionPerformed

    private void btnUsuarios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarios1ActionPerformed
        int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro de cerrar la sesión actual");
        if (pregunta == 0) {
            Login log = new Login();
            log.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnUsuarios1ActionPerformed

    private void txtTempIDPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTempIDPedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTempIDPedActionPerformed

    private void btnVerPedido(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPedido
        // TODO add your handling code here:
        int rolcheck = RolCheck();
        if (rolcheck == 1){
            btnElimPlati.setVisible(false);
        } else{
            btnElimPlati.setVisible(true);
        }
        if (!"".equals(txtIdPedido.getText())) {
            int fila = Integer.parseInt(txtHId.getText());
            int id_pedido = Integer.parseInt(TablePedidos.getValueAt(fila, 0).toString());
            LimpiarTable();
            verPedido(id_pedido);
            verPedidoDetalle(id_pedido);
            jTabbedPane1.setSelectedIndex(3);
            btnFinalizar.setEnabled(false);
            txtIdHistorialPedido.setText(""+id_pedido);
            txtIdPedido.setText("");
            
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona un pedido");
        }

    }//GEN-LAST:event_btnVerPedido

    private void cbxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCategoriaActionPerformed

    private void cbxSubCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSubCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSubCategoriaActionPerformed

    private void txtBuscarPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarPlatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarPlatoActionPerformed

    private void txtTempCategActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTempCategActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTempCategActionPerformed

    private void btnEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradasActionPerformed
        // TODO add your handling code here:
        txtTempCateg.setText("Entradas");
        LimpiarTable();
        ListarPlatosCategorias(tblTemPlatos);
        btnRegresar.setVisible(true);
        btnEntradas.setVisible(false);
        btnEnsaladas.setVisible(false);
        btnExtras.setVisible(false);
        btnEspec.setVisible(false);
        btnPostres.setVisible(false);
        
        
    }//GEN-LAST:event_btnEntradasActionPerformed

    private void btnEnsaladasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnsaladasActionPerformed
        // TODO add your handling code here:
        txtTempCateg.setText("Ensaladas Frias");
        LimpiarTable();
        ListarPlatosCategorias(tblTemPlatos);
        btnRegresar.setVisible(true);
        btnEntradas.setVisible(false);
        btnEnsaladas.setVisible(false);
        btnExtras.setVisible(false);
        btnEspec.setVisible(false);
        btnPostres.setVisible(false);
    }//GEN-LAST:event_btnEnsaladasActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        LimpiarTable();
        ListarPlatos(tblTemPlatos);
        btnRegresar.setVisible(false);
        btnEntradas.setVisible(true);
        btnEnsaladas.setVisible(true);
        btnExtras.setVisible(true);
        btnEspec.setVisible(true);
        btnPostres.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnEspecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspecActionPerformed
        // TODO add your handling code here:
        txtTempCateg.setText("Especialidades");
        LimpiarTable();
        ListarPlatosCategorias(tblTemPlatos);
        btnRegresar.setVisible(true);
        btnEntradas.setVisible(false);
        btnEnsaladas.setVisible(false);
        btnExtras.setVisible(false);
        btnEspec.setVisible(false);
        btnPostres.setVisible(false);
        
    }//GEN-LAST:event_btnEspecActionPerformed

    private void btnExtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExtrasActionPerformed
        // TODO add your handling code here:
        txtTempCateg.setText("Extras");
        LimpiarTable();
        ListarPlatosCategorias(tblTemPlatos);
        btnRegresar.setVisible(true);
        btnEntradas.setVisible(false);
        btnEnsaladas.setVisible(false);
        btnExtras.setVisible(false);
        btnEspec.setVisible(false);
        btnPostres.setVisible(false);
    }//GEN-LAST:event_btnExtrasActionPerformed

    private void btnPostresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostresActionPerformed
        // TODO add your handling code here:
        txtTempCateg.setText("Postres");
        LimpiarTable();
        ListarPlatosCategorias(tblTemPlatos);
        btnRegresar.setVisible(true);
        btnEntradas.setVisible(false);
        btnEnsaladas.setVisible(false);
        btnExtras.setVisible(false);
        btnEspec.setVisible(false);
        btnPostres.setVisible(false);
    }//GEN-LAST:event_btnPostresActionPerformed

    private void btnElimPlatiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimPlatiActionPerformed
        // TODO add your handling code here:
        
        if (!"".equals(txtIdPlat.getText())) {
            int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar");
            if (pregunta == 0) {
                int id = Integer.parseInt(txtIdPlat.getText());
                pedDao.EliminarPlatoPed(id);
                int fila = Integer.parseInt(txtHId.getText());
                int id_pedido = Integer.parseInt(txtIdPedido.getText()); //Integer.parseInt(TablePedidos.getValueAt(fila, 0).toString());
                double precio_Platillo = Double.parseDouble(tableFinalizar.getValueAt(fila, 3).toString());
                LimpiarTable();
                double total = Double.parseDouble(totalFinalizar.getText());  //totalFinalizar.getText();
                verPedido(id_pedido);
                verPedidoDetalle(id_pedido);
                
                TotalPagar(tableFinalizar, totalFinalizar);
                modificarTotal(Double.parseDouble(totalFinalizar.getText()));
                txtIdPlat.setText("");
            }else{
                txtIdPedido.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una fila");
            txtIdPlat.setText("");
        }
    }//GEN-LAST:event_btnElimPlatiActionPerformed

    private void tableFinalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableFinalizarMouseClicked
        // TODO add your handling code here:
        int fila = tableFinalizar.rowAtPoint(evt.getPoint());
        String filatxt = Integer.toString(fila);
        txtHId.setText(filatxt);
        int id_Platillo = Integer.parseInt(tableFinalizar.getValueAt(fila, 0).toString());
        
        txtIdPlat.setText(""+id_Platillo);
    }//GEN-LAST:event_tableFinalizarMouseClicked

    private void btnFinalizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarPedidoActionPerformed
        // TODO add your handling code here:
        int mesa = Integer.parseInt(txtTempNumMesa.getText());
        int sala = Integer.parseInt(txtTempIdSala.getText());
        int id_pedido = pedDao.IdPedidoMesa(mesa, sala);
        LimpiarTable();
        verPedido(id_pedido);
        verPedidoDetalle(id_pedido);
        TotalPagar(tableFinalizar, totalFinalizar);
        jTabbedPane1.setSelectedIndex(3);
        btnFinalizar.setEnabled(true);
    }//GEN-LAST:event_btnFinalizarPedidoActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
        int mesa = Integer.parseInt(txtTempNumMesa.getText());
        int sala = Integer.parseInt(txtTempIdSala.getText());
        int id_pedido = pedDao.IdPedidoMesa(mesa, sala);
        pedDao.ticketPedido(id_pedido);
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
        // TODO add your handling code here:
        URL url=null;
        try {
            url = new URL("https://goa.com.mx/");
            try {
                Desktop.getDesktop().browse(url.toURI());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e1) {
            e1.printStackTrace();
        }
    }//GEN-LAST:event_jLabel38MouseClicked

    private void btnDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescuentoActionPerformed
        // TODO add your handling code here:
        if (!"".equals(txtIdPlat.getText())) {
            double descuento = 0;
            descuento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el descuento deseado:"))/100;
            int id = Integer.parseInt(txtIdPlat.getText());
            int fila = Integer.parseInt(txtHId.getText());
            
            int id_pedido = Integer.parseInt(txtIdPedido.getText()); //Integer.parseInt(TablePedidos.getValueAt(fila, 0).toString());
            pedDao.EditarCantidad(descuento,id);
            LimpiarTable();
            verPedido(id_pedido);
            verPedidoDetalle(id_pedido);
            double precio = Double.parseDouble(tableFinalizar.getValueAt(fila, 4).toString());
            double cantidad = (((precio)*(100))/(100-(descuento*100)));
            TotalPagar(tableFinalizar, totalFinalizar);
            //modificarTotalPedidoNegativo(cantidad);
            modificarTotal(Double.parseDouble(totalFinalizar.getText()));
            /*LimpiarTable();
            verPedido(id_pedido);
            verPedidoDetalle(id_pedido);*/
            txtIdPlat.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una fila");
            txtIdPlat.setText("");
        }
    }//GEN-LAST:event_btnDescuentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelConection;
    private javax.swing.JLabel LabelVendedor;
    private javax.swing.JPanel PanelMesas;
    private javax.swing.JPanel PanelSalas;
    private javax.swing.JTable TablePedidos;
    private javax.swing.JTable TablePlatos;
    public javax.swing.JTable TableUsuarios;
    private javax.swing.JButton btnActualizarConfig;
    private javax.swing.JButton btnActualizarSala;
    private javax.swing.JButton btnAddPlato;
    private javax.swing.JButton btnAgregarPedido;
    private javax.swing.JButton btnConfig;
    private javax.swing.JButton btnDescuento;
    private javax.swing.JButton btnEditarPlato;
    private javax.swing.JButton btnElimPlati;
    private javax.swing.JButton btnEliminarPedido;
    private javax.swing.JButton btnEliminarPlato;
    private javax.swing.JButton btnEliminarSala;
    private javax.swing.JButton btnEliminarTempPlato;
    private javax.swing.JButton btnEnsaladas;
    private javax.swing.JButton btnEntradas;
    private javax.swing.JButton btnEspec;
    private javax.swing.JButton btnExtras;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnFinalizarPedido;
    private javax.swing.JButton btnGenerarPedido;
    private javax.swing.JButton btnGuardarPlato;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnNuevoPlato;
    private javax.swing.JButton btnNuevoSala;
    private javax.swing.JButton btnPdfPedido;
    private javax.swing.JButton btnPlatos;
    private javax.swing.JButton btnPostres;
    private javax.swing.JButton btnRegistrarSala;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSala;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnUsuarios1;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton btnVerPedido;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JComboBox<String> cbxRol;
    private javax.swing.JComboBox<String> cbxSubCategoria;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JTable tableFinalizar;
    private javax.swing.JTable tableMenu;
    private javax.swing.JTable tableSala;
    private javax.swing.JTable tblTemPlatos;
    private javax.swing.JLabel tipo;
    private javax.swing.JLabel totalFinalizar;
    private javax.swing.JLabel totalMenu;
    private javax.swing.JTextField txtBuscarPlato;
    private javax.swing.JTextPane txtComentario;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccionConfig;
    private javax.swing.JTextField txtFechaHora;
    private javax.swing.JTextField txtHId;
    private javax.swing.JTextField txtIdConfig;
    private javax.swing.JTextField txtIdHistorialPedido;
    private javax.swing.JTextField txtIdPedido;
    private javax.swing.JTextField txtIdPlat;
    private javax.swing.JTextField txtIdPlato;
    private javax.swing.JTextField txtIdSala;
    private javax.swing.JTextField txtMensaje;
    private javax.swing.JTextField txtMesas;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreConfig;
    private javax.swing.JTextField txtNombrePlato;
    private javax.swing.JTextField txtNombreSala;
    private javax.swing.JTextField txtNumMesaFinalizar;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtPrecioPlato;
    private javax.swing.JTextField txtRolUser;
    private javax.swing.JTextField txtRucConfig;
    private javax.swing.JTextField txtSalaFinalizar;
    private javax.swing.JTextField txtTelefonoConfig;
    private javax.swing.JTextField txtTempCateg;
    private javax.swing.JTextField txtTempIDPed;
    private javax.swing.JTextField txtTempIdSala;
    private javax.swing.JTextField txtTempNumMesa;
    // End of variables declaration//GEN-END:variables

    private void TotalPagar(JTable tabla, JLabel label) {
        Totalpagar = 0.00;
        int numFila = tabla.getRowCount();
        for (int i = 0; i < numFila; i++) {
            double cal = Double.parseDouble(String.valueOf(tabla.getModel().getValueAt(i, 4)));
            Totalpagar += cal;
        }
        label.setText(String.format("%.2f", Totalpagar));
    }

    private void LimpiarTableMenu() {
        tmp = (DefaultTableModel) tableMenu.getModel();
        int fila = tableMenu.getRowCount();
        for (int i = 0; i < fila; i++) {
            tmp.removeRow(0);
        }
    }

    public void ListarConfig() {
        conf = lgDao.datosEmpresa();
        txtIdConfig.setText("" + conf.getId());
        txtRucConfig.setText("" + conf.getRuc());
        txtNombreConfig.setText("" + conf.getNombre());
        txtTelefonoConfig.setText("" + conf.getTelefono());
        txtDireccionConfig.setText("" + conf.getDireccion());
        txtMensaje.setText("" + conf.getMensaje());
    }

    private void ListarPedidos() {
        Tables color = new Tables();
        List<Pedidos> Listar = pedDao.listarPedidos();
        modelo = (DefaultTableModel) TablePedidos.getModel();
        Object[] ob = new Object[7];
        for (int i = 0; i < Listar.size(); i++) {
            ob[0] = Listar.get(i).getId();
            ob[1] = Listar.get(i).getSala();
            ob[2] = Listar.get(i).getUsuario();
            ob[3] = Listar.get(i).getNum_mesa();
            ob[4] = Listar.get(i).getFecha();
            ob[5] = Listar.get(i).getTotal();
            ob[6] = Listar.get(i).getEstado();
            modelo.addRow(ob);
        }
        colorHeader(TablePedidos);
        TablePedidos.setDefaultRenderer(Object.class, color);
    }

    public void LimpiarTable() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    private void ListarUsuarios() {
        List<login> Listar = lgDao.ListarUsuarios();
        modelo = (DefaultTableModel) TableUsuarios.getModel();
        Object[] ob = new Object[4];
        for (int i = 0; i < Listar.size(); i++) {
            ob[0] = Listar.get(i).getId();
            ob[1] = Listar.get(i).getNombre();
            ob[2] = Listar.get(i).getCorreo();
            ob[3] = Listar.get(i).getRol();
            modelo.addRow(ob);
        }
        colorHeader(TableUsuarios);
    }

    private void ListarSalas() {
        List<Salas> Listar = slDao.Listar();
        modelo = (DefaultTableModel) tableSala.getModel();
        Object[] ob = new Object[3];
        for (int i = 0; i < Listar.size(); i++) {
            ob[0] = Listar.get(i).getId();
            ob[1] = Listar.get(i).getNombre();
            ob[2] = Listar.get(i).getMesas();
            modelo.addRow(ob);
        }
        colorHeader(tableSala);

    }

    private void colorHeader(JTable tabla) {
        tabla.setModel(modelo);
        JTableHeader header = tabla.getTableHeader();
        header.setOpaque(false);
        header.setBackground(new Color(0, 110, 255));
        header.setForeground(Color.white);
    }

    private void LimpiarSala() {
        txtIdSala.setText("");
        txtNombreSala.setText("");
        txtMesas.setText("");
    }

    private void LimpiarPlatos() {
        txtIdPlato.setText("");
        txtNombrePlato.setText("");
        txtPrecioPlato.setText("");
    }

    private void panelSalas() {
        List<Salas> Listar = slDao.Listar();
        for (int i = 0; i < Listar.size(); i++) {
            int id = Listar.get(i).getId();
            int cantidad = Listar.get(i).getMesas();
            JButton boton = new JButton(Listar.get(i).getNombre(), new ImageIcon(getClass().getResource("/Img/Salas_icon.png")));
            boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            boton.setHorizontalTextPosition(JButton.CENTER);
            boton.setVerticalTextPosition(JButton.BOTTOM);
            boton.setBackground(new Color(204, 204, 204));
            PanelSalas.add(boton);
            boton.addActionListener((ActionEvent e) -> {
                LimpiarTable();
                PanelMesas.removeAll();
                panelMesas(id, cantidad);
                jTabbedPane1.setSelectedIndex(2);
            });
        }
    }

    //crear mesas
    /*private void panelMesas(int id_sala, int cant) {
        for (int i = 1; i <= cant; i++) {
            int num_mesa = i;
            //verificar estado
            JButton boton = new JButton("MESA N°: " + i, new ImageIcon(getClass().getResource("/Img/mesa.png")));
            boton.setHorizontalTextPosition(JButton.CENTER);
            boton.setVerticalTextPosition(JButton.BOTTOM);
            int verificar = pedDao.verificarStado(num_mesa, id_sala);
            if (verificar > 0) {
                boton.setBackground(new Color(255, 51, 51));
            } else {
                boton.setBackground(new Color(0, 102, 102));
            }
            boton.setForeground(Color.WHITE);
            boton.setFocusable(false);
            boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            PanelMesas.add(boton);
            boton.addActionListener((ActionEvent e) -> {
            LimpiarTable();
            ListarPlatos(tblTemPlatos);
            jTabbedPane1.setSelectedIndex(8);
            txtTempIdSala.setText("" + id_sala);
            txtTempNumMesa.setText("" + num_mesa);
            });
        }
    }*/
    private void panelMesas(int id_sala, int cant) {
        for (int i = 1; i <= cant; i++) {
            int num_mesa = i;
            //verificar estado
            JButton boton = new JButton("MESA N°: " + i, new ImageIcon(getClass().getResource("/Img/mesa.png")));
            boton.setHorizontalTextPosition(JButton.CENTER);
            boton.setVerticalTextPosition(JButton.BOTTOM);
            int verificar = pedDao.verificarStado(num_mesa, id_sala);
            if (verificar > 0) {
                boton.setBackground(new Color(255, 51, 51));
            } else {
                boton.setBackground(new Color(0, 102, 102));
            }
            boton.setForeground(Color.WHITE);
            boton.setFocusable(false);
            boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            PanelMesas.add(boton);
            boton.addActionListener((ActionEvent e) -> {
                if (verificar > 0) {
                    /*LimpiarTable();
                    verPedido(verificar);
                    verPedidoDetalle(verificar);
                    btnFinalizar.setEnabled(true);
                    btnPdfPedido.setEnabled(false);
                    jTabbedPane1.setSelectedIndex(3);*/
                    LimpiarTable();
                    ListarPlatos(tblTemPlatos);
                    jTabbedPane1.setSelectedIndex(8);
                    txtTempIdSala.setText("" + id_sala);
                    txtTempNumMesa.setText("" + num_mesa);
                    txtTempIDPed.setText("" + pedDao.IdPedido());
                    btnGenerarPedido.setVisible(false);
                    btnAgregarPedido.setVisible(true);
                    btnRegresar.setVisible(false);
                    btnFinalizarPedido.setVisible(true);
                    
                } else {
                    LimpiarTable();
                    ListarPlatos(tblTemPlatos);
                    jTabbedPane1.setSelectedIndex(8);
                    txtTempIdSala.setText("" + id_sala);
                    txtTempNumMesa.setText("" + num_mesa);
                    btnGenerarPedido.setVisible(true);
                    btnAgregarPedido.setVisible(false);
                    btnRegresar.setVisible(false);
                    btnFinalizarPedido.setVisible(false);
                }
            });
        }
    }

    // platos
    private void ListarPlatos(JTable tabla) {
        List<Platos> Listar = plaDao.Listar(txtBuscarPlato.getText(), fechaFormato);
        modelo = (DefaultTableModel) tabla.getModel();
        Object[] ob = new Object[5];
        for (int i = 0; i < Listar.size(); i++) {
            ob[0] = Listar.get(i).getId();
            ob[1] = Listar.get(i).getNombre();
            ob[2] = Listar.get(i).getPrecio();
            ob[3] = Listar.get(i).getCategoria();
            ob[4] = Listar.get(i).getSubCategoria();
            modelo.addRow(ob);
        }
        colorHeader(tabla);
    }
    
    private void ListarPlatosCategorias(JTable tabla) {
        List<Platos> Listar = plaDao.ListarCateg(txtTempCateg.getText(), fechaFormato);
        modelo = (DefaultTableModel) tabla.getModel();
        Object[] ob = new Object[5];
        for (int i = 0; i < Listar.size(); i++) {
            ob[0] = Listar.get(i).getId();
            ob[1] = Listar.get(i).getNombre();
            ob[2] = Listar.get(i).getPrecio();
            ob[3] = Listar.get(i).getCategoria();
            ob[4] = Listar.get(i).getSubCategoria();
            modelo.addRow(ob);
        }
        colorHeader(tabla);
    }

    //registrar pedido
    private void RegistrarPedido() {
        int id_sala = Integer.parseInt(txtTempIdSala.getText());
        int num_mesa = Integer.parseInt(txtTempNumMesa.getText());
        double monto = Totalpagar;
        ped.setId_sala(id_sala);
        ped.setNum_mesa(num_mesa);
        ped.setTotal(monto);
        ped.setUsuario(LabelVendedor.getText());
        pedDao.RegistrarPedido(ped);
    }

    private void detallePedido() {
        int id = pedDao.IdPedido();
        for (int i = 0; i < tableMenu.getRowCount(); i++) {
            String nombre = tableMenu.getValueAt(i, 1).toString();
            int cant = Integer.parseInt(tableMenu.getValueAt(i, 2).toString());
            double precio = Double.parseDouble(tableMenu.getValueAt(i, 3).toString());
            detPedido.setNombre(nombre);
            detPedido.setCantidad(cant);
            detPedido.setPrecio(precio);
            detPedido.setComentario(tableMenu.getValueAt(i, 5).toString());
            detPedido.setId_pedido(id);
            pedDao.RegistrarDetalle(detPedido);

        }
    }
    
    private void modificarDetallePedido(){
        int mesa = Integer.parseInt(txtTempNumMesa.getText());
        int sala = Integer.parseInt(txtTempIdSala.getText());
        int id = pedDao.IdPedidoMesa(mesa, sala);
        for (int i = 0; i < tableMenu.getRowCount(); i++) {
            String nombre = tableMenu.getValueAt(i, 1).toString();
            int cant = Integer.parseInt(tableMenu.getValueAt(i, 2).toString());
            double precio = Double.parseDouble(tableMenu.getValueAt(i, 3).toString());
            detPedido.setNombre(nombre);
            detPedido.setCantidad(cant);
            detPedido.setPrecio(precio);
            detPedido.setComentario(tableMenu.getValueAt(i, 5).toString());
            detPedido.setId_pedido(id);
            pedDao.RegistrarDetalle(detPedido);

        }
    }
    
    private void modificarTotalPedido(){
        int mesa = Integer.parseInt(txtTempNumMesa.getText());
        int sala = Integer.parseInt(txtTempIdSala.getText());
        double total = pedDao.VerTotalPedido(mesa, sala);
        double totalAct = total + Totalpagar;
        pedDao.EditarTotalPedido(totalAct, mesa, sala);
        
    }
    
    private void modificarTotal(double total){
        int mesa = Integer.parseInt(txtTempNumMesa.getText());
        int sala = Integer.parseInt(txtTempIdSala.getText());
        pedDao.EditarTotalPedido(total, mesa, sala);
        
    }
    private void modificarTotalPedidoNegativo(double precio){
        int mesa = Integer.parseInt(txtTempNumMesa.getText());
        int sala = Integer.parseInt(txtTempIdSala.getText());
        double total = pedDao.VerTotalPedido(mesa, sala);
        System.out.println(total);
        double totalAct = total - precio;
        System.out.println(totalAct);
        pedDao.EditarTotalPedido(totalAct, mesa, sala);
        
    }

    public void verPedidoDetalle(int id_pedido) {
        List<DetallePedido> Listar = pedDao.verPedidoDetalle(id_pedido);
        modelo = (DefaultTableModel) tableFinalizar.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i < Listar.size(); i++) {
            ob[0] = Listar.get(i).getId();
            ob[1] = Listar.get(i).getNombre();
            ob[2] = Listar.get(i).getCantidad();
            ob[3] = Listar.get(i).getPrecio();
            if(Listar.get(i).getCantidad()== 1.0){
                ob[4] = Listar.get(i).getPrecio();
            }else{
                ob[4] = (Listar.get(i).getPrecio()) - (Listar.get(i).getCantidad() * Listar.get(i).getPrecio());
            }
            ob[5] = Listar.get(i).getComentario();
            modelo.addRow(ob);
        }
        colorHeader(tableFinalizar);
    }

    public void verPedido(int id_pedido) {
        ped = pedDao.verPedido(id_pedido);
        txtFechaHora.setText("" + ped.getFecha());
        txtSalaFinalizar.setText("" + ped.getSala());
        txtNumMesaFinalizar.setText("" + ped.getNum_mesa());
        txtIdPedido.setText("" + ped.getId());
    }
    
    public int RolCheck(){
        if ("Mesero".equals(txtRolUser.getText())) {
            return 1;
        } else {
            return 0;
        }
    }

}
