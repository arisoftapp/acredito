/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import complementos.consultasBD;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author antonio
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    consultasBD consultas=new consultasBD();
    public Login() {
       
            initComponents();
                      this.setLocationRelativeTo(null);
            rsscalelabel.RSScaleLabel.setScaleLabel(pefil, "src/images/persona.png");
            rsscalelabel.RSScaleLabel.setScaleLabel(login, "src/images/login.png");
           
    }



    public void Sesion()
    {
         try {
            URL url = new URL("http://wsar.homelinux.com:3100/usuario/");//your url i.e fetch data from .
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Accept","application/json");
            conn.setConnectTimeout(10000);
            conn.setReadTimeout(10000);
            conn.addRequestProperty("User-Agent","Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
            conn.setDoOutput(true);
            conn.connect();
            DataOutputStream os = new DataOutputStream(conn.getOutputStream());
            os.writeBytes(crearJsonLogin().toString());
            os.flush();
            os.close();
  /*
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP Error code : "
                        + conn.getResponseCode()+" "+conn.getResponseMessage());
            }
            */
            System.out.print(conn.getResponseCode());
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
                   cambiarPantalla();
               }
               else
               {
                   cuadroDialogo(jObject.getString("mensaje"));
               }
          
            conn.disconnect();

        } catch (IOException | JSONException e) {
            System.err.println("Exception in NetClientGet:- " + e);
          cuadroDialogo(e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pefil = new javax.swing.JLabel();
        login = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        label_info = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setName("Login"); // NOI18N
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pefil.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pefil.setName("perfil"); // NOI18N
        getContentPane().add(pefil, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 110, 100));
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 80, 80));

        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 200, 150, -1));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 270, 150, -1));

        jButton1.setText("Iniciar Sesion");
        jButton1.setToolTipText("");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setMargin(new java.awt.Insets(2, 14, 15, 14));
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 200, 100));

        jLabel1.setText("Usuario:");
        jLabel1.setToolTipText("");
        jLabel1.setName("Usuario:"); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));
        jLabel1.getAccessibleContext().setAccessibleName("text");

        jLabel2.setText("Contraseña:");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));
        getContentPane().add(label_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 140, 40));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        getAccessibleContext().setAccessibleName("Login");
        getAccessibleContext().setAccessibleDescription("");
        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            //this.setVisible(false);
        Thread t = new asynTaskLogin();
        t.start();
         //System.out.println(""+consultas.buscarPorUsuario(txt_usuario.getText().toString().trim()));
        //insertBD("jesus","jalsdjalsk",false);
    }//GEN-LAST:event_jButton1ActionPerformed
  private void cargarDriver() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
    }catch(Exception ex) {
      setTitle(ex.toString());
    }
  }
  
    public void cambiarPantalla()
    {
        this.setVisible(false);
        home v_home=new home();
        v_home.setVisible(true);
    }
        public class asynTaskSesion extends Thread
    {
        public void run()
        {
        // Código del hilo
        }
    }
    public class asynTaskLogin extends Thread
{
    public void run()
    {
        // Código del hilo
           InciarSesion();
    }
}
    public JSONObject crearJsonLogin()
    {
        
        JSONObject obj = new JSONObject();
        try {
            obj.put("usuario",txt_usuario.getText().trim());
            obj.put("contra", jPasswordField1.getText().trim());
            }
        catch (JSONException e)
            {
             System.err.println("error al crear JSON:"+e.getMessage());  
            }
        return obj;
    }
    public void InciarSesion()
    {
        boolean val=false;
        String token="";
        String ruta="";
         try {
            System.out.print(crearJsonLogin().toString());
            URL url = new URL("http://wsar.homelinux.com:3100/login");//your url i.e fetch data from .
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Accept","application/json");
            conn.setConnectTimeout(10000);
            conn.setReadTimeout(10000);
            conn.addRequestProperty("User-Agent","Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
            conn.setDoOutput(true);
            conn.connect();
            DataOutputStream os = new DataOutputStream(conn.getOutputStream());
            os.writeBytes(crearJsonLogin().toString());
            os.flush();
            os.close();
            System.out.print(conn.getResponseCode());
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
                   val=true;
                   token=jObject.getString("token");
                  ruta=jObject.getString("ruta");
               }
               else
               {
                    
                   cuadroDialogo(jObject.getString("mensaje"));
               }
          
            conn.disconnect();

        } catch (IOException | JSONException e) {
            System.err.println("Exception in NetClientGet:- " + e);
          cuadroDialogo(e.getMessage());
        }
         if(val==true)
         {
             if(consultas.buscarPorUsuario(txt_usuario.getText().toString().trim())==true)
             {
                 consultas.update(txt_usuario.getText().trim(),token, val, ruta);
             }
             else
             {
                 consultas.insertBD(txt_usuario.getText().toString().trim(), token, true,ruta);
             }
             
             //setPropertyValue("usuario",txt_usuario.getText().toString());
             //
            cambiarPantalla();
         }
         else
         {
             val=false;
         }
    }
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
       
            public void run() {
          boolean validar=false;
              try {
          Connection conexion=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/credito","root" ,"");
          Statement comando=(Statement) conexion.createStatement();
          ResultSet registro = comando.executeQuery("select * from usuario");
	  if (registro.next()==true) {
            System.out.println(registro.getString("nom_usuario"));
            validar=true;
             System.out.println("encontro");
	  } else {
	  validar=false;
          System.out.println("no encontro");
	  }
          conexion.close();
         
        } catch(SQLException ex){
             validar=false;
          System.out.println("error:"+ex);
        }
        
              if(validar==true)
              {
                       new home().setVisible(true);
              }
              else
              {
                       new Login().setVisible(true);
              }
           
                  
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel label_info;
    private javax.swing.JLabel login;
    private javax.swing.JLabel pefil;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
