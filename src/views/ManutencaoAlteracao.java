/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package views;

import Dao.AlteracaoDao;
import Dao.ClienteDao;
import Dao.UsuarioDao;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import model.Alteracao;

/**
 *
 * @author leonardo
 */
public class ManutencaoAlteracao extends javax.swing.JFrame {

    DefaultTableModel tmAlteracoes = new DefaultTableModel(null, new String []{"Código", "Tipo", "Horas Previstas", "Cliente", "Urgência", "Descrição", "Observação", "Data Entrega", "Etapa", "Responsável", "Horas Produção", "Horas Teste"});
    List<Alteracao> alteracoes;
    ListSelectionModel lsmAlteracao;
    
    private final String tipo_usuario;
    private final int cod_usuario;
    /**
     * Creates new form ManutencaoAlteracao
     * @param tipo_usuario
     * @param cod_usuario
     */
    public ManutencaoAlteracao(String tipo_usuario, int cod_usuario) {
        initComponents();
        this.tipo_usuario = tipo_usuario;
        this.cod_usuario = cod_usuario;
        
        edtCodigoAlteracao.setEditable(false);
        edtCliente.setEditable(false);
        edtDataEntrega.setEditable(false);
        edtUrgencia.setEditable(false);
        edtEtapa.setEditable(false);
        edtResponsavel.setEditable(false);
        cmbHorasProducao.setEnabled(false);
        cmbHorasTeste.setEnabled(false);
        txtObservacao.setEditable(false);
        btnIniciarAlteracao.setEnabled(false);
        btnConcluirAlteracao.setEnabled(false);
        btnDevolver.setEnabled(false);
        btnConcluirProducao.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        edtPesquisa = new javax.swing.JTextField();
        btnPesquisa = new javax.swing.JButton();
        panDadosAlteracoes = new javax.swing.JPanel();
        lblCodigoAlteracao = new javax.swing.JLabel();
        edtCodigoAlteracao = new javax.swing.JTextField();
        lblCliente = new javax.swing.JLabel();
        edtCliente = new javax.swing.JTextField();
        lblDtEntrega = new javax.swing.JLabel();
        edtDataEntrega = new javax.swing.JTextField();
        lblUrgencia = new javax.swing.JLabel();
        edtUrgencia = new javax.swing.JTextField();
        lblEtapa = new javax.swing.JLabel();
        edtEtapa = new javax.swing.JTextField();
        lblResponsavel = new javax.swing.JLabel();
        edtResponsavel = new javax.swing.JTextField();
        lblHorasProducao = new javax.swing.JLabel();
        cmbHorasProducao = new javax.swing.JComboBox();
        lblHorasTeste = new javax.swing.JLabel();
        cmbHorasTeste = new javax.swing.JComboBox();
        lblObservacao = new javax.swing.JLabel();
        scrObservacao = new javax.swing.JScrollPane();
        txtObservacao = new javax.swing.JTextPane();
        btnIniciarAlteracao = new javax.swing.JButton();
        btnConcluirAlteracao = new javax.swing.JButton();
        btnDevolver = new javax.swing.JButton();
        btnConcluirProducao = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        scrTabel = new javax.swing.JScrollPane();
        tblDados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manutenção de Alteração");
        setName("frmManutencaoAlteracao"); // NOI18N
        setResizable(false);

        edtPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        btnPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnPesquisa.setText("Pesquisar");
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        lblCodigoAlteracao.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblCodigoAlteracao.setText("Código Alteração: *");

        edtCodigoAlteracao.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblCliente.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblCliente.setText("Cliente: *");

        edtCliente.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblDtEntrega.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblDtEntrega.setText("Data de Entrega: *");

        edtDataEntrega.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblUrgencia.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblUrgencia.setText("Urgência: *");

        edtUrgencia.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblEtapa.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblEtapa.setText("Etapa Atual: *");

        edtEtapa.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblResponsavel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblResponsavel.setText("Responsável pela Etapa: *");

        edtResponsavel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblHorasProducao.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblHorasProducao.setText("Horas Gastas Produção: *");

        cmbHorasProducao.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cmbHorasProducao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40" }));

        lblHorasTeste.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblHorasTeste.setText("Horas Gastas Teste: *");

        cmbHorasTeste.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cmbHorasTeste.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40" }));

        lblObservacao.setText("Observações:");

        scrObservacao.setViewportView(txtObservacao);

        btnIniciarAlteracao.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnIniciarAlteracao.setText("Iniciar Alteração");
        btnIniciarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarAlteracaoActionPerformed(evt);
            }
        });

        btnConcluirAlteracao.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnConcluirAlteracao.setText("Concluir Alteração");
        btnConcluirAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirAlteracaoActionPerformed(evt);
            }
        });

        btnDevolver.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnDevolver.setText("Devolver Para Desenvolvedor");
        btnDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolverActionPerformed(evt);
            }
        });

        btnConcluirProducao.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnConcluirProducao.setText("Concluir Etapa de Produção");
        btnConcluirProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirProducaoActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panDadosAlteracoesLayout = new javax.swing.GroupLayout(panDadosAlteracoes);
        panDadosAlteracoes.setLayout(panDadosAlteracoesLayout);
        panDadosAlteracoesLayout.setHorizontalGroup(
            panDadosAlteracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDadosAlteracoesLayout.createSequentialGroup()
                .addGroup(panDadosAlteracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panDadosAlteracoesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panDadosAlteracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panDadosAlteracoesLayout.createSequentialGroup()
                                .addGroup(panDadosAlteracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblUrgencia)
                                    .addComponent(lblCodigoAlteracao)
                                    .addComponent(lblDtEntrega)
                                    .addComponent(lblCliente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panDadosAlteracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(edtCodigoAlteracao, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(edtCliente)
                                    .addComponent(edtDataEntrega)
                                    .addComponent(edtUrgencia))
                                .addGap(164, 164, 164)
                                .addGroup(panDadosAlteracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEtapa)
                                    .addComponent(lblResponsavel)
                                    .addComponent(lblHorasProducao)
                                    .addComponent(lblHorasTeste)))
                            .addGroup(panDadosAlteracoesLayout.createSequentialGroup()
                                .addComponent(lblObservacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrObservacao))))
                    .addGroup(panDadosAlteracoesLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnDevolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                        .addComponent(btnConcluirProducao)))
                .addGroup(panDadosAlteracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDadosAlteracoesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panDadosAlteracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edtEtapa)
                            .addComponent(edtResponsavel)
                            .addComponent(cmbHorasProducao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbHorasTeste, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIniciarAlteracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnConcluirAlteracao, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDadosAlteracoesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        panDadosAlteracoesLayout.setVerticalGroup(
            panDadosAlteracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDadosAlteracoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panDadosAlteracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoAlteracao)
                    .addComponent(edtCodigoAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEtapa)
                    .addComponent(edtEtapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panDadosAlteracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCliente)
                    .addComponent(lblResponsavel)
                    .addComponent(edtResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panDadosAlteracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDtEntrega)
                    .addComponent(edtDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHorasProducao)
                    .addComponent(cmbHorasProducao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panDadosAlteracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUrgencia)
                    .addComponent(edtUrgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHorasTeste)
                    .addComponent(cmbHorasTeste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panDadosAlteracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblObservacao)
                    .addGroup(panDadosAlteracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panDadosAlteracoesLayout.createSequentialGroup()
                            .addComponent(btnIniciarAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(btnConcluirAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(scrObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panDadosAlteracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConcluirProducao)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDevolver))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        scrTabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        tblDados.setModel(tmAlteracoes);
        tblDados.setSelectionMode(ListSelectionM­odel.SINGLE_SELECTION);
        lsmAlteracao = tblDados.getSelectionModel();
        lsmAlteracao.addListSelectionListener(new ListSelectionListener() { public void valueChanged(ListSelectionEvent e) { if (! e.getValueIsAdjusting()){ linhaSelecionada(tblDados); } }
        });
        scrTabel.setViewportView(tblDados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrTabel)
                    .addComponent(panDadosAlteracoes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(edtPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisa)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panDadosAlteracoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrTabel, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        int resp = JOptionPane.showConfirmDialog(this, "Deseja Realmente Sair?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if(resp == JOptionPane.YES_NO_OPTION){
            dispose();
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        try {
            if (tipo_usuario.equals("Desenvolvedor")) {
                listarContatos("Para Fazer");                
            } else if (tipo_usuario.equals("Consultor")) {
                listarContatos("Análise/Teste");
            } else {
                listarContatos("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastroAlteracao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void btnIniciarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarAlteracaoActionPerformed
        cmbHorasProducao.setEnabled(true);
        try {
            alteraEtapa("Desenvolvimento", Integer.parseInt(edtCodigoAlteracao.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(ManutencaoAlteracao.class.getName()).log(Level.SEVERE, null, ex);
        }
        edtEtapa.setText("Desenvolvimento");
        btnConcluirAlteracao.setEnabled(true);
        btnIniciarAlteracao.setEnabled(false);
        btnSair.setEnabled(false);
    }//GEN-LAST:event_btnIniciarAlteracaoActionPerformed

    private void btnConcluirAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirAlteracaoActionPerformed
        try {
            concluirAlteracao("Análise/Teste", Integer.parseInt(cmbHorasProducao.getSelectedItem().toString()), Integer.parseInt(edtCodigoAlteracao.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(ManutencaoAlteracao.class.getName()).log(Level.SEVERE, null, ex);
        }
        cmbHorasProducao.setEnabled(false);
        btnConcluirAlteracao.setEnabled(false);
        btnSair.setEnabled(true);
        limpar();
    }//GEN-LAST:event_btnConcluirAlteracaoActionPerformed

    private void btnDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverActionPerformed
        try {
            alterarEtapaConsultoria("Para Fazer", Integer.parseInt(cmbHorasTeste.getSelectedItem().toString()));
            JOptionPane.showMessageDialog(null, "Devolvido Para o Desenvolvedor!");
            limpar();
            cmbHorasTeste.setEnabled(false);
            listarContatos("Análise/Teste");
        } catch (SQLException ex) {
            Logger.getLogger(ManutencaoAlteracao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDevolverActionPerformed

    private void btnConcluirProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirProducaoActionPerformed
        try {
            alterarEtapaConsultoria("Concluida", Integer.parseInt(cmbHorasTeste.getSelectedItem().toString()));
            JOptionPane.showMessageDialog(null, "Alteração Concluída com Sucesso!");
            limpar();
            cmbHorasTeste.setEnabled(false);
            listarContatos("Análise/Teste");
        } catch (SQLException ex) {
            Logger.getLogger(ManutencaoAlteracao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnConcluirProducaoActionPerformed

    /**
     * @param etapa
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ManutencaoAlteracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ManutencaoAlteracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ManutencaoAlteracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ManutencaoAlteracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ManutencaoAlteracao().setVisible(true);
//            }
//        });
//    }

    protected void listarContatos(String etapa) throws SQLException {
        if (tipo_usuario.equals("Desenvolvedor")) {
            AlteracaoDao dao = new AlteracaoDao();
            alteracoes = dao.getListaMan("%" + edtPesquisa.getText() + "%", cod_usuario, etapa);
            mostraPesquisa(alteracoes);   
        } else if (tipo_usuario.equals("Consultor")) {
            AlteracaoDao dao = new AlteracaoDao();
            alteracoes = dao.getListaManConsultor("%" + edtPesquisa.getText() + "%", etapa);
            mostraPesquisa(alteracoes); 
        } else {
            AlteracaoDao dao = new AlteracaoDao();
            alteracoes = dao.getLista("%" + edtPesquisa.getText() + "%");
            mostraPesquisa(alteracoes);
        }
    }
    
    private void mostraPesquisa(List<Alteracao> alteracoes) {
        while(tmAlteracoes.getRowCount() > 0){
            tmAlteracoes.removeRow(0);
        }
        if(alteracoes.size() == 0){
            JOptionPane.showMessageDialog(null, "Nenhuma Alteração Disponível Para Você!");
        }else{
            String[] linha = new String [] {null, null, null, null};
            for (int i = 0; i < alteracoes.size(); i++) {
                tmAlteracoes.addRow(linha);
                tmAlteracoes.setValueAt(alteracoes.get(i).getCod_alteracao(), i, 0);
                tmAlteracoes.setValueAt(alteracoes.get(i).getTipo_alteracao(), i, 1);
                tmAlteracoes.setValueAt(alteracoes.get(i).getHr_previstas(), i, 2);
                tmAlteracoes.setValueAt(alteracoes.get(i).getFk_cliente(), i, 3);
                tmAlteracoes.setValueAt(alteracoes.get(i).getPrioridade(), i, 4);
                tmAlteracoes.setValueAt(alteracoes.get(i).getDescricao(), i, 5);
                tmAlteracoes.setValueAt(alteracoes.get(i).getObservacao(), i, 6);
                tmAlteracoes.setValueAt(alteracoes.get(i).getDt_entrega(), i, 7);
                tmAlteracoes.setValueAt(alteracoes.get(i).getEtapa(), i, 8);
                tmAlteracoes.setValueAt(alteracoes.get(i).getFk_usuario(), i, 9);
                tmAlteracoes.setValueAt(alteracoes.get(i).getHr_producao(), i, 10);
                tmAlteracoes.setValueAt(alteracoes.get(i).getHr_teste(), i, 11);
            }
        }
    }
    
    private void linhaSelecionada(JTable tabela){
        if (!btnConcluirAlteracao.isEnabled()) {
            if (tblDados.getSelectedRow() != -1) {
                if (tipo_usuario.equals("Desenvolvedor")) {
                    btnIniciarAlteracao.setEnabled(true);
                } else if (tipo_usuario.equals("Consultor")) {
                    btnDevolver.setEnabled(true);
                    btnConcluirProducao.setEnabled(true);
                    cmbHorasTeste.setEnabled(true);
                } else {
                    
                }
            
                edtCodigoAlteracao.setText(String.valueOf(alteracoes.get(tabela.getSelectedRow()).getCod_alteracao()));
                edtDataEntrega.setText(alteracoes.get(tabela.getSelectedRow()).getDt_entrega());
                edtUrgencia.setText(alteracoes.get(tabela.getSelectedRow()).getPrioridade());
                edtEtapa.setText(alteracoes.get(tabela.getSelectedRow()).getEtapa());
                cmbHorasProducao.setSelectedItem(alteracoes.get(tabela.getSelectedRow()).getHr_producao());
                cmbHorasTeste.setSelectedItem(alteracoes.get(tabela.getSelectedRow()).getHr_teste());
                txtObservacao.setText(alteracoes.get(tabela.getSelectedRow()).getObservacao());
            
                String nome = null;
                try {
                    if (tipo_usuario.equals("Desenvolvedor")) {
                        nome = BuscaNomeUsuario(alteracoes.get(tabela.getSelectedRow()).getFk_usuario());
                    } else if (tipo_usuario.equals("Consultor")) {
                        nome = BuscaNomeUsuario(cod_usuario);
                    } else {
                        if (alteracoes.get(tabela.getSelectedRow()).getEtapa().equals("Análise/Teste")) {
                            nome = "Simas";
                        } else {
                            nome = BuscaNomeUsuario(alteracoes.get(tabela.getSelectedRow()).getFk_usuario());
                        }
                    }
                    edtResponsavel.setText(nome);
                } catch (SQLException ex) {
                    Logger.getLogger(CadastroAlteracao.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                String nomeCliente;
                try {
                    nomeCliente = BuscaNomeCliente(alteracoes.get(tabela.getSelectedRow()).getFk_cliente());
                    edtCliente.setText(nomeCliente);
                } catch (SQLException ex) {
                    Logger.getLogger(CadastroAlteracao.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }else{
                edtCodigoAlteracao.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Conclua a Alteração Atual!");
        }
    }
    
    public String BuscaNomeUsuario(int cod_usuario) throws SQLException {
        UsuarioDao dao = new UsuarioDao();
        String nome = dao.BuscaNomeUsuario(cod_usuario);
        return nome;
    }   
    
    public String BuscaNomeCliente(int cod_cliente) throws SQLException {
        ClienteDao dao = new ClienteDao();
        String nome = dao.BuscaNomeCliente(cod_cliente);
        return nome;
    }
    
    private void alteraEtapa(String etapa, int cod_alteracao) throws SQLException {
        AlteracaoDao dao = new AlteracaoDao();
        dao.alteraEtapa(etapa, cod_alteracao);
    }
    
    private void concluirAlteracao(String etapa, int hr_producao, int cod_alteracao) throws SQLException {
        AlteracaoDao dao = new AlteracaoDao();
        dao.concluirAlteracao(etapa, hr_producao, cod_alteracao);
    }
    
    private void alterarEtapaConsultoria(String etapa, int hr_teste) throws SQLException {
        AlteracaoDao dao = new AlteracaoDao();
        dao.alterarEtapaConsultoria(etapa, hr_teste, Integer.parseInt(edtCodigoAlteracao.getText()));
    }
    
    public void limpar() {
        edtCodigoAlteracao.setText("");
        edtCliente.setText("");
        edtDataEntrega.setText("");
        edtUrgencia.setText("");
        edtEtapa.setText("");
        edtResponsavel.setText("");
        txtObservacao.setText("");
        cmbHorasProducao.setSelectedItem("1");
        cmbHorasTeste.setSelectedItem("1");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConcluirAlteracao;
    private javax.swing.JButton btnConcluirProducao;
    private javax.swing.JButton btnDevolver;
    private javax.swing.JButton btnIniciarAlteracao;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox cmbHorasProducao;
    private javax.swing.JComboBox cmbHorasTeste;
    private javax.swing.JTextField edtCliente;
    private javax.swing.JTextField edtCodigoAlteracao;
    private javax.swing.JTextField edtDataEntrega;
    private javax.swing.JTextField edtEtapa;
    private javax.swing.JTextField edtPesquisa;
    private javax.swing.JTextField edtResponsavel;
    private javax.swing.JTextField edtUrgencia;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCodigoAlteracao;
    private javax.swing.JLabel lblDtEntrega;
    private javax.swing.JLabel lblEtapa;
    private javax.swing.JLabel lblHorasProducao;
    private javax.swing.JLabel lblHorasTeste;
    private javax.swing.JLabel lblObservacao;
    private javax.swing.JLabel lblResponsavel;
    private javax.swing.JLabel lblUrgencia;
    private javax.swing.JPanel panDadosAlteracoes;
    private javax.swing.JScrollPane scrObservacao;
    private javax.swing.JScrollPane scrTabel;
    private javax.swing.JTable tblDados;
    private javax.swing.JTextPane txtObservacao;
    // End of variables declaration//GEN-END:variables
}