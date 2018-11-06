/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Beans.UsuarioBE;
import Services.UsuarioBL;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author CESDEDOCLAB04
 */
public class V01GestionarPersona extends javax.swing.JInternalFrame {

    /**
     * Creates new form v01GestionarPersona
     */
    //PRIMER PASO
    UsuarioBL oUsuarioBL = new UsuarioBL();

    //TERCER PASO
    private void cargarDatosInicialesTabla1() {
        //Importar Persona Beans <Persona>
        List<UsuarioBE> listaPersonas = oUsuarioBL.listarPersonas();

        //QUINTO PASO
        DefaultTableModel modelo;

        String[] titulo = {"ID", "NOMBRE", "APELLIDO PATERNO", "APELLIDO MATERNO", "FECHA NACIMIENTO",
            "DNI", "CELULAR", "DIRECCIÓN", "EMAIL", "FACEBOOK", "ESTADO"};
        String[] registro = new String[11];
        modelo = new DefaultTableModel(null, titulo);

        //CUARTO PASO (ITERAMOS)
        for (UsuarioBE itemPer : listaPersonas) {
            registro[0] = itemPer.getIdusuario() + "";
            registro[1] = itemPer.getNombre();
            registro[2] = itemPer.getAppaterno();
            registro[3] = itemPer.getApmaterno();
            registro[4] = itemPer.getFecha_nacimiento();
            registro[5] = itemPer.getNrodocumento();
            registro[6] = itemPer.getTelefonomovil();
            registro[7] = itemPer.getDireccion();
            registro[8] = itemPer.getEmail();
            registro[9] = itemPer.getCuenta_facebook();
            registro[10] = itemPer.getEstado() + "";
//            registro[11] = itemPer.getUsuario();
//            registro[12] = itemPer.getContrasenia();
//            registro[13] = itemPer.getTelefonofijo();

            modelo.addRow(registro);
        }
        TBLPERSONA.setModel(modelo);
    }

    public V01GestionarPersona() {
        initComponents();
        centrarVentana();

        //REALIZA LOS FILTROS(BUSQUEDAS)
        TXTBUSCAR.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {

                repaint();
                filtro();
            }
        });

//----------------Titulo del formulario-----------------------------------------
        this.setTitle("GESTIONAR PERSONA");
        cargarDatosInicialesTabla1();

//----------------Para ocultar un columna (Columna ID)--------------------------
        TBLPERSONA.getColumnModel().getColumn(0).setMaxWidth(0);
        TBLPERSONA.getColumnModel().getColumn(0).setMinWidth(0);
        TBLPERSONA.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        TBLPERSONA.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);

//----------------Para ocultar un columna (Columna Fecha de Nacimiento)---------
        TBLPERSONA.getColumnModel().getColumn(4).setMaxWidth(0);
        TBLPERSONA.getColumnModel().getColumn(4).setMinWidth(0);
        TBLPERSONA.getTableHeader().getColumnModel().getColumn(4).setMaxWidth(0);
        TBLPERSONA.getTableHeader().getColumnModel().getColumn(4).setMaxWidth(0);

//----------------Para ocultar un columna (Columna DNI)-------------------------
        TBLPERSONA.getColumnModel().getColumn(5).setMaxWidth(0);
        TBLPERSONA.getColumnModel().getColumn(5).setMinWidth(0);
        TBLPERSONA.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(0);
        TBLPERSONA.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(0);

//----------------Para ocultar un columna (Columna Celular)---------------------
        TBLPERSONA.getColumnModel().getColumn(6).setMaxWidth(0);
        TBLPERSONA.getColumnModel().getColumn(6).setMinWidth(0);
        TBLPERSONA.getTableHeader().getColumnModel().getColumn(6).setMaxWidth(0);
        TBLPERSONA.getTableHeader().getColumnModel().getColumn(6).setMaxWidth(0);

//----------------Para ocultar un columna (Columna Dirección)-------------------
        TBLPERSONA.getColumnModel().getColumn(7).setMaxWidth(0);
        TBLPERSONA.getColumnModel().getColumn(7).setMinWidth(0);
        TBLPERSONA.getTableHeader().getColumnModel().getColumn(7).setMaxWidth(0);
        TBLPERSONA.getTableHeader().getColumnModel().getColumn(7).setMaxWidth(0);

//----------------Para ocultar un columna (Columna EMAIL)-------------------
        TBLPERSONA.getColumnModel().getColumn(8).setMaxWidth(0);
        TBLPERSONA.getColumnModel().getColumn(8).setMinWidth(0);
        TBLPERSONA.getTableHeader().getColumnModel().getColumn(8).setMaxWidth(0);
        TBLPERSONA.getTableHeader().getColumnModel().getColumn(8).setMaxWidth(0);

        //----------------Para ocultar un columna (Columna Facebook)-------------------
        TBLPERSONA.getColumnModel().getColumn(9).setMaxWidth(0);
        TBLPERSONA.getColumnModel().getColumn(9).setMinWidth(0);
        TBLPERSONA.getTableHeader().getColumnModel().getColumn(9).setMaxWidth(0);
        TBLPERSONA.getTableHeader().getColumnModel().getColumn(9).setMaxWidth(0);

        //----------------Para ocultar un columna (Columna Estado)-------------------
        TBLPERSONA.getColumnModel().getColumn(10).setMaxWidth(0);
        TBLPERSONA.getColumnModel().getColumn(10).setMinWidth(0);
        TBLPERSONA.getTableHeader().getColumnModel().getColumn(10).setMaxWidth(0);
        TBLPERSONA.getTableHeader().getColumnModel().getColumn(10).setMaxWidth(0);

//        TBLPERSONA.getColumnModel().getColumn(11).setMaxWidth(0);
//        TBLPERSONA.getColumnModel().getColumn(11).setMinWidth(0);
//        TBLPERSONA.getTableHeader().getColumnModel().getColumn(11).setMaxWidth(0);
//        TBLPERSONA.getTableHeader().getColumnModel().getColumn(11).setMaxWidth(0);
//        
//        TBLPERSONA.getColumnModel().getColumn(12).setMaxWidth(0);
//        TBLPERSONA.getColumnModel().getColumn(12).setMinWidth(0);
//        TBLPERSONA.getTableHeader().getColumnModel().getColumn(12).setMaxWidth(0);
//        TBLPERSONA.getTableHeader().getColumnModel().getColumn(12).setMaxWidth(0);
//        
//        TBLPERSONA.getColumnModel().getColumn(13).setMaxWidth(0);
//        TBLPERSONA.getColumnModel().getColumn(13).setMinWidth(0);
//        TBLPERSONA.getTableHeader().getColumnModel().getColumn(13).setMaxWidth(0);
//        TBLPERSONA.getTableHeader().getColumnModel().getColumn(13).setMaxWidth(0);
//----------------Deshabilitando los Cuadros de Texto---------------------------
        TXTID.setEnabled(false);
        TXTNOMBRE.setEnabled(false);
        TXTAPEPATERNO.setEnabled(false);
        TXTAPEMATERNO.setEnabled(false);
        TXTNACIMIENTO.setEnabled(false);
        TXTDNI.setEnabled(false);
        TXTCELULAR.setEnabled(false);
        TXTDIRECCION.setEnabled(false);
        TXTEMAIL.setEnabled(false);
        TXTFACEBOOK.setEnabled(false);
        CHKESTADO.setEnabled(false);

//----------------Deshabilitando los Botones---------------------------
        BTNNUEVO.setEnabled(true);
        BTNNUEVO.setText("NUEVO");
        BTNGUARDAR.setEnabled(false);
        BTNCANCELAR.setEnabled(false);
    }

    public void centrarVentana() {
        //El tamaño de nuestra ventana
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        //El tamaño de la aplicacion
        Dimension frameSize = getSize();
        //Hacer que la pantall de la aplicacion no exeda mi pantalla
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }

        //Centra Ventana
        setLocation((screenSize.width - frameSize.width) / 2,
                (screenSize.height - frameSize.height) / 7);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLPERSONA = new javax.swing.JTable();
        TXTBUSCAR = new javax.swing.JTextField();
        BTNBUSCAR = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        BTNNUEVO = new javax.swing.JButton();
        BTNGUARDAR = new javax.swing.JButton();
        BTNCANCELAR = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CHKESTADO = new javax.swing.JCheckBox();
        TXTID = new javax.swing.JTextField();
        TXTNOMBRE = new javax.swing.JTextField();
        TXTAPEPATERNO = new javax.swing.JTextField();
        TXTAPEMATERNO = new javax.swing.JTextField();
        TXTNACIMIENTO = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TXTDNI = new javax.swing.JTextField();
        TXTCELULAR = new javax.swing.JTextField();
        TXTDIRECCION = new javax.swing.JTextField();
        TXTEMAIL = new javax.swing.JTextField();
        TXTFACEBOOK = new javax.swing.JTextField();

        jButton3.setText("jButton3");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        TBLPERSONA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TBLPERSONA.getTableHeader().setResizingAllowed(false);
        TBLPERSONA.getTableHeader().setReorderingAllowed(false);
        TBLPERSONA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBLPERSONAMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBLPERSONA);

        TXTBUSCAR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTBUSCARKeyTyped(evt);
            }
        });

        BTNBUSCAR.setText("BUSCAR");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

        BTNNUEVO.setText("NUEVO/MODIFICAR");
        BTNNUEVO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNNUEVOMouseClicked(evt);
            }
        });
        BTNNUEVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNNUEVOActionPerformed(evt);
            }
        });

        BTNGUARDAR.setText("GUARDAR");
        BTNGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNGUARDARActionPerformed(evt);
            }
        });

        BTNCANCELAR.setText("CANCELAR");
        BTNCANCELAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNCANCELARMouseClicked(evt);
            }
        });

        jButton6.setText("GENERAR REPORTES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTNNUEVO)
                .addGap(18, 18, 18)
                .addComponent(BTNGUARDAR)
                .addGap(18, 18, 18)
                .addComponent(BTNCANCELAR)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNNUEVO)
                    .addComponent(BTNGUARDAR)
                    .addComponent(BTNCANCELAR)
                    .addComponent(jButton6))
                .addContainerGap())
        );

        jLabel3.setText("ID:");

        jLabel4.setText("NOMBRE:");

        jLabel5.setText("APELLIDO PATERNO:");

        jLabel6.setText("APELLIDO MATERNO:");

        jLabel7.setText("FECHA NACIMIENTO:");

        jLabel8.setText("ESTADO:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CHKESTADO)
                    .addComponent(TXTID, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTNACIMIENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTNOMBRE)
                    .addComponent(TXTAPEPATERNO)
                    .addComponent(TXTAPEMATERNO, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TXTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TXTNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TXTAPEPATERNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TXTAPEMATERNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TXTNACIMIENTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CHKESTADO))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DATOS PERSONALES", jPanel3);

        jLabel1.setText("DNI:");

        jLabel2.setText("CELULAR:");

        jLabel9.setText("DIRECCION:");

        jLabel10.setText("EMAIL:");

        jLabel11.setText("CUENTA FACEBOOK:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TXTDIRECCION)
                    .addComponent(TXTEMAIL)
                    .addComponent(TXTFACEBOOK, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(TXTCELULAR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                        .addComponent(TXTDNI, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TXTDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TXTCELULAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TXTDIRECCION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TXTEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TXTFACEBOOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DATOS CONTACTO", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jTabbedPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(TXTBUSCAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNBUSCAR))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNBUSCAR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TBLPERSONAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBLPERSONAMouseClicked
        int fila = TBLPERSONA.rowAtPoint(evt.getPoint());
        TableModel model = TBLPERSONA.getModel();

        TXTID.setText(TBLPERSONA.getValueAt(fila, 0).toString());
        TXTNOMBRE.setText(TBLPERSONA.getValueAt(fila, 1).toString());
        TXTAPEPATERNO.setText(TBLPERSONA.getValueAt(fila, 2).toString());
        TXTAPEMATERNO.setText(TBLPERSONA.getValueAt(fila, 3).toString());
        TXTNACIMIENTO.setText(TBLPERSONA.getValueAt(fila, 4).toString());
        TXTDNI.setText(TBLPERSONA.getValueAt(fila, 5).toString());
        TXTCELULAR.setText(TBLPERSONA.getValueAt(fila, 6).toString());
        TXTDIRECCION.setText(TBLPERSONA.getValueAt(fila, 7).toString());
        TXTEMAIL.setText(TBLPERSONA.getValueAt(fila, 8).toString());
        TXTFACEBOOK.setText(TBLPERSONA.getValueAt(fila, 9).toString());
        String gf = model.getValueAt(fila, 10).toString();
        if (gf.equals("true")) {
            CHKESTADO.setSelected(true);
        } else {
            CHKESTADO.setSelected(false);
        }

//        String(CHKESTADO, Integer.parseInt(TBLPERSONA.getValueAt(fila, 5).toString()));
//----------------Deshabilitando los Cuadros de Texto---------------------------
        TXTID.setEnabled(false);
        TXTNOMBRE.setEnabled(false);
        TXTAPEPATERNO.setEnabled(false);
        TXTAPEMATERNO.setEnabled(false);
        TXTNACIMIENTO.setEnabled(false);
        TXTDNI.setEnabled(false);
        TXTCELULAR.setEnabled(false);
        TXTDIRECCION.setEnabled(false);
        TXTEMAIL.setEnabled(false);
        TXTFACEBOOK.setEnabled(false);
        CHKESTADO.setEnabled(false);

//---------------Modificando los Botones----------------------------------------
        BTNNUEVO.setEnabled(true);
        BTNNUEVO.setText("MODIFICAR");
        BTNGUARDAR.setEnabled(false);
        BTNCANCELAR.setEnabled(true);

    }//GEN-LAST:event_TBLPERSONAMouseClicked

    private void BTNCANCELARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNCANCELARMouseClicked
        TXTID.setEnabled(false);
        TXTNOMBRE.setEnabled(false);
        TXTAPEPATERNO.setEnabled(false);
        TXTAPEMATERNO.setEnabled(false);
        TXTNACIMIENTO.setEnabled(false);
        TXTDNI.setEnabled(false);
        TXTCELULAR.setEnabled(false);
        TXTDIRECCION.setEnabled(false);
        TXTEMAIL.setEnabled(false);
        TXTFACEBOOK.setEnabled(false);
//        CHKESTADO.setEnabled(false);
        CHKESTADO.setSelected(false);

        BTNNUEVO.setEnabled(true);
        BTNNUEVO.setText("NUEVO");
        BTNGUARDAR.setEnabled(false);
        BTNCANCELAR.setEnabled(false);

        TXTID.setText("");
        TXTNOMBRE.setText("");
        TXTAPEPATERNO.setText("");
        TXTAPEMATERNO.setText("");
        TXTNACIMIENTO.setText("");
        TXTDNI.setText("");
        TXTCELULAR.setText("");
        TXTDIRECCION.setText("");
        TXTEMAIL.setText("");
        TXTFACEBOOK.setText("");
        CHKESTADO.setText("");
    }//GEN-LAST:event_BTNCANCELARMouseClicked

    private void BTNNUEVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNNUEVOActionPerformed
        if (BTNNUEVO.getText().equalsIgnoreCase("MODIFICAR")) {
            TXTNOMBRE.setEnabled(true);
            TXTAPEPATERNO.setEnabled(true);
            TXTAPEMATERNO.setEnabled(true);
            TXTNACIMIENTO.setEnabled(true);
            TXTDNI.setEnabled(true);
            TXTCELULAR.setEnabled(true);
            TXTDIRECCION.setEnabled(true);
            TXTEMAIL.setEnabled(true);
            TXTFACEBOOK.setEnabled(true);

        } else if (BTNNUEVO.getText().equalsIgnoreCase("NUEVO")) {
            TXTNOMBRE.setEnabled(true);
            TXTAPEPATERNO.setEnabled(true);
            TXTAPEMATERNO.setEnabled(true);
            TXTNACIMIENTO.setEnabled(true);
            TXTDNI.setEnabled(true);
            TXTCELULAR.setEnabled(true);
            TXTDIRECCION.setEnabled(true);
            TXTEMAIL.setEnabled(true);
            TXTFACEBOOK.setEnabled(true);

            TXTID.setText("");
            TXTNOMBRE.setText("");
            TXTAPEPATERNO.setText("");
            TXTAPEMATERNO.setText("");
            TXTNACIMIENTO.setText("");
            TXTDNI.setText("");
            TXTCELULAR.setText("");
            TXTDIRECCION.setText("");
            TXTEMAIL.setText("");
            TXTFACEBOOK.setText("");
            CHKESTADO.setText("");
            TXTNOMBRE.requestFocus();
        }
        BTNCANCELAR.setEnabled(true);
        BTNGUARDAR.setEnabled(true);
    }//GEN-LAST:event_BTNNUEVOActionPerformed

    private void BTNNUEVOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNNUEVOMouseClicked
        TXTID.setEnabled(false);
        TXTNOMBRE.setEnabled(true);
        TXTAPEPATERNO.setEnabled(true);
        TXTAPEMATERNO.setEnabled(true);
        TXTNACIMIENTO.setEnabled(true);
        TXTDNI.setEnabled(true);
        TXTCELULAR.setEnabled(true);
        TXTDIRECCION.setEnabled(true);
        TXTEMAIL.setEnabled(true);
        TXTFACEBOOK.setEnabled(true);
        CHKESTADO.setEnabled(true);
    }//GEN-LAST:event_BTNNUEVOMouseClicked

    private void BTNGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNGUARDARActionPerformed
        int opcion = 0;
        String tipoOperacion = BTNNUEVO.getText();

        UsuarioBE oUsuarioBE = new UsuarioBE();
        oUsuarioBE.setNombre(TXTNOMBRE.getText());
        oUsuarioBE.setAppaterno(TXTAPEPATERNO.getText());
        oUsuarioBE.setApmaterno(TXTAPEMATERNO.getText());
        oUsuarioBE.setFecha_nacimiento(TXTNACIMIENTO.getText());
        oUsuarioBE.setNrodocumento(TXTDNI.getText());
        oUsuarioBE.setTelefonomovil(TXTCELULAR.getText());
        oUsuarioBE.setDireccion(TXTDIRECCION.getText());
        oUsuarioBE.setEmail(TXTEMAIL.getText());
        oUsuarioBE.setCuenta_facebook(TXTFACEBOOK.getText());
        if (CHKESTADO.isSelected()) {
            oUsuarioBE.setEstado(true);
        } else {
            oUsuarioBE.setEstado(false);
        }

        //En caso que no tenga ID usamos try-catch
        //(Por ejemplo cuando agrega una nueva persona el id va estar en blanco y trata de transformar
        // en entero y ese transcurso sufre un error)
        try {
            oUsuarioBE.setIdusuario(Integer.parseInt(TXTID.getText()));
        } catch (Exception e) {

        }

        if (tipoOperacion.equals("NUEVO")) {
            opcion = JOptionPane.showConfirmDialog(this, "Confirma Agregar", "Agregar", JOptionPane.YES_NO_OPTION);

            if (opcion == 0) {
//--------------------FALTA EL METODO ADDPERSONA--------------------------------
               
                  System.out.println("Nombrrrrrre "+oUsuarioBE.getNombre());
                       
                       
                UsuarioBE respuesta = oUsuarioBL.addUser(oUsuarioBE);

                if (respuesta.getIndOpSp() != 1) {
                    JOptionPane.showMessageDialog(this, "Ha fallado");
                } else {
                    JOptionPane.showMessageDialog(this, "Se ha realizado la Operación");
                    cargarDatosInicialesTabla1();
                }

            } else {
                JOptionPane.showMessageDialog(this, "Canceló la Operación");

            }

//--------------------FALTA EL METODO MODIFYPERSONA--------------------------------
        } else if (tipoOperacion.equals("MODIFICAR")) {
            opcion = JOptionPane.showConfirmDialog(this, "Confirma Modificar", "Modificar", JOptionPane.YES_NO_OPTION);

            //Opcion es 0 cuando selecciona si
            if (opcion == 0) {
                System.out.println("estado vista" + oUsuarioBE);
                UsuarioBE respuesta = oUsuarioBL.updateUser(oUsuarioBE);

                if (respuesta.getIndOpSp() != 1) {
                    JOptionPane.showMessageDialog(this, "Ha fallado");
                } else {
                    JOptionPane.showMessageDialog(this, "Se ha realizado la Operación");
                    cargarDatosInicialesTabla1();
                }

            } else {
                JOptionPane.showMessageDialog(this, "Canceló la Operación");

            }
        }

//----------------Para ocultar un columna (Columna ID)--------------------------
        TBLPERSONA.getColumnModel().getColumn(0).setMaxWidth(0);
        TBLPERSONA.getColumnModel().getColumn(0).setMinWidth(0);
        TBLPERSONA.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        TBLPERSONA.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);

//----------------Para ocultar un columna (Columna Fecha de Nacimiento)---------
        TBLPERSONA.getColumnModel().getColumn(4).setMaxWidth(0);
        TBLPERSONA.getColumnModel().getColumn(4).setMinWidth(0);
        TBLPERSONA.getTableHeader().getColumnModel().getColumn(4).setMaxWidth(0);
        TBLPERSONA.getTableHeader().getColumnModel().getColumn(4).setMaxWidth(0);

//----------------Para ocultar un columna (Columna DNI)-------------------------
        TBLPERSONA.getColumnModel().getColumn(5).setMaxWidth(0);
        TBLPERSONA.getColumnModel().getColumn(5).setMinWidth(0);
        TBLPERSONA.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(0);
        TBLPERSONA.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(0);

//----------------Para ocultar un columna (Columna Celular)---------------------
        TBLPERSONA.getColumnModel().getColumn(6).setMaxWidth(0);
        TBLPERSONA.getColumnModel().getColumn(6).setMinWidth(0);
        TBLPERSONA.getTableHeader().getColumnModel().getColumn(6).setMaxWidth(0);
        TBLPERSONA.getTableHeader().getColumnModel().getColumn(6).setMaxWidth(0);

//----------------Para ocultar un columna (Columna Dirección)-------------------
        TBLPERSONA.getColumnModel().getColumn(7).setMaxWidth(0);
        TBLPERSONA.getColumnModel().getColumn(7).setMinWidth(0);
        TBLPERSONA.getTableHeader().getColumnModel().getColumn(7).setMaxWidth(0);
        TBLPERSONA.getTableHeader().getColumnModel().getColumn(7).setMaxWidth(0);

//----------------Para ocultar un columna (Columna EMAIL)-------------------
        TBLPERSONA.getColumnModel().getColumn(8).setMaxWidth(0);
        TBLPERSONA.getColumnModel().getColumn(8).setMinWidth(0);
        TBLPERSONA.getTableHeader().getColumnModel().getColumn(8).setMaxWidth(0);
        TBLPERSONA.getTableHeader().getColumnModel().getColumn(8).setMaxWidth(0);

        //----------------Para ocultar un columna (Columna Facebook)-------------------
        TBLPERSONA.getColumnModel().getColumn(9).setMaxWidth(0);
        TBLPERSONA.getColumnModel().getColumn(9).setMinWidth(0);
        TBLPERSONA.getTableHeader().getColumnModel().getColumn(9).setMaxWidth(0);
        TBLPERSONA.getTableHeader().getColumnModel().getColumn(9).setMaxWidth(0);

        //----------------Para ocultar un columna (Columna Estado)-------------------
        TBLPERSONA.getColumnModel().getColumn(10).setMaxWidth(0);
        TBLPERSONA.getColumnModel().getColumn(10).setMinWidth(0);
        TBLPERSONA.getTableHeader().getColumnModel().getColumn(10).setMaxWidth(0);
        TBLPERSONA.getTableHeader().getColumnModel().getColumn(10).setMaxWidth(0);

    }//GEN-LAST:event_BTNGUARDARActionPerformed

    private void TXTBUSCARKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTBUSCARKeyTyped
        //REALIZA LOS FILTROS(BUSQUEDAS)
        trsfiltro = new TableRowSorter(TBLPERSONA.getModel());
        TBLPERSONA.setRowSorter(trsfiltro);

        String nombre = TXTBUSCAR.getText();
        if (nombre.length() > 0) {
            char primero = nombre.charAt(0);
            nombre = Character.toUpperCase(primero) + nombre.substring(1, nombre.length()).toLowerCase();
            TXTBUSCAR.setText(nombre);
        }
    }//GEN-LAST:event_TXTBUSCARKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNBUSCAR;
    private javax.swing.JButton BTNCANCELAR;
    private javax.swing.JButton BTNGUARDAR;
    private javax.swing.JButton BTNNUEVO;
    private javax.swing.JCheckBox CHKESTADO;
    private javax.swing.JTable TBLPERSONA;
    private javax.swing.JTextField TXTAPEMATERNO;
    private javax.swing.JTextField TXTAPEPATERNO;
    private javax.swing.JTextField TXTBUSCAR;
    private javax.swing.JTextField TXTCELULAR;
    private javax.swing.JTextField TXTDIRECCION;
    private javax.swing.JTextField TXTDNI;
    private javax.swing.JTextField TXTEMAIL;
    private javax.swing.JTextField TXTFACEBOOK;
    private javax.swing.JTextField TXTID;
    private javax.swing.JTextField TXTNACIMIENTO;
    private javax.swing.JTextField TXTNOMBRE;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

//REALIZA LOS FILTROS(BUSQUEDAS)
    public void filtro() {

        filtro = TXTBUSCAR.getText();

        trsfiltro.setRowFilter(RowFilter.regexFilter(TXTBUSCAR.getText(), 1));
    }
//-----------------------------------------------------------------------------   
    private TableRowSorter trsfiltro;
    String filtro;
}
