/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antonio
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form inicio
     */
    public home() {
        initComponents();
        this.setLocationRelativeTo(null);
         rsscalelabel.RSScaleLabel.setScaleLabel(img_clientes, "src/images/persona.png");
          rsscalelabel.RSScaleLabel.setScaleLabel(img_logout, "src/images/logout.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        img_clientes = new javax.swing.JLabel();
        img_logout = new javax.swing.JLabel();
        btn_alta = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn_alta1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(img_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 80, 80));
        getContentPane().add(img_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 80, 80));

        btn_alta.setText("Alta de Cliente");
        btn_alta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_alta.setMargin(new java.awt.Insets(2, 14, 15, 14));
        btn_alta.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_altaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 200, 100));

        jButton3.setText("jButton1");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 200, 100));

        jButton2.setText("jButton1");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 40, 200, 100));

        btn_alta1.setText("Cerrar Sesion");
        btn_alta1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_alta1.setMargin(new java.awt.Insets(2, 14, 15, 14));
        btn_alta1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_alta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alta1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_alta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 200, 100));

        jMenu1.setText("Clientes");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem1.setText("Alta Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_altaActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        altaclientes vista=new altaclientes();
        vista.setVisible(true);
    }//GEN-LAST:event_btn_altaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        altaclientes vista=new altaclientes();
        vista.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btn_alta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alta1ActionPerformed
        // TODO add your handling code here:
           this.setVisible(false);
        Login vista=new Login();
        vista.setVisible(true);
    }//GEN-LAST:event_btn_alta1ActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alta;
    private javax.swing.JButton btn_alta1;
    private javax.swing.JLabel img_clientes;
    private javax.swing.JLabel img_logout;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
