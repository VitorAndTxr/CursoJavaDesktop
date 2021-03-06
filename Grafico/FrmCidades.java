/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafico;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import Controle.ConectaBanco;
import Controle.ControleCidade;
import Controle.ModeloTabela;
import Modelo.ModeloCidade;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Cogeti
 */
public class FrmCidades extends javax.swing.JFrame {
    ConectaBanco connEstado = new ConectaBanco();
    ConectaBanco connCidade = new ConectaBanco();
    ModeloCidade mod = new ModeloCidade();
    ControleCidade control = new ControleCidade();  

    /**
     * Creates new form FrmCidades
     */
    public FrmCidades() {
        initComponents();
        connEstado.conexao();
        connCidade.conexao();
        preencherTabela("select * from cidade inner join estados on cidade.id_estado = estados.id_estado");
        connEstado.executaSQL("select * from estados order by nome_estado");
        jComboBoxEstado.removeAllItems();
        try{
            connEstado.rs.first();
            do{
                jComboBoxEstado.addItem(connEstado.rs.getString("nome_estado"));
            }while(connEstado.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro do combobox:/n" + ex);
        }     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jButtonAdd = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonFirst = new javax.swing.JButton();
        jButtonDel = new javax.swing.JButton();
        jButtonPrevious = new javax.swing.JButton();
        jButtonNext = new javax.swing.JButton();
        jButtonLast = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();

        jButton7.setText("jButton7");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cidades");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cadastro de Cidades");

        jLabel2.setText("Código:");

        jLabel3.setText("Nome:");

        jLabel4.setText("Estado:");

        jTextFieldCod.setEditable(false);
        jTextFieldCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodActionPerformed(evt);
            }
        });

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Add-32.png"))); // NOI18N
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Save_32.png"))); // NOI18N
        jButtonSave.setEnabled(false);
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Edit-32.png"))); // NOI18N
        jButtonEdit.setEnabled(false);
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/2leftarrow-32.png"))); // NOI18N
        jButtonFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFirstActionPerformed(evt);
            }
        });

        jButtonDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Delete-File-32.png"))); // NOI18N
        jButtonDel.setEnabled(false);
        jButtonDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelActionPerformed(evt);
            }
        });

        jButtonPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1leftarrow-32.png"))); // NOI18N
        jButtonPrevious.setEnabled(false);
        jButtonPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPreviousActionPerformed(evt);
            }
        });

        jButtonNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1rightarrow-32.png"))); // NOI18N
        jButtonNext.setEnabled(false);
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });

        jButtonLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/2rightarrow-32.png"))); // NOI18N
        jButtonLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLastActionPerformed(evt);
            }
        });

        jButtonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Door-Out-32.png"))); // NOI18N
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabela);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonDel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonLast, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonExit)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonSave))
                                    .addComponent(jButtonPrevious, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(jButtonDel, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jButtonEdit)
                            .addComponent(jButtonNext)
                            .addComponent(jButtonLast)
                            .addComponent(jButtonFirst))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        try {
            mod.setCodigo(Integer.parseInt(jTextFieldCod.getText()));
            mod.setNome(jTextFieldNome.getText());
            connCidade.executaSQL("select * from estados where nome_estado = '"+jComboBoxEstado.getSelectedItem()+"'");
            connCidade.rs.first();
            mod.setCodigo_estado(connCidade.rs.getInt("id_estado"));
            control.editCidade(mod);
            jButtonAdd.setEnabled(true);
            jButtonFirst.setEnabled(true);
            jButtonLast.setEnabled(true);
            jButtonNext.setEnabled(true);
            jButtonPrevious.setEnabled(true);
            jTextFieldNome.setEnabled(true);
            jComboBoxEstado.setEnabled(true);
            jButtonNext.setEnabled(false);
            jButtonPrevious.setEnabled(false);
            jButtonSave.setEnabled(false);
            jButtonEdit.setEnabled(false);
            jTextFieldNome.setText("");
            jTextFieldCod.setText("");
            jComboBoxEstado.setSelectedIndex(0);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar"+ex);
        }
        preencherTabela("select * from cidade inner join estados on cidade.id_estado = estados.id_estado");

    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        try {
            mod.setNome(jTextFieldNome.getText());
            connEstado.executaSQL("select * from estados where nome_estado='"+jComboBoxEstado.getSelectedItem()+"'"); 
            connEstado.rs.first();
            mod.setCodigo_estado(connEstado.rs.getInt("id_estado"));
            control.InserirCidade(mod);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir registro" +ex);
        }
        jTextFieldCod.setText("");
        jTextFieldNome.setText("");
        jComboBoxEstado.setSelectedIndex(0);
        preencherTabela("select * from cidade inner join estados on cidade.id_estado = estados.id_estado");
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFirstActionPerformed
        jButtonDel.setEnabled(true);
        jButtonEdit.setEnabled(true);
        jButtonAdd.setEnabled(false);
        jButtonNext.setEnabled(true);
        jButtonPrevious.setEnabled(true);
        jTextFieldNome.setEnabled(false);
        jComboBoxEstado.setEnabled(false);
        try {
            connCidade.executaSQL("select * from cidade order by id_cidade");
            connCidade.rs.first();
            jTextFieldCod.setText(String.valueOf(connCidade.rs.getInt("id_cidade")));
            jTextFieldNome.setText(connCidade.rs.getString("nome_cidade"));
            connEstado.executaSQL("select * from estados where id_estado = "+connCidade.rs.getInt("id_estado"));
            connEstado.rs.first();
            jComboBoxEstado.setSelectedItem(connEstado.rs.getString("nome_estado"));
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null,"Erro ao Setar o primeiro registro"+ ex);
        }
        

    }//GEN-LAST:event_jButtonFirstActionPerformed

    private void jButtonLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLastActionPerformed
        jButtonDel.setEnabled(true);
        jButtonEdit.setEnabled(true);
        jButtonAdd.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jComboBoxEstado.setEnabled(false);
        try {
            connCidade.executaSQL("select * from cidade order by id_cidade");
            connCidade.rs.last();
            jTextFieldCod.setText(String.valueOf(connCidade.rs.getInt("id_cidade")));
            jTextFieldNome.setText(connCidade.rs.getString("nome_cidade"));
            connEstado.executaSQL("select * from estados where id_estado = "+connCidade.rs.getInt("id_estado"));
            connEstado.rs.first();
            jComboBoxEstado.setSelectedItem(connEstado.rs.getString("nome_estado"));
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null,"Erro ao Setar o ultimo registro"+ ex);
        }
    }//GEN-LAST:event_jButtonLastActionPerformed

    private void jButtonPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPreviousActionPerformed
        try {
            connCidade.rs.previous();
            jTextFieldCod.setText(String.valueOf(connCidade.rs.getInt("id_cidade")));
            jTextFieldNome.setText(connCidade.rs.getString("nome_cidade"));
            connEstado.executaSQL("select * from estados where id_estado = "+connCidade.rs.getInt("id_estado"));
            connEstado.rs.first();
            jComboBoxEstado.setSelectedItem(connEstado.rs.getString("nome_estado"));
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null,"Erro ao Setar o registro anterior"+ ex);
        }
    }//GEN-LAST:event_jButtonPreviousActionPerformed

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        try {
            connCidade.rs.next();
            jTextFieldCod.setText(String.valueOf(connCidade.rs.getInt("id_cidade")));
            jTextFieldNome.setText(connCidade.rs.getString("nome_cidade"));
            connEstado.executaSQL("select * from estados where id_estado = "+connCidade.rs.getInt("id_estado"));
            connEstado.rs.first();
            jComboBoxEstado.setSelectedItem(connEstado.rs.getString("nome_estado"));
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null,"Erro ao Setar o registro próximo"+ ex);
        }
    }//GEN-LAST:event_jButtonNextActionPerformed

    private void jButtonDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelActionPerformed
        try {
            mod.setCodigo(Integer.parseInt(jTextFieldCod.getText()));
            mod.setNome(jTextFieldNome.getText());
            mod.setCodigo_estado(connCidade.rs.getInt("id_estado"));
            control.excluiCidade(mod);
            jButtonAdd.setEnabled(true);
            jTextFieldNome.setEnabled(true);
            jComboBoxEstado.setEnabled(true);
            jButtonNext.setEnabled(false);
            jButtonPrevious.setEnabled(false);
            jButtonDel.setEnabled(false);
            jButtonEdit.setEnabled(false);
            jTextFieldNome.setText("");
            jTextFieldCod.setText("");
            jComboBoxEstado.setSelectedIndex(0);
        } catch (SQLException ex) {
            Logger.getLogger(FrmCidades.class.getName()).log(Level.SEVERE, null, ex);
        }
        preencherTabela("select * from cidade inner join estados on cidade.id_estado = estados.id_estado");

    }//GEN-LAST:event_jButtonDelActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        jButtonSave.setEnabled(true);
        jButtonDel.setEnabled(false);
        jButtonFirst.setEnabled(false);
        jButtonLast.setEnabled(false);
        jButtonNext.setEnabled(false);
        jButtonPrevious.setEnabled(false);
        jTextFieldNome.setEnabled(true);
        jComboBoxEstado.setEnabled(true);
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonExitActionPerformed

    public void preencherTabela(String SQL){
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"ID", "Cidade", "Estado"};
        connCidade.executaSQL(SQL);

        try{
            connCidade.rs.first();
            do{
                dados.add(new Object[]{connCidade.rs.getInt("id_cidade"), connCidade.rs.getString("nome_cidade"), connCidade.rs.getString("sigla_estado")});
            }while(connCidade.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        Tabela.setModel(modelo);
        
        for(int i = 0; i<Colunas.length; i++){
            Tabela.getColumnModel().getColumn(i).setPreferredWidth(150);
            Tabela.getColumnModel().getColumn(i).setResizable(false);
        }
        Tabela.getTableHeader().setReorderingAllowed(false);
        Tabela.setAutoResizeMode(Tabela.AUTO_RESIZE_OFF);
        Tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);     
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCidades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDel;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonFirst;
    private javax.swing.JButton jButtonLast;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JButton jButtonPrevious;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
