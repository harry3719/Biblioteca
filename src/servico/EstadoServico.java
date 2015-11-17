/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import dao.EstadoDAO;
import entidades.Estado;
import factory.CriadorDeSessao;
import java.util.List;

/**
 *
 * @author Paulo
 */
public class EstadoServico {
    
    private EstadoDAO dao;

    public EstadoServico() {
        dao = new EstadoDAO(CriadorDeSessao.getSession());
    }
    
    public void salvar(Estado estado){
        dao.saveOrUpdate(estado);
    }

    public List<Estado> listar() {
        return dao.listar();
    }
    
    
}
