/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Editora;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Paulo
 */
public class EditoraDAO extends DAO<Editora> {

    public EditoraDAO(Session session) {
        super(session, Editora.class);
    }

    public List<Editora> listar(String nome) {
        return getSession().createCriteria(Editora.class).add(Restrictions.ilike("nome", nome, MatchMode.ANYWHERE)).list();
    }

}
