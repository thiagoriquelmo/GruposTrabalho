/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.grupostrabalho;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author Thiago Riquelmo
 */
@Entity
public class Endereco implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(length = 150)
    private String lagradouro;
    
    private Integer numero;
    
    @Column(length = 25)
    private String bairro;
    
    @Enumerated(EnumType.ORDINAL)
    private TipoLagradouro tipoLagradouro;

    public Endereco(String lagradouro, Integer numero, String bairro, TipoLagradouro tipoLagradouro) {
        this.lagradouro = lagradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.tipoLagradouro = tipoLagradouro;
    }

    public Endereco() {
    }
        
    

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLagradouro() {
        return lagradouro;
    }

    public void setLagradouro(String lagradouro) {
        this.lagradouro = lagradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public TipoLagradouro getTipoLagradouro() {
        return tipoLagradouro;
    }

    public void setTipoLagradouro(TipoLagradouro tipoLagradouro) {
        this.tipoLagradouro = tipoLagradouro;
    }
    //</editor-fold>
    
    
}
