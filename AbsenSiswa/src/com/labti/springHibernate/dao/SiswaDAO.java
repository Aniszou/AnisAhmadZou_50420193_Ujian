/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.springHibernate.dao;

import com.labti.springHibernate.model.Siswa;
import java.util.List;

public interface SiswaDAO {
    public void save(Siswa sws);
    public void update(Siswa sws);
    public void delete(Siswa sws);
    public Siswa getSiswa(String npm);
    public List<Siswa> getSiswas();

}
