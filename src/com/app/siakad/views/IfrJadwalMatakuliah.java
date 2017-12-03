/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.siakad.entities.Forms;

import com.app.siakad.database.KoneksiDB;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ritky
 */
public class IfrJadwalMatakuliah extends javax.swing.JInternalFrame {
    
    KoneksiDB getCnn = new KoneksiDB();     //deklarasi Object untuk koneksi Database
    Connection _Cnn;
    
    // deklarasikan variabel yang dibutuhkan
    
    String sqlselect, sqlinsert, sqldelete ;
    String vid_tk, vsemester, vkd_prodi, vid_kelas, kat_kelas, vhari, id_sj, vkd_mk, vkd_dosen, vkd_ruang ;
    
    private DefaultTableModel tbJadwalMatakuliah ;
    SimpleDateFormat tglinput = new SimpleDateFormat ("yyyy,MM,dd");
    SimpleDateFormat tglview = new SimpleDateFormat ("dd,MM,yyyy");
    private DefaultTableModel tbljadwalmatakuliah;
    
    /**
     * Creates new form IfrJadwalMatakuliah
     */
    public IfrJadwalMatakuliah() {
        initComponents();
    }
    
    private void clearInput(){
        cmbThnAjaran.setSelectedIndex(0);
        cmbSemester.setSelectedIndex(0);
        cmbProdi.setSelectedIndex(0);
        cmbKtgKls.setSelectedIndex(0);
        cmbHari.setSelectedIndex(0);
        txtJam.setText("");
        cmbNmMatKul.setSelectedIndex(0);
        cmbNmDosen.setSelectedIndex(0);
        cmbNmRuang.setSelectedIndex(0);
        btnSimpan.setText("Simpan");
        
    }
    private void setTableJadwalMatakuliah(){
        String[] kolom1 = {"Tahun ajaran", "Semester", "Prodi", "Kategori Kelas", "Hari",
            "Jam", "Nama Matakuliah", "Nama Dosen", "Nama Ruang"};
        tbljadwalmatakuliah = new DefaultTableModel(null, kolom1){
            Class[] types = new Class[]{
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class
            };
            public Class getColumnClass (int columnIndex){
                return types [columnIndex];
            }
            //Agar tabel tidak bisa diEdit
            public boolean isCellEditable(int row, int col){
                int colla = tbljadwalmatakuliah.getColumnCount();
                return (col < colla) ? false : true ;
            }
        };
        tbDataJadwalMatakuliah.setModel(tbljadwalmatakuliah);
        tbDataJadwalMatakuliah.getColumnModel().getColumn(0).setPreferredWidth(75);
        tbDataJadwalMatakuliah.getColumnModel().getColumn(1).setPreferredWidth(250);
        tbDataJadwalMatakuliah.getColumnModel().getColumn(2).setPreferredWidth(25);
        tbDataJadwalMatakuliah.getColumnModel().getColumn(3).setPreferredWidth(175);
        tbDataJadwalMatakuliah.getColumnModel().getColumn(4).setPreferredWidth(75);
        tbDataJadwalMatakuliah.getColumnModel().getColumn(5).setPreferredWidth(75);
        tbDataJadwalMatakuliah.getColumnModel().getColumn(6).setPreferredWidth(175);
        tbDataJadwalMatakuliah.getColumnModel().getColumn(7).setPreferredWidth(300);
        tbDataJadwalMatakuliah.getColumnModel().getColumn(8).setPreferredWidth(275);
    }
    
    private void clearTableJadwalMatakuliah(){
        int row = tbljadwalmatakuliah.getRowCount();
        for(int i=0; i<row; i++){
            tbljadwalmatakuliah.removeRow(0);
        }
    }
    private void showDataJadwalMatakuliah(){
        try{
            _Cnn = null;
            _Cnn = getCnn.getConnection();
            
            // Di sini belum di masukan nama atribut pada jadwal matakuliah
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(this, "Error Method showJadwalMatakuliah() : "+ex);
        }
    }
    private void getJadwalMatakuliah(){
        
    }
    
    String[] KeyTK ;
    private void listTK(){
        
    }
    String[] KeyProdi;
    private void listProdi(){
        
    }
    String[] KeyKelas;
    private void listKelas(){
        
    }
    String[] KeySJ;
    private void listSJ(){
        
    }
    String[] KeyMK;
    private void listMK(){
        
    }
    String[] KeyDosen;
    private void listDosen(){
        
    }
    String[] KeyRuang;
    private void listRuang(){
        
    }
    private void aksiSimpan(){
        
    }
    private void aksiHapus(){
        
    }
    private void aksiKeluar(){
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbThnAjaran = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbSemester = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbProdi = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbKtgKls = new javax.swing.JComboBox<>();
        cmbHari = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cmbNmMatKul = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmbNmDosen = new javax.swing.JComboBox<>();
        cmbNmRuang = new javax.swing.JComboBox<>();
        txtJam = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDataJadwalMatakuliah = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnTambah = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();

        setClosable(true);
        setTitle(".: Jadwal Matakuliah");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/siakad/entities/Forms/Image/Admin-Schoolar-Icon.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Input :"));
        jPanel1.setOpaque(false);

        cmbThnAjaran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " --- Pilih ---" }));
        cmbThnAjaran.setBorder(null);
        cmbThnAjaran.setOpaque(false);

        jLabel1.setText("Tahun Ajaran");

        jLabel2.setText("Semester");

        cmbSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " -- Pilih --", "1", "2", "3", "4", "5", "6", "7", "8" }));

        jLabel3.setText("Prodi");

        cmbProdi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " -- Pilih --", "Teknik Informatika", "Teknik Kimia", "Teknik Mesin" }));
        cmbProdi.setOpaque(false);

        jLabel4.setText("Kategori Kelas");

        jLabel5.setText("Hari");

        jLabel6.setText("Jam");

        cmbKtgKls.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " -- Pilih --" }));
        cmbKtgKls.setOpaque(false);

        cmbHari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --", "Senin", "Selasa", "Rabu", "Kamis", "Jumat" }));
        cmbHari.setOpaque(false);

        jLabel8.setText("Nama Matakuliah");

        cmbNmMatKul.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --", "Pemrogaman", "Proyek 3", "Arkom", "Basis Data" }));

        jLabel9.setText("Nama Dosen");

        jLabel10.setText("Nama Ruang");

        cmbNmDosen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " -- Pilih --", "Anom Sejogati, S.Kom", "M. Rizaludin, M.Kom", "Imam Prayogo Pujiono, S.Kom" }));
        cmbNmDosen.setOpaque(false);

        cmbNmRuang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --", "Teori", "Lab 1", "Lab 2" }));
        cmbNmRuang.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbSemester, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbThnAjaran, 0, 112, Short.MAX_VALUE)
                    .addComponent(cmbProdi, 0, 0, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(txtJam, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbKtgKls, 0, 96, Short.MAX_VALUE)
                            .addComponent(cmbHari, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbNmMatKul, 0, 112, Short.MAX_VALUE)
                    .addComponent(cmbNmDosen, 0, 1, Short.MAX_VALUE)
                    .addComponent(cmbNmRuang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbThnAjaran, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbKtgKls, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbNmMatKul, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbHari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbNmDosen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbNmRuang)
                    .addComponent(cmbProdi)
                    .addComponent(txtJam)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(14, 14, 14))
        );

        tbDataJadwalMatakuliah.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tahun Ajaran", "Semester", "Prodi", "Kategori Kelas", "Hari", "Jam", "Nama Matakuliah", "Nama Dosen", "Nama Ruang"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbDataJadwalMatakuliah);
        if (tbDataJadwalMatakuliah.getColumnModel().getColumnCount() > 0) {
            tbDataJadwalMatakuliah.getColumnModel().getColumn(4).setMinWidth(20);
            tbDataJadwalMatakuliah.getColumnModel().getColumn(6).setMinWidth(20);
        }

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Navigasi :"));
        jPanel2.setOpaque(false);

        btnTambah.setText("Tambah");
        btnTambah.setOpaque(false);

        btnSimpan.setText("Simpan");

        btnHapus.setText("Hapus");

        btnKeluar.setText("Keluar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKeluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox<String> cmbHari;
    private javax.swing.JComboBox<String> cmbKtgKls;
    private javax.swing.JComboBox<String> cmbNmDosen;
    private javax.swing.JComboBox<String> cmbNmMatKul;
    private javax.swing.JComboBox<String> cmbNmRuang;
    private javax.swing.JComboBox<String> cmbProdi;
    private javax.swing.JComboBox<String> cmbSemester;
    private javax.swing.JComboBox<String> cmbThnAjaran;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDataJadwalMatakuliah;
    private javax.swing.JTextField txtJam;
    // End of variables declaration//GEN-END:variables
}
