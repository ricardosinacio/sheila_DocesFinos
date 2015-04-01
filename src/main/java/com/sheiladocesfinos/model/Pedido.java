/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sheiladocesfinos.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author ricardo
 */
public class Pedido implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private Long codigo;
    private Usuario nomeCliente;
    private List<Produto> produtos;
    private Timestamp data_entrega;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Usuario getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(Usuario nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    public Timestamp getData_entrega() {
        return data_entrega;
    }

    public void setData_entrega(Timestamp data_entrega) {
        this.data_entrega = data_entrega;
    }
    
    
    
}
