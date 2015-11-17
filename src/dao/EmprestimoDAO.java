/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Emprestimo;
import org.hibernate.Session;

/**
 *
 * @author Paulo
 */
public class EmprestimoDAO extends DAO<Emprestimo> {

    public EmprestimoDAO(Session session) {
        super(session, Emprestimo.class);
    }

}
