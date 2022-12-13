/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

//import static BLL.Repositorio.getUtilizadores;
import BLL.Administrador;
import BLL.Utilizador;
import BLL.Equipa;
import BLL.Repository;
import BLL.Municipio;
import BLL.Gestor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class LoginUtilizador extends javax.swing.JFrame {

    

    /**
     * Creates new form Login_users
     */
    public LoginUtilizador() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bLogin = new javax.swing.JButton();
        bVoltar = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login de Utilizador");
        setAlwaysOnTop(true);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(450, 400));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setText("Utilizador:");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 50, 60, 20);

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsername);
        txtUsername.setBounds(50, 70, 210, 30);

        jLabel3.setText("Palavra-passe:");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 130, 90, 20);

        bLogin.setText("Autenticar");
        bLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoginActionPerformed(evt);
            }
        });
        getContentPane().add(bLogin);
        bLogin.setBounds(310, 310, 100, 30);

        bVoltar.setText("Cancelar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(bVoltar);
        bVoltar.setBounds(200, 310, 100, 30);

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtPassword);
        txtPassword.setBounds(50, 150, 210, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/administrador.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 460, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        // TODO add your handling code here:
        Entrada obj = new Entrada();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_bVoltarActionPerformed


    private void bLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoginActionPerformed

        String username = txtUsername.getText();
        String password = txtPassword.getText();
        
        boolean existe=false;
        boolean admin_existe=false;
        boolean gestor_existe=false;
        boolean equipa_existe=false;
        boolean municipio_existe=false;
       
        LoginUtilizador log = new LoginUtilizador();
        for(Utilizador x : Repository.getInstance().getUtilizadores()){
            
            if(username.equals(x.getUsername()) && password.equals(x.getPassword())){
                
                existe=true;
                JOptionPane.showMessageDialog(null, "Login efetuado com sucesso");
                if(x instanceof Administrador){
                    admin_existe=true;   
                }
                if(x instanceof Equipa){
                    equipa_existe=true;
                }
                if(x instanceof Gestor){
                    gestor_existe=true;  
                }
                if(x instanceof Municipio){
                    municipio_existe=true;
                    
                }
                
            }
            
            
        }
        
        AreaAdministrador adm = new AreaAdministrador();
        AreaGestor ges =new AreaGestor();
        AreaEquipa equi = new AreaEquipa();
        AreaMunicipio mun = new AreaMunicipio();
        
        if(existe==false){
            JOptionPane.showMessageDialog(null, "Dados incorretos !");
        }
        
        if(admin_existe==true){
            new AreaAdministrador().setVisible(true);
            dispose();  
        }
        if(gestor_existe==true){
            new AreaGestor().setVisible(true);
            dispose();

        }
        if(municipio_existe==true){
            new AreaMunicipio().setVisible(true);
                dispose();
      
        }
        if(equipa_existe ==true){
            new AreaEquipa().setVisible(true);
                dispose();
        }
        
         

    }//GEN-LAST:event_bLoginActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(LoginUtilizador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUtilizador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUtilizador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUtilizador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUtilizador().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bLogin;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

}