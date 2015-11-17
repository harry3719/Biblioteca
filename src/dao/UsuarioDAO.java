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
import entidades.Usuario;
import org.hibernate.Session;

public class UsuarioDAO extends DAO<Usuario> {

    public UsuarioDAO(Session session) {
        super(session, Usuario.class);
    }

}
