/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifnmg.grupostrabalho;

import javax.ejb.Local;

/**
 *
 * @author Thiago Riquelmo
 */
@Local
public interface EnderecoBeanLocal {
    public void salvar(Endereco endereco);
}
