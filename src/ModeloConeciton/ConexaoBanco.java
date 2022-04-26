
package ModeloConeciton;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ConexaoBanco {
    
    public Statement Stm;//RESPONSAVEL POR PESQUISAR
    public ResultSet Rs;
    private String Driver = "com.mytsql.Driver";
    private String Caminho = "jdbc:mysql://localhost:3306/odonto";
    private String Usuario =  "root";
    private String Senha = "2108mort";
    public Connection  Con;
    
    
    public void Conexao(){//CONECTA COM O BANCO
        
        try {
            System.setProperty("jdbc.Drivers", Driver);
            Con = DriverManager.getConnection(Caminho,Usuario,Senha);
           //JOptionPane.showMessageDialog(null,"Conexao Efetuada");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Conexao Nao Efetuada" + ex);
            
        }
                
    
    }
    
    public void ExecultaSQL(String SQL){
        
        try {
            Stm = Con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);//DIFERENCIA M de m - PERCORRER REGISTRO 
             Rs = Stm.executeQuery(SQL);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro no Sql \n\n " + ex.getMessage());
        }
            
        
    }
    public void Desconecta(){//DESCONECTA COM O BANCO
        try {
            Con.close();
           // JOptionPane.showMessageDialog(null,"Desconexao Efetuada");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Desconecta" +  ex);
        
        }
    
    }
}