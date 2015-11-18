/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import dao.AutorDAO;
import entidades.Autor;
import factory.CriadorDeSessao;
import java.util.List;

/**
 *
 * @author Paulo
 */
public class AutorServico {

    private AutorDAO dao;

    public AutorServico() {
        dao = new AutorDAO(CriadorDeSessao.getSession());
    }

    public void salvar(Autor autor) {
        dao.saveOrUpdate(autor);
    }

    public List<Autor> listar(String nome) {
        return dao.listar(nome);
    }

    public Autor encontra(Long aLong) {
        return dao.carregar(aLong);
    }

}
