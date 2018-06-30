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
public class Alteracao {
    
    private int cod_alteracao;
    private String tipo_alteracao;
    private int hr_previstas;
    private String descricao;
    private String observacao;
    private String prioridade;
    private String dt_entrega;
    private String etapa;
    private int hr_producao;
    private int hr_teste;
    private String dt_insert;
    private String dt_update;
    private int fk_usuario;
    private int fk_cliente;

    public int getCod_alteracao() {
        return cod_alteracao;
    }

    public void setCod_alteracao(int cod_alteracao) {
        this.cod_alteracao = cod_alteracao;
    }

    public String getTipo_alteracao() {
        return tipo_alteracao;
    }

    public void setTipo_alteracao(String tipo_alteracao) {
        this.tipo_alteracao = tipo_alteracao;
    }

    public int getHr_previstas() {
        return hr_previstas;
    }

    public void setHr_previstas(int hr_previstas) {
        this.hr_previstas = hr_previstas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getDt_entrega() {
        return dt_entrega;
    }

    public void setDt_entrega(String dt_entrega) {
        this.dt_entrega = dt_entrega;
    }

    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    public int getHr_producao() {
        return hr_producao;
    }

    public void setHr_producao(int hr_producao) {
        this.hr_producao = hr_producao;
    }

    public int getHr_teste() {
        return hr_teste;
    }

    public void setHr_teste(int hr_teste) {
        this.hr_teste = hr_teste;
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

    public int getFk_usuario() {
        return fk_usuario;
    }

    public void setFk_usuario(int fk_usuario) {
        this.fk_usuario = fk_usuario;
    }

    public int getFk_cliente() {
        return fk_cliente;
    }

    public void setFk_cliente(int fk_cliente) {
        this.fk_cliente = fk_cliente;
    }
}