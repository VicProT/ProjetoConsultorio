/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;



import ModeloBeans.BeansUsuario;
import ModeloConeciton.ConexaoBanco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor
 */
public class DaoUsuario {
    ConexaoBanco Conex = new ConexaoBanco();
    BeansUsuario Mod = new BeansUsuario();
    
    public void Salvar(BeansUsuario Mod){//SALVA DADOS
        Conex.Conexao();
        try {
            PreparedStatement Pst= Conex.Con.prepareStatement("insert into usuario(Nomeusu,Loginusu,Senhausu,Tipousu)values(?,?,?,?)");
            Pst.setString(1,Mod.getNomeUsu());
            Pst.setString(2,Mod.getLoginUsu());
            Pst.setString(3,Mod.getSenhaUsu());
            Pst.setString(4,Mod.getTipoUsu());           
            Pst.execute();
            JOptionPane.showMessageDialog(null,"Inseriu Usuario");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro Inserir Usuario"+ex);
        }
        
        Conex.Desconecta();
    }
    
    public BeansUsuario BuscarUsuario(BeansUsuario Mod){
        Conex.Conexao();
        Conex.ExecultaSQL("select * from usuario where  Nomeusu like '%"+Mod.getPesquisarUsuario()+"%'");
        try {
            Conex.Rs.first();
            Mod.setCoddenUsu(Conex.Rs.getInt("Coddenusu"));
            Mod.setNomeUsu(Conex.Rs.getString("Nomeusu"));
            Mod.setLoginUsu(Conex.Rs.getString("Loginusu"));
            Mod.setSenhaUsu(Conex.Rs.getString("Senhausu"));
            Mod.setTipoUsu(Conex.Rs.getString("Tipousu"));
            
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro de Busca de Usuario---------------\n\n"+ex);
        }
        
        Conex.Desconecta();
        return Mod;
        
    }
    public void Alteraroi(BeansUsuario Mod){
        Conex.Conexao();
        try {
            PreparedStatement Pst = Conex.Con.prepareStatement("update usuario set Nomeusu = ?,Loginusu= ? ,Senhausu = ? ,Tipousu= ? where Coddenusu = ?");
            Pst.setString(1,Mod.getNomeUsu());
            Pst.setString(2,Mod.getLoginUsu());
            Pst.setString(3,Mod.getSenhaUsu());
            Pst.setString(4,Mod.getTipoUsu());
            Pst.setInt(5,Mod.getCoddenUsu());
            Pst.execute();
            JOptionPane.showMessageDialog(null,"Edicao feita no USUARIO \n\n");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro de Edicao do USUARIO \n\n"+ex);
        }
        Conex.Desconecta();
    }
    
    public void Excluir(BeansUsuario Mod){
        Conex.Conexao();
        
        try {
            PreparedStatement Pst = Conex.Con.prepareStatement("delete from usuario where  Coddenusu = ?");
            Pst.setInt(1,Mod.getCoddenUsu());
            Pst.execute();
           JOptionPane.showMessageDialog(null,"Excliu Usuario");         
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao Excluir usuario \n\n"+ex);
        }
        
        Conex.Desconecta();
    }
}
