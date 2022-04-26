/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBeans;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Victor
 */
public class ModeloTabela extends AbstractTableModel{
    
    private ArrayList Linhas = null; //COLECAO PARA ARMAZENAR OBJ
    private String[] Colunas = null; //VETOR
    
    
    public ModeloTabela(ArrayList Lin,String[] Col){
        setLinhas(Lin);
        setColunas(Col);
    }

    /**
     * @return the Linhas
     */
    public ArrayList getLinhas() {
        return Linhas;
    }

    /**
     * @param Linhas the Linhas to set
     */
    public void setLinhas(ArrayList Linhas) {
        this.Linhas = Linhas;
    }

    /**
     * @return the Colunas
     */
    public String[] getColunas() {
        return Colunas;
    }

    /**
     * @param Colunas the Colunas to set
     */
    public void setColunas(String[] Colunas) {
        this.Colunas = Colunas;
    }
    
    
    public int getColumnCount(){
        return Colunas.length; //CONTA COLUNAS
    }
    
    public int getRowCount(){
        return Linhas.size();//CONTA LINHAS
    }
    
    public String getColumnName(int NumCol){
        return Colunas[NumCol]; //RETORNA COLUNAS
    }
    
    public Object getValueAt(int NumLin,int NumCol){//MONTADOR DA TABELA
        Object[] Linhaa = (Object[])getLinhas().get(NumLin);
        return Linhaa[NumCol];
    }
    
}
