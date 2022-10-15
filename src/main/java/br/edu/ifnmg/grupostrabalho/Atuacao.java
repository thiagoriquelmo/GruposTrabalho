/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.grupostrabalho;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Thiago Riquelmo
 */
@Entity
public class Atuacao {
    @Id
    private Long id;
    
    @Column(columnDefinition = "DATE")
    private LocalDate inicio;
    
    @Column(columnDefinition = "DATE")
    private LocalDate termino;
    
    @ManyToOne(fetch = FetchType.LAZY, // padrão
            cascade = CascadeType.ALL)
    @JoinColumn(name = "alocacao_id")
    private Pessoa pessoa;
    
    @ManyToOne(fetch = FetchType.LAZY, // padrão
            cascade = CascadeType.ALL)
    @JoinColumn(name = "alocacao_id")
    private Grupo grupo;

    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getTermino() {
        return termino;
    }

    public void setTermino(LocalDate termino) {
        this.termino = termino;
    }
    //</editor-fold>
}
