/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.ModeloEstado;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Cogeti
 */
public class ControleEstado {
    ConectaBanco connEstado = new ConectaBanco();
    public void novo(ModeloEstado mod){
        PreparedStatement pst;
        connEstado.conexao();
        try {
            pst = connEstado.conn.prepareStatement("insert into estados (nome_estado, sigla_estado) values(?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getSigla());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControleEstado.class.getName()).log(Level.SEVERE, null, ex);
        }
        connEstado.desconecta();
    }
    public void exclui(ModeloEstado mod){
        PreparedStatement pst;
        connEstado.conexao();
        try {
            pst = connEstado.conn.prepareStatement("delete from estados where id_estado = ?");
            pst.setInt(1, mod.getId());
            JOptionPane.showMessageDialog(null, mod.getId());
            pst.execute();
                    } catch (SQLException ex) {
            Logger.getLogger(ControleEstado.class.getName()).log(Level.SEVERE, null, ex);
        }
        connEstado.desconecta();
    }
    public void alterar(ModeloEstado mod){
        PreparedStatement pst;
        connEstado.conexao();
        try {
            pst = connEstado.conn.prepareStatement("update estados set nome_estado = ?, sigla_estado = ? where id_estado = ?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getSigla());
            pst.setInt(3, mod.getId());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControleEstado.class.getName()).log(Level.SEVERE, null, ex);
        }      
        connEstado.desconecta();
    }
}
