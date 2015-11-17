/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Paulo
 */
public class TabelaModelo extends DefaultTableModel {

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    public TabelaModelo() {
    }

    public TabelaModelo(Object[][] data, Object[] columnNames) {
        super(data, columnNames);
    }
}
