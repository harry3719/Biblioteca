/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Livro;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Paulo
 */
public class LivroDAO extends DAO<Livro> {

    public LivroDAO(Session session) {
        super(session, Livro.class);
    }

    public List<Livro> buscar(String autor, String isbn) {
        return getSession().createCriteria(Livro.class).add(Restrictions.ilike("autor", autor, MatchMode.START))
                .add(Restrictions.ilike("isbn", isbn)).list();

    }

}
