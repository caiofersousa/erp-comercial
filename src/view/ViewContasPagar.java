/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import controller.ControllerCliente;
import controller.ControllerConta;
import controller.ControllerTipoPagamento;
import java.sql.Date;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelCliente;
import model.ModelConta;
import model.ModelTipoPagamento;
import util.BLDatas;

/**
 *
 * @author Caio Fernando de Sousa
 */
public class ViewContasPagar extends javax.swing.JFrame {
    ModelConta modelConta = new ModelConta();
    ControllerCliente controllerCliente = new ControllerCliente();
    ArrayList<ModelConta> listamModelContaPagar = new ArrayList<>();
    ControllerConta controllerConta = new ControllerConta();
    ControllerTipoPagamento controllerTipoPagamento = new ControllerTipoPagamento();
    ArrayList<ModelTipoPagamento> listaModelTipoPagamentos = new ArrayList<>();
    ArrayList<ModelCliente> listaModelClientes = new ArrayList<>();
    String tipoCadastro;
    /**
     * Creates new form ViewContasPagar
     */
    public ViewContasPagar() {
        initComponents();
        setLocationRelativeTo(null);
        this.limparDados();
        this.habilitaDesabilitarCampos(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jtfPesquisa2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbPesquisar2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbContasPagar = new javax.swing.JTable();
        btCancelar = new javax.swing.JButton();
        jbExcluirPagar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        jbVisualizarPagar = new javax.swing.JButton();
        jbPagarConta = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btCancelar1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbContasPagas = new javax.swing.JTable();
        jtfPesquisa1 = new javax.swing.JTextField();
        jbPesquisar1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jbVisualizarPagar1 = new javax.swing.JButton();
        jpRevorgarConta = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jcbClientes = new componentes.UJComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelPagamento = new javax.swing.JLabel();
        jtfValor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfDescricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jcbTipoPagamento = new componentes.UJComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtfObservacao = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        btCancelar2 = new javax.swing.JButton();
        JbSAlvar = new javax.swing.JButton();
        jtfCodigoConta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        try{      javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##/##/##");      txtData = new javax.swing.JFormattedTextField(data);   }      catch (Exception e){   }
        txtDataVencimento = new javax.swing.JFormattedTextField();
        try{      javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##/##/##");      txtDataVencimento = new javax.swing.JFormattedTextField(data);   }      catch (Exception e){   }
        txtDataPagamento = new javax.swing.JFormattedTextField();
        try{      javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##/##/##");      txtDataVencimento = new javax.swing.JFormattedTextField(data);   }      catch (Exception e){   }

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Contas a pagar");

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfPesquisa2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(jtfPesquisa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, 370, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Descrição:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 8, -1, -1));

        jbPesquisar2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbPesquisar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Search.png"))); // NOI18N
        jbPesquisar2.setText("Pesquisar");
        jbPesquisar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisar2ActionPerformed(evt);
            }
        });
        jPanel3.add(jbPesquisar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        tbContasPagar.setAutoCreateRowSorter(true);
        tbContasPagar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Descrição", "Cliente", "Data", "Vencimento", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbContasPagar.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbContasPagar.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbContasPagar);
        tbContasPagar.getColumnModel().getColumn(0).setMinWidth(50);
        tbContasPagar.getColumnModel().getColumn(0).setMaxWidth(50);
        tbContasPagar.getColumnModel().getColumn(1).setMinWidth(200);
        tbContasPagar.getColumnModel().getColumn(2).setMinWidth(200);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 68, 676, 303));

        btCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/No.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(btCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 382, -1, -1));

        jbExcluirPagar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbExcluirPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Delete.png"))); // NOI18N
        jbExcluirPagar.setText("Excluir");
        jbExcluirPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirPagarActionPerformed(evt);
            }
        });
        jPanel3.add(jbExcluirPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 382, -1, -1));

        btAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Modify.png"))); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });
        jPanel3.add(btAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 382, -1, -1));

        btNovo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Add.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        jPanel3.add(btNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 382, 88, -1));

        jbVisualizarPagar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbVisualizarPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Report.png"))); // NOI18N
        jbVisualizarPagar.setText("Visualizar/Imprimir");
        jbVisualizarPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVisualizarPagarActionPerformed(evt);
            }
        });
        jPanel3.add(jbVisualizarPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));

        jbPagarConta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbPagarConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Apply.png"))); // NOI18N
        jbPagarConta.setText("Pagar conta");
        jbPagarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPagarContaActionPerformed(evt);
            }
        });
        jPanel3.add(jbPagarConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, -1, -1));

        jTabbedPane1.addTab("Contas a pagar", jPanel3);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/No.png"))); // NOI18N
        btCancelar1.setText("Cancelar");
        btCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelar1ActionPerformed(evt);
            }
        });
        jPanel2.add(btCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        tbContasPagas.setAutoCreateRowSorter(true);
        tbContasPagas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Descrição", "Cliente", "Data", "Vencimento", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbContasPagas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbContasPagas.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tbContasPagas);
        tbContasPagas.getColumnModel().getColumn(0).setMinWidth(50);
        tbContasPagas.getColumnModel().getColumn(0).setMaxWidth(50);
        tbContasPagas.getColumnModel().getColumn(1).setMinWidth(200);
        tbContasPagas.getColumnModel().getColumn(2).setMinWidth(200);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 73, 676, 298));
        jPanel2.add(jtfPesquisa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 38, 403, -1));

        jbPesquisar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Search.png"))); // NOI18N
        jbPesquisar1.setText("Pesquisar");
        jbPesquisar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisar1ActionPerformed(evt);
            }
        });
        jPanel2.add(jbPesquisar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 35, -1, -1));

        jLabel9.setText("Descrição:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jbVisualizarPagar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Report.png"))); // NOI18N
        jbVisualizarPagar1.setText("Visualizar/Imprimir");
        jbVisualizarPagar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVisualizarPagar1ActionPerformed(evt);
            }
        });
        jPanel2.add(jbVisualizarPagar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 35, -1, -1));

        jpRevorgarConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Erase.png"))); // NOI18N
        jpRevorgarConta.setText("Revogar pagamento");
        jpRevorgarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpRevorgarContaActionPerformed(evt);
            }
        });
        jPanel2.add(jpRevorgarConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, -1, -1));

        jTabbedPane1.addTab("Contas pagas", jPanel2);

        jPanel1.setLayout(null);
        jPanel1.add(jcbClientes);
        jcbClientes.setBounds(10, 33, 484, 20);

        jLabel2.setText("Cliente:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 13, 37, 14);

        jLabel6.setText("Data:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 140, 27, 14);

        jLabel7.setText("Vencimento:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(167, 137, 59, 14);

        labelPagamento.setText("Data Pagamento:");
        jPanel1.add(labelPagamento);
        labelPagamento.setBounds(321, 137, 84, 14);

        jtfValor.setBackground(new java.awt.Color(51, 255, 204));
        jPanel1.add(jtfValor);
        jtfValor.setBounds(473, 161, 131, 20);

        jLabel3.setText("Valor:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(473, 140, 28, 14);
        jPanel1.add(jtfDescricao);
        jtfDescricao.setBounds(10, 91, 676, 20);

        jLabel4.setText("Descrição da conta:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 71, 95, 14);

        jLabel8.setText("Tipo de pagamento:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 199, 96, 14);
        jPanel1.add(jcbTipoPagamento);
        jcbTipoPagamento.setBounds(10, 219, 288, 20);

        jScrollPane1.setViewportView(jtfObservacao);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 277, 676, 86);

        jLabel10.setText("Observação:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 257, 62, 14);

        btCancelar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/No.png"))); // NOI18N
        btCancelar2.setText("Cancelar");
        btCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelar2ActionPerformed(evt);
            }
        });
        jPanel1.add(btCancelar2);
        btCancelar2.setBounds(10, 382, 97, 27);

        JbSAlvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Save.png"))); // NOI18N
        JbSAlvar.setText("Salvar");
        JbSAlvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbSAlvarActionPerformed(evt);
            }
        });
        jPanel1.add(JbSAlvar);
        JbSAlvar.setBounds(601, 382, 85, 27);

        jtfCodigoConta.setEditable(false);
        jtfCodigoConta.setBackground(new java.awt.Color(204, 255, 204));
        jtfCodigoConta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jtfCodigoConta);
        jtfCodigoConta.setBounds(504, 33, 182, 20);

        jLabel5.setText("Código da conta:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(504, 13, 82, 14);
        jPanel1.add(txtData);
        txtData.setBounds(10, 160, 110, 20);
        jPanel1.add(txtDataVencimento);
        txtDataVencimento.setBounds(160, 160, 110, 20);
        jPanel1.add(txtDataPagamento);
        txtDataPagamento.setBounds(320, 160, 120, 20);

        jTabbedPane1.addTab("Cadastro", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // habilita ou desabilita campos
        this.limparDados();
        this.habilitaDesabilitarCampos(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void jbExcluirPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirPagarActionPerformed
        this.excluirConta();
    }//GEN-LAST:event_jbExcluirPagarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        try {
            int linha = tbContasPagar.getSelectedRow();
            int codigo = (int) tbContasPagar.getValueAt(linha, 0);
            this.limparDados();
            this.habilitaDesabilitarCampos(true);
            tipoCadastro = "alteracao";
            //seta o código para alteração
            recuperarConta(codigo);
            //avançar para aba 3
            jTabbedPane1.setSelectedIndex(jTabbedPane1.getSelectedIndex() + 2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Você selecionar uma conta para alterar!", "ATENÇÂO", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        // TODO add your handling code here:
        this.limparDados();
        this.habilitaDesabilitarCampos(true);
        tipoCadastro = "cadastro";
        this.jtfCodigoConta.setText("Nova Conta");
        //avançar para aba 3
        jTabbedPane1.setSelectedIndex(jTabbedPane1.getSelectedIndex() + 2);
    }//GEN-LAST:event_btNovoActionPerformed

    private void btCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelar1ActionPerformed
        // TODO add your handling code here:
        this.limparDados();
        this.habilitaDesabilitarCampos(false);
    }//GEN-LAST:event_btCancelar1ActionPerformed

    private void btCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelar2ActionPerformed
        // TODO add your handling code here:
        this.limparDados();
        this.habilitaDesabilitarCampos(false);
        jTabbedPane1.setSelectedIndex(jTabbedPane1.getSelectedIndex() - 2);
    }//GEN-LAST:event_btCancelar2ActionPerformed

    private void JbSAlvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbSAlvarActionPerformed
        if (jtfDescricao.getText().equals("") || jtfValor.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Você deve preencher todos os campos!", "ATENÇÂO", JOptionPane.WARNING_MESSAGE);
        }else{
            if(tipoCadastro.equals("cadastro")){
                this.salvar();
                jTabbedPane1.setSelectedIndex(jTabbedPane1.getSelectedIndex() - 2);
            }else{
                this.alterar();
                jTabbedPane1.setSelectedIndex(jTabbedPane1.getSelectedIndex() - 2);
            }
        }
    }//GEN-LAST:event_JbSAlvarActionPerformed

    private void jbPesquisar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisar2ActionPerformed
        DefaultTableModel tabela = (DefaultTableModel) this.tbContasPagar.getModel();
        final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tabela);
        this.tbContasPagar.setRowSorter(sorter);
        String text = jtfPesquisa2.getText();
        sorter.setRowFilter(RowFilter.regexFilter(text, 1));
    }//GEN-LAST:event_jbPesquisar2ActionPerformed

    private void jbPesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisar1ActionPerformed
        DefaultTableModel tabela = (DefaultTableModel) this.tbContasPagas.getModel();
        final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tabela);
        this.tbContasPagas.setRowSorter(sorter);
        String text = jtfPesquisa1.getText();
        sorter.setRowFilter(RowFilter.regexFilter(text, 1));
    }//GEN-LAST:event_jbPesquisar1ActionPerformed

    private void jbVisualizarPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVisualizarPagarActionPerformed
        int linha = tbContasPagar.getSelectedRow();
        int codigo = (int) tbContasPagar.getValueAt(linha, 0);
        controllerConta.gerarRelatorioContaPagar(codigo);
    }//GEN-LAST:event_jbVisualizarPagarActionPerformed

    private void jbVisualizarPagar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVisualizarPagar1ActionPerformed
        int linha = tbContasPagar.getSelectedRow();
        int codigo = (int) tbContasPagar.getValueAt(linha, 0);
        controllerConta.gerarRelatorioContaPagar(codigo);
    }//GEN-LAST:event_jbVisualizarPagar1ActionPerformed

    private void jbPagarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPagarContaActionPerformed
       modelConta = new ModelConta();
        try {
            int linha = tbContasPagar.getSelectedRow();
            int codigo = (int) tbContasPagar.getValueAt(linha, 0);
            BLDatas bl = new BLDatas();
            
            modelConta.setCodigo(codigo);
            modelConta.setSituacao(1);
            modelConta.setPagamento(bl.converterDataParaDateUS(new java.util.Date(System.currentTimeMillis())));
            //pegunta
            int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja"
                    + " pagar a conta nº:\n" + "\n " + codigo + "?", "Atenção", JOptionPane.YES_NO_OPTION);
            //se sim paga, se não não faz nada
            if (opcao == JOptionPane.OK_OPTION) {
                if (controllerConta.pagarContaPagarController(modelConta)) {
                    JOptionPane.showMessageDialog(this, "Conta Paga!");
                    this.carregarContasPagar();
                    this.carregarContasPagas();
                }
            }

            jTabbedPane1.setSelectedIndex(jTabbedPane1.getSelectedIndex() + 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Você deve selecionar uma conta!", "ATENÇÂO", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbPagarContaActionPerformed

    private void jpRevorgarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpRevorgarContaActionPerformed
       modelConta = new ModelConta();
        try {
            int linha = tbContasPagas.getSelectedRow();
            int codigo = (int) tbContasPagas.getValueAt(linha, 0);
            BLDatas bl = new BLDatas();
            
            modelConta.setCodigo(codigo);
            modelConta.setSituacao(0);
            modelConta.setPagamento(bl.converterDataParaDateUS(new java.util.Date(System.currentTimeMillis())));
            //pegunta
            int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja"
                    + " revogar o pagamento da conta nº:\n" + "\n " + codigo + "?", "Atenção", JOptionPane.YES_NO_OPTION);
            //se sim revoga, se não não faz nada
            if (opcao == JOptionPane.OK_OPTION) {
                if (controllerConta.receberContaReceberController(modelConta)) {
                    JOptionPane.showMessageDialog(this, "Conta revogada!");
                    this.carregarContasPagar();
                    this.carregarContasPagas();
                }
            }

            jTabbedPane1.setSelectedIndex(jTabbedPane1.getSelectedIndex() - 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Você deve selecionar uma conta!", "ATENÇÂO", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jpRevorgarContaActionPerformed
  
    /**
     * REcuperar dados do banco para alterar
     *
     * @param pCodigoConta
     * @return
     */
    private boolean recuperarConta(int pCodigoConta) {
        modelConta = new ModelConta();
        modelConta = controllerConta.getContaPagarController(pCodigoConta);
        this.jcbClientes.setSelectedItem(controllerCliente.getClienteController(modelConta.getCodigoPessoa()).getNome());
        this.jtfCodigoConta.setText(String.valueOf(pCodigoConta));
        this.jtfDescricao.setText(modelConta.getDescricao());
//        this.jdData.setDate(modelConta.getData());
//        this.jdPagamento.setDate(modelConta.getPagamento());
//        this.jdVencimento.setDate(modelConta.getVencimento());
        this.jtfValor.setText(String.valueOf(modelConta.getValor()));
        this.jcbTipoPagamento.setSelectedItem(controllerTipoPagamento.getTipoPagamentoController(modelConta.getTipoPagamento()).getDescricao());
        return true;
    }
    
    /**
     * Excluir dados do banco
     * @return 
     */
    private boolean excluirConta() {
        int linha = tbContasPagar.getSelectedRow();
        String nome = (String) tbContasPagar.getValueAt(linha, 1);
        int codigo = (int) tbContasPagar.getValueAt(linha, 0);

        //pegunta se realmente deseja excluir
        int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja"
                + " excluir o registro:\n" + "\n " + nome + "?", "Atenção", JOptionPane.YES_NO_OPTION);
        //se sim exclui, se não não faz nada
        if (opcao == JOptionPane.OK_OPTION) {
            if (controllerConta.excluirContaPagarController(codigo)) {
                JOptionPane.showMessageDialog(this, "Registro excluido com suscesso!");
                carregarContasPagar();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao e os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }
    
    /**
     * Salvar dados
     * @return 
     */
    private boolean salvar() {
        BLDatas bl = new BLDatas();
        modelConta.setTipoConta("PAGAR");
        modelConta.setCodigoPessoa(controllerCliente.getClienteController(this.jcbClientes.getSelectedItem().toString()).getCodigo());
        modelConta.setDescricao(this.jtfDescricao.getText());
        try {
            modelConta.setData(Date.valueOf(txtData.getText()));
            modelConta.setVencimento(Date.valueOf(txtDataVencimento.getText()));
            modelConta.setPagamento(Date.valueOf(txtDataPagamento.getText()));
        } catch (Exception ex) {
            Logger.getLogger(ViewVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        modelConta.setSituacao(0);
        modelConta.setValor(Float.parseFloat(this.jtfValor.getText()));
        modelConta.setTipoPagamento(controllerTipoPagamento.getTipoPagamentoController(this.jcbTipoPagamento.getSelectedItem().toString()).getCodigo());
        modelConta.setObservacao(this.jtfObservacao.getText());

        //salvar 
        if (controllerConta.salvarContaPagarController(modelConta)>0) {
            JOptionPane.showMessageDialog(this, "Registro gravado com sucesso!");
            this.limparDados();
            this.habilitaDesabilitarCampos(false);
            this.carregarContasPagar();
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao gravar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
   /**
     * Alterar dados
     * @return 
     */
    private boolean alterar() {
        BLDatas bl = new BLDatas();
        modelConta.setTipoConta("PAGAR");
        modelConta.setCodigoPessoa(controllerCliente.getClienteController(this.jcbClientes.getSelectedItem().toString()).getCodigo());
        modelConta.setDescricao(this.jtfDescricao.getText());
        modelConta.setCodigo(Integer.parseInt(this.jtfCodigoConta.getText()));
        try {
//            modelConta.setData(bl.converterDataParaDateUS(jdData.getDate()));
//            modelConta.setVencimento(bl.converterDataParaDateUS(jdVencimento.getDate()));
//            modelConta.setPagamento(bl.converterDataParaDateUS(jdPagamento.getDate()));
        } catch (Exception ex) {
            Logger.getLogger(ViewVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        modelConta.setSituacao(0);
        modelConta.setValor(Float.parseFloat(this.jtfValor.getText()));
        modelConta.setTipoPagamento(controllerTipoPagamento.getTipoPagamentoController(this.jcbTipoPagamento.getSelectedItem().toString()).getCodigo());
        modelConta.setObservacao(this.jtfObservacao.getText());

        //salvar 
        if (controllerConta.atualizarContaPagarController(modelConta)) {
            JOptionPane.showMessageDialog(this, "Registro alterado com sucesso!");
            this.limparDados();
            this.habilitaDesabilitarCampos(false);
            this.carregarContasPagar();
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
     private void carregarContasPagar() {
        listamModelContaPagar = controllerConta.getListaContaPagarController(0);
        DefaultTableModel modelo = (DefaultTableModel) tbContasPagar.getModel();
        modelo.setNumRows(0);
        String nomeCliente;
        //CARREGA OS DADOS DA LISTA NA TABELA
        int cont = listamModelContaPagar.size();
        for (int i = 0; i < cont; i++) {
            nomeCliente = controllerCliente.getClienteController(listamModelContaPagar.get(i).getCodigoPessoa()).getNome();
            modelo.addRow(new Object[]{
                listamModelContaPagar.get(i).getCodigo(),
                listamModelContaPagar.get(i).getDescricao(),
                nomeCliente,
                listamModelContaPagar.get(i).getData(),
                listamModelContaPagar.get(i).getVencimento(),
                listamModelContaPagar.get(i).getValor()
            });
        }
    }
    
     private void carregarContasPagas() {
        listamModelContaPagar = controllerConta.getListaContaPagarController(1);
        DefaultTableModel modelo = (DefaultTableModel) tbContasPagas.getModel();
        modelo.setNumRows(0);
        String nomeCliente;
        //CARREGA OS DADOS DA LISTA NA TABELA
        int cont = listamModelContaPagar.size();
        for (int i = 0; i < cont; i++) {
            nomeCliente = controllerCliente.getClienteController(listamModelContaPagar.get(i).getCodigoPessoa()).getNome();
            modelo.addRow(new Object[]{
                listamModelContaPagar.get(i).getCodigo(),
                listamModelContaPagar.get(i).getDescricao(),
                nomeCliente,
                listamModelContaPagar.get(i).getData(),
                listamModelContaPagar.get(i).getVencimento(),
                listamModelContaPagar.get(i).getValor()
            });
        }
    }
     
    private void listarClientes(){
        listaModelClientes = controllerCliente.getListaClienteController();
        jcbClientes.removeAllItems();
        for (int i = 0; i < listaModelClientes.size(); i++){
            jcbClientes.addItem(listaModelClientes.get(i).getNome());
        }
    }
    
    private void listarTipoPagamento(){
        listaModelTipoPagamentos = controllerTipoPagamento.getListaTipoPagamentoController();
        jcbTipoPagamento.removeAllItems();
        for (int i = 0; i < listaModelTipoPagamentos.size(); i++){
            jcbTipoPagamento.addItem(listaModelTipoPagamentos.get(i).getDescricao());
        }
    }
    
    
    private void limparDados(){
        listarClientes();
        listarTipoPagamento();
        carregarContasPagar();
        carregarContasPagas();
        this.jtfDescricao.setText("");
        this.jtfObservacao.setText("");
        this.jtfValor.setText("");
//        this.jdData.setDate(null);
//        this.jdPagamento.setDate(null);
//        this.jdVencimento.setDate(null);
       
    }
    
    /**
     * Habilitar ou desabilitar campos do formulário
     * @param operaco 
     */
    private void habilitaDesabilitarCampos(boolean operaco){
        this.jtfDescricao.setEnabled(operaco);
        this.jtfObservacao.setEnabled(operaco);
        this.jtfValor.setEnabled(operaco);
        this.jcbTipoPagamento.setEnabled(operaco);
//        this.jdData.setEnabled(operaco);
//        this.jdPagamento.setEnabled(operaco);
//        this.jdVencimento.setEnabled(operaco);
        this.jcbClientes.setEnabled(operaco);
        this.JbSAlvar.setEnabled(operaco);
    
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
            java.util.logging.Logger.getLogger(ViewContasPagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewContasPagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewContasPagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewContasPagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewContasPagar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbSAlvar;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btCancelar1;
    private javax.swing.JButton btCancelar2;
    private javax.swing.JButton btNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbExcluirPagar;
    private javax.swing.JButton jbPagarConta;
    private javax.swing.JButton jbPesquisar1;
    private javax.swing.JButton jbPesquisar2;
    private javax.swing.JButton jbVisualizarPagar;
    private javax.swing.JButton jbVisualizarPagar1;
    private componentes.UJComboBox jcbClientes;
    private componentes.UJComboBox jcbTipoPagamento;
    private javax.swing.JButton jpRevorgarConta;
    private javax.swing.JTextField jtfCodigoConta;
    private javax.swing.JTextField jtfDescricao;
    private javax.swing.JTextPane jtfObservacao;
    private javax.swing.JTextField jtfPesquisa1;
    private javax.swing.JTextField jtfPesquisa2;
    private javax.swing.JTextField jtfValor;
    private javax.swing.JLabel labelPagamento;
    private javax.swing.JTable tbContasPagar;
    private javax.swing.JTable tbContasPagas;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JFormattedTextField txtDataPagamento;
    private javax.swing.JFormattedTextField txtDataVencimento;
    // End of variables declaration//GEN-END:variables
}
