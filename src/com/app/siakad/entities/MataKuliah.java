
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.siakad.entities;

import com.app.siakad.database.KoneksiDB;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DEVI
 */
public class MataKuliah extends KoneksiDB{
    public String kd_mk;
    public String kd_kmk;
    public int tahun_kur;
    public String kd_prodi;
    public String nama_mk;
    public int smt;
    public int sks_t;
    public int sks_p;
    public int jam_t;
    public int jam_p;
    
    public void select(){
        tbldosen.setColumnIdentifiers(new Object[]{"Tahun Kurikulum", "Jurusan", "Program Studi", 
           "Kode Matakuliah", "Nama Matakuliah", "Semester", "SKS Teori","SKS Praktek", 
           "Jam Teori", "Jam Praktek"});
    
    try{
        conn = getConnection();
        query = "select * from tbmatakuliah a, tblmstkelompokmk b, tbprodi c "
                    + " where a.kd_kmk=b.kd_kmk and a.kd_prodi=c.kd_prodi order by a.kd_prodi";
        stat = conn.prepareStatement(query);
        res = stat.executeQuery(query);
        list = new ArrayList<>();
        while(res.next()){
            kd_mk = res.getString(kd_mk);
            kd_kmk = res.getString(kd_kmk);
            tahun_kur = res.getInt(tahun_kur);
            kd_prodi = res.getString(kd_prodi);
            nama_mk = res.getString(nama_mk);
            smt = res.getInt(smt);
            sks_t = res.getInt(sks_t);
            sks_p = res.getInt(sks_p);
            jam_t = res.getInt(jam_t);
            jam_p = res.getInt(jam_p);
            
            list.add(new Object[]{kd_mk, kd_kmk, tahun_kur, kd_prodi, nama_mk, smt, sks_t, sks_p, jam_t, jam_p});
            stat.close();
        }
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "Error method select : " + ex);
        }
    }
    
    public void insert_update(){
        try{
            conn = getConnection();
            if(isUpdate == false){
                query = " insert into tbmatakuliah values(?,?,?,?,?,?,?,?,?,?) ";
            }else{
                query = " update tbmatakuliah set kd_mk=?, kd_kmk=?, "
                        + " tahun_kur=?, kd_prodi=?, nama_mk=?, "
                        + " smt=?, sks_t=?, sks_p=?, "
                        + " jam_t=?, jam_p=? "
                        + " where kd_mk='"+kd_kmk+"' ";
            }
            stat = conn.prepareStatement(query);
            stat.setString(1, kd_mk);
            stat.setString(2, kd_kmk);
            stat.setInt(3, tahun_kur);
            stat.setString(4, kd_prodi);
            stat.setString(5, nama_mk);
            stat.setInt(6, smt);
            stat.setInt(7, sks_t);
            stat.setInt(8, sks_p);
            stat.setInt(11, jam_t);
            stat.setInt(12, jam_p);
            stat.executeUpdate();
            stat.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error method insert_update() : " + ex);
        }
    }
    
    public void delete(int kd_mk){
        try{
            conn = getConnection();
            query = "delete from tbmatakuliah where kd_mk='"+kd_kmk+"' ";
            stat = conn.prepareStatement(query);
            stat.executeUpdate();
            stat.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}
