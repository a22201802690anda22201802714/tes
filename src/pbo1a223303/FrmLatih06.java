/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1a223303;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class FrmLatih06 extends javax.swing.JFrame {

    /**
     * Creates new form FrmLatih06
     */
    public FrmLatih06() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        awal = new javax.swing.JLabel();
        awal1 = new javax.swing.JLabel();
        awal2 = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        btnBersih = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel = new javax.swing.JTable();
        txtAwal = new javax.swing.JTextField();
        txtAkhir = new javax.swing.JTextField();
        cmbBilangan = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        awal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        awal.setText("Angka Awal");

        awal1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        awal1.setText("Angka Akhir");

        awal2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        awal2.setText("Bilangan");

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnBersih.setText("Bersih");
        btnBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBersihActionPerformed(evt);
            }
        });

        Tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Angka", "Keterangan"
            }
        ));
        jScrollPane1.setViewportView(Tabel);

        txtAwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAwalActionPerformed(evt);
            }
        });

        txtAkhir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAkhirActionPerformed(evt);
            }
        });

        cmbBilangan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --", "Ganjil", "Genap", "Prima", "Bilangan" }));
        cmbBilangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBilanganActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(awal)
                            .addComponent(awal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(awal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAwal)
                            .addComponent(txtAkhir, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(cmbBilangan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBersih))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(awal)
                    .addComponent(txtAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(awal1)
                    .addComponent(txtAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(awal2)
                    .addComponent(cmbBilangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk)
                    .addComponent(btnBersih))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAwalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAwalActionPerformed

    private void txtAkhirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAkhirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAkhirActionPerformed

    private void cmbBilanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBilanganActionPerformed
        // TODO add your handling code here:

   
    }//GEN-LAST:event_cmbBilanganActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
        int awal,akhir, x , n=1, y;
        String ket;
        awal = Integer.parseInt(txtAwal.getText());
        akhir = Integer.parseInt(txtAkhir.getText());
        if (cmbBilangan.getSelectedItem().equals("Ganjil")){
            // Memasukkan ke dalam Tabel
            for (x=awal; x<=akhir; x++){
                y = x%2 ;
                if (y==1){
                    ket = "Ganjil";
                    DefaultTableModel dataModel = (DefaultTableModel) Tabel.getModel();
                    List list = new ArrayList();
                    list.add(n++);
                    list.add(x);
                    list.add(ket);
                    dataModel.addRow(list.toArray());
                }
            }
        }
        if (cmbBilangan.getSelectedItem().equals("Genap")){
            // Memasukkan ke dalam Tabel
            for (x=awal; x<=akhir; x++){
                y = x%2 ;
                if (y==0){
                    ket = "Genap";
                    DefaultTableModel dataModel = (DefaultTableModel) Tabel.getModel();
                    List list = new ArrayList();
                    list.add(n++);
                    list.add(x);
                    list.add(ket);
                    dataModel.addRow(list.toArray());
                }
            }
        }
        if (cmbBilangan.getSelectedItem().equals("Prima")){
            int i=0;
            for (x=awal; x<=akhir; x++)
            {    
                for( y=2; y<x; y++)
                {
                    if(x%y==0)
                    {
                        i=0;
                        break;
                    }
                    else{
                        i=1;
                    }
                    
                }
                if (i==1){
                        ket = "Bilangan Prima";
                        DefaultTableModel dataModel = (DefaultTableModel) Tabel.getModel();
                        List list = new ArrayList();
                        list.add(n++);
                        list.add(x);
                        list.add(ket);
                        dataModel.addRow(list.toArray());
                    }
            }
        }
        if (cmbBilangan.getSelectedItem().equals("Bilangan")){
           int i=0,i2;
                for (x=awal; x<=akhir; x++){
            i2=x%2; 
            for( y=2; y<x; y++){
                if(x%y==0){
            i=0;
                break;
                }
                else{
            i=1;
                    }
            }
            if (i==1 && i2==0){
                ket = "Bilangan Prima dan Genap";
        DefaultTableModel dataModel = (DefaultTableModel) Tabel.getModel();
        List list = new ArrayList();
        list.add(n++);
        list.add(x);
        list.add(ket);
        dataModel.addRow(list.toArray());
            }
            if (i==0 && i2==0){
                ket = "Bukan Bilangan Prima Tapi Genap";
        DefaultTableModel dataModel = (DefaultTableModel) Tabel.getModel();
        List list = new ArrayList();
        list.add(n++);
        list.add(x);
        list.add(ket);
        dataModel.addRow(list.toArray());
            }
            if (i==1 && i2==1){
                ket = "Bilangan Prima dan Ganjil";
        DefaultTableModel dataModel = (DefaultTableModel) Tabel.getModel();
        List list = new ArrayList();
        list.add(n++);
        list.add(x);
        list.add(ket);
        dataModel.addRow(list.toArray());
            }
            if (i==0 && i2==1){
                ket = "Bukan Bilangan Prima Tapi Ganjil";
        DefaultTableModel dataModel = (DefaultTableModel) Tabel.getModel();
        List list = new ArrayList();
        list.add(n++);
        list.add(x);
        list.add(ket);
        dataModel.addRow(list.toArray());
        }
    }
}
        
        
        
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihActionPerformed
        // TODO add your handling code here:
        txtAwal.setText("");
        txtAkhir.setText("");
        txtAwal.requestFocus();
        DefaultTableModel dataModel = (DefaultTableModel) Tabel.getModel();
        if (Tabel.getRowCount()>0){
            for ( int i = Tabel.getRowCount() - 1 ; i > -1 ; i--){
                dataModel.removeRow(i);
            }
        }
    }//GEN-LAST:event_btnBersihActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLatih06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLatih06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLatih06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLatih06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLatih06().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabel;
    private javax.swing.JLabel awal;
    private javax.swing.JLabel awal1;
    private javax.swing.JLabel awal2;
    private javax.swing.JButton btnBersih;
    private javax.swing.JButton btnOk;
    private javax.swing.JComboBox<String> cmbBilangan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAkhir;
    private javax.swing.JTextField txtAwal;
    // End of variables declaration//GEN-END:variables
}
