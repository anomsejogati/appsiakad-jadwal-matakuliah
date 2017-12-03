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
public class Dosen extends KoneksiDB{
    public int nik;
    public int kd_dosen;
    public int nip;
    public String nama_pegawai;
    public String jk;
    public String tmp_lahir;
    public String tgl_lahir;
    public String agama;
    public String alamat;
    public String no_telepon1;
    public String no_telepon2;
    public String email;
    public String tmt;
    public String nama_ibu;
    public String sta_menikah;
    public String jml_tanggungan;
    public String sta_pegawai;
    public String sta_aktif;
    
   public void select(){
       tbldosen.setColumnIdentifiers(new Object[]{"Nik", "Kode Dosen", "Nip", "Nama Pegawai",
           "Jenis Kelamin", "Tempat Lahir", "Tanggal Lahir", "Agama", "Alamat", "No. Telepon1",
           "No. Telepon2", "Email", "Tempat", "Nama Ibu", "Status Menikah", "Jumlah Tanggungan",
           "Status Pegawai", "Status Aktif"});
       try{
           conn = getConnection();
           query = "select * from tbdosen";
           stat =  conn.prepareStatement(query);
           res = stat.executeQuery(query);
           list = new ArrayList<>();
           while(res.next()){
               nik = res.getInt(1);
               kd_dosen = res.getInt(2);
               nip = res.getInt(3);
               nama_pegawai = res.getString(4);
               jk = res.getString(5);
               tmp_lahir = res.getString(6);
               agama = res.getString(7);
               alamat = res.getString(8);
               no_telepon1 = res.getString(9);
               no_telepon2 = res.getString(10);
               email = res.getString(11);
               tmt = res.getString(12);
               nama_ibu = res.getString(13);
               sta_menikah = res.getString(14);
               jml_tanggungan = res.getString(15);
               sta_pegawai = res.getString(16);
               sta_aktif = res.getString(17);
               list.add(new Object[]{nik, kd_dosen, nip, nama_pegawai, jk, tmp_lahir, agama, alamat, no_telepon1,
               no_telepon2, email, tmt, nama_ibu, sta_menikah, jml_tanggungan, sta_pegawai, sta_aktif});
               stat.close();
           }
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Error method select() : " + ex);
       }
   }
   public void insert_update(){
        try{
            conn = getConnection();
            if(isUpdate == false){
                query = " insert into tbdosen values(?,?,?,?,?,?,?,?,?,?) ";
            }else{
                query = " update tbdosen set nik=?, kd_dosen=?, "
                        + " nip=?, nama_pegawai=?, jk=?, "
                        + " tmp_lahir=?, agama=?, alamat=?, "
                        + " no_telepon1=?, no_telepon2=?, "
                        + " email=?, tmt=?, nama_ibu=?, "
                        + " sta_menikah=?, jml_tanggungan=?, "
                        + " sta_pegawai=?, sta_aktif=? "
                        + " where nik='"+kd_dosen+"' ";
            }
            stat = conn.prepareStatement(query);
            stat.setInt(1, nik);
            stat.setInt(2, kd_dosen);
            stat.setInt(3, nip);
            stat.setString(4, nama_pegawai);
            stat.setString(5, jk);
            stat.setString(6, tmp_lahir);
            stat.setString(7, agama);
            stat.setString(8, alamat);
            stat.setString(11, no_telepon1);
            stat.setString(12, no_telepon2);
            stat.setString(4, email);
            stat.setString(5, tmt);
            stat.setString(6, nama_ibu);
            stat.setString(7, sta_menikah);
            stat.setString(8, jml_tanggungan);
            stat.setString(11, sta_pegawai);
            stat.setString(12, sta_aktif);
            stat.executeUpdate();
            stat.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error method insert_update() : " + ex);
        }
    }
   
   public void delete(int nik){
        try{
            conn = getConnection();
            query = "delete from tbdosen where nik='"+kd_dosen+"' ";
            stat = conn.prepareStatement(query);
            stat.executeUpdate();
            stat.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
   
}
