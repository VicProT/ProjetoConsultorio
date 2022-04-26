/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import ModeloBeans.BeansAgenda;
import ModeloConeciton.ConexaoBanco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor
 */
public class DaoAgenda {
    
    BeansAgenda agenda = new BeansAgenda();
    ConexaoBanco Conex = new ConexaoBanco(); 
    ConexaoBanco ConexPaciente = new ConexaoBanco();
    ConexaoBanco ConexDentista = new ConexaoBanco();
    
    int CodDentista;
    int CodPaciente;
    
    public void Salvar(BeansAgenda agenda){
        BuscarPaciente(agenda.getNomePaciAge());
        BuscarDentista(agenda.getNomeMedAge());
        Conex.Conexao();   
        
          try {
            PreparedStatement Pst = Conex.Con.prepareStatement("insert into agenda(PacienteCodage,DentistaCodage,Horarioage,Procedimentoage,Dataage,Statusage)values(?,?,?,?,?,?)");
            Pst.setInt(1,CodPaciente);
            Pst.setInt(2,CodDentista);
            Pst.setString(3,agenda.getHorarioAge());
            Pst.setString(4,agenda.getProcedimentoAge());
            Pst.setDate(5,new java.sql.Date(agenda.getDataAge().getTime()));
            Pst.setString(6,agenda.getStatusAge());
            Pst.execute();
             JOptionPane.showMessageDialog(null,"AGENDA salva \n\n\n");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar AGENDA \n\n\n"+ex);
        }
        Conex.Desconecta();
    }
    
    public void BuscarDentista(String NomeDentistaA){
        ConexDentista.Conexao();//CONECTA COM O BANCO 
        ConexDentista.ExecultaSQL("select * from dent where Nomedent='"+NomeDentistaA+"'");
        try {
            ConexDentista.Rs.first();
            CodDentista = Conex.Rs.getInt("Codden");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao buscar DENTISTA na AGENDA \n\n\n"+ex);
        }
    }
    
    public void BuscarPaciente(String NomePacienteA){
        ConexPaciente.Conexao();
        ConexPaciente.ExecultaSQL("select * from paciente where Nomepaci='"+NomePacienteA+"'");
        try {
            ConexPaciente.Rs.first();
            CodPaciente = Conex.Rs.getInt("Coddenpaci");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao buscar PACIENTE na AGENDA \n\n\n"+ex);
        }
    
    }
    
    public void Alterar(BeansAgenda agenda){
        
        Conex.Conexao();
        try {
            PreparedStatement Pst = Conex.Con.prepareStatement("update agenda set Statusage= ? where Coddenage = ?");
            Pst.setString(1,agenda.getStatusAge());
            Pst.setInt(2,agenda.getCoddenAge());
            Pst.execute();
            JOptionPane.showMessageDialog(null,"Edicao feita no STATUS AGENDA \n\n");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro de Edicao do STATUS AGENDA \n\n"+ex);
        }
        Conex.Desconecta();
    
    }
    
}
