/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafico;

import Controle.ConectaBanco;
import Controle.ControleProduto;
import Controle.ModeloTabela;
import Modelo.ModeloProduto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Cogeti
 */
public class FrmProduto extends javax.swing.JFrame {

    ConectaBanco conexao = new ConectaBanco();
    ConectaBanco connFornecedor = new ConectaBanco();
    ModeloProduto mod = new ModeloProduto();
    ControleProduto control = new ControleProduto();
    int flag;

    public FrmProduto() {
        conexao.conexao();
        initComponents();
        preencheCombo();
        jTable1 = preencherTabela(jTable1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCOd = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldQnt = new javax.swing.JTextField();
        jTextFieldCompra = new javax.swing.JTextField();
        jTextFieldVenda = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonNew = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jButtonPesquisa = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setText("Cód:");

        jLabel3.setText("Nome:");

        jLabel4.setText("Quantidade:");

        jLabel5.setText("Preço de Compra:");

        jLabel6.setText("Preço de Venda:");

        jLabel7.setText("Fornecedor:");

        jTextFieldCOd.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCOd.setEnabled(false);

        jTextFieldNome.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jTextFieldQnt.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jTextFieldCompra.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jTextFieldVenda.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextFieldPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisaActionPerformed(evt);
            }
        });

        jButtonNew.setText("Novo");
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });

        jButtonSave.setText("Salvar");
        jButtonSave.setEnabled(false);
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Excluir");
        jButtonDelete.setEnabled(false);
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonExit.setText("Sair");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jButtonPesquisa.setText("Pesquisar");
        jButtonPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaActionPerformed(evt);
            }
        });

        jButtonEdit.setText("Editar");
        jButtonEdit.setEnabled(false);
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable1FocusGained(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCOd, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldQnt, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldCOd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldQnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNew)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonEdit)
                    .addComponent(jButtonDelete)
                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisa)
                    .addComponent(jButtonExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Produtos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(227, 227, 227))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisaActionPerformed

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        flag = 1;
        habilita();
        clear();
        jButtonSave.setEnabled(true);
        jButtonNew.setEnabled(false);
    }//GEN-LAST:event_jButtonNewActionPerformed

    private void jTable1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusGained

    }//GEN-LAST:event_jTable1FocusGained

    private void jButtonPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaActionPerformed
        try {
            conexao.executaSQL("select * from produto inner join fornecedores "
                    + "on produto.id_fornecedor = fornecedores.id_fornecedor where nome_produto like '%" + jTextFieldPesquisa.getText() + "%' order by nome_produto");
            conexao.rs.first();
            jTextFieldCOd.setText(String.valueOf(conexao.rs.getInt("id_produto")));
            jTextFieldNome.setText(conexao.rs.getString("nome_produto"));
            jTextFieldCompra.setText(String.valueOf(conexao.rs.getFloat("preco_compra")));
            jTextFieldVenda.setText(String.valueOf(conexao.rs.getFloat("preco_venda")));
            jTextFieldQnt.setText(String.valueOf(conexao.rs.getInt("quantidade")));
            jComboBox1.setSelectedItem(conexao.rs.getString("nome_fornecedor"));
            jTable1 = preencherTabelaPesquisa(jTable1, jTextFieldPesquisa.getText());
            desabilita();
        } catch (SQLException ex) {
            Logger.getLogger(FrmProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonPesquisaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int linhaselecionada = jTable1.getSelectedRow();
        jTextFieldCOd.setText(String.valueOf(jTable1.getValueAt(linhaselecionada, 0)));
        jTextFieldNome.setText(String.valueOf(jTable1.getValueAt(linhaselecionada, 1)));
        jTextFieldCompra.setText(String.valueOf(jTable1.getValueAt(linhaselecionada, 2)));
        jTextFieldVenda.setText(String.valueOf(jTable1.getValueAt(linhaselecionada, 3)));
        jTextFieldQnt.setText(String.valueOf(jTable1.getValueAt(linhaselecionada, 4)));
        jComboBox1.setSelectedItem(jTable1.getValueAt(linhaselecionada, 5));
        desabilita();
        jButtonDelete.setEnabled(true);
        jButtonEdit.setEnabled(true);
        jButtonNew.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        mod.setId_produto(Integer.parseInt(jTextFieldCOd.getText()));
        control.excluirProduto(mod);
        jTable1 = preencherTabelaPesquisa(jTable1, jTextFieldPesquisa.getText());
        clear();
        jButtonDelete.setEnabled(false);
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        if (flag == 1) {
            try {
                conexao.executaSQL("select * from fornecedores where nome_fornecedor  = '" + (String) jComboBox1.getSelectedItem() + "'");
                conexao.rs.first();
                mod.setFornecedor(conexao.rs.getInt("id_fornecedor"));
                mod.setNome(jTextFieldNome.getText());
                mod.setPreco_compra(Float.parseFloat(jTextFieldCompra.getText()));
                mod.setPreco_venda(Float.parseFloat(jTextFieldVenda.getText()));
                mod.setQuantidade(Integer.parseInt(jTextFieldQnt.getText()));
                control.inserirProduto(mod);
                jTable1 = preencherTabela(jTable1);
                clear();
                jButtonSave.setEnabled(false);
            } catch (SQLException ex) {
                Logger.getLogger(FrmProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(flag == 2){
            try {
                conexao.executaSQL("select * from fornecedores where nome_fornecedor = '"+jComboBox1.getSelectedItem()+"'");
                conexao.rs.first();
                mod.setId_produto(Integer.parseInt(jTextFieldCOd.getText()));
                mod.setNome(jTextFieldNome.getText());
                mod.setPreco_compra(Float.parseFloat(jTextFieldCompra.getText()));
                mod.setPreco_venda(Float.parseFloat(jTextFieldVenda.getText()));
                mod.setQuantidade(Integer.parseInt(jTextFieldQnt.getText()));
                mod.setFornecedor(conexao.rs.getInt("id_fornecedor"));
                control.editarProduto(mod);
                clear();
                jButtonEdit.setEnabled(false);
                jButtonSave.setEnabled(false);
            } catch (SQLException ex) {
                Logger.getLogger(FrmProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        jButtonNew.setEnabled(true);
        jButtonPesquisa.setEnabled(true);
        jTextFieldPesquisa.setEnabled(true);
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        flag = 2;
        habilita();
        jTextFieldPesquisa.setEnabled(false);
        jButtonPesquisa.setEnabled(false);
        jButtonDelete.setEnabled(false);
        jButtonSave.setEnabled(true);
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void preencheCombo() {
        try {
            conexao.executaSQL("select * from fornecedores order by nome_fornecedor");
            conexao.rs.first();
            jComboBox1.removeAllItems();
            do {
                jComboBox1.addItem(conexao.rs.getString("nome_fornecedor"));
            } while (conexao.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher ComboBOx/n" + ex);
        }
    }

    private JTable preencherTabela(JTable Tabela) {
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"ID", "Produto", "Preço de Compra", "Preço de Venda", "Quantidade", "Fornecedor"};
        conexao.executaSQL("select * from produto inner join fornecedores on "
                + "produto.id_fornecedor = fornecedores.id_fornecedor order by nome_produto");
        try {
            conexao.rs.first();
            do {
                dados.add(new Object[]{conexao.rs.getInt("id_produto"), conexao.rs.getString("nome_produto"),
                    conexao.rs.getFloat("preco_compra"), conexao.rs.getFloat("preco_venda"),
                    conexao.rs.getInt("quantidade"), conexao.rs.getString("nome_fornecedor")});
            } while (conexao.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        Tabela.setModel(modelo);

        for (int i = 0; i < Colunas.length; i++) {
            Tabela.getColumnModel().getColumn(i).setPreferredWidth(150);
            Tabela.getColumnModel().getColumn(i).setResizable(false);
        }
        Tabela.getTableHeader().setReorderingAllowed(false);
        Tabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        Tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        return Tabela;
    }

    private JTable preencherTabelaPesquisa(JTable Tabela, String nome) {
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"ID", "Produto", "Preço de Compra", "Preço de Venda", "Quantidade", "Fornecedor"};
        conexao.executaSQL("select * from produto inner join fornecedores on "
                + "produto.id_fornecedor = fornecedores.id_fornecedor and nome_produto like '%" + nome + "%' order by nome_produto");
        try {
            conexao.rs.first();
            do {
                dados.add(new Object[]{conexao.rs.getInt("id_produto"), conexao.rs.getString("nome_produto"),
                    conexao.rs.getFloat("preco_compra"), conexao.rs.getFloat("preco_venda"),
                    conexao.rs.getInt("quantidade"), conexao.rs.getString("nome_fornecedor")});
            } while (conexao.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        Tabela.setModel(modelo);

        for (int i = 0; i < Colunas.length; i++) {
            Tabela.getColumnModel().getColumn(i).setPreferredWidth(150);
            Tabela.getColumnModel().getColumn(i).setResizable(false);
        }
        Tabela.getTableHeader().setReorderingAllowed(false);
        Tabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        Tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        return Tabela;
    }
    
    private void desabilita(){
        jTextFieldNome.setEnabled(false);
        jTextFieldCompra.setEnabled(false);
        jTextFieldQnt.setEnabled(false);
        jTextFieldVenda.setEnabled(false);
        jComboBox1.setEnabled(false);
    }
        
    private void habilita(){
        jTextFieldNome.setEnabled(true);
        jTextFieldCompra.setEnabled(true);
        jTextFieldQnt.setEnabled(true);
        jTextFieldVenda.setEnabled(true);
        jComboBox1.setEnabled(true);
    }
    
    private void clear() {
        jTextFieldCOd.setText("");
        jTextFieldCompra.setText("");
        jTextFieldNome.setText("");
        jTextFieldPesquisa.setText("");
        jTextFieldQnt.setText("");
        jTextFieldVenda.setText("");
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
            java.util.logging.Logger.getLogger(FrmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrmProduto().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonPesquisa;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCOd;
    private javax.swing.JTextField jTextFieldCompra;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jTextFieldQnt;
    private javax.swing.JTextField jTextFieldVenda;
    // End of variables declaration//GEN-END:variables
}