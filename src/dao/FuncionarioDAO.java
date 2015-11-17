/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Funcionario;
import org.hibernate.Session;

/**
 *
 * @author Paulo
 */
public class FuncionarioDAO extends DAO<Funcionario> {

    public FuncionarioDAO(Session session) {
        super(session, Funcionario.class);
    }

    public Funcionario login(String login, String senha) {
        return (Funcionario) getSession().createQuery("SELECT a FROM Funcionario a WHERE a.nome =:nome AND a.senha =:senha ")
                .setParameter("nome", login)
                .setParameter("senha", senha)
                .uniqueResult();
    }

}
