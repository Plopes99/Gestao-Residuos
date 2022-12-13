/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.Repository;
import BLL.Utilizador;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pedro
 */
public class AlterarUtilizador extends javax.swing.JFrame {

    /**
     * Creates new form AreaAdministrador
     */
    public AlterarUtilizador() {
        initComponents();
        DefaultTableModel res = (DefaultTableModel)this.jTable1.getModel();
        for(Utilizador x : Repository.getInstance().getUtilizadores()){
            
                 res.addRow(new Object[]{
                 ((Utilizador)x).getnCC(), ((Utilizador)x).getNome(), ((Utilizador)x).getNif()
                 });
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nCCtext = new javax.swing.JTextField();
        nifText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        bVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Área Administrador");
        setMinimumSize(new java.awt.Dimension(550, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel3.setText("CC ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 360, 17, 14);

        jLabel4.setText("Email");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 400, 24, 14);
        getContentPane().add(nCCtext);
        nCCtext.setBounds(40, 360, 150, 20);
        getContentPane().add(nifText);
        nifText.setBounds(40, 400, 150, 20);

        jButton1.setText("Adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 400, 140, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CC", "Nome", "Email"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(60, 60, 410, 230);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setText("Contas");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 20, 52, 23);

        jLabel6.setText("Nome");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(220, 360, 27, 14);
        getContentPane().add(txtNome);
        txtNome.setBounds(250, 360, 150, 20);

        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(bVoltar);
        bVoltar.setBounds(400, 400, 100, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        // TODO add your handling code here:
        new LoginUtilizador().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_bVoltarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int ncc = Integer.parseInt(this.nCCtext.getText());
        Utilizador util = new Utilizador();
        boolean suc = false;

        for(Utilizador x : Repository.getInstance().getUtilizadores()){
            if( x.getnCC()==ncc ){
                util.setNif(x.getNif());
                util.setLocalidade(x.getLocalidade());
                util.setnCC(x.getnCC());
                util.setNome(x.getNome());
                util.setPassword(x.getPassword());
                util.setTelefone(x.getTelefone());
                util.setMorada(x.getMorada());         
                suc=true;
            }
        }

//        if(suc==true){
//            Iterator<Utilizador> iter = Repositorio.getInstance().getUtil().iterator();
//            while(iter.hasNext()){
//                Utilizador c = iter.next();
//                if(c.getEmail().equals(mail) && c.getnCC() == ncc){
//                    iter.remove();
//                }
//            }
//            Repositorio.getInstance().novoUtilizador(dono);
//            JOptionPane.showMessageDialog(this.jButton1, "Dono adicionado com sucesso!");
//        }else{
//            JOptionPane.showMessageDialog(this.jButton1, "Informação inserida incorretamente!");
//        }
//
//        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int linha = jTable1.getSelectedRow();
        nCCtext.setText(model.getValueAt(linha, 0).toString());
        txtNome.setText(model.getValueAt(linha, 1).toString());
        nifText.setText(model.getValueAt(linha, 2).toString());
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(AlterarUtilizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarUtilizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarUtilizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarUtilizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarUtilizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bVoltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nCCtext;
    private javax.swing.JTextField nifText;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}