/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Estado;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Paulo
 */
public class EstadoDAO extends DAO<Estado> {

    public EstadoDAO(Session session) {
        super(session, Estado.class);
    }

    public List<Estado> listar(String nome) {
        return getSession().createCriteria(Estado.class).add(Restrictions.ilike("nome", nome, MatchMode.ANYWHERE)).list();
    }

}
