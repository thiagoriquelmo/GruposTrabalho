/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package br.edu.ifnmg.grupostrabalho;

import java.time.LocalDate;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 *
 * @author Thiago Riquelmo
 */
@Singleton
@Startup
public class CargaDados implements CargaDadosLocal {

    @Inject
    PessoaBeanLocal pessoaBean;
    
    @Inject
    EnderecoBeanLocal enderecoBean;
    
    @PostConstruct
    @Override
    public void popularBanco() {
        //Endereços
        Endereco e1 = new Endereco();
        e1.setLagradouro("RUA 1");
        e1.setNumero(1111);
        e1.setBairro("Bairro Humberto");
        e1.setLagradouro("RUA");
        
        Endereco e2 = new Endereco();
        e2.setLagradouro("AVENIDA 2");
        e2.setNumero(2222);
        e2.setBairro("Bairro Doisberto");
        e2.setLagradouro("AVENIDA");
        
        Endereco e3 = new Endereco();
        e3.setLagradouro("AVENIDA 3");
        e3.setNumero(3333);
        e3.setBairro("Bairro Trêsberto");
        e3.setLagradouro("AVENIDA");
        
        Endereco e4 = new Endereco();
        e4.setLagradouro("PRACA 4");
        e4.setNumero(4444);
        e4.setBairro("Bairro Quatroberto");
        e4.setLagradouro("PRACA");
        
        //Pessoas
        Pessoa p1 = new Pessoa();
        p1.setNome("Ana Zaira");
        p1.setEmail("ana@mail.caom");
        p1.setNascimento(LocalDate.of(2001, 1, 1));
        
        Pessoa p2 = new Pessoa();
        p1.setNome("Beatriz Yana");
        p1.setEmail("beatriz@mail");
        p1.setNascimento(LocalDate.of(2002, 2, 2));
        
        Pessoa p3 = new Pessoa();
        p1.setNome("Cecília Xerxes");
        p1.setEmail("cecilia@mail.com");
        p1.setNascimento(LocalDate.of(2003, 3, 3));
        
        Pessoa p4 = new Pessoa();
        p1.setNome("Débora Wendel");
        p1.setEmail("debora@mail.com");
        p1.setNascimento(LocalDate.of(2004, 4, 4));
        
        
        
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
