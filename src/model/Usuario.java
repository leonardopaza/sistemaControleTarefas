/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author leonardo
 */
public class Usuario {
    
    private int cod_usuario;
    private String nome;
    private String login;
    private String senha;
    private String email;
    private String tipo_usuario;
    private String dt_insert;
    private String dt_update;

    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public String getDt_insert() {
        return dt_insert;
    }

    public void setDt_insert(String dt_insert) {
        this.dt_insert = dt_insert;
    }

    public String getDt_update() {
        return dt_update;
    }

    public void setDt_update(String dt_update) {
        this.dt_update = dt_update;
    }
}