/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import dao.UsuarioDAO;
import entidades.Usuario;
import factory.CriadorDeSessao;

/**
 *
 * @author Paulo
 */
public class UsuarioServico {

    private UsuarioDAO dao;

    public UsuarioServico() {
        dao = new UsuarioDAO(CriadorDeSessao.getSession());
    }

    public void salvar(Usuario usuario) {

        dao.saveOrUpdate(usuario);
    }
}
