/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skripsi;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Ulil_Mz
 */
public class form_penilaianharian extends javax.swing.JDialog {

    private static Connection con;

    /**
     * Creates new form form_penilaianharian
     */
    public form_penilaianharian(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        try {
            con = koneksidb.getConnection();
            System.out.println("Koneksi Sukses");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Masalah Koneksi");
        }
        setLocationRelativeTo(null);
        bersih();
        autokode();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        h_idpenilaian = new javax.swing.JTextField();
        h_idsantri = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        h_setoranke = new javax.swing.JTextField();
        h_namasantri = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        h_idpentashih = new javax.swing.JTextField();
        h_namapentashih = new javax.swing.JLabel();
        h_tanggal = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        h_cbsurat = new javax.swing.JComboBox();
        h_dari = new javax.swing.JTextField();
        h_sampai = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        h_nilai = new javax.swing.JTextField();
        h_keterangan = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        h_bttambah = new javax.swing.JButton();
        h_btedit = new javax.swing.JButton();
        h_bthapus = new javax.swing.JButton();
        bttt_bersih = new javax.swing.JButton();
        btttt_cari = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel1.setText("Id Penilaian");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel2.setText("No Induk");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel3.setText("Nama");

        h_idpenilaian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                h_idpenilaianKeyPressed(evt);
            }
        });

        h_idsantri.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                h_idsantriKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel5.setText("Setoran Ke");

        h_namasantri.setText(".........................");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel7.setText("Id. Pentashih");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel8.setText("Nama");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel9.setText("Tanggal");

        h_idpentashih.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                h_idpentashihKeyPressed(evt);
            }
        });

        h_namapentashih.setText("...........................");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel11.setText("Penilaian Harian Santri Tafiz Al-Qur'an");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel12.setText("Surat");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel13.setText("Dari");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel14.setText("Sampai");

        h_cbsurat.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        h_cbsurat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Al-Fatihah", "AL-BAQARAH", " ALI IMRAN", " ANNISA", " AL-MA`IDAH", " AL-AN'AM", " AL-A'RAF", " AL-ANFAL", " ATTAUBAH", " YUNUS", " HUD", " YUSUF", " ARRA'DU", " IBRAHIM", " AL-HIJRU", " ANNAHLU", " AL-ISRA", " AL-KAHFI", " MARYAM", " TOHA", " AL-ANBIYA", " AL-HAJJ", " AL-MU`MINUN", " ANNUR", " AL-FURQAN", " ASY-SYU'ARA", " ANNAMLU", " AL-QASHASH", " AL-'ANKABUT", " ARRUM", " LUQMAN", " ASSAJDAH", " AL-AHZAB", " SABA`", " FATHIR", " YASIN", " ASH-SHAFFAT", " SHAD", " AZZUMAR", " AL-MU`MIN", " FUSHSHILAT", " ASY-SYURA", " AZZUKHRUF", " ADDUKHAN", " AL-JATSIYAH", " AL-AHQAF", " MUHAMMAD", " AL-FATHU", " AL-HUJURAT", " QAF", " ADZ-DZARIYAT", " ATH-THUR", " ANNAJMU", " AL-QAMAR", " ARRAHMAN", " AL-WAQI'AH", " AL-HADID", " AL-MUJADILAH", " AL-HASYR", " AL-MUMTAHANAH", " ASH-SHAF", " AL-JUMU'AH", " AL-MUNAFIQUN", " ATTAGHABUN", " ATH-THALAQ", " ATTAHRIM", " AL-MULKU", " AL-QALAM", " AL-HAQQAH", " AL-MA'ARIJ", " NUH", " AL-JINN", " AL-MUZAMMIL", " AL-MUDDATS-TSIR", " AL-QIYAMAH", " AL-INSAN", " AL-MURSALAT", " ANNABA`", " ANNAZI'AT", " 'ABASA", " ATTAKWIR", " AL-INFITHAR", " ATTATHFIF", " AL-INSYIQAQ", " AL-BURUJ", " ATH-THARIQ", " AL-A'LA", " AL-GHASYIYAH", " AL-FAJR", " AL-BALAD", " ASY-SYAMSU", " AL-LAIL", " ADH-DHUHA", " AL-INSYIRAH", " ATTIN", " AL-'ALAQ", " AL-QADAR", " AL-BAYYINAH", " AZZILZAL", " AL-'ADIYAT", " AL-QARI'AH", " ATTAKATSUR", " AL-'ASHR", " AL-HUMAZAH", " AL-FIL", " QURAISY", " AL-MA'UN", " AL-KAUTSAR", " AL-KAFIRUN", " ANNASHRU", " ALLAHAB", " AL-IKHLASH", " AL-FALAQ", " ANNAS", " " }));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel15.setText("Nilai");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel16.setText("Keterangan");

        h_nilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h_nilaiActionPerformed(evt);
            }
        });
        h_nilai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                h_nilaiKeyPressed(evt);
            }
        });

        h_keterangan.setText("...............");

        h_bttambah.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        h_bttambah.setText("TAMBAH");
        h_bttambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h_bttambahActionPerformed(evt);
            }
        });

        h_btedit.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        h_btedit.setText("EDIT");
        h_btedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h_bteditActionPerformed(evt);
            }
        });

        h_bthapus.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        h_bthapus.setText("HAPUS");
        h_bthapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h_bthapusActionPerformed(evt);
            }
        });

        bttt_bersih.setText("Bersih");
        bttt_bersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttt_bersihActionPerformed(evt);
            }
        });

        btttt_cari.setText("Cari");
        btttt_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btttt_cariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(26, 26, 26)
                                .addComponent(h_idpentashih, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(h_idsantri, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel9))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(h_idpenilaian, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(h_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(35, 35, 35)
                                        .addComponent(h_setoranke, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btttt_cari)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel8))
                                            .addGap(64, 64, 64)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(h_namapentashih, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(h_namasantri))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(h_dari, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(h_sampai)
                            .addComponent(h_cbsurat, 0, 1, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(h_nilai)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(h_keterangan)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(bttt_bersih)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(h_bttambah)
                .addGap(18, 18, 18)
                .addComponent(h_btedit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(h_bthapus, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(h_idpenilaian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(h_idsantri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btttt_cari)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(h_namasantri))))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(h_idpentashih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(h_namapentashih))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(h_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(h_setoranke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(h_cbsurat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(h_nilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(h_keterangan))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(h_dari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(h_sampai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(h_bttambah)
                    .addComponent(h_btedit)
                    .addComponent(h_bthapus)
                    .addComponent(bttt_bersih))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        setBounds(0, 0, 506, 573);
    }// </editor-fold>//GEN-END:initComponents

    private void h_nilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h_nilaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_h_nilaiActionPerformed

    private void h_idsantriKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_h_idsantriKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                String Cari = "select * from peserta_tahfidz where no_induk=?";
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql:///skripsi", "root", "");
                PreparedStatement UR = con.prepareStatement(Cari);
                UR.setString(1, h_idsantri.getText());
                ResultSet UL = UR.executeQuery();
                if (UL.next()) {
                    h_namasantri.setText(UL.getString(2));
                } else {
                    JOptionPane.showMessageDialog(this, "Data Tidak Ditemukan");
                    h_namasantri.setText(".........................");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_h_idsantriKeyPressed

    private void h_bttambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h_bttambahActionPerformed
        // TODO add your handling code here:
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String Tanggal = String.valueOf(sdf.format(h_tanggal.getDate()));
            String sql = "insert into penilaian values (?,?,?,?,?,?,?,?,?,?,?,?)";
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql:///skripsi", "root", "");
            PreparedStatement tl = koneksi.prepareStatement(sql);
            tl.setString(1, h_idpenilaian.getText());
            tl.setString(2, h_setoranke.getText());
            tl.setString(3, h_idsantri.getText());
            tl.setString(4, h_namasantri.getText());
            tl.setString(5, h_idpentashih.getText());
            tl.setString(6, h_namapentashih.getText());
            tl.setString(7, Tanggal);
            tl.setString(8, h_cbsurat.getSelectedItem().toString());
            tl.setString(9, h_dari.getText());
            tl.setString(10, h_sampai.getText());
            tl.setString(11, h_nilai.getText());
            tl.setString(12, h_keterangan.getText());
            tl.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Berhasil Di Simpan");
        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_h_bttambahActionPerformed

    private void h_bteditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h_bteditActionPerformed
        // TODO add your handling code here:
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String Tanggal = String.valueOf(sdf.format(h_tanggal.getDate()));
            String sql = "UPDATE penilaian SET setoran_ke=?,"
                    + "id_siswi=?,nama=?,id_pentashih=?,nama_pentashih=?,"
                    + "tanggal=?,surat=?,dari=?,sampai=?,nilai=?,keterangan=? WHERE id_penilaian=?";
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql:///skripsi", "root", "");
            PreparedStatement tl = koneksi.prepareStatement(sql);
            tl.setString(12, h_idpenilaian.getText());
            tl.setString(1, h_setoranke.getText());
            tl.setString(2, h_idsantri.getText());
            tl.setString(3, h_namasantri.getText());
            tl.setString(4, h_idpentashih.getText());
            tl.setString(5, h_namapentashih.getText());
            tl.setString(6, Tanggal);
            tl.setString(7, h_cbsurat.getSelectedItem().toString());
            tl.setString(8, h_dari.getText());
            tl.setString(9, h_sampai.getText());
            tl.setString(10, h_nilai.getText());
            tl.setString(11, h_keterangan.getText());
            tl.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Berhasil Di Edit");
        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_h_bteditActionPerformed

    private void h_bthapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h_bthapusActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "DELETE FROM penilaian WHERE 0 where no_pendaftar=?";
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql:///skripsi", "root", "");
            PreparedStatement tulis = koneksi.prepareStatement(sql);
            tulis.setString(1, h_idpenilaian.getText());
            tulis.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Berhasil Di Hapus ");
            bersih();
            //refresh();
            //Tampil_Tabel();
            //input();
            autokode();
        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_h_bthapusActionPerformed

    private void h_nilaiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_h_nilaiKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                String coba = h_nilai.getText();
                Integer aa = Integer.parseInt(coba);
                if (aa > 89) {
                    h_keterangan.setText("Lulus");
                } else {
                    h_keterangan.setText("Gak Lulus");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_h_nilaiKeyPressed

    private void h_idpentashihKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_h_idpentashihKeyPressed
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                String Cari = "select * from pentashih where id_pentashih=?";
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql:///skripsi", "root", "");
                PreparedStatement UR = con.prepareStatement(Cari);
                UR.setString(1, h_idpentashih.getText());
                ResultSet UL = UR.executeQuery();
                if (UL.next()) {
                    h_namapentashih.setText(UL.getString(2));
                } else {
                    JOptionPane.showMessageDialog(this, "Data Tidak Ditemukan");
                    h_namapentashih.setText(".........................");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_h_idpentashihKeyPressed

    private void bttt_bersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttt_bersihActionPerformed
        // TODO add your handling code here:
        bersih();
    }//GEN-LAST:event_bttt_bersihActionPerformed

    private void btttt_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btttt_cariActionPerformed
        // TODO add your handling code here:
        h_btedit.setEnabled(true);
        h_bthapus.setEnabled(true);
        h_bttambah.setEnabled(false);
        h_idpenilaian.setEnabled(true);
    }//GEN-LAST:event_btttt_cariActionPerformed

    private void h_idpenilaianKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_h_idpenilaianKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                //String Tanggal = String.valueOf(sdf.format(J_date.getDate()));
                Date dateValue = null;
                String Cari = "select * from penilaian where id_penilaian=?";
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql:///skripsi", "root", "");
                PreparedStatement UR = con.prepareStatement(Cari);
                UR.setString(1, h_idpenilaian.getText());
                ResultSet UL = UR.executeQuery();
                if (UL.next()) {

                    String id_penilaian = UL.getString("id_penilaian");
                    String setoran_ke = UL.getString("setoran_ke");
                    String id_siswi = UL.getString("id_siswi");
                    String nama = UL.getString("nama");
                    String id_pentashih = UL.getString("id_pentashih");
                    String nama_pentashih = UL.getString("nama_pentashih");
                    String tanggal = UL.getString("tanggal");
                    String surat = UL.getString("surat");
                    String dari = UL.getString("dari");
                    String sampai = UL.getString("sampai");
                    String nilai = UL.getString("nilai");
                    String keterangan = UL.getString("keterangan");

                    h_idpenilaian.setText(id_penilaian);
                    h_setoranke.setText(setoran_ke);
                    h_idsantri.setText(id_siswi);
                    h_namasantri.setText(nama);
                    h_idpentashih.setText(id_pentashih);
                    h_namapentashih.setText(nama_pentashih);
                    dateValue = sdf.parse(tanggal);
                    h_tanggal.setDate(dateValue);
                    h_cbsurat.setSelectedItem(surat);
                    h_dari.setText(dari);
                    h_sampai.setText(sampai);
                    h_nilai.setText(nilai);
                    h_keterangan.setText(keterangan);

                } else {
                    JOptionPane.showMessageDialog(this, "Data Tidak Ditemukan");
                    h_namasantri.setText(".........................");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_h_idpenilaianKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(form_penilaianharian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_penilaianharian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_penilaianharian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_penilaianharian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                form_penilaianharian dialog = new form_penilaianharian(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private void autokode() {
        try {

            String query = "SELECT MAX(right(id_penilaian,5))AS no FROM penilaian";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                if (rs.first() == false) {
                    h_idpenilaian.setText("001");
                } else {
                    rs.last();
                    int auto_id = rs.getInt(1) + 1;
                    String no = String.valueOf(auto_id);
                    int nolong = no.length();
                    for (int a = 0; a < 3 - nolong; a++) {
                        no = "0" + no;
                    }

                    h_idpenilaian.setText(no);
                }
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR:\n" + e.toString(), "kesalahan", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void bersih() {
        h_idpenilaian.setText(null);
        h_setoranke.setText(null);
        h_idsantri.setText(null);
        h_namasantri.setText(null);
        h_idpentashih.setText(null);
        h_namapentashih.setText(null);
        h_cbsurat.setSelectedIndex(0);
        h_dari.setText(null);
        h_sampai.setText(null);
        h_nilai.setText(null);
        h_keterangan.setText(null);
        h_btedit.setEnabled(false);
        h_bthapus.setEnabled(false);
        h_bttambah.setEnabled(true);
        h_idpenilaian.setEnabled(false);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttt_bersih;
    private javax.swing.JButton btttt_cari;
    private javax.swing.JButton h_btedit;
    private javax.swing.JButton h_bthapus;
    private javax.swing.JButton h_bttambah;
    private javax.swing.JComboBox h_cbsurat;
    private javax.swing.JTextField h_dari;
    private javax.swing.JTextField h_idpenilaian;
    private javax.swing.JTextField h_idpentashih;
    private javax.swing.JTextField h_idsantri;
    private javax.swing.JLabel h_keterangan;
    private javax.swing.JLabel h_namapentashih;
    private javax.swing.JLabel h_namasantri;
    private javax.swing.JTextField h_nilai;
    private javax.swing.JTextField h_sampai;
    private javax.swing.JTextField h_setoranke;
    private com.toedter.calendar.JDateChooser h_tanggal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
