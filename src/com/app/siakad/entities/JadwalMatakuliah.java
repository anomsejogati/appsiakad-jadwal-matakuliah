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
 * @author Ritky
 */
public class JadwalMatakuliah extends KoneksiDB{
    public int id_tk;
    public String semester;
    public int kd_prodi;
    public int id_kelas;
    public String kat_kelas;
    public String hari;
    public int id_sj;
    public int kd_mk;
    public int kd_dosen;
    public int kd_ruang;
    
    
   public void select(){
       tbldosen.setColumnIdentifiers(new Object[]{"Jadwal ", "Semester", "Kode Prodi",
           "Kelas","Kategori Kelas", "Hari","Set Jam", "Mata kuliah",
           "Kode Dosen", "Kode Ruang"});
       try{
           conn = getConnection();
           query = "select * from tbjadwalmk";
           stat =  conn.prepareStatement(query);
           res = stat.executeQuery(query);
           list = new ArrayList<>();
           while(res.next()){
               
               id_tk = res.getInt(1);
               semester = res.getString(2);
               kd_prodi = res.getInt(3);
               id_kelas = res.getInt(4);
               kat_kelas = res.getString(5);
               hari = res.getString(6);
               id_sj = res.getInt(7);
               kd_mk = res.getInt(8);
               kd_dosen = res.getInt(9);
               kd_ruang = res.getInt(10);
               
               list.add(new Object[]{id_tk, semester, kd_prodi, id_kelas, kat_kelas, hari, id_sj, kd_mk, 
                   kd_dosen, kd_ruang});
               stat.close();
           }
           
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Error mothod select (): "+ex);
       }
    }
   
   public void insert_update(){
        try{
            conn = getConnection();
            if(isUpdate == false){
                query = " insert into tbjadwalmk values(?,?,?,?,?,?,?,?,?,?) ";
            }else{
                query = " update tbjadwalmk set id_tk=?, semester=?, "
                        + " kd_prodi=?, id_kelas=?, kat_kelas=?, "
                        + " hari=?, id_sj=?, kd_mk=?, "
                        + " kd_dosen=?, kd_ruang=? "
                        + " where id_tk='"+id_kelas+"' ";
            }
            stat = conn.prepareStatement(query);
            stat.setInt(1, id_tk);
            stat.setString(2, semester);
            stat.setInt(3, kd_prodi);
            stat.setInt(4, id_kelas);
            stat.setString(5, kat_kelas);
            stat.setString(6, hari);
            stat.setInt(7, id_sj);
            stat.setInt(8, kd_mk);
            stat.setInt(11, kd_dosen);
            stat.setInt(12, kd_ruang);
            stat.executeUpdate();
            stat.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error method insert_update() : " + ex);
        }
    }
   
   public void delete(int id_tk){
        try{
            conn = getConnection();
            query = "delete from tbjadwalmatkul where id_tk='"+id_kelas+"' ";
            stat = conn.prepareStatement(query);
            stat.executeUpdate();
            stat.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
   
}

