
package Interface;

import ModeloConeciton.ConexaoBanco;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




public class LoginUsuario extends javax.swing.JFrame {
    
   ConexaoBanco Con = new ConexaoBanco();
    
    
    public LoginUsuario() {
        initComponents();
        Con.Conexao();    
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoAcessar = new javax.swing.JButton();
        BotaoFecharLogin = new javax.swing.JButton();
        Usuario = new javax.swing.JLabel();
        Senha = new javax.swing.JLabel();
        UsuarioDigitar = new javax.swing.JTextField();
        SenhaDigitar = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        BotaoAcessar.setText("Acessar");
        BotaoAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoAcessar);
        BotaoAcessar.setBounds(370, 170, 79, 25);

        BotaoFecharLogin.setText("Fechar");
        BotaoFecharLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFecharLoginActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoFecharLogin);
        BotaoFecharLogin.setBounds(650, 10, 140, 25);

        Usuario.setText("Usuario :");
        getContentPane().add(Usuario);
        Usuario.setBounds(150, 110, 60, 20);

        Senha.setText("Senha : ");
        getContentPane().add(Senha);
        Senha.setBounds(400, 110, 49, 20);

        UsuarioDigitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioDigitarActionPerformed(evt);
            }
        });
        getContentPane().add(UsuarioDigitar);
        UsuarioDigitar.setBounds(210, 110, 180, 22);

        SenhaDigitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaDigitarActionPerformed(evt);
            }
        });
        getContentPane().add(SenhaDigitar);
        SenhaDigitar.setBounds(460, 110, 190, 22);

        setSize(new java.awt.Dimension(814, 371));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAcessarActionPerformed
        if(UsuarioDigitar.getText().equals("admin1")&&SenhaDigitar.getText().equals("admin1")){
            TelaAceso Tela = new TelaAceso(UsuarioDigitar.getText());//INSTANCIAMENTO DA TELA PRINCIPAL
            Tela.setVisible(true);
            dispose();
        
        }else{
           try {
           Con.ExecultaSQL("select * from usuario where Loginusu ='"+UsuarioDigitar.getText()+"'");
           Con.Rs.first();
           if(Con.Rs.getString("Senhausu").equals(SenhaDigitar.getText())){
               
           }
           else{
               JOptionPane.showMessageDialog(rootPane,"SENHA OU USUARIOS INVALIDOS");
           }
           } catch (SQLException ex) {
           JOptionPane.showMessageDialog(rootPane,"ERRO"+ex);
           }
        
      }
       
               
    }//GEN-LAST:event_BotaoAcessarActionPerformed

    private void UsuarioDigitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioDigitarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioDigitarActionPerformed

    private void SenhaDigitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaDigitarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SenhaDigitarActionPerformed

    private void BotaoFecharLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFecharLoginActionPerformed
        // TODO add your handling code here:
        //BOTAO FECHA O SISTEMA
         Con.Desconecta();
         System.exit(0);
      
    }//GEN-LAST:event_BotaoFecharLoginActionPerformed

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
            java.util.logging.Logger.getLogger(LoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAcessar;
    private javax.swing.JButton BotaoFecharLogin;
    private javax.swing.JLabel Senha;
    private javax.swing.JPasswordField SenhaDigitar;
    private javax.swing.JLabel Usuario;
    private javax.swing.JTextField UsuarioDigitar;
    // End of variables declaration//GEN-END:variables
}
