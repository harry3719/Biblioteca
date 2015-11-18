/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Paulo
 */
import entidades.Leitor;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

public class LeitorDAO extends DAO<Leitor> {

    public LeitorDAO(Session session) {
        super(session, Leitor.class);
    }

    public List<Leitor> buscar(String nome, String cpf) {
        return getSession().createCriteria(Leitor.class).add(Restrictions.ilike("nome", nome, MatchMode.START)).add(Restrictions.ilike("cpf", cpf, MatchMode.START)).list();
    }

}
