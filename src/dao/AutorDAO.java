/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Autor;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Paulo
 */
public class AutorDAO extends DAO<Autor> {

    public AutorDAO(Session session) {
        super(session, Autor.class);
    }

    public List<Autor> listar(String nome) {
        return getSession().createCriteria(Autor.class).add(Restrictions.ilike("nome", nome, MatchMode.ANYWHERE)).list();
    }

}
