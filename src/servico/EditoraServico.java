/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import dao.EditoraDAO;
import entidades.Editora;
import factory.CriadorDeSessao;
import java.util.List;

/**
 *
 * @author Paulo
 */
public class EditoraServico {

    private EditoraDAO dao;

    public EditoraServico() {
        dao = new EditoraDAO(CriadorDeSessao.getSession());
    }

    public void salvar(Editora editora) {
        dao.saveOrUpdate(editora);
    }

    public List<Editora> listar(String nome) {
        return dao.listar(nome);
    }

    public Editora encontra(Long aLong) {
        return dao.carregar(aLong);
    }
}
