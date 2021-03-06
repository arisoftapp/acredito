
import complementos.apiClientes;
import javax.swing.JOptionPane;
import org.json.JSONObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Desarrollo
 */
public class modificarCliente extends javax.swing.JFrame {

    /**
     * Creates new form modificarCliente
     */
    public modificarCliente() {
        initComponents();
            this.setLocationRelativeTo(null);
          desactivarComponentes();
    }
    public void desactivarComponentes()
    {
        txt_comentarios.setEnabled(false);
        txt_nombre.setEnabled(false);
        txt_paterno.setEnabled(false);
        txt_materno.setEnabled(false);
        txt_puesto.setEnabled(false);
    }
        public void activarComponentes()
    {
        txt_comentarios.setEnabled(true);
        txt_nombre.setEnabled(true);
        txt_paterno.setEnabled(true);
        txt_materno.setEnabled(true);
        txt_puesto.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jtp_main = new javax.swing.JTabbedPane();
        jp_cliente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_puesto = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_paterno = new javax.swing.JTextField();
        txt_materno = new javax.swing.JTextField();
        txt_codigoMacro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_comentarios = new javax.swing.JTextArea();
        jp_huella = new javax.swing.JPanel();
        jp_doc = new javax.swing.JPanel();
        btn_guardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("");
        setPreferredSize(new java.awt.Dimension(600, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        txt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_codigoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codigoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 5, 150, 30));

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 5, -1, 30));

        jtp_main.setPreferredSize(new java.awt.Dimension(500, 400));

        jp_cliente.setPreferredSize(new java.awt.Dimension(500, 500));
        jp_cliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nombre:");
        jp_cliente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, 30));

        jLabel3.setText("Apellido Paterno:");
        jp_cliente.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 30));

        jLabel4.setText("Apellido Materno:");
        jp_cliente.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, 30));

        jLabel5.setText("Puesto:");
        jp_cliente.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, 30));

        jLabel6.setText("Comentarios:");
        jp_cliente.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 30));

        jLabel7.setText("Codigo Macro:");
        jp_cliente.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 30));

        txt_puesto.setPreferredSize(new java.awt.Dimension(100, 20));
        jp_cliente.add(txt_puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, 30));

        txt_nombre.setPreferredSize(new java.awt.Dimension(100, 20));
        jp_cliente.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, 30));

        txt_paterno.setPreferredSize(new java.awt.Dimension(100, 20));
        jp_cliente.add(txt_paterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, 30));

        txt_materno.setPreferredSize(new java.awt.Dimension(100, 20));
        jp_cliente.add(txt_materno, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, 30));

        txt_codigoMacro.setEditable(false);
        txt_codigoMacro.setEnabled(false);
        txt_codigoMacro.setPreferredSize(new java.awt.Dimension(100, 20));
        jp_cliente.add(txt_codigoMacro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, 30));

        txt_comentarios.setColumns(20);
        txt_comentarios.setRows(5);
        txt_comentarios.setPreferredSize(new java.awt.Dimension(165, 94));
        jScrollPane1.setViewportView(txt_comentarios);

        jp_cliente.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 290, 100));

        jtp_main.addTab("Cliente", jp_cliente);

        javax.swing.GroupLayout jp_huellaLayout = new javax.swing.GroupLayout(jp_huella);
        jp_huella.setLayout(jp_huellaLayout);
        jp_huellaLayout.setHorizontalGroup(
            jp_huellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );
        jp_huellaLayout.setVerticalGroup(
            jp_huellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );

        jtp_main.addTab("Huella", jp_huella);

        javax.swing.GroupLayout jp_docLayout = new javax.swing.GroupLayout(jp_doc);
        jp_doc.setLayout(jp_docLayout);
        jp_docLayout.setHorizontalGroup(
            jp_docLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );
        jp_docLayout.setVerticalGroup(
            jp_docLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );

        jtp_main.addTab("Documentos", jp_doc);

        getContentPane().add(jtp_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 500, 400));

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 50, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private int limite  = 10;
    private void txt_codigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyReleased
        // TODO add your handling code here:
        txt_codigo.setText(txt_codigo.getText().toUpperCase());
    }//GEN-LAST:event_txt_codigoKeyReleased

    private void txt_codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyTyped
        // TODO add your handling code here:
           if (txt_codigo.getText().length()== limite);
    }//GEN-LAST:event_txt_codigoKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(txt_codigo.getText().equalsIgnoreCase(""))
        {
            cuadroDialogo("ingrese codigo");
        }
        else
        {
            JSONObject data = apiClientes.getCliente(txt_codigo.getText().toString().trim());
            System.out.println(data.getString("nombre"));
            txt_nombre.setText(data.getString("nombre"));
             txt_paterno.setText(data.getString("a_paterno"));
              txt_materno.setText(data.getString("a_materno"));
              txt_codigoMacro.setText(data.getString("codigoMacro"));
              if(data.getString("puesto").equalsIgnoreCase("undefined"))
              {
                 txt_puesto.setText(""); 
              }
              else
              {
                  txt_puesto.setText(data.getString("puesto"));
              }
                  if(data.getString("comentarios").equalsIgnoreCase("undefined"))
              {
                 txt_comentarios.setText(""); 
              }
              else
              {
                  txt_comentarios.setText(data.getString("comentarios"));
              }
          
            activarComponentes();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        if(txt_nombre.getText().equalsIgnoreCase(""))
        {
            cuadroDialogo("Ingrese nombre");
        }
        else
        {
            if(txt_paterno.getText().equalsIgnoreCase(""))
            {
                cuadroDialogo("Ingrese Apellido paterno");
            }
            else
            {
                if(txt_materno.getText().equalsIgnoreCase(""))
                {
                    cuadroDialogo("Ingrese Apellido Materno");
                }
                else
                {
                    //modificar
                    txt_nombre.setText("");
                    txt_paterno.setText("");
                    txt_materno.setText("");
                    txt_codigoMacro.setText("");
                    txt_puesto.setText(""); 
                    txt_comentarios.setText("");
                    desactivarComponentes();
                }
            }
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

      public void cuadroDialogo(String mensaje)
    {
          JOptionPane.showMessageDialog(null, mensaje);
    }
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
            java.util.logging.Logger.getLogger(modificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modificarCliente().setVisible(true);
            }
        });
    }
    //variables
    apiClientes apiClientes=new apiClientes();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jp_cliente;
    private javax.swing.JPanel jp_doc;
    private javax.swing.JPanel jp_huella;
    private javax.swing.JTabbedPane jtp_main;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_codigoMacro;
    private javax.swing.JTextArea txt_comentarios;
    private javax.swing.JTextField txt_materno;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_paterno;
    private javax.swing.JTextField txt_puesto;
    // End of variables declaration//GEN-END:variables
}
