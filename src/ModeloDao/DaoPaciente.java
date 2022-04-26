/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import ModeloBeans.BeansPaciente;
import ModeloConeciton.ConexaoBanco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor
 */
public class DaoPaciente {
    ConexaoBanco Conex = new ConexaoBanco();
    BeansPaciente Mod = new BeansPaciente();
    
    public void Salvar(BeansPaciente Mod){//SALVA DADOS
        Conex.Conexao();
        try {
            PreparedStatement Pst= Conex.Con.prepareStatement("insert into paciente(Nomepaci,CPFpaci,Telpaci,RGpaci,Procepaci,Nascipaci)values(?,?,?,?,?,?)");
            Pst.setString(1,Mod.getNomePaci());
            Pst.setString(2,Mod.getCPFPaci());
            Pst.setString(3,Mod.getTelPaci());
            Pst.setString(4,Mod.getRGPaci());
            Pst.setString(5,Mod.getProcePaci()); 
            Pst.setString(6,Mod.getNasciPaci());
            Pst.execute();
            JOptionPane.showMessageDialog(null,"Inseriu Paciente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro Inserir Paciente"+ex);
        }
        
        Conex.Desconecta();
    }
    
    public BeansPaciente  BuscarPaciente(BeansPaciente Mod){
        Conex.Conexao();
        Conex.ExecultaSQL("select * from paciente where  Nomepaci like '%"+Mod.getPesquisarPaciente()+"%'");
        try {
            Conex.Rs.first();
            Mod.setCoddenPaci(Conex.Rs.getInt("Coddenpaci"));
            Mod.setNomePaci(Conex.Rs.getString("Nomepaci"));
            Mod.setCPFPaci(Conex.Rs.getString("CPFpaci"));
            Mod.setTelPaci(Conex.Rs.getString("Telpaci"));
            Mod.setRGPaci(Conex.Rs.getString("RGpaci"));
            Mod.setProcePaci(Conex.Rs.getString("Procepaci"));
            Mod.setNasciPaci(Conex.Rs.getString("Nascipaci"));
            
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro de Busca de Paciente---------------\n\n"+ex);
        }
        
        Conex.Desconecta();
        return Mod;
        
    }
    public void AlterarSim(BeansPaciente Mod){
        Conex.Conexao();
        try {
            PreparedStatement Pst = Conex.Con.prepareStatement("update paciente set Nomepaci= ?,CPFpaci= ? ,Telpaci = ? ,RGpaci= ? ,Procepaci= ? ,Nascipaci= ? where Coddenpaci = ?");
            Pst.setString(1,Mod.getNomePaci());
            Pst.setString(2,Mod.getCPFPaci());
            Pst.setString(3,Mod.getTelPaci());
            Pst.setString(4,Mod.getRGPaci());
            Pst.setString(5,Mod.getProcePaci());
            Pst.setString(6,Mod.getNasciPaci());
            Pst.setInt(7,Mod.getCoddenPaci());
            Pst.execute();
            JOptionPane.showMessageDialog(null,"Edicao feita no PACIENTE \n\n");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro de Edicao do PACIENTE \n\n"+ex);
        }
        Conex.Desconecta();
    }
    
    public void Excluir(BeansPaciente Mod){
        Conex.Conexao();
        
        try {
            PreparedStatement Pst = Conex.Con.prepareStatement("delete from paciente where Coddenpaci = ?");
            Pst.setInt(1,Mod.getCoddenPaci());
            Pst.execute();
           JOptionPane.showMessageDialog(null,"Excliu Paciente");         
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao Excluir Paciente \n\n"+ex);
        }
        
        Conex.Desconecta();
    }
    
}
