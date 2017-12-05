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
public class TahunAjaran extends KoneksiDB{
    public int id_th;
    public String tahun_ajaran;
    public String semester;
    public int sta_aktif;
    
    public void select(){
        tblthajaran.setColumnIdentifiers(new Object[]{"ID. Tahun Ajaran", "Tahun Ajaran", 
        "Semester", "Status Aktif"});
        try{
            conn = getConnection();
            query = "select * from tbthajaran";
            stat = conn.prepareStatement(query);
            res = stat.executeQuery(query);
            list = new ArrayList<>();
            while(res.next()){
                id_th = res.getInt(1);
                tahun_ajaran = res.getString(2);
                semester = res.getString(3);
                sta_aktif = res.getInt(4);
                
                list.add(new Object[] {id_th, tahun_ajaran, semester, sta_aktif});
            }
            stat.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error method select() : " + ex);
        }
        
    }
    
    public void insert_update(){
        try{
            conn = getConnection();
            if(isUpdate == false){
            query = " insert into tbthajaran values (?,?,?,?)";
        }else{
            query = " update tbthajaran set id_th=?, tahun_ajaran=?, semester=?, sta_aktif "
                    + "where id_th='"+id_th+"' ";
            
        }
        stat = conn.prepareStatement(query);
        stat.setInt(1, id_th);
        stat.setString(2, tahun_ajaran);
        stat.setString(3, semester);
        stat.setInt(4, sta_aktif);
        stat.executeUpdate();
        stat.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error method insert_update() : " + ex);
        }
    }
    
    public void delete(int id_th){
        try{
            conn = getConnection();
            query = " delete from tbthajaran where id_th='"+id_th+"' ";
            stat = conn.prepareStatement(query);
            stat.executeUpdate();
            stat.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error method delete() : " + ex);
        }
    }
}
