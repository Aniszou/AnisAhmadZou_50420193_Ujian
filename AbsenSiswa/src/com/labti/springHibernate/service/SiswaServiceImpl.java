/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.springHibernate.service;

import com.labti.springHibernate.model.Siswa;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.labti.springHibernate.dao.SiswaDAO;

@Service("MahasiswaService")
@Transactional(readOnly = true)

public class SiswaServiceImpl implements SiswaService {
    @Autowired
    private SiswaDAO mahasiswaDao;
    
    @Transactional
    @Override
    public void save(Siswa mahasiswa) {
	mahasiswaDao.save(mahasiswa);
    }
    
    @Transactional
    @Override
    public void update(Siswa mahasiswa) {
	mahasiswaDao.update(mahasiswa);
    }
    
    @Transactional
    @Override
    public void delete(Siswa mahasiswa) {
	mahasiswaDao.delete(mahasiswa);
    }
    
    @Override
    public Siswa getMahasiswa(String npm) {
	return mahasiswaDao.getSiswa(npm);
    }
    
    @Override
    public List<Siswa> getMahasiswas() {
	return mahasiswaDao.getSiswas();
    }

    @Override
    public List<Siswa> getSiswas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
