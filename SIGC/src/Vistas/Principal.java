package Vistas;
// modificado por luis eduardo

import Services.RolBL;
import Beans.UsuarioBE;
import DAO.UsuarioDA;
import Services.UsuarioBL;
import util.Background;
//import de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

public class Principal extends javax.swing.JFrame {

    private int idUsuario;
    private HashMap<Integer, JComponent> mapJMI = new HashMap<Integer, JComponent>();
    //private HashMap<Integer, JButton> mapBtn=new HashMap<Integer, JButton>();

    public Principal() {
        try {
            //UIManager.setLookAndFeel(new SyntheticaStandardLookAndFeel());
            initComponents();
            setExtendedState(Principal.MAXIMIZED_BOTH);
            ponerFondo(JDPContenedor);
            AutenticarUsuarioPrincipal oAutenticarUsuarioPrincipal = new AutenticarUsuarioPrincipal(this, JDPContenedor, JTBTool, JMBMenu);
            JDPContenedor.add(oAutenticarUsuarioPrincipal);
            oAutenticarUsuarioPrincipal.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDPContenedor = new javax.swing.JDesktopPane();
        JTBTool = new javax.swing.JToolBar();
        JBImportarActas = new javax.swing.JButton();
        JBImportarAlumnos = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        JBSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JLBUsuario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        JLBFecha = new javax.swing.JLabel();
        JMBMenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        JMIAdminUsuario = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        JMIAdminSecretario = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        JMIAyuda = new javax.swing.JMenuItem();
        JMIAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Emisión de Certificados");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        JTBTool.setFloatable(false);
        JTBTool.setRollover(true);

        JBImportarActas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/importActas7.png"))); // NOI18N
        JBImportarActas.setText("Importar Actas");
        JBImportarActas.setToolTipText("Importar actas desde un archivo Excel.");
        JBImportarActas.setFocusable(false);
        JBImportarActas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBImportarActas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBImportarActas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBImportarActasActionPerformed(evt);
            }
        });
        JTBTool.add(JBImportarActas);

        JBImportarAlumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/importActas9.png"))); // NOI18N
        JBImportarAlumnos.setText("Importar Alumnos");
        JBImportarAlumnos.setToolTipText("Importar alumnos desde un archivo Excel.");
        JBImportarAlumnos.setFocusable(false);
        JBImportarAlumnos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBImportarAlumnos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBImportarAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBImportarAlumnosActionPerformed(evt);
            }
        });
        JTBTool.add(JBImportarAlumnos);
        JTBTool.add(jSeparator4);

        JBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/close.png"))); // NOI18N
        JBSalir.setText("     Salir     ");
        JBSalir.setToolTipText("Salir del sistema");
        JBSalir.setFocusable(false);
        JBSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalirActionPerformed(evt);
            }
        });
        JTBTool.add(JBSalir);

        jLabel1.setText("FECHA:");

        jLabel3.setText("BIENVENIDO:");

        JLBUsuario.setText("Nombre");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        JLBFecha.setText("Fecha:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLBFecha)
                .addGap(106, 106, 106)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLBUsuario)
                .addContainerGap(353, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLBUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLBFecha)))
        );

        jMenu1.setText(" Administrador ");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        JMIAdminUsuario.setText("Administrar Usuario");
        JMIAdminUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIAdminUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(JMIAdminUsuario);
        jMenu1.add(jSeparator9);

        JMIAdminSecretario.setText("Administrar Secretario General");
        JMIAdminSecretario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIAdminSecretarioActionPerformed(evt);
            }
        });
        jMenu1.add(JMIAdminSecretario);

        JMBMenu.add(jMenu1);

        jMenu7.setText(" Ayuda ");

        JMIAyuda.setText("Ayuda");
        JMIAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIAyudaActionPerformed(evt);
            }
        });
        jMenu7.add(JMIAyuda);

        JMIAcercaDe.setText("Acerca de Nosotros    ");
        JMIAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIAcercaDeActionPerformed(evt);
            }
        });
        jMenu7.add(JMIAcercaDe);

        JMBMenu.add(jMenu7);

        setJMenuBar(JMBMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTBTool, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JDPContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JTBTool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JDPContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        //deshabilitar todos los controles
        JMIAdminUsuario.setEnabled(false);
        JMIAdminSecretario.setEnabled(false);
        JMIAyuda.setEnabled(false);
        JMIAcercaDe.setEnabled(false);
        JBImportarActas.setEnabled(false);
        JBImportarAlumnos.setEnabled(false);
        JBSalir.setEnabled(false);

        //crear array de controles
        mapJMI.put(1, JMIAdminUsuario);
        mapJMI.put(2, JMIAdminSecretario);
        mapJMI.put(3, JMIAyuda);
        mapJMI.put(4, JMIAcercaDe);
        mapJMI.put(5, JBImportarActas);
        mapJMI.put(6, JBImportarAlumnos);
        mapJMI.put(7, JBSalir);

    }//GEN-LAST:event_formWindowOpened

    private void JMIAdminUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIAdminUsuarioActionPerformed

        /*
         AdministrarUsuario oAdministrarJefeOficina = new AdministrarUsuario(JDPContenedor, JTBTool, JMBMenu);
         JDPContenedor.add(oAdministrarJefeOficina);
         oAdministrarJefeOficina.setVisible(true);
         */
    }//GEN-LAST:event_JMIAdminUsuarioActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void JMIAdminSecretarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIAdminSecretarioActionPerformed
        /*
         AdministrarSecretarioGeneral oAdministrarSecretarioGeneral = new AdministrarSecretarioGeneral(JDPContenedor, JTBTool, JMBMenu);
         JDPContenedor.add(oAdministrarSecretarioGeneral);
         oAdministrarSecretarioGeneral.setVisible(true);
         */
    }//GEN-LAST:event_JMIAdminSecretarioActionPerformed

    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed

        if (JOptionPane.showInternalConfirmDialog(JDPContenedor, "¿Esta seguro de salir del Sistema?", "Cerrar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }//GEN-LAST:event_JBSalirActionPerformed

    private void JMIAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIAcercaDeActionPerformed
        AcercaDe oAcercaDe = new AcercaDe(JDPContenedor, JTBTool, JMBMenu);
        JDPContenedor.add(oAcercaDe);
        oAcercaDe.setVisible(true);
    }//GEN-LAST:event_JMIAcercaDeActionPerformed

    private void JBImportarActasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBImportarActasActionPerformed

        /*
         SeleccionarTipoActaAImportar oSeleccionarTipoActaAImportar = new SeleccionarTipoActaAImportar(JDPContenedor, JTBTool, JMBMenu, idUsuario, "importar");
         JDPContenedor.add(oSeleccionarTipoActaAImportar);
         oSeleccionarTipoActaAImportar.setVisible(true);
         */
    }//GEN-LAST:event_JBImportarActasActionPerformed

    private void JBImportarAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBImportarAlumnosActionPerformed
        /*
         SeleccionarTipoAlumnoImportar oSeleccionarTipoAlumnoImportar = new SeleccionarTipoAlumnoImportar(JDPContenedor, JTBTool, JMBMenu);
         JDPContenedor.add(oSeleccionarTipoAlumnoImportar);
         oSeleccionarTipoAlumnoImportar.setVisible(true);
         */
    }//GEN-LAST:event_JBImportarAlumnosActionPerformed

    private void JMIAdministrarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO aJMIAdministrarAlumnoActionPerformed
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void JMIAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIAyudaActionPerformed
//        // TODO add your handling code here:
        Ayuda oAyuda = new Ayuda(JDPContenedor, JTBTool, JMBMenu);
        JDPContenedor.add(oAyuda);
        oAyuda.setVisible(true);

    }//GEN-LAST:event_JMIAyudaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Principal().setVisible(true);
            }
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBImportarActas;
    private javax.swing.JButton JBImportarAlumnos;
    private javax.swing.JButton JBSalir;
    private javax.swing.JDesktopPane JDPContenedor;
    private javax.swing.JLabel JLBFecha;
    private javax.swing.JLabel JLBUsuario;
    private javax.swing.JMenuBar JMBMenu;
    private javax.swing.JMenuItem JMIAcercaDe;
    private javax.swing.JMenuItem JMIAdminSecretario;
    private javax.swing.JMenuItem JMIAdminUsuario;
    private javax.swing.JMenuItem JMIAyuda;
    private javax.swing.JToolBar JTBTool;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    // End of variables declaration//GEN-END:variables

    private void ponerFondo(JDesktopPane JDPContenedor) {
        BufferedImage imagen = null;
        URL path = getClass().getClassLoader().getResource("Img/backgroundFinal1.jpg");

        try {
            imagen = ImageIO.read(path);
            JDPContenedor.setBorder(new Background(imagen));
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }

    void llenarUsuario(UsuarioBE oUsuarioBE) {
//        this.idUsuario = oUsuarioBE.getIdusuario();
//        JLBUsuario.setText(oUsuarioBE.getNombre().toUpperCase() + " " + oUsuarioBE.getAppaterno().toUpperCase() + " " + oUsuarioBE.getApmaterno().toUpperCase());
        Date d = new Date();
        SimpleDateFormat dia = new SimpleDateFormat("EEEE dd");
        SimpleDateFormat mes = new SimpleDateFormat("MMMM");
        SimpleDateFormat anio = new SimpleDateFormat("yyyy");
        JLBFecha.setText(dia.format(d).toUpperCase() + " DE " + mes.format(d).toUpperCase() + " DEL " + anio.format(d));
        
        validarRolUsuario(oUsuarioBE);
       
    }

    private void validarRolUsuario(UsuarioBE oUsuarioBE) {

        // actualizando los menus segun el permiso que tenga
        UsuarioBL oUsuarioBL = new UsuarioBL();
        List<Integer> listaIds = 
                oUsuarioBL.obtenerIdVistaByUsuario(oUsuarioBE);

        for(Integer id : listaIds){
            mapJMI.get(id).setEnabled(true);
        }
        
        // mostrando los datos de la persona que se esta
        // logueando o entrando al sistema
        UsuarioBE oUsuarioBE2 = new UsuarioBE();
        oUsuarioBE2 = oUsuarioBL.findUsuarioByUserAndPass(oUsuarioBE.getUsuario()
                ,oUsuarioBE.getContrasenia());
        
        if(oUsuarioBE2 != null){
            JLBUsuario.setText(oUsuarioBE2.getNombre()
                +" "+oUsuarioBE2.getAppaterno()
                +" "+oUsuarioBE2.getApmaterno());
        }
        
        
    }
}

        //Esta recorriendo el mapJMI
//        for (int i = 1; i <= 7; i++) {
//            JComponent oJcomp = mapJMI.get(i);
//            oJcomp.setEnabled(true);
//        }
//
//            fila[0] = itemPer.getId() + "";
//            fila[1] = itemPer.getNombres();
//            fila[2] = itemPer.getApellidos();
//            model.addRow(fila);
//
//        }
//        mapJMI.get(3).setEnabled(true);
//        mapJMI.get(4).setEnabled(true);
//        mapJMI.get(7).setEnabled(true);

