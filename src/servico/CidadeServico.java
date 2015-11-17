/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import dao.CidadeDAO;
import entidades.Cidade;
import entidades.Estado;
import factory.CriadorDeSessao;
import java.util.List;

/**
 *
 * @author Paulo
 */
public class CidadeServico {
    private CidadeDAO dao;
    
    public CidadeServico(){
        dao = new CidadeDAO(CriadorDeSessao.getSession());
    }

    
    public void salvar(Cidade cidade){
        dao.saveOrUpdate(cidade);
    }

    public List<Cidade> listar(Estado estado) {
        return dao.listar(estado);
    }
}
