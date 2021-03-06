/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafico;

import Controle.ConectaBanco;
import Controle.ControleForncecedor;
import Modelo.ModeloFornecedor;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cogeti
 */
public class FrmFornecedor extends javax.swing.JFrame {

    ConectaBanco connFornecedor = new ConectaBanco();
    ConectaBanco connBairro = new ConectaBanco();
    ControleForncecedor control = new ControleForncecedor();
    ModeloFornecedor mod = new ModeloFornecedor();

    /**
     * Creates new form FrmFornecedores
     */
    public FrmFornecedor() {
        connBairro.conexao();
        connFornecedor.conexao();
        initComponents();
        try {
            jComboBoxBairro.removeAllItems();
            jComboBoxCidade.removeAllItems();
            jComboBoxEstado = control.preencheComboEstado(jComboBoxEstado);
        } catch (SQLException ex) {
            Logger.getLogger(FrmFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTable1 = control.preencherTabela(jTable1);

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldCNPJ = new javax.swing.JTextField();
        jComboBoxBairro = new javax.swing.JComboBox<>();
        jComboBoxCidade = new javax.swing.JComboBox<>();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jButtonNew = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonPrimeiro = new javax.swing.JButton();
        jButtonUltimo = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jButtonProximo = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Fornecedores");

        jLabel2.setText("Nome:");

        jLabel3.setText("Endereço:");

        jLabel4.setText("ID:");

        jLabel5.setText("CNPJ:");

        jLabel6.setText("Bairro:");

        jLabel7.setText("Cidade:");

        jLabel8.setText("Estado:");

        jTextFieldCod.setEnabled(false);

        jComboBoxBairro.setEnabled(false);

        jComboBoxCidade.setEnabled(false);
        jComboBoxCidade.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxCidadePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxEstado.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxEstadoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jButtonNew.setText("Novo");
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonPrimeiro.setText("<<");
        jButtonPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimeiroActionPerformed(evt);
            }
        });

        jButtonUltimo.setText(">>");
        jButtonUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUltimoActionPerformed(evt);
            }
        });

        jButtonAnterior.setText("<");
        jButtonAnterior.setEnabled(false);
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });

        jButtonProximo.setText(">");
        jButtonProximo.setEnabled(false);
        jButtonProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximoActionPerformed(evt);
            }
        });

        jButtonExit.setText("Sair");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldCNPJ)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jButtonNew)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonSalvar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonEditar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonExcluir)
                                        .addGap(42, 42, 42)
                                        .addComponent(jButtonPrimeiro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonUltimo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonAnterior)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(6, 6, 6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonProximo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonExit)
                                        .addGap(8, 8, 8))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel1)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNew)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonPrimeiro)
                    .addComponent(jButtonUltimo)
                    .addComponent(jButtonProximo)
                    .addComponent(jButtonAnterior)
                    .addComponent(jButtonExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jComboBoxEstadoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxEstadoPopupMenuWillBecomeInvisible
        if (jComboBoxEstado.getSelectedIndex() != 0) {
            try {
                jComboBoxCidade = control.preencheComboCidade(jComboBoxCidade, (String) jComboBoxEstado.getSelectedItem());
            } catch (SQLException ex) {
                Logger.getLogger(FrmFornecedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            jComboBoxCidade.removeAllItems();
            jComboBoxBairro.removeAllItems();
            jComboBoxCidade.setEnabled(false);
            jComboBoxBairro.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBoxEstadoPopupMenuWillBecomeInvisible

    private void jComboBoxCidadePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxCidadePopupMenuWillBecomeInvisible
        if (jComboBoxCidade.getSelectedIndex() != 0) {
            try {
                jComboBoxBairro = control.preencheComboBairro(jComboBoxBairro, (String) jComboBoxCidade.getSelectedItem());
            } catch (SQLException ex) {
                Logger.getLogger(FrmFornecedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            jComboBoxBairro.removeAllItems();
            jComboBoxBairro.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBoxCidadePopupMenuWillBecomeInvisible

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        try {
            connFornecedor.executaSQL("select * from bairro where nome_bairro = '" + jComboBoxBairro.getSelectedItem() + "'");
            connFornecedor.rs.first();
            mod.setNome(jTextFieldNome.getText());
            mod.setEndereco(jTextFieldEndereco.getText());
            mod.setCnpj(jTextFieldCNPJ.getText());
            mod.setBairro(connFornecedor.rs.getInt("id_bairro"));
            control.novo(mod);
            clear();
            jTable1 = control.preencherTabela(jTable1);

        } catch (SQLException ex) {
            Logger.getLogger(FrmFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonNewActionPerformed

    private void jButtonPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeiroActionPerformed
        try {
            connFornecedor.executaSQL("select * from fornecedores order by id_fornecedor");
            connFornecedor.rs.first();
            connBairro.executaSQL("select * from bairro "
                    + "inner join cidade on bairro.id_cidade = cidade.id_cidade "
                    + "inner join estados on cidade.id_estado = estados.id_estado "
                    + "where id_bairro = " + connFornecedor.rs.getInt("id_bairro"));
            connBairro.rs.first();
            jTextFieldCod.setText(String.valueOf(connFornecedor.rs.getInt("id_fornecedor")));
            jTextFieldNome.setText(connFornecedor.rs.getString("nome_fornecedor"));
            jTextFieldEndereco.setText(connFornecedor.rs.getString("endereco"));
            jTextFieldCNPJ.setText(connFornecedor.rs.getString("cnpj"));
            jComboBoxEstado.setSelectedItem(connBairro.rs.getString("sigla_estado"));
            jComboBoxCidade = control.preencheComboCidade(jComboBoxCidade, (String) jComboBoxEstado.getSelectedItem());
            jComboBoxCidade.setSelectedItem(connBairro.rs.getString("nome_cidade"));
            jComboBoxBairro = control.preencheComboBairro(jComboBoxBairro, (String) jComboBoxCidade.getSelectedItem());
            jComboBoxBairro.setSelectedItem(connBairro.rs.getString("nome_bairro"));
            desabilitar();
            escolha();
            jButtonAnterior.setEnabled(false);
            if (connFornecedor.rs.next()) {
                connFornecedor.rs.previous();
                jButtonProximo.setEnabled(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FrmFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonPrimeiroActionPerformed

    private void jButtonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimoActionPerformed
        try {
            connFornecedor.executaSQL("select * from fornecedores order by id_fornecedor");
            connFornecedor.rs.last();
            connBairro.executaSQL("select * from bairro "
                    + "inner join cidade on bairro.id_cidade = cidade.id_cidade "
                    + "inner join estados on cidade.id_estado = estados.id_estado "
                    + "where id_bairro = " + connFornecedor.rs.getInt("id_bairro"));
            connBairro.rs.first();
            jTextFieldCod.setText(String.valueOf(connFornecedor.rs.getInt("id_fornecedor")));
            jTextFieldNome.setText(connFornecedor.rs.getString("nome_fornecedor"));
            jTextFieldEndereco.setText(connFornecedor.rs.getString("endereco"));
            jTextFieldCNPJ.setText(connFornecedor.rs.getString("cnpj"));
            jComboBoxEstado.setSelectedItem(connBairro.rs.getString("sigla_estado"));
            jComboBoxCidade = control.preencheComboCidade(jComboBoxCidade, (String) jComboBoxEstado.getSelectedItem());
            jComboBoxCidade.setSelectedItem(connBairro.rs.getString("nome_cidade"));
            jComboBoxBairro = control.preencheComboBairro(jComboBoxBairro, (String) jComboBoxCidade.getSelectedItem());
            jComboBoxBairro.setSelectedItem(connBairro.rs.getString("nome_bairro"));
            desabilitar();
            escolha();
            jButtonProximo.setEnabled(false);
            if (connFornecedor.rs.previous()) {
                connFornecedor.rs.next();
                jButtonAnterior.setEnabled(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FrmFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonUltimoActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        try {
            if (connFornecedor.rs.previous()) {
                connBairro.executaSQL("select * from bairro "
                        + "inner join cidade on bairro.id_cidade = cidade.id_cidade "
                        + "inner join estados on cidade.id_estado = estados.id_estado "
                        + "where id_bairro = " + connFornecedor.rs.getInt("id_bairro"));
                connBairro.rs.first();
                jTextFieldCod.setText(String.valueOf(connFornecedor.rs.getInt("id_fornecedor")));
                jTextFieldNome.setText(connFornecedor.rs.getString("nome_fornecedor"));
                jTextFieldEndereco.setText(connFornecedor.rs.getString("endereco"));
                jTextFieldCNPJ.setText(connFornecedor.rs.getString("cnpj"));
                jComboBoxEstado.setSelectedItem(connBairro.rs.getString("sigla_estado"));
                jComboBoxCidade = control.preencheComboCidade(jComboBoxCidade, (String) jComboBoxEstado.getSelectedItem());
                jComboBoxCidade.setSelectedItem(connBairro.rs.getString("nome_cidade"));
                jComboBoxBairro = control.preencheComboBairro(jComboBoxBairro, (String) jComboBoxCidade.getSelectedItem());
                jComboBoxBairro.setSelectedItem(connBairro.rs.getString("nome_bairro"));
                jButtonProximo.setEnabled(true);
            }else{
                jButtonAnterior.setEnabled(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FrmFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoActionPerformed
        try {
            if (connFornecedor.rs.next()) {
                connBairro.executaSQL("select * from bairro "
                        + "inner join cidade on bairro.id_cidade = cidade.id_cidade "
                        + "inner join estados on cidade.id_estado = estados.id_estado "
                        + "where id_bairro = " + connFornecedor.rs.getInt("id_bairro"));
                connBairro.rs.first();
                jTextFieldCod.setText(String.valueOf(connFornecedor.rs.getInt("id_fornecedor")));
                jTextFieldNome.setText(connFornecedor.rs.getString("nome_fornecedor"));
                jTextFieldEndereco.setText(connFornecedor.rs.getString("endereco"));
                jTextFieldCNPJ.setText(connFornecedor.rs.getString("cnpj"));
                jComboBoxEstado.setSelectedItem(connBairro.rs.getString("sigla_estado"));
                jComboBoxCidade = control.preencheComboCidade(jComboBoxCidade, (String) jComboBoxEstado.getSelectedItem());
                jComboBoxCidade.setSelectedItem(connBairro.rs.getString("nome_cidade"));
                jComboBoxBairro = control.preencheComboBairro(jComboBoxBairro, (String) jComboBoxCidade.getSelectedItem());
                jComboBoxBairro.setSelectedItem(connBairro.rs.getString("nome_bairro"));
                jButtonAnterior.setEnabled(true);
            }else{
                jButtonProximo.setEnabled(false);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FrmFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonProximoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
            connBairro.executaSQL("select * from bairro where nome_bairro = '"+jComboBoxBairro.getSelectedItem()+"'");
            connBairro.rs.first();
            mod.setId(Integer.parseInt(jTextFieldCod.getText()));
            mod.setNome(jTextFieldNome.getText());
            mod.setEndereco(jTextFieldEndereco.getText());
            mod.setCnpj(jTextFieldCNPJ.getText());
            mod.setBairro(connBairro.rs.getInt("id_bairro"));
            control.editar(mod);
            inicial();
            clear();
            jTable1 = control.preencherTabela(jTable1);
        } catch (SQLException ex) {
            Logger.getLogger(FrmFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        mod.setId(Integer.parseInt(jTextFieldCod.getText()));
        control.excluir(mod);
        inicial();
        clear();
        jTable1 = control.preencherTabela(jTable1);
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        edicao();
        
    }//GEN-LAST:event_jButtonEditarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmFornecedor().setVisible(true);
            }
        });
    }

    private void clear() {
        jTextFieldCod.setText("");
        jTextFieldNome.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldCNPJ.setText("");
        jComboBoxBairro.removeAllItems();
        jComboBoxCidade.removeAllItems();
    }

    private void desabilitar() {
        jTextFieldNome.setEnabled(false);
        jTextFieldEndereco.setEnabled(false);
        jTextFieldCNPJ.setEnabled(false);
        jComboBoxEstado.setEnabled(false);
        jComboBoxCidade.setEnabled(false);
        jComboBoxBairro.setEnabled(false);
    }

    private void habilitar() {
        jTextFieldNome.setEnabled(true);
        jTextFieldEndereco.setEnabled(true);
        jTextFieldCNPJ.setEnabled(true);
        jComboBoxEstado.setEnabled(true);
        jComboBoxCidade.setEnabled(true);
        jComboBoxBairro.setEnabled(true);
    }
    public void edicao(){
        habilitar();
        jButtonPrimeiro.setEnabled(false);
        jButtonUltimo.setEnabled(false);
        jButtonProximo.setEnabled(false);
        jButtonAnterior.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonNew.setEnabled(false);
    }
    
    public void escolha(){
        jButtonNew.setEnabled(false);
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
    }
    public void inicial(){
        jButtonNew.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonPrimeiro.setEnabled(true);
        jButtonUltimo.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonPrimeiro;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonUltimo;
    private javax.swing.JComboBox<String> jComboBoxBairro;
    private javax.swing.JComboBox<String> jComboBoxCidade;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCNPJ;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
