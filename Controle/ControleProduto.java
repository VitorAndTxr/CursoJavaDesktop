/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.ModeloProduto;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Cogeti
 */
public class ControleProduto {
    ConectaBanco conexao = new ConectaBanco();
    
    public void inserirProduto(ModeloProduto mod){
        conexao.conexao();
        PreparedStatement pst;    
        try {
            pst = conexao.conn.prepareStatement("insert into produto"
                    + "(nome_produto, preco_compra, preco_venda, quantidade, id_fornecedor) values(?, ?, ?, ?, ?)");
            pst.setString(1, mod.getNome());
            pst.setFloat(2, mod.getPreco_compra());
            pst.setFloat(3, mod.getPreco_venda());
            pst.setInt(4, mod.getQuantidade());
            pst.setInt(5, mod.getFornecedor());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            } 
        conexao.desconecta();       
    }
    public void excluirProduto(ModeloProduto mod){
        conexao.conexao();
        PreparedStatement pst;
        try {
            pst = conexao.conn.prepareStatement("delete from produto where id_produto = ?");
            pst.setInt(1, mod.getId_produto());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastro excluido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        conexao.desconecta();
    }
    public void editarProduto(ModeloProduto mod){
        conexao.conexao();
        try {
            PreparedStatement pst;
            pst = conexao.conn.prepareStatement("update produto set nome_produto=?, "
                    + "preco_compra = ?, preco_venda = ?, quantidade = ?, id_fornecedor = ? "
                    + "where id_produto = ?");
            pst.setString(1, mod.getNome());
            pst.setFloat(2, mod.getPreco_compra());
            pst.setFloat(3, mod.getPreco_venda());
            pst.setInt(4, mod.getQuantidade());
            pst.setInt(5, mod.getFornecedor());
            pst.setInt(6, mod.getId_produto());
            pst.execute();            
            JOptionPane.showMessageDialog(null, "Cadastro Alterado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
        conexao.desconecta();
    }    
}
