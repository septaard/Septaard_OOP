package pertemuan4;
//import library

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Handphone_ extends javax.swing.JFrame {
//source pada init component

    public Handphone_() {
        initComponents();
        DefaultTableModel dataModel = (DefaultTableModel) Tampil.getModel();
        int rowCount = dataModel.getRowCount();
        while (rowCount > 0) {
            dataModel.removeRow(rowCount - 1);
            rowCount = dataModel.getRowCount();
        }
    }
//method untuk mengosongkan inputan

    public void clear() {
        txtbln.setText("");
        txtmerk.setText("");
        txtmodel.setText("");
        txtos.setText("");
        txtspek.setText("");
        txttgl.setText("");
        txtthn.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtmerk = new javax.swing.JTextField();
        txtmodel = new javax.swing.JTextField();
        txtspek = new javax.swing.JTextField();
        txtos = new javax.swing.JTextField();
        Androidbtn = new javax.swing.JRadioButton();
        Applebtn = new javax.swing.JRadioButton();
        btnCek = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txttgl = new javax.swing.JTextField();
        txtthn = new javax.swing.JTextField();
        txtbln = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tampil = new javax.swing.JTable();
        btnhapus = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        btnbatal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Informasi Handphone");

        jLabel2.setText("Merk ");

        jLabel3.setText("Model");

        jLabel4.setText("Spesifikasi");

        jLabel5.setText("Jenis Os");

        jLabel6.setText("versi Os");

        txtmerk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmerkActionPerformed(evt);
            }
        });

        txtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtosActionPerformed(evt);
            }
        });

        buttonGroup1.add(Androidbtn);
        Androidbtn.setText("Android");

        buttonGroup1.add(Applebtn);
        Applebtn.setText("Apple");

        btnCek.setText("Simpan");
        btnCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekActionPerformed(evt);
            }
        });

        jLabel7.setText("bln");

        txttgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttglActionPerformed(evt);
            }
        });

        txtthn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtthnActionPerformed(evt);
            }
        });

        txtbln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtblnActionPerformed(evt);
            }
        });

        jLabel8.setText("thn");

        jLabel9.setText("Pembelian");

        jLabel10.setText("tgl");

        Tampil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Merk", "Model", "Spesifikasi", "Jenis Os", "Versi Os", "Tanggal "
            }
        ));
        jScrollPane2.setViewportView(Tampil);

        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnclose.setText("Keluar");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        btnbatal.setText("Batal");
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txttgl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtbln, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtthn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(53, 53, 53)
                                .addComponent(txtos, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(65, 65, 65))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Applebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtmerk, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                .addComponent(txtmodel)
                                .addComponent(txtspek)
                                .addComponent(Androidbtn)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCek)
                        .addGap(39, 39, 39)
                        .addComponent(btnbatal)
                        .addGap(47, 47, 47)
                        .addComponent(btnhapus)
                        .addGap(46, 46, 46)
                        .addComponent(btnclose)))
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtmerk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtmodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtspek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Androidbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Applebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(txttgl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbln, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtthn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCek)
                    .addComponent(btnhapus)
                    .addComponent(btnclose)
                    .addComponent(btnbatal))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtmerkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmerkActionPerformed

    }//GEN-LAST:event_txtmerkActionPerformed

    private void txtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtosActionPerformed

    }//GEN-LAST:event_txtosActionPerformed
//source button simpan
    private void btnCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekActionPerformed
        try {
            DefaultTableModel dataModel = (DefaultTableModel) Tampil.getModel();
//         Inisialisasi sebuah ArrayList bernama 'list'
        List list = new ArrayList<>();
//         Mengatur tabel untuk membuat kolom dari model secara otomatis
        Tampil.setAutoCreateColumnsFromModel(true);
//         Membuat instance dari kelas  handphone
        Handphone hp = new Handphone();
//        upcasting
        hp.getmerk(txtmerk.getText());
        hp.getmodel(txtmodel.getText());
        hp.getspek(txtspek.getText());
        hp.getversi(txtos.getText());
        hp.gettanggal(txttgl.getText(), txtbln.getText(), txtthn.getText());
        if (Androidbtn.isSelected()) {
            hp.getos(Androidbtn.getText());
        } else {
            hp.getos(Applebtn.getText());
        }
        list.add(hp.cetakmerk());
        list.add(hp.cetakmodel());
        list.add(hp.cetakspek());
        list.add(hp.cetakos());
        list.add(hp.cetakversi());
        list.add(hp.cetaktanggal());
        dataModel.addRow(list.toArray());
        clear();
        boolean isAuthenticated = hp.Cek(txtmerk.getText());
        if (isAuthenticated) {
            JOptionPane.showMessageDialog(rootPane, "" + hp.notice(hp.Os));
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan:\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        

//        clear();
//        Tampil.append("\s\s\s\s\s\s\s\s\s\s\s\s\s\sINFORMASI HANDPHONE\n");
//        Tampil.append("\s\s\s\s\s\s\s\s\s\s\s\s\s\s===================\n");
//        Tampil.append("\b "+hp.nama+"\n");
//        Tampil.append("\b "+hp.Imei+"\n\n");
//        Tampil.append(hp.Merk+txtmerk.getText()+"\n");
//        Tampil.append(hp.model+txtmodel.getText()+"\n");
//        Tampil.append(hp.spesifikasi+txtspek.getText()+"\n");
//        
//        Tampil.append(hp.Os+txtos.getText()+"\n");
//        Tampil.append("Pembelian : "+txttgl.getText()+" / "+txtbln.getText()+" / "+txtthn.getText()+"\n");
    }//GEN-LAST:event_btnCekActionPerformed

    private void txttglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttglActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttglActionPerformed

    private void txtthnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtthnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtthnActionPerformed

    private void txtblnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtblnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtblnActionPerformed

//    source button hapus
    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        DefaultTableModel dataModel = (DefaultTableModel) Tampil.getModel();
        int rowCount = dataModel.getRowCount();
        while (rowCount > 0) {
            dataModel.removeRow(rowCount - 1);
            rowCount = dataModel.getRowCount();
        } // Update}
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        dispose();
    }//GEN-LAST:event_btncloseActionPerformed
//source button batal
    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
        Handphone hp = new Handphone();
        boolean isAuthenticated = false;
        if (isAuthenticated) {
            JOptionPane.showMessageDialog(rootPane, " " + hp.notice(hp.Merk));
        } else {
            JOptionPane.showMessageDialog(rootPane, " " + hp.notice());
        }
        clear();
    }//GEN-LAST:event_btnbatalActionPerformed
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
            java.util.logging.Logger.getLogger(Handphone_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Handphone_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Handphone_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Handphone_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Handphone_().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Androidbtn;
    private javax.swing.JRadioButton Applebtn;
    private javax.swing.JTable Tampil;
    private javax.swing.JButton btnCek;
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnhapus;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField txtbln;
    private javax.swing.JTextField txtmerk;
    private javax.swing.JTextField txtmodel;
    private javax.swing.JTextField txtos;
    private javax.swing.JTextField txtspek;
    private javax.swing.JTextField txttgl;
    private javax.swing.JTextField txtthn;
    // End of variables declaration//GEN-END:variables
}
