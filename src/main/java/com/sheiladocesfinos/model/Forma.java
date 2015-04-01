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
class Forma implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private String tipo;
    private String bandeira;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }
    
    
    
}
