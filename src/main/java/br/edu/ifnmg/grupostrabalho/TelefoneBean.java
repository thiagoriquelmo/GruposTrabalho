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
public class TelefoneBean implements TelefoneBeanLocal{

    @PersistenceContext(unitName = "GruposTrabalhoPU")
    EntityManager entityManager;

    @Override
    public void salvar(Telefone telefone) {
        System.out.println(">> Salvar novo Telefone");
        entityManager.persist(telefone);
    }

}
