/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import dao.EmprestimoDAO;
import entidades.Autor;
import entidades.Emprestimo;
import factory.CriadorDeSessao;
import java.util.List;

/**
 *
 * @author gilmario
 */
public class EmprestimoServico {

    private EmprestimoDAO dao;

    public EmprestimoServico() {
        this.dao = new EmprestimoDAO(CriadorDeSessao.getSession());
    }

    public void salvar(Emprestimo e) {
        // Verificar se existe livro suficiente
        dao.saveOrUpdate(e);
    }

    public List<Emprestimo> listar(String leitor, String livro) {
        return dao.listar(leitor, livro);
    }

    public Emprestimo encontra(Long aLong) {
        return dao.carregar(aLong);
    }

}
