/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.grupostrabalho;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

/**
 *
 * @author Thiago Riquelmo
 */
@Entity
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 65)
    private String nome;

    @Column(length = 250)
    private String email;

    @Column(columnDefinition = "DATE")
    private LocalDate nascimento;

    @Transient
    private Byte idade;

    @OneToOne(fetch = FetchType.EAGER, // padrão
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private Endereco endereco;

    

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JoinColumn(name = "pessoa_id")
    private List<Telefone> telefones;

    @OneToMany(mappedBy = "pessoa",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<Atuacao> atuacoes;
    
    public Pessoa() {
        
        telefones = new ArrayList<>();
        atuacoes = new ArrayList<>();
    }

    public Pessoa(String nome, String email, LocalDate nascimento, Byte idade, Endereco endereco, List<Telefone> telefones, List<Atuacao> atuacoes) {
        this.nome = nome;
        this.email = email;
        this.nascimento = nascimento;
        this.idade = idade;
        this.endereco = endereco;
        this.telefones = telefones;
        this.atuacoes = atuacoes;
    }

    

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public Byte getIdade() {
        return idade;
    }

    public void setIdade(Byte idade) {
        this.idade = idade;
    }
    //</editor-fold>

}
