/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.springHibernate.controller;

import com.labti.springHibernate.app;
import com.labti.springHibernate.configuration.SiswaTableModel;
import com.labti.springHibernate.model.Siswa;
import com.labti.springHibernate.view.ViewSiswa;
import java.util.List;
import javax.swing.JOptionPane;

public class SiswaController {
    private final ViewSiswa viewSiswa;
    private SiswaTableModel siswaTableModel;
    private List<Siswa> siswas;
    
    public SiswaController(ViewSiswa viewSiswa) {
        this.viewSiswa = viewSiswa;
    }
    
    public void tampilData() {
	siswas = app.getSiswaService().getSiswas();
	siswaTableModel = new SiswaTableModel(siswas);	
	this.viewSiswa.getTabel().setModel(siswaTableModel);
    }
    
    public void show() {
	int index = this.viewSiswa.getTabel().getSelectedRow();
	this.viewSiswa.getNpm().setText(String.valueOf(
	this.viewSiswa.getTabel().getValueAt(index, 0)));
	this.viewSiswa.getNama().setText(String.valueOf(
	this.viewSiswa.getTabel().getValueAt(index, 1)));
	this.viewSiswa.getKelas().setText(String.valueOf(
	this.viewSiswa.getTabel().getValueAt(index, 2)));
	this.viewSiswa.getAlamat().setText(String.valueOf(
	this.viewSiswa.getTabel().getValueAt(index, 3)));
    }
    
    public void clear() {
	this.viewSiswa.Npm().setText("");
	this.viewSiswa.Nama().setText("");
	this.viewSiswa.Kelas().setText("");
	this.viewSiswa.Alamat().setText("");
    }
    
    public void saveSiswa() {
	Siswa siswa = new Siswa();
	siswa.setNpm(this.viewSiswa.getNpm().getText());
	siswa.setNama(this.viewSiswa.getNama().getText());
	siswa.setKelas(this.viewSiswa.getKelas().getText());
	siswa.setAlamat(this.viewSiswa.getAlamat().getText());
	app.getSiswaService().save(siswa);
	JOptionPane.showMessageDialog(null, "Data Berhasil di Simpan", "info",
	JOptionPane.INFORMATION_MESSAGE);
        clear();
        tampilData();
    }
    
    public void updateSiswa() {
	Siswa siswa = new Siswa();
	siswa.setNpm(this.viewSiswa.getNpm().getText());
	siswa.setNama(this.viewSiswa.getNama().getText());
	siswa.setKelas(this.viewSiswa.getKelas().getText());
	siswa.setAlamat(this.viewSiswa.getAlamat().getText());
	app.getSiswaService().update(siswa);
	JOptionPane.showMessageDialog(null, "Data Berhasil di Edit", "info",
	JOptionPane.INFORMATION_MESSAGE);
	clear();
	tampilData();
    }
    
    public void deleteSiswa(){
        if(this.viewSiswa.getNpm().getText() == null){
            JOptionPane.showMessageDialog(null, "Mahasiswa belum dipilih", "error",JOptionPane.ERROR_MESSAGE);
        }else{
            Siswa siswa = new Siswa();
            siswa.setNpm(this.viewSiswa.getNpm().getText());
            int pilih = JOptionPane.showConfirmDialog(null,"Apakah data ingin dihapus ?", "Warning",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(pilih == JOptionPane.YES_OPTION){
                app.getSiswaService().delete(siswa);
                JOptionPane.showMessageDialog(null, "Data Berhasil di Hapus", "info",JOptionPane.INFORMATION_MESSAGE);
                clear();
                tampilData();
            }
        }
    }






}
