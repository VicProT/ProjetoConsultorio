/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import ModeloConeciton.ConexaoBanco;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author Victor
 */
public class TelaAceso extends javax.swing.JFrame {
   ConexaoBanco Con = new ConexaoBanco();
   TelaDentista TelaM =  new TelaDentista();
   TelaUsuario TelaU =  new TelaUsuario();
   TelaPacientes TelaP = new TelaPacientes();
   TelaSecretario TelaS = new TelaSecretario();
   TelaAgenda TelaA =  new TelaAgenda();
   TelaAgendaDiaria TelaAD = new TelaAgendaDiaria();
    
    
    public TelaAceso(String Usuario) {
        initComponents();
        UsuarioRecebido.setText(Usuario);
        Con.Conexao();
        
    }

    TelaAceso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        AcesoDentistasBotao = new javax.swing.JButton();
        AcesoPacientesBotao = new javax.swing.JButton();
        AcesoAgendaBotao = new javax.swing.JButton();
        AcesoSairBotao = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        AcesoPacientesBotao1 = new javax.swing.JButton();
        AcesoPacientesBotao2 = new javax.swing.JButton();
        AcesoPacientesBotao3 = new javax.swing.JButton();
        UsuarioTelaAceso = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        UsuarioRecebido = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        AcesoDentistasBotao.setText("Dentistas");
        AcesoDentistasBotao.setToolTipText("Dentistas");
        AcesoDentistasBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcesoDentistasBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(AcesoDentistasBotao);
        AcesoDentistasBotao.setBounds(40, 80, 110, 130);

        AcesoPacientesBotao.setText("Pacientes");
        AcesoPacientesBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcesoPacientesBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(AcesoPacientesBotao);
        AcesoPacientesBotao.setBounds(320, 80, 110, 130);

        AcesoAgendaBotao.setText("Agendamentos");
        AcesoAgendaBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcesoAgendaBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(AcesoAgendaBotao);
        AcesoAgendaBotao.setBounds(740, 80, 130, 130);

        AcesoSairBotao.setText("Sair");
        AcesoSairBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcesoSairBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(AcesoSairBotao);
        AcesoSairBotao.setBounds(740, 230, 130, 130);

        jButton1.setText("Secretarios");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(180, 80, 110, 130);

        jLabel1.setText("Cadastros Geral");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 50, 100, 16);

        AcesoPacientesBotao1.setText("Pacientes");
        AcesoPacientesBotao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcesoPacientesBotao1ActionPerformed(evt);
            }
        });
        getContentPane().add(AcesoPacientesBotao1);
        AcesoPacientesBotao1.setBounds(320, 80, 110, 130);

        AcesoPacientesBotao2.setText("Pacientes");
        AcesoPacientesBotao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcesoPacientesBotao2ActionPerformed(evt);
            }
        });
        getContentPane().add(AcesoPacientesBotao2);
        AcesoPacientesBotao2.setBounds(320, 80, 110, 130);

        AcesoPacientesBotao3.setText("Pacientes");
        AcesoPacientesBotao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcesoPacientesBotao3ActionPerformed(evt);
            }
        });
        getContentPane().add(AcesoPacientesBotao3);
        AcesoPacientesBotao3.setBounds(320, 80, 110, 130);

        UsuarioTelaAceso.setText("Usuarios");
        UsuarioTelaAceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioTelaAcesoActionPerformed(evt);
            }
        });
        getContentPane().add(UsuarioTelaAceso);
        UsuarioTelaAceso.setBounds(460, 80, 110, 130);

        jLabel2.setText("Usuario :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 390, 60, 30);
        getContentPane().add(UsuarioRecebido);
        UsuarioRecebido.setBounds(70, 390, 130, 30);

        jButton2.setText("Agenda ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(40, 220, 110, 140);
        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(943, 479));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AcesoDentistasBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcesoDentistasBotaoActionPerformed
        // TODO add your handling code here:
        
       try {
           Con.ExecultaSQL("select * from usuario where Loginusu ='"+UsuarioRecebido.getText()+"'");//PESQUISA NO BANCO PARA ENCONTRAR USUARIO
           Con.Rs.first();//PEGA O PRIMEIRO RESULTADO
           
           if(Con.Rs.getString("Tipousu").equals("Administrador")||Con.Rs.getString("Tipousu").equals("Secretario")){//SENDO ADM OU SECRETARIO A TELA ABRE PARA CADRASTRAR MEDICO
               if(TelaM==null){                   
                   TelaM =  new TelaDentista();
                   TelaM.setVisible(true);
                   TelaM.setResizable(false);
               }else{
                   TelaM.setVisible(true);
                   TelaM.setResizable(false);
               }
               
           }else{
               JOptionPane.showMessageDialog(rootPane,"VOCE NAO TEM PERMISSAO PARA ACESSAR O CADRASTRO DE DENTISTAS");
           }
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(rootPane,"ACESSO COM ADMIN1 \n\n\n");
       }
      if(UsuarioRecebido.getText().equals("admin1")&&UsuarioRecebido.getText().equals("admin1")){
            if(TelaM==null){                   
                   TelaM =  new TelaDentista();
                   TelaM.setVisible(true);
                   TelaM.setResizable(false);
               }else{
                   TelaM.setVisible(true);
                   TelaM.setResizable(false);
               }
        
        }
        
         
    }//GEN-LAST:event_AcesoDentistasBotaoActionPerformed

    private void AcesoPacientesBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcesoPacientesBotaoActionPerformed
        try {
           Con.ExecultaSQL("select * from usuario where Loginusu ='"+UsuarioRecebido.getText()+"'");//PESQUISA NO BANCO PARA ENCONTRAR USUARIO
           Con.Rs.first();//PEGA O PRIMEIRO RESULTADO
           
           if(Con.Rs.getString("Tipousu").equals("Secretario")||Con.Rs.getString("Tipousu").equals("Dentista")||Con.Rs.getString("Tipousu").equals("Administrador")){//SENDO ADM OU SECRETARIO A TELA ABRE PARA CADRASTRAR MEDICO
               if(TelaP==null){                   
                   TelaP =  new TelaPacientes();
                   TelaP.setVisible(true);
                   TelaP.setResizable(false);
               }else{
                   TelaP.setVisible(true);
                   TelaP.setResizable(false);
               }
               
           }else{
               JOptionPane.showMessageDialog(rootPane,"VOCE NAO TEM PERMISSAO PARA ACESSAR O CADRASTRO DE PACIENTES");
           }
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(rootPane,"ACESSO COM ADMIN1 \n\n\n");
       }
      if(UsuarioRecebido.getText().equals("admin1")&&UsuarioRecebido.getText().equals("admin1")){
            if(TelaP==null){                   
                   TelaP =  new TelaPacientes();
                   TelaP.setVisible(true);
                   TelaP.setResizable(false);
               }else{
                   TelaP.setVisible(true);
                   TelaP.setResizable(false);
               }
        
        }
    }//GEN-LAST:event_AcesoPacientesBotaoActionPerformed

    private void AcesoSairBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcesoSairBotaoActionPerformed
        // BOTAO SAIR PARA O TELA DE LONGIN
        LoginUsuario Login = new LoginUsuario();
        Login.setVisible(true);
        dispose();//FECHA A TELA ANTERIOR
    }//GEN-LAST:event_AcesoSairBotaoActionPerformed

    private void AcesoPacientesBotao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcesoPacientesBotao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AcesoPacientesBotao1ActionPerformed

    private void AcesoPacientesBotao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcesoPacientesBotao2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AcesoPacientesBotao2ActionPerformed

    private void AcesoPacientesBotao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcesoPacientesBotao3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AcesoPacientesBotao3ActionPerformed

    private void UsuarioTelaAcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioTelaAcesoActionPerformed
       try {
           Con.ExecultaSQL("select * from usuario where Loginusu ='"+UsuarioRecebido.getText()+"'");//PESQUISA NO BANCO PARA ENCONTRAR USUARIO
           Con.Rs.first();//PEGA O PRIMEIRO RESULTADO
           if(Con.Rs.getString("Tipousu").equals("Administrador")){//SENDO ADM OU SECRETARIO A TELA ABRE PARA CADRASTRAR MEDICOS
              if(TelaU==null){
                  TelaU =  new TelaUsuario();
                  TelaU.setVisible(true);
                  TelaU.setResizable(rootPaneCheckingEnabled);
                }else{
                 TelaU.setVisible(true);
                 TelaU.setResizable(rootPaneCheckingEnabled);
                }
              }
           else{
               JOptionPane.showMessageDialog(rootPane,"VOCE NAO TEM PERMISSAO PARA ACESSAR O CADRASTRO DE USUARIOS");
           }
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(rootPane,"ACESSO COM ADMIN1 \n\n\n");
       }
      if(UsuarioRecebido.getText().equals("admin1")&&UsuarioRecebido.getText().equals("admin1")){
            if(TelaU==null){
                  TelaU =  new TelaUsuario();
                  TelaU.setVisible(true);
                  TelaU.setResizable(rootPaneCheckingEnabled);
                }else{
                 TelaU.setVisible(true);
                 TelaU.setResizable(rootPaneCheckingEnabled);
                }
        
        }
      
    }//GEN-LAST:event_UsuarioTelaAcesoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      try {
           Con.ExecultaSQL("select * from usuario where Loginusu ='"+UsuarioRecebido.getText()+"'");//PESQUISA NO BANCO PARA ENCONTRAR USUARIO
           Con.Rs.first();//PEGA O PRIMEIRO RESULTADO
           
           if(Con.Rs.getString("Tipousu").equals("Administrador")){//SENDO ADM OU SECRETARIO A TELA ABRE PARA CADRASTRAR MEDICO
               if(TelaS==null){                   
                   TelaS =  new TelaSecretario();
                   TelaS.setVisible(true);
                   TelaS.setResizable(false);
               }else{
                   TelaS.setVisible(true);
                   TelaS.setResizable(false);
               }
               
           }else{
               JOptionPane.showMessageDialog(rootPane,"VOCE NAO TEM PERMISSAO PARA ACESSAR O CADRASTRO DE SECRETARIOS");
           }
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(rootPane,"ACESSO COM ADMIN1 \n\n\n");
       }
      if(UsuarioRecebido.getText().equals("admin1")&&UsuarioRecebido.getText().equals("admin1")){
            if(TelaS==null){                   
                   TelaS =  new TelaSecretario();
                   TelaS.setVisible(true);
                   TelaS.setResizable(false);
               }else{
                   TelaS.setVisible(true);
                   TelaS.setResizable(false);
               }
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AcesoAgendaBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcesoAgendaBotaoActionPerformed
         try {
           Con.ExecultaSQL("select * from usuario where Loginusu ='"+UsuarioRecebido.getText()+"'");//PESQUISA NO BANCO PARA ENCONTRAR USUARIO
           Con.Rs.first();//PEGA O PRIMEIRO RESULTADO
           
           if(Con.Rs.getString("Tipousu").equals("Secretario")||Con.Rs.getString("Tipousu").equals("Dentista")||Con.Rs.getString("Tipousu").equals("Administrador")){//SENDO ADM OU SECRETARIO A TELA ABRE PARA CADRASTRAR MEDICO
               if(TelaA==null){                   
                   TelaA =  new TelaAgenda();
                   TelaA.setVisible(true);
                   TelaA.setResizable(false);
               }else{
                   TelaA.setVisible(true);
                   TelaA.setResizable(false);
               }
               
           }else{
               JOptionPane.showMessageDialog(rootPane,"VOCE NAO TEM PERMISSAO PARA ACESSAR O CADRASTRO DE AGENDAS");
           }
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(rootPane,"ACESSO COM ADMIN1 \n\n\n");
       }
      if(UsuarioRecebido.getText().equals("admin1")&&UsuarioRecebido.getText().equals("admin1")){
            if(TelaA==null){                   
                   TelaA =  new TelaAgenda();
                   TelaA.setVisible(true);
                   TelaA.setResizable(false);
               }else{
                   TelaA.setVisible(true);
                   TelaA.setResizable(false);
               }
        
        }
    }//GEN-LAST:event_AcesoAgendaBotaoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
           Con.ExecultaSQL("select * from usuario where Loginusu ='"+UsuarioRecebido.getText()+"'");//PESQUISA NO BANCO PARA ENCONTRAR USUARIO
           Con.Rs.first();//PEGA O PRIMEIRO RESULTADO
           
           if(Con.Rs.getString("Tipousu").equals("Secretario")||Con.Rs.getString("Tipousu").equals("Dentista")||Con.Rs.getString("Tipousu").equals("Administrador")){//SENDO ADM OU SECRETARIO A TELA ABRE PARA CADRASTRAR MEDICO
               if(TelaAD==null){                   
                   TelaAD =  new TelaAgendaDiaria();
                   TelaAD.setVisible(true);
                   TelaAD.setResizable(false);
               }else{
                   TelaAD.setVisible(true);
                   TelaAD.setResizable(false);
               }
               
           }else{
               JOptionPane.showMessageDialog(rootPane,"VOCE NAO TEM PERMISSAO PARA ACESSAR A AGENDA");
           }
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(rootPane,"ACESSO COM ADMIN1 \n\n\n");
       }
      if(UsuarioRecebido.getText().equals("admin1")&&UsuarioRecebido.getText().equals("admin1")){
            if(TelaAD==null){                   
                   TelaAD =  new TelaAgendaDiaria();
                   TelaAD.setVisible(true);
                   TelaAD.setResizable(false);
               }else{
                   TelaAD.setVisible(true);
                   TelaAD.setResizable(false);
               }
        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcesoAgendaBotao;
    private javax.swing.JButton AcesoDentistasBotao;
    private javax.swing.JButton AcesoPacientesBotao;
    private javax.swing.JButton AcesoPacientesBotao1;
    private javax.swing.JButton AcesoPacientesBotao2;
    private javax.swing.JButton AcesoPacientesBotao3;
    private javax.swing.JButton AcesoSairBotao;
    private javax.swing.JLabel UsuarioRecebido;
    private javax.swing.JButton UsuarioTelaAceso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
