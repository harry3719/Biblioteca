/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Paulo
 */
public abstract class DAO<T> {
    
    private final Session session;
    private Class classe;

    
    public DAO(Session session, Class classe) {
        this.session = session;
        this.classe = classe;
    }
    public List<T> listar(){
        return session.createCriteria(classe).list();
    }

    public Session getSession() {
        return session;
    }
    
    public void salvar(T t){
        session.save(t);
    }
    public void update(T t){
        session.update(t);
    }
    public void saveOrUpdate(T t){
        session.saveOrUpdate(t);
    }
    public void delete(T t){
        session.delete(t);
    }
    
    public Transaction abrirTransacao(){
        return session.beginTransaction();
    }
    
    
}
