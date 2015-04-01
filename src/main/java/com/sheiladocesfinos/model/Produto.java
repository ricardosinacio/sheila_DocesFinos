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
public class Produto implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private String nomeProd;
    private double valorCento;
    private TipoProduto tipo_prod;
    private int quantidade;
    private double valor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public double getValorCento() {
        return valorCento;
    }

    public void setValorCento(double valorCento) {
        this.valorCento = valorCento;
    }

    public TipoProduto getTipo_prod() {
        return tipo_prod;
    }

    public void setTipo_prod(TipoProduto tipo_prod) {
        this.tipo_prod = tipo_prod;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
    
    
    
    
}
