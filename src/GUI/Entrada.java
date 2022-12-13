/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import BLL.Administrador;
import BLL.Contentor;
import BLL.Equipa;
import BLL.Gestor;
import BLL.Municipio;
import BLL.OrdensServico;
import BLL.ParqueContentores;
import java.awt.*;
import javax.swing.*;
import BLL.Repository;
import BLL.TiposResiduos;
import BLL.Trabalhadores;
import javax.swing.JFrame;

/**
 *
 * @author pedro
 */
public class Entrada extends javax.swing.JFrame {

    public static boolean IsAuthenticated = false;
    /**
     * Creates new form Entrada
     */
    public Entrada() {
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

        bEntrar = new javax.swing.JButton();
        bSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Entrar");
        setMinimumSize(new java.awt.Dimension(450, 425));
        getContentPane().setLayout(null);

        bEntrar.setText("Entrar");
        bEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(bEntrar);
        bEntrar.setBounds(160, 130, 80, 30);

        bSair.setText("Sair");
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });
        getContentPane().add(bSair);
        bSair.setBounds(160, 190, 80, 30);

        jLabel2.setBackground(new java.awt.Color(102, 255, 102));
        jLabel2.setDisplayedMnemonic('b');
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("GesRes - Gestão de Resíduos Urbanos");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 430, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Painel.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -20, 820, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
        
    }//GEN-LAST:event_bSairActionPerformed

    private void bEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEntrarActionPerformed
        // TODO add your handling code here:

        
        
       Administrador admin  = new Administrador();
       admin.setNome("Manuel");
       admin.setnCC(23649856);
       admin.setNif(259634526);
       admin.setTelefone(963544852);
       admin.setMorada("Rua Henrique Lopes");
       admin.setLocalidade("Viana do Castelo");
       admin.setUsername("admin");
       admin.setPassword("admin");
       Repository.getInstance().novoUtilizador(admin);
       Repository.desserializar("repositorio.dat");
       
       //Município
       Municipio municipio1 = new Municipio();
       municipio1.setNome("Clara");
       municipio1.setnCC(12336548);
       municipio1.setNif(125639456);
       municipio1.setTelefone(925634586);
       municipio1.setMorada("Rua de Faro");
       municipio1.setLocalidade("Faro");
       municipio1.setUsername("clara");
       municipio1.setPassword("4569");
       Repository.getInstance().novoUtilizador(municipio1);
       Repository.desserializar("repositorio.dat");
       
       Municipio municipio2 = new Municipio();
       municipio2.setNome("Julio");
       municipio2.setnCC(56148963);
       municipio2.setNif(365489632);
       municipio2.setTelefone(967009206);
       municipio2.setMorada("Rua de Coimbra");
       municipio2.setLocalidade("Coimbra");
       municipio2.setUsername("julio");
       municipio2.setPassword("4569");
       Repository.getInstance().novoUtilizador(municipio2);
       Repository.desserializar("repositorio.dat");
       
       //Equipa
       Equipa equipa1 = new Equipa();
       equipa1.setNome("Rui");
       equipa1.setnCC(30226547);
       equipa1.setNif(965423665);
       equipa1.setTelefone(912336504);
       equipa1.setMorada("Rua Cidade Nova");
       equipa1.setLocalidade("Viana do Castelo");
       equipa1.setUsername("rui");
       equipa1.setPassword("1478");
       Repository.getInstance().novaEquipa(equipa1);
       Repository.desserializar("repositorio.dat");
       
       Equipa equipa2 = new Equipa();
       equipa2.setNome("Carlos");
       equipa2.setnCC(78995632);
       equipa2.setNif(741258963);
       equipa2.setTelefone(921456302);
       equipa2.setMorada("Rua da Vila Verde");
       equipa2.setLocalidade("Braga");
       equipa2.setUsername("carlos");
       equipa2.setPassword("1236");
       Repository.getInstance().novaEquipa(equipa2);
       Repository.desserializar("repositorio.dat");
       
       
       //Gestor
       Gestor gestor1 = new Gestor();
       gestor1.setNome("Luis");
       gestor1.setnCC(26559756);
       gestor1.setNif(365489632);
       gestor1.setTelefone(932665986);
       gestor1.setMorada("Rua Lopes");
       gestor1.setLocalidade("Viana do Castelo");
       gestor1.setUsername("luis");
       gestor1.setPassword("1234");
       Repository.getInstance().novoUtilizador(gestor1);
       Repository.desserializar("repositorio.dat");
       
       Gestor gestor2 = new Gestor();
       gestor2.setNome("Ana");
       gestor2.setnCC(63224896);
       gestor2.setNif(254789632);
       gestor2.setTelefone(964552365);
       gestor2.setMorada("Rua Luis Azevedo");
       gestor2.setLocalidade("Lisboa");
       gestor2.setUsername("ana");
       gestor2.setPassword("0000");
       Repository.getInstance().novoUtilizador(gestor2);
       Repository.desserializar("repositorio.dat");
       
       //Tipos Residuos
       TiposResiduos tipo1 = new TiposResiduos();
       tipo1.setNomeTipo("Vidro");
       Repository.getInstance().novoResiduo(tipo1);
       Repository.desserializar("repositorio.dat");
       
       TiposResiduos tipo2 = new TiposResiduos();
       tipo2.setNomeTipo("Plástico");
       Repository.getInstance().novoResiduo(tipo2);
       Repository.desserializar("repositorio.dat");
       
       TiposResiduos tipo3 = new TiposResiduos();
       tipo3.setNomeTipo("Papel");
       Repository.getInstance().novoResiduo(tipo3);
       Repository.desserializar("repositorio.dat");
       
       TiposResiduos tipo4 = new TiposResiduos();
       tipo4.setNomeTipo("Metal");
       Repository.getInstance().novoResiduo(tipo4);
       Repository.desserializar("repositorio.dat");
       
       
       //OrdensServiço
       OrdensServico ordem1 = new OrdensServico();
       ordem1.setDescricao("Contentor Cheio.");
       ordem1.setDataOrdem("20/02/2022");
       Repository.getInstance().novaOrdem(ordem1);
       Repository.desserializar("repositorio.dat");
       
       OrdensServico ordem2 = new OrdensServico();
       ordem2.setDescricao("Contentor Meio-Cheio. Limpar Contentor.");
       ordem2.setDataOrdem("18/03/2022");
       Repository.getInstance().novaOrdem(ordem2);
       Repository.desserializar("repositorio.dat");
       
       OrdensServico ordem3 = new OrdensServico();
       ordem3.setDescricao("Limpar Contentor.");
       ordem3.setDataOrdem("15/02/2022");
       Repository.getInstance().novaOrdem(ordem3);
       Repository.desserializar("repositorio.dat");
       
       //Contentores
       Contentor contentor1 = new Contentor();
       contentor1.setIdContentor(1);
       Repository.getInstance().novoContentor(contentor1);
       Repository.desserializar("repositorio.dat");
       
       Contentor contentor2 = new Contentor();
       contentor2.setIdContentor(2);
       Repository.getInstance().novoContentor(contentor2);
       Repository.desserializar("repositorio.dat");
       
       Contentor contentor3 = new Contentor();
       contentor3.setIdContentor(3);
       Repository.getInstance().novoContentor(contentor3);
       Repository.desserializar("repositorio.dat");
       
       //Parques
       ParqueContentores parque1 = new ParqueContentores();
       parque1.setNome("Parque das Giesteiras");
       parque1.setMorada("Rua Cidade Nova");
       parque1.setLocalidade("Viana do Castelo");
       Repository.getInstance().novoParque(parque1);
       Repository.desserializar("repositorio.dat");
       
       ParqueContentores parque2 = new ParqueContentores();
       parque2.setNome("Parque das Nações");
       parque2.setMorada("Rua Luis Azevedo");
       parque2.setLocalidade("Lisboa");
       Repository.getInstance().novoParque(parque2);
       Repository.desserializar("repositorio.dat");
       
       
       //Trabalhadores
       Trabalhadores trabalhador1 = new Trabalhadores();
       trabalhador1.setNome("António Marques");
       trabalhador1.setNifTrabalhador(268753696);
       trabalhador1.setnSegSocial(123);
       trabalhador1.setContacto(964393807);
       trabalhador1.setSalario(900);
       Repository.getInstance().novoTrabalhador(trabalhador1);
       Repository.desserializar("repositorio.dat");
       
       Trabalhadores trabalhador2 = new Trabalhadores();
       trabalhador2.setNome("Inês Antunes");
       trabalhador2.setNifTrabalhador(259631456);
       trabalhador2.setnSegSocial(456);
       trabalhador2.setContacto(921563208);
       trabalhador2.setSalario(895);
       Repository.getInstance().novoTrabalhador(trabalhador2);
       Repository.desserializar("repositorio.dat");
       
       Trabalhadores trabalhador3 = new Trabalhadores();
       trabalhador3.setNome("Ana Guiomar");
       trabalhador3.setNifTrabalhador(259631478);
       trabalhador3.setnSegSocial(789);
       trabalhador3.setContacto(963014536);
       trabalhador3.setSalario(950);
       Repository.getInstance().novoTrabalhador(trabalhador3);
       Repository.desserializar("repositorio.dat");
       
       
       
       
        LoginUtilizador obj = new LoginUtilizador();
        obj.setVisible(true); 
        dispose();
        
        
        
        
        
        
        
    }//GEN-LAST:event_bEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Entrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEntrar;
    private javax.swing.JButton bSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}