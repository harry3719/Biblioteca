/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import dao.LeitorDAO;
import entidades.Leitor;
import factory.CriadorDeSessao;
import java.util.List;

/**
 *
 * @author Paulo
 */
public class LeitorServico {

    private LeitorDAO dao;

    public LeitorServico() {
        dao = new LeitorDAO(CriadorDeSessao.getSession());
    }

    public void salvar(Leitor usuario) {

        dao.saveOrUpdate(usuario);
    }

    public List<Leitor> buscar(String nome, String cpf) {
        return dao.buscar(nome, cpf);
    }

    public Leitor encontra(Long aLong) {
        return dao.carregar(aLong);
    }
}
