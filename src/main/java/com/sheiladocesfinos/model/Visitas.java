/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sheiladocesfinos.model;

import java.io.Serializable;

/**
 *
 * @author ricardo
 */
public class Visitas implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private Local nome_local;
    private String responsavel;
    private int visitas;
    private int indicacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Local getNome_local() {
        return nome_local;
    }

    public void setNome_local(Local nome_local) {
        this.nome_local = nome_local;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public int getVisitas() {
        return visitas;
    }

    public void setVisitas(int visitas) {
        this.visitas = visitas;
    }

    public int getIndicacao() {
        return indicacao;
    }

    public void setIndicacao(int indicacao) {
        this.indicacao = indicacao;
    }
    
    
    
}
