/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import entidades.Cidade;
import entidades.Estado;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import servico.CidadeServico;
import servico.EstadoServico;

/**
 *
 * @author Paulo
 */
public class ModelCidade {
    
    public static ComboBoxModel getModelo(Estado estado) {
        CidadeServico servico = new CidadeServico();
        List<Cidade> cidades = servico.listar(estado);
        DefaultComboBoxModel<Object> model = new DefaultComboBoxModel<>();
        model.addElement(" -- Selecione --");
        for (Cidade cid : cidades) {
            model.addElement(cid);
        }
        return model;
    }
}
