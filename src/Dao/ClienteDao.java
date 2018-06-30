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
import model.Cliente;

/**
 *
 * @author LeoPaza
 */
public class ClienteDao {
    private Connection conexao;
    
    public ClienteDao() throws SQLException {
        this.conexao = CriarConexao.getConexao();
    }
    
    public void adiciona(Cliente c1) throws SQLException{
        //prepara conexão
        String sql = "insert into cliente (nome,endereco,cidade,uf,email,dt_insert) values (?,?,?,?,?,?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        stmt.setString(1, c1.getNome());
        stmt.setString(2, c1.getEndereco());
        stmt.setString(3, c1.getCidade());
        stmt.setString(4, c1.getUf());
        stmt.setString(5, c1.getEmail());
        stmt.setString(6, c1.getDt_insert());
        
        //Executa o Código SQL
        stmt.execute();
        stmt.close();
    }
    
    public List<String> buscaClientes() throws SQLException {
        String sql = "select * from cliente";
        PreparedStatement stmt = conexao.prepareStatement(sql);
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
    
    public int BuscaCodCliente(String nome) throws SQLException {
        String sql = "select * from cliente where nome = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();
        
        rs.next();
        int cod_usuario = rs.getInt("cod_cliente");
        
        rs.close();
        stmt.close();
        return cod_usuario;
    }
    
    public String BuscaNomeCliente(int cod_cliente) throws SQLException {
        String sql = "select * from cliente where cod_cliente = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, cod_cliente);
        ResultSet rs = stmt.executeQuery();
        
        rs.next();
        String nome = rs.getString("nome");
        
        rs.close();
        stmt.close();
        return nome;
    }
}