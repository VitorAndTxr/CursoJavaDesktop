/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.ModeloTelefone;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Cogeti
 */
public class ControleTelefone {
    ConectaBanco connTel = new ConectaBanco();
    public void novoTel(ModeloTelefone mod){
        connTel.conexao();
        PreparedStatement pst;
        try {
            pst = connTel.conn.prepareStatement("insert into telefone(numero_tel) values(?)");
            pst.setString(1, mod.getTel());
            pst.execute();            
            } catch (SQLException ex) {
            Logger.getLogger(ControleTelefone.class.getName()).log(Level.SEVERE, null, ex);
        }
        connTel.desconecta();
    }
    public void exclui(ModeloTelefone mod){
        connTel.conexao();
        PreparedStatement pst;
        try {
            pst = connTel.conn.prepareStatement("delete from telefone where id_telefone = ?");
            pst.setInt(1, mod.getCod());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControleTelefone.class.getName()).log(Level.SEVERE, null, ex);
        }
        connTel.desconecta();
    }
    public void alterar(ModeloTelefone mod){
        connTel.conexao();
        PreparedStatement pst;
        try {
            pst = connTel.conn.prepareStatement("update telefone set numero_tel = ? where id_telefone = ?");
            pst.setString(1, mod.getTel());
            JOptionPane.showMessageDialog(null,mod.getTel());
            pst.setInt(2, mod.getCod());
            JOptionPane.showMessageDialog(null,mod.getCod());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControleTelefone.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
