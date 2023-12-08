/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.springHibernate.configuration;

import com.labti.springHibernate.model.Siswa;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class SiswaTableModel extends AbstractTableModel {
    private List<Siswa> swsa = new ArrayList<>();
    private final String HEADER[] = {"Npm", "Nama", "Kelas", "Alamat"};
    
    public SiswaTableModel(List<Siswa> sws) {
	this.swsa = sws;
    }
    
    @Override
    public int getRowCount() {
	return swsa.size();
    }
    
    @Override
    public int getColumnCount() {
	return HEADER.length;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
	return HEADER[columnIndex];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
	Siswa sws = swsa.get(rowIndex);
            switch (columnIndex) {
		case 0:
                    return sws.getNpm();
		case 1:
                    return sws.getNama();
		case 2:
                    return sws.getKelas();
		case 3:
                    return sws.getAlamat();
		default:
                    return null;
		}
    }
}
