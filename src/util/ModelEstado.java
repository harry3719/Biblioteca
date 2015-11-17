/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import entidades.Estado;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import servico.EstadoServico;

/**
 *
 * @author Paulo
 */
public class ModelEstado {
    
    public static ComboBoxModel getModelo() {
        EstadoServico servico = new EstadoServico();
        List<Estado> ufs = servico.listar();
        DefaultComboBoxModel<Object> model = new DefaultComboBoxModel<>();
        model.addElement(" -- Selecione --");
        for (Estado uf : ufs) {
            model.addElement(uf);
        }
        return model;
    }
    
}
