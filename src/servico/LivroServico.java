/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import dao.LivroDAO;
import entidades.Livro;
import factory.CriadorDeSessao;
import java.util.List;

/**
 *
 * @author Paulo
 */
public class LivroServico {

    private LivroDAO dao;

    public LivroServico() {
        dao = new LivroDAO(CriadorDeSessao.getSession());
    }

    public void salvar(Livro livro) {
        dao.saveOrUpdate(livro);
    }

    public List<Livro> buscar(String autor, String isbn) {
        return dao.buscar(autor, isbn);
    }

}
