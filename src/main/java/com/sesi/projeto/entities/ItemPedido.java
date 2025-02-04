package com.sesi.projeto.entities;

import com.sesi.projeto.dto.PedidoDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "item_pedido")
public class ItemPedido {
    @Id
    private Long id;
    private Double preco;
    private int  quantidade;

    public ItemPedido(int quantidade, Double preco, Long id) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.id = id;
    }

    public ItemPedido() {
    }

    public ItemPedido(PedidoDTO dtoitempedido){
        this.quantidade = dtoitempedido.quantidade();
        this.preco = dtoitempedido.preco();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
