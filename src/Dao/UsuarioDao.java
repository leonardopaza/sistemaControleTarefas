/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Usuario;

/**
 *
 * @author leonardo
 */
public class UsuarioDao {
    private Connection conexao;
    
    public UsuarioDao() throws SQLException{
        this.conexao = CriarConexao.getConexao();
    }
    
    public Usuario Logar(String usuario, String senha) throws SQLException {
        String sql = "select * from usuario where login=? AND senha=?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, usuario);
        stmt.setString(2, senha);
        ResultSet rs = stmt.executeQuery();    
        
        if (rs.next()) {
            Usuario u1 = new Usuario();
            u1.setCod_usuario(rs.getInt("cod_usuario"));
            u1.setNome(rs.getString("nome"));
            u1.setLogin(rs.getString("login"));
            u1.setSenha(rs.getString("senha"));
            u1.setEmail(rs.getString("email"));
            u1.setTipo_usuario(rs.getString("tipo_usuario"));
        
            rs.close();
            stmt.close();
            return u1;            
        } else {
            return null;
        }
    }
    
    public void adiciona(Usuario u1) throws SQLException{
        //prepara conexão
        String sql = "insert into usuario (nome,login,senha,email,tipo_usuario,dt_insert) values (?,?,?,?,?,?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        stmt.setString(1, u1.getNome());
        stmt.setString(2, u1.getLogin());
        stmt.setString(3, u1.getSenha());
        stmt.setString(4, u1.getEmail());
        stmt.setString(5, u1.getTipo_usuario());
        stmt.setString(6, u1.getDt_insert());
        
        //Executa o Código SQL
        stmt.execute();
        stmt.close();
    }
    
    public void altera(Usuario u1) throws SQLException {
        String sql = "update usuario set nome = ?, login = ?, senha = ?, email = ?, dt_update = ? where cod_usuario = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        stmt.setString(1, u1.getNome());
        stmt.setString(2, u1.getLogin());
        stmt.setString(3, u1.getSenha());
        stmt.setString(4, u1.getEmail());
        stmt.setString(5, u1.getDt_update());
        stmt.setInt(6, u1.getCod_usuario());
        
        //Executa o Código SQL
        stmt.execute();
        stmt.close();
    }
    
    public List<String> buscaUsuarios(String tipo_usuario) throws SQLException {
        String sql = "select * from usuario where tipo_usuario = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, tipo_usuario);
        ResultSet rs = stmt.executeQuery(); 
        List<String> minhaLista = new ArrayList<String>();
        
        while (rs.next()) {
            String nome = rs.getString("nome");
            minhaLista.add(nome);
        }
        rs.close();
        stmt.close();
        return minhaLista;
    }
    
    public int BuscaCodUsuario(String nome) throws SQLException {
        String sql = "select * from usuario where nome = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();
        
        rs.next();
        int cod_usuario = rs.getInt("cod_usuario");
        
        rs.close();
        stmt.close();
        return cod_usuario;
    }
    
    public String BuscaNomeUsuario(int cod_usuario) throws SQLException {
        String sql = "select * from usuario where cod_usuario = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, cod_usuario);
        ResultSet rs = stmt.executeQuery();
        
        rs.next();
        String nome = rs.getString("nome");
        
        rs.close();
        stmt.close();
        return nome;
    }
}