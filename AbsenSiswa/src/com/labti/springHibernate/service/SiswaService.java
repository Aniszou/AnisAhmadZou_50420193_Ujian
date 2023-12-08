/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.springHibernate.service;

import com.labti.springHibernate.model.Siswa;
import java.util.List;

public interface SiswaService {
    public void save(Siswa mahasiswa);
    public void update(Siswa mahasiswa);
    public void delete(Siswa mahasiswa);
    public Siswa getMahasiswa(String npm);
    public List<Siswa> getMahasiswas();

    public List<Siswa> getSiswas();
}
