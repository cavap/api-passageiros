package com.api.model;

import javax.persistence.*;

@Entity
public class Passageiro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
