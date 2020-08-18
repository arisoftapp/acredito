

import complementos.consultasApi;
import complementos.consultasBD;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antonio
 */
public class AltaClientes extends javax.swing.JFrame {

    /**
     * Creates new form altaclientes
     */
    public AltaClientes() {
        initComponents();
        this.setLocationRelativeTo(null);
          rsscalelabel.RSScaleLabel.setScaleLabel(save, "src/images/save.png");
          rsscalelabel.RSScaleLabel.setScaleLabel(add, "src/images/plus.png");
          //jtp_main.setEnabledAt(1, false);
          //jtp_main.setEnabledAt(2, false);
          
          
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        btn_add = new javax.swing.JButton();
        add = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_materno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_paterno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_puesto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_comentarios = new javax.swing.JTextArea();
        save = new javax.swing.JLabel();
        btn_guardar_cliente = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_add.setText("jButton3");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        getContentPane().add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 50, 50));

        add.setText("jLabel2");
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 30, 30));

        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        txt_materno.setToolTipText("");
        txt_materno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_maternoKeyReleased(evt);
            }
        });
        getContentPane().add(txt_materno, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 180, -1));

        jLabel4.setText("Apellido Paterno:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jLabel5.setText("Apellido Materno:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, -1));

        txt_nombre.setToolTipText("");
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nombreKeyReleased(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 230, -1));

        txt_paterno.setToolTipText("");
        txt_paterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_paternoKeyReleased(evt);
            }
        });
        getContentPane().add(txt_paterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 180, -1));

        jLabel6.setText("Puesto:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        txt_puesto.setToolTipText("");
        txt_puesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_puestoKeyReleased(evt);
            }
        });
        getContentPane().add(txt_puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 230, -1));

        jLabel7.setText("Comentarios:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, -1));

        txt_comentarios.setColumns(20);
        txt_comentarios.setRows(5);
        txt_comentarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_comentariosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txt_comentarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 370, 110));
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 30, 30));

        btn_guardar_cliente.setText("Guardar");
        btn_guardar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_clienteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 50, 50));

        jLabel1.setText("ID:");
        jPanel3.add(jLabel1);

        txt_codigo.setToolTipText("Codigo ERP MacroPro");
        txt_codigo.setPreferredSize(new java.awt.Dimension(100, 25));
        txt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_codigoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codigoKeyTyped(evt);
            }
        });
        jPanel3.add(txt_codigo);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private int limite  = 10;
    private void txt_codigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyReleased
        // TODO add your handling code here:
        txt_codigo.setText(txt_codigo.getText().toUpperCase());
    }//GEN-LAST:event_txt_codigoKeyReleased

    private void txt_codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyTyped
        // TODO add your handling code here:
        if (txt_codigo.getText().length()== limite)
 
     evt.consume();
    }//GEN-LAST:event_txt_codigoKeyTyped

    private void btn_guardar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_clienteActionPerformed
        // TODO add your handling code here:
        //validando 
        boolean validar=false;
        if(txt_codigo.getText().equalsIgnoreCase(""))
        {
            cuadroDialogo("Ingrese ID");

        }
        else
        {
            
            if(txt_nombre.getText().equalsIgnoreCase(""))
            {
                cuadroDialogo("Ingrese nombre");
            }
            else
            {
                  if(txt_paterno.getText().equalsIgnoreCase(""))
                  {
                      cuadroDialogo("Ingrese apellido paterno");
                  }
                  else
                  {
                      if(txt_materno.getText().equalsIgnoreCase(""))
                      {
                          cuadroDialogo("Ingrese apellido materno");
                      }
                      else
                      {
                        validar=true;
                        Thread t = new AltaClientes.atInsertCliente();
                        t.start();
                      }
                  }
            }
        }
        
        
        

        

    }//GEN-LAST:event_btn_guardar_clienteActionPerformed
     public class atInsertCliente extends Thread
     {
         public void run()
         {
             InsertarCliente();
         }
     }
  
      public void InsertarCliente()
    {
        
        boolean validar=false;
        String token=consultasBD.getToken();
        //System.out.print(token);
         try {
            URL url = new URL("http://wsar.homelinux.com:3100/insertarCliente");//your url i.e fetch data from .
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Accept","application/json");
            conn.setRequestProperty("access-token",token);
            conn.setConnectTimeout(10000);
            conn.setReadTimeout(10000);
            conn.addRequestProperty("User-Agent","Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
            conn.setDoOutput(true);
            conn.connect();
            DataOutputStream os = new DataOutputStream(conn.getOutputStream());
            os.writeBytes(crearJsonInsert().toString());
            os.flush();
            os.close();
            System.out.println(conn.getResponseCode());
                BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line).append("\n");
                }
                String finalJSON = sb.toString();
                JSONObject jObject = new JSONObject(finalJSON);
                System.out.print(finalJSON);
               if(jObject.getBoolean("success"))
               {
                System.out.println(jObject.getBoolean("success"));
                cuadroDialogo(jObject.getString("mensaje"));
                validar=true;
               }
               else
               {
                cuadroDialogo("Error "+jObject.getString("mensaje"));
               }
          
            conn.disconnect();

        } catch (IOException | JSONException e) {
            System.err.println("Exception in NetClientGet:- " + e);
          cuadroDialogo(e.getMessage());
        }
         if(validar==true)
         {

          desactivarCompClientes();
         }
         
    }
      public void desactivarCompClientes()
      {
          txt_codigo.setEnabled(false);
          txt_paterno.setEnabled(false);
          txt_materno.setEnabled(false);
          txt_puesto.setEnabled(false);
          txt_comentarios.setEnabled(false);
          txt_nombre.setEnabled(false);
          btn_add.setEnabled(false);
      }
          public JSONObject crearJsonInsert()
    {
        
        JSONObject obj = new JSONObject();
        try {
            obj.put("codigoMacro",txt_codigo.getText().trim());
            obj.put("nombre", txt_nombre.getText().trim());
            obj.put("a_paterno",txt_paterno.getText().trim());
            obj.put("a_materno", txt_materno.getText().trim());
            obj.put("puesto",txt_puesto.getText().trim());
            obj.put("comentarios", txt_comentarios.getText().trim());
            }
        catch (JSONException e)
            {
             System.err.println("error al crear JSON:"+e.getMessage());  
            }
        return obj;
    }
    public void cuadroDialogo(String mensaje)
    {
          JOptionPane.showMessageDialog(null, mensaje);
    }
    
    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:

        
    }//GEN-LAST:event_btn_addActionPerformed

    public void getfoto()
    {
        /*
                FileNameExtensionFilter filtroImagen=new FileNameExtensionFilter("JPG, PNG & GIF","jpg","png","gif");
        Object [] fila=new Object[2]; 
        DefaultTableModel modelo=(DefaultTableModel) tabla_datos.getModel();
        //Creamos el objeto JFileChooser
        JFileChooser fc=new JFileChooser();
         fc.setFileFilter(filtroImagen);
        //Abrimos la ventana, guardamos la opcion seleccionada por el usuario
        int seleccion=fc.showOpenDialog(this);
        //Si el usuario, pincha en aceptar
        if(seleccion==JFileChooser.APPROVE_OPTION){
            //Seleccionamos el fichero
            File fichero=fc.getSelectedFile();
             //Ecribe la ruta del fichero seleccionado en el campo de texto
            fila[0]=fichero.getAbsolutePath();
            fila[1]=fichero.getName();
            /*
              try(FileReader fr=new FileReader(fichero)){
              String cadena="";
              int valor=fr.read();
              while(valor!=-1){
                cadena=cadena+(char)valor;
                valor=fr.read();
              }
                  fila[1]=cadena;
                  System.out.println(cadena);
              } catch (IOException e1) {
                e1.printStackTrace();
              }
            */
              //modelo.addRow(fila);
              //tabla_datos.setModel(modelo);
              
              
        //}
        
    }
    private void txt_nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyReleased
        // TODO add your handling code here:
        txt_nombre.setText(txt_nombre.getText().toUpperCase());
    }//GEN-LAST:event_txt_nombreKeyReleased

    private void txt_paternoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_paternoKeyReleased
        // TODO add your handling code here:
           txt_paterno.setText(txt_paterno.getText().toUpperCase());
    }//GEN-LAST:event_txt_paternoKeyReleased

    private void txt_maternoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_maternoKeyReleased
        // TODO add your handling code here:
        txt_materno.setText(txt_materno.getText().toUpperCase());
    }//GEN-LAST:event_txt_maternoKeyReleased

    private void txt_puestoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_puestoKeyReleased
        // TODO add your handling code here:
        txt_puesto.setText(txt_puesto.getText().toUpperCase());
    }//GEN-LAST:event_txt_puestoKeyReleased

    private void txt_comentariosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_comentariosKeyReleased
        // TODO add your handling code here:
        txt_comentarios.setText(txt_comentarios.getText().toUpperCase());
    }//GEN-LAST:event_txt_comentariosKeyReleased

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
            java.util.logging.Logger.getLogger(AltaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaClientes().setVisible(true);
            }
        });
    }
    //variables
    consultasBD consultasBD=new consultasBD();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_guardar_cliente;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel save;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextArea txt_comentarios;
    private javax.swing.JTextField txt_materno;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_paterno;
    private javax.swing.JTextField txt_puesto;
    // End of variables declaration//GEN-END:variables
}