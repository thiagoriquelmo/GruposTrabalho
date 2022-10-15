/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package br.edu.ifnmg.grupostrabalho;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Thiago Riquelmo
 */
@Stateless
public class AtuacaoBean implements AtuacaoBeanLocal{

    @PersistenceContext(unitName = "GruposTrabalhoPU")
    EntityManager entityManager;

    @Override
    public void salvar(Atuacao atuacao) {
        System.out.println(">> Salvar nova atuacao");
        entityManager.persist(atuacao);
    }

}
