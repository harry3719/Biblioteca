/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Emprestimo;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Paulo
 */
public class EmprestimoDAO extends DAO<Emprestimo> {

    public EmprestimoDAO(Session session) {
        super(session, Emprestimo.class);
    }

    public List<Emprestimo> listar(String leitor, String livro) {
        return getSession().createQuery("SELECT e FROM Emprestimo e WHERE e.livro.titulo LIKE :livro AND e.usuario.nome LIKE :leitor")
                .setParameter("livro", livro + "%")
                .setParameter("leitor", leitor + "%")
                .list();
    }

}
