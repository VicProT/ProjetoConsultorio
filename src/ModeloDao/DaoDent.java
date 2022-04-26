/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import ModeloConeciton.ConexaoBanco;
import ModeloBeans.BeansDent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Victor
 */
public class DaoDent {
    
    ConexaoBanco Conex = new ConexaoBanco();
    BeansDent Mod = new BeansDent();
    
    public void Salvar(BeansDent Mod){//SALVA DADOS
        Conex.Conexao();
        try {
            PreparedStatement Pst= Conex.Con.prepareStatement("insert into dent (Nomedent,Registro,Cpfden,Telden,Areaden)values(?,?,?,?,?)");
            Pst.setString(1,Mod.getNomeDent());
            Pst.setString(2,Mod.getRegDent());
            Pst.setString(3,Mod.getCpfDent());
            Pst.setString(4,Mod.getTelDent());
            Pst.setString(5,Mod.getAreaDent());
            Pst.execute();
            JOptionPane.showMessageDialog(null,"Inseriu");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro Inseriu"+ex);
        }
        
        Conex.Desconecta();
    }
    
    public BeansDent BuscarDent(BeansDent Mod){
        Conex.Conexao();
        Conex.ExecultaSQL("select * from dent where Nomedent like '"+Mod.getPesquisaDent()+"'");
        try {
            Conex.Rs.first();
            Mod.setCodDent(Conex.Rs.getInt("Codden"));
            Mod.setNomeDent(Conex.Rs.getString("Nomedent"));
            Mod.setRegDent(Conex.Rs.getString("Registro"));
            Mod.setCpfDent(Conex.Rs.getString("Cpfden"));
            Mod.setTelDent(Conex.Rs.getString("Telden"));
            Mod.setAreaDent(Conex.Rs.getString("Areaden"));
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro de Busca\n\n"+ex);
        }
        
        Conex.Desconecta();
        return Mod;
        
    }
    
    public void Editar(BeansDent Mod){
        Conex.Conexao();
        try {
            PreparedStatement Pst = Conex.Con.prepareStatement("update dent set Nomedent = ?,Registro= ? ,Cpfden = ? ,Telden = ? ,Areaden = ?  where Codden = ?");
            Pst.setString(1,Mod.getNomeDent());
            Pst.setString(2,Mod.getRegDent());
            Pst.setString(3,Mod.getCpfDent());
            Pst.setString(4,Mod.getTelDent());
            Pst.setString(5,Mod.getAreaDent());
            Pst.setInt(6,Mod.getCodDent());
            Pst.execute();
            JOptionPane.showMessageDialog(null,"Edicao feita \n\n");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro de Edicao\n\n"+ex);
        }
        
        Conex.Desconecta();
    
    }
    
    public void Excluir(BeansDent Mod){
        Conex.Conexao();
        
        try {
            PreparedStatement Pst = Conex.Con.prepareStatement("delete from dent where Codden = ?");
            Pst.setInt(1,Mod.getCodDent());
            Pst.execute();
           JOptionPane.showMessageDialog(null,"Excliu ");         
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao Excluir\n\n"+ex);
        }
        
        Conex.Desconecta();
    }
    
    
}
