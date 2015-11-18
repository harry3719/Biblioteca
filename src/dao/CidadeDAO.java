/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Cidade;
import entidades.Editora;
import entidades.Estado;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Paulo
 */
public class CidadeDAO extends DAO<Cidade> {

    public CidadeDAO(Session session) {
        super(session, Cidade.class);
    }

    public List<Cidade> listar(Estado estado) {
        return getSession().createCriteria(Cidade.class).add(Restrictions.eq("estado", estado)).list();
    }

    public List<Cidade> listar(String nome) {
        return getSession().createCriteria(Cidade.class).add(Restrictions.ilike("nome", nome, MatchMode.ANYWHERE)).list();

    }

}
