/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.neu.cafemanagement;

import edu.neu.csye6200.ItemBill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author kaush
 */
public class ViewSells extends javax.swing.JFrame {

    
    public ViewSells() {
        initComponents();
        ShowBills();
    }

    ResultSet Rs = null, Rs1 = null;
    Connection Con = null;
    Statement St = null, St1 = null;
    
      private void ShowBills(){
    
        try {
            Con = DriverManager.getConnection(Constants.dbUrl, Constants.dbUser, Constants.dbPwd);
            St =  Con.createStatement();
            Rs = St.executeQuery("select * from BillTbl");
            System.out.println(Rs);
            BillList.setModel(DbUtils.resultSetToTableModel(Rs));
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BillList = new javax.swing.JTable();
        viewHighestBtn = new javax.swing.JButton();
        viewLowestBtn = new javax.swing.JButton();
        ItemsLb = new javax.swing.JLabel();
        ViewSellsLogoutBtn = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SellingLb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 51, 102));

        jLabel8.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("List of Bills");

        BillList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Seller", "Date", "Amount"
            }
        ));
        BillList.setRowHeight(30);
        BillList.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(BillList);

        viewHighestBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewHighestBtn.setText("Highest");
        viewHighestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewHighestBtnActionPerformed(evt);
            }
        });

        viewLowestBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewLowestBtn.setText("Lowest");
        viewLowestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewLowestBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(377, 377, 377)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addComponent(viewLowestBtn)
                .addGap(18, 18, 18)
                .addComponent(viewHighestBtn)
                .addGap(55, 55, 55))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(41, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewHighestBtn)
                    .addComponent(viewLowestBtn))
                .addContainerGap(510, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(84, 84, 84)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );

        ItemsLb.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        ItemsLb.setForeground(new java.awt.Color(255, 51, 51));
        ItemsLb.setText("Items");
        ItemsLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemsLbMouseClicked(evt);
            }
        });

        ViewSellsLogoutBtn.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        ViewSellsLogoutBtn.setForeground(new java.awt.Color(255, 51, 51));
        ViewSellsLogoutBtn.setText("Logout");
        ViewSellsLogoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewSellsLogoutBtnMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("View Bills");

        SellingLb.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        SellingLb.setForeground(new java.awt.Color(255, 51, 51));
        SellingLb.setText("Selling");
        SellingLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SellingLbMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SellingLb, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ItemsLb, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(12, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(ViewSellsLogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(ItemsLb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SellingLb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ViewSellsLogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ViewSellsLogoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewSellsLogoutBtnMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ViewSellsLogoutBtnMouseClicked

    private void SellingLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SellingLbMouseClicked
        new Selling().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SellingLbMouseClicked

    private void ItemsLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemsLbMouseClicked
        new Items().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ItemsLbMouseClicked

    private  List<ItemBill> billList = new ArrayList<>();
    
    private void viewHighestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewHighestBtnActionPerformed
         try {
            Con = DriverManager.getConnection(Constants.dbUrl, Constants.dbUser, Constants.dbPwd);
            St =  Con.createStatement();
            Rs = St.executeQuery("select * from BillTbl");
            //System.out.println(Rs);
             while (Rs.next()) {
                // Retrieve data from the ResultSet
                int billId = Rs.getInt("Bnum");
                String cashierName = Rs.getString("Seller");
                String date = Rs.getString("BDate");
                int amount = Rs.getInt("Amount");

                // Create Bill object with retrieved data
                ItemBill bill = new ItemBill(billId, cashierName, date, amount);
                billList.add(bill);
                
               // Bill bill = new Bill(billId, customerName, amount);

                // Do something with the Bill object (e.g., print or use it in your application)
                System.out.println(bill);
            }
            
              ItemBill billWithHighestAmount = billList.stream()
                .max((bill1, bill2) -> Integer.compare(bill1.getAmount(), bill2.getAmount()))
                .orElse(null);
              
              JOptionPane.showMessageDialog(this, "The Bill with highest Bill Amount recorded is " + billWithHighestAmount.getAmount() + " recorded on " + billWithHighestAmount.getSellingDate());
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_viewHighestBtnActionPerformed

    private void viewLowestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewLowestBtnActionPerformed
         try {
            Con = DriverManager.getConnection(Constants.dbUrl, Constants.dbUser, Constants.dbPwd);
            St =  Con.createStatement();
            Rs = St.executeQuery("select * from BillTbl");
            //System.out.println(Rs);
             while (Rs.next()) {
                // Retrieve data from the ResultSet
                int billId = Rs.getInt("Bnum");
                String cashierName = Rs.getString("Seller");
                String date = Rs.getString("BDate");
                int amount = Rs.getInt("Amount");

                // Create Bill object with retrieved data
                ItemBill bill = new ItemBill(billId, cashierName, date, amount);
                billList.add(bill);
                
               // Bill bill = new Bill(billId, customerName, amount);

                // Do something with the Bill object (e.g., print or use it in your application)
                System.out.println(bill);
            }
            
              ItemBill billWithLowestAmount = billList.stream()
                .min((bill1, bill2) -> Integer.compare(bill1.getAmount(), bill2.getAmount()))
                .orElse(null);
              
              JOptionPane.showMessageDialog(this, "The Bill with lowest Bill Amount recorded is " + billWithLowestAmount.getAmount() + " recorded on " + billWithLowestAmount.getSellingDate());
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_viewLowestBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ViewSells.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSells.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSells.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSells.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSells().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BillList;
    private javax.swing.JLabel ItemsLb;
    private javax.swing.JLabel SellingLb;
    private javax.swing.JLabel ViewSellsLogoutBtn;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewHighestBtn;
    private javax.swing.JButton viewLowestBtn;
    // End of variables declaration//GEN-END:variables
}
