/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author LeoPaza
 */
public class Cliente {
    
    private int cod_cliente;
    private String nome;
    private String endereco;
    private String cidade;
    private String uf;
    private String email;
    private String dt_insert;
    private String dt_update;

    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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