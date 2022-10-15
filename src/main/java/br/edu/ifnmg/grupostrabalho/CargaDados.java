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
        //ENDEREÇOS
        Endereco e1 = new Endereco();
        e1.setLagradouro("RUA 1");
        e1.setNumero(1111);
        e1.setBairro("Bairro Humberto");
        e1.setLagradouro("RUA");
        enderecoBean.salvar(e1);
        
        Endereco e2 = new Endereco();
        e2.setLagradouro("AVENIDA 2");
        e2.setNumero(2222);
        e2.setBairro("Bairro Doisberto");
        e2.setLagradouro("AVENIDA");
        enderecoBean.salvar(e2);
        
        Endereco e3 = new Endereco();
        e3.setLagradouro("AVENIDA 3");
        e3.setNumero(3333);
        e3.setBairro("Bairro Trêsberto");
        e3.setLagradouro("AVENIDA");
        enderecoBean.salvar(e3);
        
        Endereco e4 = new Endereco();
        e4.setLagradouro("PRACA 4");
        e4.setNumero(4444);
        e4.setBairro("Bairro Quatroberto");
        e4.setLagradouro("PRACA");
        enderecoBean.salvar(e4);
        
        //PESSOAS
        Pessoa p1 = new Pessoa();
        p1.setNome("Ana Zaira");
        p1.setEmail("ana@mail.caom");
        p1.setNascimento(LocalDate.of(2001, 1, 1));
        p1.setEndereco(e1);
        pessoaBean.salvar(p1);
        
        Pessoa p2 = new Pessoa();
        p2.setNome("Beatriz Yana");
        p2.setEmail("beatriz@mail");
        p2.setNascimento(LocalDate.of(2002, 2, 2));
        p2.setEndereco(e2);
        pessoaBean.salvar(p2);
        
        Pessoa p3 = new Pessoa();
        p3.setNome("Cecília Xerxes");
        p3.setEmail("cecilia@mail.com");
        p3.setNascimento(LocalDate.of(2003, 3, 3));
        p3.setEndereco(e3);
        pessoaBean.salvar(p3);
        
        Pessoa p4 = new Pessoa();
        p4.setNome("Débora Wendel");
        p4.setEmail("debora@mail.com");
        p4.setNascimento(LocalDate.of(2004, 4, 4));
        p4.setEndereco(e4);        
        pessoaBean.salvar(p4);
        
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
