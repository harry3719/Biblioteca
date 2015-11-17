/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Estado;
import org.hibernate.Session;

/**
 *
 * @author Paulo
 */
public class EstadoDAO extends DAO<Estado>{

    public EstadoDAO(Session session) {
        super(session, Estado.class);
    }
    
}
