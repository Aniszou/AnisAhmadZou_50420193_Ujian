/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.springHibernate.dao;

import com.labti.springHibernate.model.Siswa;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class SiswaDAOImpl implements SiswaDAO {
    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void save(Siswa mahasiswa) {
	sessionFactory.getCurrentSession().save(mahasiswa);
    }
    
    @Override
    public void update(Siswa mahasiswa) {
	sessionFactory.getCurrentSession().update(mahasiswa);
    }
    
    @Override
    public void delete(Siswa mahasiswa) {
	sessionFactory.getCurrentSession().delete(mahasiswa);
    }
    
    @Override
    public Siswa getSiswa(String npm) {
	return (Siswa) sessionFactory.getCurrentSession().get(Siswa.class, npm);
    }
    
    @Override
    public List<Siswa> getSiswas() {
	return sessionFactory.getCurrentSession().createCriteria(Siswa.class).list();
    }

}
