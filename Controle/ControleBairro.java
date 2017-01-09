/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.ModeloBairro;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;


public class ControleBairro {
    ConectaBanco connBairro = new ConectaBanco();
    ConectaBanco connCidade = new ConectaBanco();
    ConectaBanco connEstado = new ConectaBanco();
    public void addBairro(ModeloBairro mod){
        connBairro.conexao();
        PreparedStatement pst;
        
        try {
            pst = connBairro.conn.prepareStatement("insert into bairro(nome_bairro, id_cidade) values(?,?)");
            pst.setString(1, mod.getNome_bairro());
            pst.setInt(2, mod.getId_cidade());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na inserção de dados"+ex);
        }
        connBairro.desconecta();
    }
    public void deleteBairro(int id){
        PreparedStatement pst;
        connBairro.conexao();
        try {
            pst = connBairro.conn.prepareStatement("delete from bairro where id_bairro = ?");
            pst.setInt(1, id);
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na exclusão de dados"+ex);

        }
        connBairro.desconecta();
    }
    public void editaBairro(ModeloBairro mod){
        connBairro.conexao();
        PreparedStatement pst;
        try {
            pst = connBairro.conn.prepareStatement("update bairro set nome_bairro = ?, id_cidade = ? where id_bairro = ?");
            pst.setString(1, mod.getNome_bairro());
            pst.setInt(2, mod.getId_cidade());
            pst.setInt(3, mod.getId_bairro());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na edição\n"+ex);
        }
        connBairro.desconecta();
    }
    public JComboBox preencheCidades(JComboBox comboBox, String sigla) {
        connCidade.conexao();
        comboBox.removeAllItems();
        connCidade.executaSQL("select * from cidade inner join estados on cidade.id_estado = estados.id_estado and sigla_estado = '"+sigla+"'");
        try {
            connCidade.rs.first();
            do {
                comboBox.addItem(connCidade.rs.getString("nome_cidade"));
            } while (connCidade.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no preenchimento da combo box\n"+ex);

        }
        connCidade.desconecta();
        return comboBox;
    }
    public JTable preencherTabela(JTable tabela){
        connBairro.conexao();
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"ID", "Bairro", "Cidade"};
        connBairro.executaSQL("select * from bairro inner join cidade on bairro.id_cidade = cidade.id_cidade order by id_bairro");
        try{
            connBairro.rs.first();
            do{
                dados.add(new Object[]{connBairro.rs.getInt("id_bairro"), connBairro.rs.getString("nome_bairro"), connBairro.rs.getString("nome_cidade")});
            }while(connBairro.rs.next());
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
