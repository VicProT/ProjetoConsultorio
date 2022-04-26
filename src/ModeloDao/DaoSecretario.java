/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import ModeloBeans.BeansSecretario;
import ModeloConeciton.ConexaoBanco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor
 */
public class DaoSecretario {
    
    ConexaoBanco Conex = new ConexaoBanco();
    BeansSecretario Mod = new BeansSecretario();
    
    public void Salvar(BeansSecretario Mod){//SALVA DADOS
        Conex.Conexao();
        try {
            PreparedStatement Pst= Conex.Con.prepareStatement("insert into secretario(Nomesecre,CPFsecre,Telsecre)values(?,?,?)");
            Pst.setString(1,Mod.getNomeSecre());
            Pst.setString(2,Mod.getCpfSecre());
            Pst.setString(3,Mod.getTelSecre());
            Pst.execute();
            JOptionPane.showMessageDialog(null,"Inseriu SECRETARIO");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro Inserir SECRETARIO \n\n\n\n\n"+ex);
        }
        
        Conex.Desconecta();
    }
    
    public BeansSecretario BuscarPaciente(BeansSecretario Mod){
        Conex.Conexao();
        Conex.ExecultaSQL("select * from secretario where  Nomepaci like '%"+Mod.getPesquisaSecre()+"%'");
        try {
            Conex.Rs.first();
            Mod.setCodSecre(Conex.Rs.getInt("Coddensecre"));
            Mod.setNomeSecre(Conex.Rs.getString("Nomesecre"));
            Mod.setCpfSecre(Conex.Rs.getString("CPFsecre"));
            Mod.setTelSecre(Conex.Rs.getString("Telsecre"));           
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro de Busca de SECRETARIO---------------\n\n"+ex);
        }
        
        Conex.Desconecta();
        return Mod;
        
    }
    public void AlterarSiim(BeansSecretario Mod){
        Conex.Conexao();
        try {
            PreparedStatement Pst = Conex.Con.prepareStatement("update secretario set Nomesecre= ?,CPFsecre= ? ,Telsecre = ?  where Coddensecre= ?");
            Pst.setString(1,Mod.getNomeSecre());
            Pst.setString(2,Mod.getCpfSecre());
            Pst.setString(3,Mod.getTelSecre());
            Pst.setInt(4,Mod.getCodSecre());
            Pst.execute();
            JOptionPane.showMessageDialog(null,"Edicao feita no SECRETARIO \n\n");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro de Edicao do SECRETARIO \n\n"+ex);
        }
        Conex.Desconecta();
    }
    
    public void Excluir(BeansSecretario Mod){
        Conex.Conexao();
        
        try {
            PreparedStatement Pst = Conex.Con.prepareStatement("delete from secretario where Coddensecre = ?");
            Pst.setInt(1,Mod.getCodSecre());
            Pst.execute();
           JOptionPane.showMessageDialog(null,"Excliu SECRETARIO");         
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao Excluir SECRETARIO \n\n"+ex);
        }
        
        Conex.Desconecta();
    }
    
}
