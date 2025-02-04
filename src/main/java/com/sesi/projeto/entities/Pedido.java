package com.sesi.projeto.entities;

import java.time.Instant;

import com.sesi.projeto.dto.PedidoDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "pedido")
public class Pedido {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant momento;
    private StatusDoProduto status;

    public Pedido(Long id, Instant momento, StatusDoProduto status) {
        this.id = id;
        this.momento = momento;
        this.status = status;
    }

    public Pedido() {
    }

    public Pedido(PedidoDTO dtopedido){
        this.momento = dtopedido.momento();
        this.status = dtopedido.status();
    }

    public StatusDoProduto getStatus() {
        return status;
    }

    public void setStatus(StatusDoProduto status) {
        this.status = status;
    }

    public Instant getMomento() {
        return momento;
    }

    public void setMomento(Instant momento) {
        this.momento = momento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
