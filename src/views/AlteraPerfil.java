/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package views;

import Dao.UsuarioDao;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author leonardo
 */
public class AlteraPerfil extends javax.swing.JFrame {

    private final int cod_usuario;
    private final String nome;
    private final String login;
    private final String senha;
    private final String email;
    
    /**
     * Creates new form AlteraUsuario
     * @param cod_usuario
     * @param nome
     * @param login
     * @param senha
     * @param email
     */
    public AlteraPerfil(int cod_usuario, String nome, String login, String senha, String email) {
        initComponents();
        this.cod_usuario = cod_usuario;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
        edtCodUsuario.setEditable(false);
        edtCodUsuario.setEnabled(false);
        edtCodUsuario.setText(String.valueOf(cod_usuario));
        edtNome.setText(nome);
        edtLogin.setText(login);
        edtSenha.setText(senha);
        edtEmail.setText(email);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        lblLogin = new javax.swing.JLabel();
        edtLogin = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        edtSenha = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        edtEmail = new javax.swing.JTextField();
        btnAltera = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblCodUsuario = new javax.swing.JLabel();
        edtCodUsuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alterar Perfil");
        setName("frmAlterarPerfil"); // NOI18N
        setResizable(false);

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNome.setText("Nome: *");

        edtNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtNomeKeyPressed(evt);
            }
        });

        lblLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLogin.setText("Login: *");

        edtLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edtLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtLoginKeyPressed(evt);
            }
        });

        lblSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSenha.setText("Senha: *");

        edtSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtSenhaKeyPressed(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmail.setText("Email:");

        edtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtEmailKeyPressed(evt);
            }
        });

        btnAltera.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAltera.setText("Alterar");
        btnAltera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlteraActionPerformed(evt);
            }
        });
        btnAltera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAlteraKeyPressed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        btnSair.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSairKeyPressed(evt);
            }
        });

        lblCodUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCodUsuario.setText("Cod Usuário: *");

        edtCodUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAltera)
                    .addComponent(lblCodUsuario)
                    .addComponent(lblEmail)
                    .addComponent(lblSenha)
                    .addComponent(lblLogin)
                    .addComponent(lblNome))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(edtLogin)
                            .addComponent(edtSenha)
                            .addComponent(edtEmail)
                            .addComponent(edtCodUsuario))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                        .addComponent(btnSair)
                        .addGap(73, 73, 73))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodUsuario)
                    .addComponent(edtCodUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogin)
                    .addComponent(edtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(edtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(edtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAltera)
                    .addComponent(btnSair))
                .addGap(48, 48, 48))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlteraActionPerformed
        if (verificaDados()) {
            if (verificaSenha()) {
                try {
                    alteraContato();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Tente Novamente ou Contate o Administrador do Sistema!");
                    edtNome.requestFocus();
                }
            }
        }
    }//GEN-LAST:event_btnAlteraActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        mensagemSair();
    }//GEN-LAST:event_btnSairActionPerformed

    private void edtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtNomeKeyPressed
        switch (evt.getKeyCode()) {
            case 10: // Enter
                edtLogin.requestFocus();
            break;
                
           case 27: // Esc
                mensagemSair();
           break;
        }
    }//GEN-LAST:event_edtNomeKeyPressed

    private void edtLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtLoginKeyPressed
        switch (evt.getKeyCode()) {
            case 10: // Enter
                edtSenha.requestFocus();
            break;
                
           case 27: // Esc
                mensagemSair();
           break;
        }
    }//GEN-LAST:event_edtLoginKeyPressed

    private void edtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtSenhaKeyPressed
        switch (evt.getKeyCode()) {
            case 10: // Enter
                edtEmail.requestFocus();
            break;
                
           case 27: // Esc
                mensagemSair();
           break;
        }
    }//GEN-LAST:event_edtSenhaKeyPressed

    private void edtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtEmailKeyPressed
        pegarTeclas(evt);  
    }//GEN-LAST:event_edtEmailKeyPressed

    private void btnAlteraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAlteraKeyPressed
        pegarTeclas(evt);   
    }//GEN-LAST:event_btnAlteraKeyPressed

    private void btnSairKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSairKeyPressed
        switch (evt.getKeyCode()) {
            case 10: // Enter
                mensagemSair();
            break;
                
           case 27: // Esc
                mensagemSair();
           break;
        }
    }//GEN-LAST:event_btnSairKeyPressed

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
//            java.util.logging.Logger.getLogger(AlteraUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AlteraUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AlteraUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AlteraUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AlteraUsuario().setVisible(true);
//            }
//        });
//    }
    
    private boolean verificaDados() {
        if (!(edtNome.getText().equals("")) && !(edtLogin.getText().equals("")) && !(edtSenha.getText().equals(""))) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Preencha os Campos Requeridos!!!");
            edtNome.requestFocus();
            return false;
        }
    }
    
    private boolean verificaSenha() {
        int tamanhoSenha = edtSenha.getText().length();
        if (tamanhoSenha >= 8) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Digite uma Senha com no Mínimo 8 Digitos");
            edtSenha.grabFocus();
            return false;
        }
    }
    
    private void pegarTeclas(java.awt.event.KeyEvent evt) {
        switch (evt.getKeyCode()) {
            case 10: // Enter
                if (verificaDados()) {
                    if (verificaSenha()) {
                        try {
                            alteraContato();
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null, "Tente Novamente ou Contate o Administrador do Sistema!");
                            edtNome.requestFocus();
                        }
                    }
                }
            break;
                
           case 27: // Esc
                mensagemSair();
           break;
        }
    }
    
    private void alteraContato() throws SQLException {
        Usuario u1 = new Usuario();
        u1.setCod_usuario(Integer.parseInt(edtCodUsuario.getText()));
        u1.setNome(edtNome.getText());
        u1.setLogin(edtLogin.getText());
        u1.setSenha(edtSenha.getText());
        u1.setEmail(edtEmail.getText());
        
        Date hoje = new Date();
        SimpleDateFormat df;
        df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String DateTime = df.format(hoje);
        
        u1.setDt_update(DateTime);
        
        UsuarioDao dao = new UsuarioDao();
        dao.altera(u1);
        
        JOptionPane.showMessageDialog(null, "Perfil Alterado Com Sucesso!!!");
        dispose();
    }
    
    // Exibe Mensagem de Confirmação de Saida.
    private void mensagemSair() {
        int resp = JOptionPane.showConfirmDialog(this, "Deseja Realmente Sair?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if(resp == JOptionPane.YES_NO_OPTION) {
            dispose();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltera;
    private javax.swing.JButton btnSair;
    private javax.swing.JTextField edtCodUsuario;
    private javax.swing.JTextField edtEmail;
    private javax.swing.JTextField edtLogin;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtSenha;
    private javax.swing.JLabel lblCodUsuario;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    // End of variables declaration//GEN-END:variables
}