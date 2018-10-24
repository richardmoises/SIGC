package Vistas;

import Services.UsuarioBL;
import Beans.UsuarioBE;
import util.Centrar;
import util.FuncionesHash;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;

//Modificado po ARMIN ENRIQUE
public class AutenticarUsuarioPrincipal extends javax.swing.JInternalFrame {

    private URL path = getClass().getResource("/Img/loginFondo.jpg");
    private ImageIcon imgn = new ImageIcon(path);
    private Image img = imgn.getImage();
    private Principal princ;
    private JDesktopPane des;
    private JToolBar tool;
    private JMenuBar menu;
    private int cont = 3;
    private HashMap<String, Integer> mapIdUsuario = new HashMap<String, Integer>();

    AutenticarUsuarioPrincipal(Principal aThis, JDesktopPane JD, JToolBar JTBTool, JMenuBar JMenu) {
        this.princ = aThis;
        this.des = JD;
        this.tool = JTBTool;
        this.menu = JMenu;
        initComponents();
        JLBIntento.setText("Ud. tiene " + cont + " intentos para ingresar al sistema,");
        new Centrar(this, 120);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXImagePanel1 = new org.jdesktop.swingx.JXImagePanel();
        jPanel1 = new javax.swing.JPanel();
        JTFUsuaruio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JPFPassword = new javax.swing.JPasswordField();
        jXHyperlink1 = new org.jdesktop.swingx.JXHyperlink();
        jPanel4 = new javax.swing.JPanel();
        JBIngresar = new javax.swing.JButton();
        JBSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        JLBIntentoAbajo = new javax.swing.JLabel();
        JLBIntento = new javax.swing.JLabel();
        JLBError = new javax.swing.JLabel();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jXImagePanel1.setImage(img);

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Usuario:");
        jLabel1.setForeground(new java.awt.Color(37, 55, 82));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Password:");
        jLabel2.setForeground(new java.awt.Color(37, 55, 82));

        JPFPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JPFPasswordKeyPressed(evt);
            }
        });

        jXHyperlink1.setClickedColor(new java.awt.Color(255, 255, 255));
        jXHyperlink1.setText("» Configurar Base de Datos");
        jXHyperlink1.setToolTipText("Configure la base de datos.");
        jXHyperlink1.setUnclickedColor(new java.awt.Color(255, 255, 255));
        jXHyperlink1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jXHyperlink1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXHyperlink1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(300, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JPFPassword)
                            .addComponent(JTFUsuaruio, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69))
                    .addComponent(jXHyperlink1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jXHyperlink1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFUsuaruio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JPFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 0));
        jPanel4.setOpaque(false);

        JBIngresar.setText("Ingresar");
        JBIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBIngresarActionPerformed(evt);
            }
        });

        JBSalir.setText("Salir");
        JBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(JBIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBIngresar)
                    .addComponent(JBSalir))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));
        jPanel2.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 0));
        jPanel3.setOpaque(false);

        JLBIntentoAbajo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JLBIntentoAbajo.setText("después se cerrará automáticamente.");
        JLBIntentoAbajo.setForeground(new java.awt.Color(241, 241, 255));

        JLBIntento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JLBIntento.setText("R");
        JLBIntento.setForeground(new java.awt.Color(241, 241, 255));

        JLBError.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JLBError.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLBError.setText("Si existe error va aqui...");
        JLBError.setForeground(new java.awt.Color(153, 153, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLBIntentoAbajo, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(JLBIntento, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(JLBError, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(JLBError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLBIntento, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLBIntentoAbajo)
                .addContainerGap())
        );

        javax.swing.GroupLayout jXImagePanel1Layout = new javax.swing.GroupLayout(jXImagePanel1);
        jXImagePanel1.setLayout(jXImagePanel1Layout);
        jXImagePanel1Layout.setHorizontalGroup(
            jXImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXImagePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jXImagePanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jXImagePanel1Layout.setVerticalGroup(
            jXImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXImagePanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jXImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXImagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXImagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

        JLBError.setText("Mensaje: ");
        ocultarArriba(false);
        JTFUsuaruio.requestFocus();
    }//GEN-LAST:event_formInternalFrameOpened

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        ocultarArriba(true);
    }//GEN-LAST:event_formInternalFrameClosed

    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
        if (JOptionPane.showInternalConfirmDialog(des, "¿Esta seguro de salir del Sistema?", "Cerrar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
}//GEN-LAST:event_JBSalirActionPerformed

    private void JBIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBIngresarActionPerformed

        //princ.llenarUsuario(null);
        
        UsuarioBE oUsuarioBE = new UsuarioBE();
        oUsuarioBE.setNombre(JTFUsuaruio.getText());
        princ.llenarUsuario(oUsuarioBE);
        this.dispose();
        
        /*
        this.dispose();

        if (JTFUsuaruio.getText().equals("")) {
            JOptionPane.showInternalMessageDialog(des, "Debe ingresar un usuario.");
            JTFUsuaruio.requestFocus();
        } else {
            UsuarioBE oUsuarioBE = autenticarUsuario(JTFUsuaruio.getText(), JPFPassword.getPassword());
            if (!oUsuarioBE.isInExist()) {
                cont--;
                if (cont == 0) {
                    System.exit(0);
                } else {
                    JLBError.setText("Password incorrecto");
                    JLBIntento.setText("Ud. tiene " + cont + " intentos para ingresar al sistema,");
                    JPFPassword.setText("");
                    JPFPassword.requestFocus();
                }
            } else {
                princ.llenarUsuario(oUsuarioBE);
                this.dispose();
            }
        }
                */

    }//GEN-LAST:event_JBIngresarActionPerformed

    private void JPFPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JPFPasswordKeyPressed
        JLBError.setText("Mensaje: ");
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (JTFUsuaruio.getText().equals("")) {
                JOptionPane.showInternalMessageDialog(des, "Debe ingresar un usuario.");
                JTFUsuaruio.requestFocus();
            } else {
                UsuarioBE oUsuarioBE = autenticarUsuario(JTFUsuaruio.getText(), JPFPassword.getPassword());
                if (!oUsuarioBE.isInExist()) {
                    cont--;
                    if (cont == 0) {
                        System.exit(0);
                    } else {
                        JLBError.setText("Password incorrecto");
                        JLBIntento.setText("Ud. tiene " + cont + " intentos para ingresar al sistema,");
                        JPFPassword.setText("");
                        JPFPassword.requestFocus();
                    }
                } else {
                    princ.llenarUsuario(oUsuarioBE);
                    this.dispose();
                }
            }
        }
}//GEN-LAST:event_JPFPasswordKeyPressed

    private void jXHyperlink1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXHyperlink1ActionPerformed
        AdministrarBaseDatos oAdministrarBaseDatos = new AdministrarBaseDatos(des, tool, menu);
        des.add(oAdministrarBaseDatos);
        oAdministrarBaseDatos.setVisible(true);
    }//GEN-LAST:event_jXHyperlink1ActionPerformed

    private void ocultarArriba(boolean b) {
        tool.setVisible(b);
        menu.setVisible(b);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBIngresar;
    private javax.swing.JButton JBSalir;
    private javax.swing.JLabel JLBError;
    private javax.swing.JLabel JLBIntento;
    private javax.swing.JLabel JLBIntentoAbajo;
    private javax.swing.JPasswordField JPFPassword;
    private javax.swing.JTextField JTFUsuaruio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private org.jdesktop.swingx.JXHyperlink jXHyperlink1;
    private org.jdesktop.swingx.JXImagePanel jXImagePanel1;
    // End of variables declaration//GEN-END:variables

    private UsuarioBE autenticarUsuario(String login, char[] password) {
        UsuarioBE oUsuarioBE = null;
        try {
            UsuarioBE oUsuarioBE1 = new UsuarioBE();
            oUsuarioBE1.setIndOpSp(Commons.Common.c_numDos);
            oUsuarioBE1.setUsuario(login);
            UsuarioBL oUsuarioBL = new UsuarioBL();
            oUsuarioBE = oUsuarioBL.listarUsuarioBE(oUsuarioBE1);
            if (oUsuarioBE.getIdusuario() > 0) {
                String resumen = FuncionesHash.funcionResumenMd5Cadena(java.util.Arrays.toString(JPFPassword.getPassword()).toString());
                if (password != null && oUsuarioBE.getContrasenia() != null && resumen.equals(oUsuarioBE.getContrasenia())) {
                    oUsuarioBE.setInExist(true);
                }
            }
        } catch (Exception ex) {
            oUsuarioBE.setInExist(false);
            ex.printStackTrace();
        }

        return oUsuarioBE;
    }

    private void cargarComboUsuario() {
        try {
            ArrayList<UsuarioBE> listaUsuarioBE;
            UsuarioBE oUsuarioBE1 = new UsuarioBE();
            oUsuarioBE1.setIndOpSp(Commons.Common.c_numUno);
            UsuarioBL oUsuarioBL = new UsuarioBL();
            listaUsuarioBE = oUsuarioBL.listarRegistrosUsuarioBE(oUsuarioBE1);
            for (UsuarioBE oUsuarioBE : listaUsuarioBE) {
                mapIdUsuario.put(oUsuarioBE.getUsuario(), oUsuarioBE.getIdusuario());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
