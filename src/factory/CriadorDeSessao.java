/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import entidades.Pais;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Paulo
 */
public class CriadorDeSessao {
    
    private static Session session;
    private static SessionFactory factory;
    static {
        Configuration c = new Configuration();
        c.configure();
        
        factory = c.buildSessionFactory();
    }

    
    
    public static Session getSession(){
        if(session == null){
            session = factory.openSession();
        }
        return session;
    }
    
    public static void fecharSession(){
        session.disconnect();
        session.close();
    }
    
    
}
