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
public class Estoque implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private ProdutoEstoque produtoEstoque;
    private int quantidade;
    private int quantidade_minima;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProdutoEstoque getProdutoEstoque() {
        return produtoEstoque;
    }

    public void setProdutoEstoque(ProdutoEstoque produtoEstoque) {
        this.produtoEstoque = produtoEstoque;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade_minima() {
        return quantidade_minima;
    }

    public void setQuantidade_minima(int quantidade_minima) {
        this.quantidade_minima = quantidade_minima;
    }
    
    
    
}
