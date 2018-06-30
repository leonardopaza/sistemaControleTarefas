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
import model.Alteracao;

/**
 *
 * @author leonardo
 */
public class AlteracaoDao {
    private Connection conexao;

    public AlteracaoDao() throws SQLException {
        this.conexao = CriarConexao.getConexao();
    }
    
    public void adiciona(Alteracao a1) throws SQLException{
        //prepara conexão
        String sql = "insert into alteracao (tipo_alteracao,hr_previstas,descricao,prioridade,dt_entrega,etapa,hr_producao,hr_teste,dt_insert,fk_usuario, fk_cliente) values (?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        stmt.setString(1, a1.getTipo_alteracao());
        stmt.setInt(2, a1.getHr_previstas());
        stmt.setString(3, a1.getDescricao());
        stmt.setString(4, a1.getPrioridade());
        stmt.setString(5, a1.getDt_entrega());
        stmt.setString(6, a1.getEtapa());
        stmt.setInt(7, a1.getHr_producao());
        stmt.setInt(8, a1.getHr_teste());
        stmt.setString(9, a1.getDt_insert());
        stmt.setInt(10, a1.getFk_usuario());
        stmt.setInt(11, a1.getFk_cliente());
        
        //Executa o Código SQL
        stmt.execute();
        stmt.close();
    }
    
    public List<Alteracao> getLista(String descricao) throws SQLException{
        String sql = "select * from alteracao where descricao like ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, descricao);
        ResultSet rs = stmt.executeQuery();        
        List<Alteracao> minhaLista = new ArrayList<Alteracao>();
        
        while(rs.next()){
          Alteracao a1 = new Alteracao();
          a1.setCod_alteracao(rs.getInt("cod_alteracao"));
          a1.setTipo_alteracao(rs.getString("tipo_alteracao"));
          a1.setHr_previstas(rs.getInt("hr_previstas"));
          a1.setDescricao(rs.getString("descricao"));
          a1.setPrioridade(rs.getString("prioridade"));
          a1.setFk_usuario(rs.getInt("fk_usuario"));
          a1.setFk_cliente(rs.getInt("fk_cliente"));
          a1.setDt_entrega(rs.getString("dt_entrega"));
          a1.setEtapa(rs.getString("etapa"));
          a1.setHr_producao(rs.getInt("hr_producao"));
          a1.setHr_teste(rs.getInt("hr_teste"));
          minhaLista.add(a1);
        }
        
        rs.close();
        stmt.close();
        return minhaLista;
    }
    
    public List<Alteracao> getListaAll(String descricao) throws SQLException{
        String sql = "select * from alteracao where descricao like ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, descricao);
        ResultSet rs = stmt.executeQuery();        
        List<Alteracao> minhaLista = new ArrayList<Alteracao>();
        
        while(rs.next()){
          Alteracao a1 = new Alteracao();
          a1.setCod_alteracao(rs.getInt("cod_alteracao"));
          a1.setTipo_alteracao(rs.getString("tipo_alteracao"));
          a1.setHr_previstas(rs.getInt("hr_previstas"));
          a1.setDescricao(rs.getString("descricao"));
          a1.setPrioridade(rs.getString("prioridade"));
          a1.setFk_usuario(rs.getInt("fk_usuario"));
          a1.setFk_cliente(rs.getInt("fk_cliente"));
          a1.setDt_entrega(rs.getString("dt_entrega"));
          a1.setEtapa(rs.getString("etapa"));
          a1.setHr_producao(rs.getInt("hr_producao"));
          a1.setHr_teste(rs.getInt("hr_teste"));
          minhaLista.add(a1);
        }
        
        rs.close();
        stmt.close();
        return minhaLista;
    }
    
    public List<Alteracao> getListaMan(String descricao, int fk_usuario, String etapa) throws SQLException{
        String sql = "select * from alteracao where descricao like ? and fk_usuario = ? and etapa = ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, descricao);
        stmt.setInt(2, fk_usuario);
        stmt.setString(3, etapa);
        ResultSet rs = stmt.executeQuery();        
        List<Alteracao> minhaLista = new ArrayList<Alteracao>();
        
        while(rs.next()){
          Alteracao a1 = new Alteracao();
          a1.setCod_alteracao(rs.getInt("cod_alteracao"));
          a1.setTipo_alteracao(rs.getString("tipo_alteracao"));
          a1.setHr_previstas(rs.getInt("hr_previstas"));
          a1.setDescricao(rs.getString("descricao"));
          a1.setPrioridade(rs.getString("prioridade"));
          a1.setFk_usuario(rs.getInt("fk_usuario"));
          a1.setFk_cliente(rs.getInt("fk_cliente"));
          a1.setDt_entrega(rs.getString("dt_entrega"));
          a1.setEtapa(rs.getString("etapa"));
          a1.setHr_producao(rs.getInt("hr_producao"));
          a1.setHr_teste(rs.getInt("hr_teste"));
          a1.setObservacao(rs.getString("observacao"));
          minhaLista.add(a1);
        }
        
        rs.close();
        stmt.close();
        return minhaLista;
    }    
    
    public List<Alteracao> getListaManConsultor(String descricao, String etapa) throws SQLException{
        String sql = "select * from alteracao where descricao like ? and etapa = ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, descricao);
        stmt.setString(2, etapa);
        ResultSet rs = stmt.executeQuery();        
        List<Alteracao> minhaLista = new ArrayList<Alteracao>();
        
        while(rs.next()){
          Alteracao a1 = new Alteracao();
          a1.setCod_alteracao(rs.getInt("cod_alteracao"));
          a1.setTipo_alteracao(rs.getString("tipo_alteracao"));
          a1.setHr_previstas(rs.getInt("hr_previstas"));
          a1.setDescricao(rs.getString("descricao"));
          a1.setPrioridade(rs.getString("prioridade"));
          a1.setFk_usuario(rs.getInt("fk_usuario"));
          a1.setFk_cliente(rs.getInt("fk_cliente"));
          a1.setDt_entrega(rs.getString("dt_entrega"));
          a1.setEtapa(rs.getString("etapa"));
          a1.setHr_producao(rs.getInt("hr_producao"));
          a1.setHr_teste(rs.getInt("hr_teste"));
          a1.setObservacao(rs.getString("observacao"));
          minhaLista.add(a1);
        }
        
        rs.close();
        stmt.close();
        return minhaLista;
    }    
    
    public void alteraCadastroAlteracao(Alteracao a1) throws SQLException{
        String sql = "update alteracao set tipo_alteracao = ?, hr_previstas = ?, descricao = ?, prioridade = ?, dt_entrega = ?, dt_update = ?, fk_usuario = ?, fk_cliente = ? where cod_alteracao = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        stmt.setString(1, a1.getTipo_alteracao());
        stmt.setInt(2, a1.getHr_previstas());
        stmt.setString(3, a1.getDescricao());
        stmt.setString(4, a1.getPrioridade());
        stmt.setString(5, a1.getDt_entrega());
        stmt.setString(6, a1.getDt_update());
        stmt.setInt(7, a1.getFk_usuario());
        stmt.setInt(8, a1.getFk_cliente());
        stmt.setInt(9, a1.getCod_alteracao());
        
        //Executa o Código SQL
        stmt.execute();
        stmt.close();
    }
    
    public void alteraEtapa(String etapa, int cod_alteracao) throws SQLException {
        String sql = "update alteracao set etapa = ? where cod_alteracao = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, etapa);
        stmt.setInt(2, cod_alteracao);
        stmt.execute();
        stmt.close();
    }
    
    public void concluirAlteracao(String etapa, int hr_producao, int cod_alteracao) throws SQLException {
        String sql = "update alteracao set etapa = ?, hr_producao = ? where cod_alteracao = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, etapa);
        stmt.setInt(2, hr_producao);
        stmt.setInt(3, cod_alteracao);
        stmt.execute();
        stmt.close();
    }
    
    public void alterarEtapaConsultoria(String etapa, int hr_teste, int cod_alteracao) throws SQLException {
        String sql = "update alteracao set etapa = ?, hr_teste = ? where cod_alteracao = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, etapa);
        stmt.setInt(2, hr_teste);
        stmt.setInt(3, cod_alteracao);
        stmt.execute();
        stmt.close();
    }
}