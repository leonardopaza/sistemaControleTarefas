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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import model.Alteracao;
import utils.JCalendar;

/**
 *
 * @author leonardo
 */
public class CadastroAlteracao extends javax.swing.JFrame {
    
    DefaultTableModel tmAlteracoes = new DefaultTableModel(null, new String []{"Código", "Tipo", "Desenvolvedor", "Horas Previstas", "Cliente", "Urgência", "Descrição", "Data Entrega"});

    List<Alteracao> alteracoes;
    String[] arrayDesenvolvedores;
    String[] arrayClientes;
    String tipo_usuario;
    ListSelectionModel lsmAlteracao;
    /**
     * Creates new form CadastroAlteracao
     * @param arrayDesenvolvedores
     * @param arrayClientes
     * @param tipo_usuario
     */
    public CadastroAlteracao(String[] arrayDesenvolvedores, String[] arrayClientes, String tipo_usuario) {
        initComponents();
        this.arrayDesenvolvedores = arrayDesenvolvedores;
        this.arrayClientes = arrayClientes;
        this.tipo_usuario = tipo_usuario;
        cmbNomeDesenvolvedor.setModel(new DefaultComboBoxModel(arrayDesenvolvedores));
        cmbCliente.setModel(new DefaultComboBoxModel(arrayClientes));
        edtCodAlteracao.setEditable(false);
        edtCodAlteracao.setEnabled(false);
        
        desabilitaDados();
        btnSalvar.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnCancelar.setEnabled(false);
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
        btnPesquisar = new javax.swing.JButton();
        panDadosAlter = new javax.swing.JPanel();
        lblCodAlteracao = new javax.swing.JLabel();
        edtCodAlteracao = new javax.swing.JTextField();
        lblNomeDesenvolvedor = new javax.swing.JLabel();
        lblHorasPrevistas = new javax.swing.JLabel();
        cmbHorasPrevistas = new javax.swing.JComboBox();
        lblTipoAlteracao = new javax.swing.JLabel();
        cmbTipoAlteracao = new javax.swing.JComboBox();
        lblCliente = new javax.swing.JLabel();
        lblUrgencia = new javax.swing.JLabel();
        cmbCliente = new javax.swing.JComboBox();
        cmbUrgencia = new javax.swing.JComboBox();
        lblDescricao = new javax.swing.JLabel();
        scrDesc = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        lblCalendario = new javax.swing.JLabel();
        cmbCalendario = new utils.JCalendar(false);
        cmbNomeDesenvolvedor = new javax.swing.JComboBox();
        panBotoes = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        scrTable = new javax.swing.JScrollPane();
        tblDados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Alterações");
        setName("frmCadastroAlteracao"); // NOI18N
        setResizable(false);

        edtPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        panDadosAlter.setToolTipText("");
        panDadosAlter.setName(""); // NOI18N

        lblCodAlteracao.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblCodAlteracao.setText("Código Alteração: *");

        edtCodAlteracao.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblNomeDesenvolvedor.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblNomeDesenvolvedor.setText("Nome Desenvolvedor: *");

        lblHorasPrevistas.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblHorasPrevistas.setText("Horas Previstas: *");

        cmbHorasPrevistas.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cmbHorasPrevistas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16" }));

        lblTipoAlteracao.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblTipoAlteracao.setText("Tipo de Alteração: *");

        cmbTipoAlteracao.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cmbTipoAlteracao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bug", "Idéia", "Nova Funcionalidade" }));

        lblCliente.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblCliente.setText("Cliente: *");

        lblUrgencia.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblUrgencia.setText("Urgência: *");

        cmbCliente.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        cmbUrgencia.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cmbUrgencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alta", "Média", "Baixa" }));

        lblDescricao.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblDescricao.setText("Descrição: *");

        txtDescricao.setColumns(20);
        txtDescricao.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtDescricao.setRows(5);
        scrDesc.setViewportView(txtDescricao);

        lblCalendario.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblCalendario.setText("Data da Entrega: *");

        cmbCalendario.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        cmbNomeDesenvolvedor.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        javax.swing.GroupLayout panDadosAlterLayout = new javax.swing.GroupLayout(panDadosAlter);
        panDadosAlter.setLayout(panDadosAlterLayout);
        panDadosAlterLayout.setHorizontalGroup(
            panDadosAlterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDadosAlterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panDadosAlterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDadosAlterLayout.createSequentialGroup()
                        .addGroup(panDadosAlterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panDadosAlterLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lblCodAlteracao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edtCodAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panDadosAlterLayout.createSequentialGroup()
                                .addGroup(panDadosAlterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblHorasPrevistas)
                                    .addComponent(lblNomeDesenvolvedor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panDadosAlterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbHorasPrevistas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbNomeDesenvolvedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panDadosAlterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUrgencia)
                            .addComponent(lblCliente)
                            .addComponent(lblTipoAlteracao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panDadosAlterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbTipoAlteracao, 0, 134, Short.MAX_VALUE)
                            .addComponent(cmbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbUrgencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(54, 54, 54))
                    .addGroup(panDadosAlterLayout.createSequentialGroup()
                        .addComponent(lblDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panDadosAlterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCalendario)
                            .addComponent(cmbCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        panDadosAlterLayout.setVerticalGroup(
            panDadosAlterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDadosAlterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panDadosAlterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodAlteracao)
                    .addComponent(edtCodAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoAlteracao)
                    .addComponent(cmbTipoAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panDadosAlterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeDesenvolvedor)
                    .addComponent(lblCliente)
                    .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbNomeDesenvolvedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panDadosAlterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHorasPrevistas)
                    .addComponent(cmbHorasPrevistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUrgencia)
                    .addComponent(cmbUrgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panDadosAlterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescricao)
                    .addComponent(scrDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panDadosAlterLayout.createSequentialGroup()
                        .addComponent(lblCalendario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNovo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnNovo.setText("Nova Alteração");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panBotoesLayout = new javax.swing.GroupLayout(panBotoes);
        panBotoes.setLayout(panBotoesLayout);
        panBotoesLayout.setHorizontalGroup(
            panBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBotoesLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(btnNovo)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panBotoesLayout.setVerticalGroup(
            panBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBotoesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        scrTable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        tblDados.setModel(tmAlteracoes);
        tblDados.setSelectionMode(ListSelectionM­odel.SINGLE_SELECTION);
        lsmAlteracao = tblDados.getSelectionModel();
        lsmAlteracao.addListSelectionListener(new ListSelectionListener() { public void valueChanged(ListSelectionEvent e) { if (! e.getValueIsAdjusting()){ linhaSelecionada(tblDados); } }
        });
        scrTable.setViewportView(tblDados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrTable)
                    .addComponent(panBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panDadosAlter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(edtPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panDadosAlter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrTable, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        mensagemSair();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        habilitaDados();
        btnAlterar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnNovo.setEnabled(false);
        btnSalvar.setEnabled(true);
        edtPesquisa.setEnabled(false);
        btnPesquisar.setEnabled(false);
        limpar();
        cmbNomeDesenvolvedor.grabFocus();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (!(txtDescricao.getText().equals(""))) {
            cadastro();
            desabilitaDados();
            limpar();
            edtPesquisa.setEnabled(true);
            btnPesquisar.setEnabled(true);
            edtPesquisa.grabFocus();
            btnNovo.setEnabled(true);
            btnSalvar.setEnabled(false);
            try {
                listarContatos();
            } catch (SQLException ex) {
                Logger.getLogger(CadastroAlteracao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha Todos os Campos!");
            txtDescricao.requestFocus();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            listarContatos();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroAlteracao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (!(txtDescricao.getText().equals(""))) {
            if (!"".equals(edtCodAlteracao.getText())) {
                try {
                    alteraContato();            
                    desabilitaDados();
                    listarContatos();
                    limpar();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Não Foi Possível Alterar o Contato!!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Selecione Uma Alteração Para Alterar!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha Todos os Campos!");
            txtDescricao.requestFocus();
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if (!"".equals(edtCodAlteracao.getText())) {
            try {
                cancelarAlteracao();
                listarContatos();
                desabilitaDados();
                limpar();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Não Foi Possível Excluir!!");
            }
        } else{
            JOptionPane.showMessageDialog(null, "Selecione Uma Alteração Para Excluir!!");
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
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
//            java.util.logging.Logger.getLogger(CadastroAlteracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CadastroAlteracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CadastroAlteracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CadastroAlteracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CadastroAlteracao().setVisible(true);
//            }
//        });
//    }

    public void cadastro() {
        try {
            Alteracao a1 = new Alteracao();
            a1.setHr_previstas(Integer.parseInt(cmbHorasPrevistas.getSelectedItem().toString()));
            a1.setTipo_alteracao(cmbTipoAlteracao.getSelectedItem().toString());
            a1.setPrioridade(cmbUrgencia.getSelectedItem().toString());
            a1.setDescricao(txtDescricao.getText());
            a1.setDt_entrega((((JCalendar) cmbCalendario).getText()));
            
            int cod_usuario = BuscaCodUsuario();
            a1.setFk_usuario(cod_usuario);
            
            int cod_cliente = BuscaCodCliente();
            a1.setFk_cliente(cod_cliente);
            
            a1.setEtapa("Para Fazer");
            a1.setHr_producao(0);
            a1.setHr_teste(0);
            
            Date hoje = new Date();
            SimpleDateFormat df;
            df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String DateTime = df.format(hoje);
            
            a1.setDt_insert(DateTime);

            AlteracaoDao dao = new AlteracaoDao();
            dao.adiciona(a1);
            
            JOptionPane.showMessageDialog(null, "Alteração Cadastrada com Sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cadastro Não Concluido!!");
        }
    }
    
    private void alteraContato() throws SQLException{
        if(tblDados.getSelectedRow() != -1){
//            if(verificaDados()){
                Alteracao a1 = new Alteracao();
                AlteracaoDao dao = new AlteracaoDao();
                
                a1.setCod_alteracao(Integer.parseInt(edtCodAlteracao.getText()));
                a1.setHr_previstas(Integer.parseInt(cmbHorasPrevistas.getSelectedItem().toString()));
                a1.setTipo_alteracao(cmbTipoAlteracao.getSelectedItem().toString());
                a1.setPrioridade(cmbUrgencia.getSelectedItem().toString());
                a1.setDescricao(txtDescricao.getText());
                a1.setDt_entrega((((JCalendar) cmbCalendario).getText()));
            
                int cod_usuario = BuscaCodUsuario();
                a1.setFk_usuario(cod_usuario);
                
                int cod_cliente = BuscaCodCliente();
                a1.setFk_cliente(cod_cliente);
                
                Date hoje = new Date();
                SimpleDateFormat df;
                df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                String DateTime = df.format(hoje);
            
                a1.setDt_update(DateTime);
                
                dao.alteraCadastroAlteracao(a1);
                JOptionPane.showMessageDialog(null, "Alteração Alterada Com Sucesso!!");
//            }
        }
    }
    
    public void cancelarAlteracao() throws SQLException{
        int resp = JOptionPane.showConfirmDialog(this, "Deseja Realmente Cancelar Esta Alteração?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if(resp == JOptionPane.YES_NO_OPTION){
            AlteracaoDao dao = new AlteracaoDao();
            dao.alteraEtapa("Cancelada", Integer.parseInt(edtCodAlteracao.getText()));   
            JOptionPane.showMessageDialog(null, "Alteração Cancelada Com Sucesso!!");      
        }   
    }
    
    public int BuscaCodUsuario() throws SQLException {
        UsuarioDao dao = new UsuarioDao();
        String nome = cmbNomeDesenvolvedor.getSelectedItem().toString();
        int cod_usuario = dao.BuscaCodUsuario(nome);
        return cod_usuario;
    }
    
    public String BuscaNomeUsuario(int cod_usuario) throws SQLException {
        UsuarioDao dao = new UsuarioDao();
        String nome = dao.BuscaNomeUsuario(cod_usuario);
        return nome;
    }
    
    public int BuscaCodCliente() throws SQLException {
        ClienteDao dao = new ClienteDao();
        String nome = cmbCliente.getSelectedItem().toString();
        int cod_usuario = dao.BuscaCodCliente(nome);
        return cod_usuario;
    }
    
    public String BuscaNomeCliente(int cod_cliente) throws SQLException {
        ClienteDao dao = new ClienteDao();
        String nome = dao.BuscaNomeCliente(cod_cliente);
        return nome;
    }
    
    protected void listarContatos() throws SQLException {
        if (tipo_usuario.equals("Consultor")) {
            AlteracaoDao dao = new AlteracaoDao();
            alteracoes = dao.getLista("%" + edtPesquisa.getText() + "%");
            mostraPesquisa(alteracoes);
        } else {
            AlteracaoDao dao = new AlteracaoDao();
            alteracoes = dao.getListaAll("%" + edtPesquisa.getText() + "%");
            mostraPesquisa(alteracoes);
        }
    }
    
    private void mostraPesquisa(List<Alteracao> alteracoes) {
        while(tmAlteracoes.getRowCount() > 0){
            tmAlteracoes.removeRow(0);
        }
        if(alteracoes.size() == 0){
            JOptionPane.showMessageDialog(null, "Nenhum Alteração Cadastrada!");
        }else{
            String[] linha = new String [] {null, null, null, null};
            for (int i = 0; i < alteracoes.size(); i++) {
                tmAlteracoes.addRow(linha);
                tmAlteracoes.setValueAt(alteracoes.get(i).getCod_alteracao(), i, 0);
                tmAlteracoes.setValueAt(alteracoes.get(i).getTipo_alteracao(), i, 1);
                tmAlteracoes.setValueAt(alteracoes.get(i).getFk_usuario(), i, 2);
                tmAlteracoes.setValueAt(alteracoes.get(i).getHr_previstas(), i, 3);
                tmAlteracoes.setValueAt(alteracoes.get(i).getFk_cliente(), i, 4);
                tmAlteracoes.setValueAt(alteracoes.get(i).getPrioridade(), i, 5);
                tmAlteracoes.setValueAt(alteracoes.get(i).getDescricao(), i, 6);
                tmAlteracoes.setValueAt(alteracoes.get(i).getDt_entrega(), i, 7);
            }
            
            btnAlterar.setEnabled(true);
            btnCancelar.setEnabled(true);            
        }
    }
    
    private void linhaSelecionada(JTable tabela){
        if (tblDados.getSelectedRow() != -1) {
            habilitaDados();
            btnSalvar.setEnabled(false);
            edtCodAlteracao.setText(String.valueOf(alteracoes.get(tabela.getSelectedRow()).getCod_alteracao()));
            cmbHorasPrevistas.setSelectedItem(String.valueOf(alteracoes.get(tabela.getSelectedRow()).getHr_previstas()));
            cmbTipoAlteracao.setSelectedItem(alteracoes.get(tabela.getSelectedRow()).getTipo_alteracao());
            cmbUrgencia.setSelectedItem(alteracoes.get(tabela.getSelectedRow()).getPrioridade());
            txtDescricao.setText(alteracoes.get(tabela.getSelectedRow()).getDescricao());
            
            String nome;
            try {
                nome = BuscaNomeUsuario(alteracoes.get(tabela.getSelectedRow()).getFk_usuario());
                cmbNomeDesenvolvedor.setSelectedItem(nome);
            } catch (SQLException ex) {
                Logger.getLogger(CadastroAlteracao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            String nomeCliente;
            try {
                nomeCliente = BuscaNomeCliente(alteracoes.get(tabela.getSelectedRow()).getFk_cliente());
                cmbCliente.setSelectedItem(nomeCliente);
            } catch (SQLException ex) {
                Logger.getLogger(CadastroAlteracao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            edtCodAlteracao.setText("");
        }
    }
    
    public void desabilitaDados() {
        cmbNomeDesenvolvedor.setEnabled(false);
        cmbHorasPrevistas.setEnabled(false);
        cmbTipoAlteracao.setEnabled(false);
        cmbCliente.setEnabled(false);
        cmbUrgencia.setEnabled(false);
        txtDescricao.setEditable(false);
        cmbCalendario.setEnabled(false);
    }
    
    public void habilitaDados() {
        cmbNomeDesenvolvedor.setEnabled(true);
        cmbHorasPrevistas.setEnabled(true);
        cmbTipoAlteracao.setEnabled(true);
        cmbCliente.setEnabled(true);
        cmbUrgencia.setEnabled(true);
        txtDescricao.setEditable(true);
        cmbCalendario.setEnabled(true);
    }
    
    public void limpar() {
        txtDescricao.setText("");
    }
    
    // Exibe Mensagem de Confirmação de Saida.
    private void mensagemSair() {
        int resp = JOptionPane.showConfirmDialog(this, "Deseja Realmente Sair?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if(resp == JOptionPane.YES_NO_OPTION) {
            dispose();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cmbCalendario;
    private javax.swing.JComboBox cmbCliente;
    private javax.swing.JComboBox cmbHorasPrevistas;
    private javax.swing.JComboBox cmbNomeDesenvolvedor;
    private javax.swing.JComboBox cmbTipoAlteracao;
    private javax.swing.JComboBox cmbUrgencia;
    private javax.swing.JTextField edtCodAlteracao;
    private javax.swing.JTextField edtPesquisa;
    private javax.swing.JLabel lblCalendario;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCodAlteracao;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblHorasPrevistas;
    private javax.swing.JLabel lblNomeDesenvolvedor;
    private javax.swing.JLabel lblTipoAlteracao;
    private javax.swing.JLabel lblUrgencia;
    private javax.swing.JPanel panBotoes;
    private javax.swing.JPanel panDadosAlter;
    private javax.swing.JScrollPane scrDesc;
    private javax.swing.JScrollPane scrTable;
    private javax.swing.JTable tblDados;
    private javax.swing.JTextArea txtDescricao;
    // End of variables declaration//GEN-END:variables
}