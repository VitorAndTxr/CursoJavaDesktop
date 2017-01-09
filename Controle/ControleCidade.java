/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.ModeloCidade;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Cogeti
 */
public class ControleCidade {
    ConectaBanco connCidade = new ConectaBanco();
    public void InserirCidade(ModeloCidade mod){
        connCidade.conexao();
        PreparedStatement pst;
        try {
            pst = connCidade.conn.prepareStatement("insert into cidade(nome_cidade, id_estado) values(?,?)");
            pst.setString(1, mod.getNome());
            pst.setInt(2, mod.getCodigo_estado());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha na inserção!/n"+ex);
        }
        connCidade.desconecta();    
    }
    public void excluiCidade(ModeloCidade mod){
        connCidade.conexao();
        try {
            PreparedStatement pst = connCidade.conn.prepareStatement("delete from cidade where id_cidade=?");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso");            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na exclusão dos dados\n"+ex);
        }
        connCidade.desconecta();
    }
    public void editCidade(ModeloCidade mod){
        connCidade.conexao();
        try {
            PreparedStatement pst = connCidade.conn.prepareStatement("update cidade set nome_cidade=?, id_estado=? where id_cidade=?");
            pst.setString(1, mod.getNome());
            pst.setInt(2, mod.getCodigo_estado());
            pst.setInt(3, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Alterado com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro al alterar"+ex);
        }
    }
}
