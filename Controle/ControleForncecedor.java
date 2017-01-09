/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.ModeloFornecedor;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Cogeti
 */
public class ControleForncecedor {
    ConectaBanco conn = new ConectaBanco();
    
    public void excluir(ModeloFornecedor mod){
        PreparedStatement pst;
        conn.conexao();
        try {
            pst = conn.conn.prepareStatement("delete from fornecedores where id_fornecedor = ?");
            pst.setInt(1, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        conn.desconecta();
    }
    
    public void editar(ModeloFornecedor mod){
        PreparedStatement pst;
        conn.conexao();
        try {
            pst = conn.conn.prepareStatement("update fornecedores "
                    + "set nome_fornecedor = ?, endereco = ?, cnpj = ?, id_bairro = ? "
                    + "where id_fornecedor = ?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEndereco());
            pst.setString(3, mod.getCnpj());
            pst.setInt(4, mod.getBairro());
            pst.setInt(5, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        conn.desconecta();
    }
    
    public void novo(ModeloFornecedor mod){
        PreparedStatement pst;
        conn.conexao();
        try {
            pst = conn.conn.prepareStatement("insert into fornecedores "
                    + "(nome_fornecedor, endereco, id_bairro, cnpj) values(?, ?, ?, ?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEndereco());
            pst.setInt(3, mod.getBairro());
            pst.setString(4, mod.getCnpj());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Novo cadastro criado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        conn.desconecta();
    }
    
    
    
    public JComboBox preencheComboEstado(JComboBox box) throws SQLException {
        conn.conexao();
        box.removeAllItems();
        box.addItem("");
        conn.executaSQL("select * from estados order by sigla_estado");
        if (conn.rs.next()) {
            do {
                box.addItem(conn.rs.getString("sigla_estado"));
            } while (conn.rs.next());
            box.setEnabled(true);
        }else{
            JOptionPane.showMessageDialog(null, "Não existem estados cadastrados");
            box.setEnabled(false);
        }
        conn.desconecta();
        return box;
    }

    public JComboBox preencheComboCidade(JComboBox box, String sigla) throws SQLException {
        conn.conexao();
        box.removeAllItems();
        box.addItem("");
        conn.executaSQL("select * from cidade inner join estados on "
                + "cidade.id_estado = estados.id_estado and sigla_estado = '" + sigla + "'");
        if (conn.rs.next()) {

            do {
                box.addItem(conn.rs.getString("nome_cidade"));
            } while (conn.rs.next());
            box.setEnabled(true);
        }else{
            JOptionPane.showMessageDialog(null, "Não existem cidades cadastradas no estado selecionado");
            box.setEnabled(false);
        }
        conn.desconecta();
        return box;
    }

    public JComboBox preencheComboBairro(JComboBox box, String cidade) throws SQLException {
        conn.conexao();
        box.removeAllItems();
        box.addItem("");
        conn.executaSQL("select * from bairro inner join cidade on "
                + "bairro.id_cidade = cidade.id_cidade and nome_cidade = '" + cidade + "'");
        if (conn.rs.next()) {
            do {
                box.addItem(conn.rs.getString("nome_bairro"));
            } while (conn.rs.next());
            box.setEnabled(true);
        }else{
            JOptionPane.showMessageDialog(null, "Não existem bairros cadastrados na cidade selecionada");
            box.setEnabled(false);
        }
        conn.desconecta();
        return box;
    }
    public JTable preencherTabela(JTable tabela) {
        conn.conexao();
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"ID", "Fornecedor", "CNPJ", "Endereço", "Bairro", "Cidade"};
        conn.executaSQL("select * from fornecedores inner join bairro on fornecedores.id_bairro = bairro.id_bairro "
                + "inner join cidade on bairro.id_cidade = cidade.id_cidade order by id_fornecedor");
        try {
            conn.rs.first();
            do {
                dados.add(new Object[]{conn.rs.getInt("id_fornecedor"), conn.rs.getString("nome_fornecedor"),
                    conn.rs.getString("cnpj"), conn.rs.getString("endereco"),
                    conn.rs.getString("nome_bairro"), conn.rs.getString("nome_cidade")});
            } while (conn.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        tabela.setModel(modelo);

        for (int i = 0; i < Colunas.length; i++) {
            tabela.getColumnModel().getColumn(i).setPreferredWidth(150);
            tabela.getColumnModel().getColumn(i).setResizable(false);
        }
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        return tabela;
    }
}

