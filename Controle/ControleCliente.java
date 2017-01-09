/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.ModeloCliente;
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
public class ControleCliente {

    ConectaBanco conn = new ConectaBanco();

    public void novo(ModeloCliente mod) {
        conn.conexao();
        PreparedStatement pst;
        try {
            pst = conn.conn.prepareStatement("insert into clientes"
                    + "(nome_cliente, endereco, rg_cliente, cpf_cliente, id_telefone, id_bairro, id_cidade)"
                    + " values(?,?,?,?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEndereco());
            pst.setString(3, mod.getRg());
            pst.setString(4, mod.getCpf());
            pst.setInt(5, mod.getTel());
            pst.setInt(6, mod.getBairro());
            pst.setInt(7, mod.getCidade());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Inseridos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha na inserção de dados?\n" + ex);
        }
        conn.desconecta();
    }

    public void exclui(ModeloCliente mod) {
        conn.conexao();
        PreparedStatement pst;
        try {
            pst = conn.conn.prepareStatement("delete from clientes where id_cliente = ?");
            pst.setInt(1, mod.getCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha na exclusão de dados!\n" + ex);
        }
        conn.desconecta();

    }
    
    public void edita(ModeloCliente mod){
        conn.conexao();
        PreparedStatement pst;
        try {
            pst = conn.conn.prepareStatement("update clientes set nome_cliente = ?,"
                    + " endereco = ?, rg_cliente = ?, cpf_cliente = ?, id_bairro = ?,"
                    + " id_cidade = ?, id_telefone = ? where id_cliente = ?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEndereco());
            pst.setString(3, mod.getRg());
            pst.setString(4, mod.getCpf());
            pst.setInt(5, mod.getBairro());
            pst.setInt(6, mod.getCidade());
            pst.setInt(7, mod.getTel());
            pst.setInt(8, mod.getCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha na alteração dos dados!\n"+ex);
        }
        conn.desconecta();
    }

    public JComboBox preencheComboTel(JComboBox box) throws SQLException {
        conn.conexao();
        box.removeAllItems();
        box.addItem("");
        conn.executaSQL("select * from telefone order by id_telefone");
        if (conn.rs.next()) {
            do {
                box.addItem(conn.rs.getString("numero_tel"));
            } while (conn.rs.next());
            box.setEnabled(true);
        }else{
            JOptionPane.showMessageDialog(null, "Não existem numeros de telefone cadastrados");
            box.setEnabled(false);
        }
        conn.desconecta();
        return box;
    }

    public JComboBox preencheComboEstado(JComboBox box) throws SQLException {
        conn.conexao();
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
    
    public JTable preencherTabela(JTable tabela){
        conn.conexao();
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"ID", "Nome", "RG", "CPF", "Telefone", "Endereço", "Bairro", "Cidade"};
        conn.executaSQL("select * from clientes inner join telefone on clientes.id_telefone = telefone.id_telefone "
                + "inner join bairro on clientes.id_bairro = bairro.id_bairro "
                + "inner join cidade on clientes.id_cidade = cidade.id_cidade order by id_cliente");
        try{
            conn.rs.first();
            do{
                dados.add(new Object[]{conn.rs.getInt("id_cliente"), conn.rs.getString("nome_cliente"), 
                    conn.rs.getString("rg_cliente"), conn.rs.getString("cpf_cliente"), 
                    conn.rs.getString("numero_tel"), conn.rs.getString("endereco"), 
                    conn.rs.getString("nome_bairro"), conn.rs.getString("nome_cidade")});
            
            }while(conn.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        tabela.setModel(modelo);
        
        for(int i = 0; i<Colunas.length; i++){
            tabela.getColumnModel().getColumn(i).setPreferredWidth(150);
            tabela.getColumnModel().getColumn(i).setResizable(false);
        }
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        return tabela;
    }
}
