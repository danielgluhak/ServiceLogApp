
package com.danielgluhak.view;

import java.text.SimpleDateFormat;
import java.util.Date;


public class MainMenu extends javax.swing.JFrame {

    public MainMenu() {
        initComponents();
        setTitle(Application.APP_NAME);
        new Time().start();
    }
    
    private class Time extends Thread {
        private SimpleDateFormat df = new SimpleDateFormat("dd. MMMM YYYY. HH:mm:ss");
        
        @Override
        public void run() {
            while (true) {                
                lblTime.setText(df.format(new Date()));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                }
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnServiceLogs = new javax.swing.JButton();
        btnArticlesServices = new javax.swing.JButton();
        btnVehicles = new javax.swing.JButton();
        btnCustomers = new javax.swing.JButton();
        lblTime = new javax.swing.JLabel();
        btnHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnServiceLogs.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnServiceLogs.setText("Service logs");
        btnServiceLogs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnServiceLogsMouseReleased(evt);
            }
        });

        btnArticlesServices.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnArticlesServices.setText("Articles and services");
        btnArticlesServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArticlesServicesActionPerformed(evt);
            }
        });

        btnVehicles.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnVehicles.setText("Vehicles");
        btnVehicles.setToolTipText("");

        btnCustomers.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnCustomers.setText("Customers");

        btnHelp.setText("Help");
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnArticlesServices, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnServiceLogs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCustomers, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnServiceLogs, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnArticlesServices, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnHelp)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnServiceLogsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnServiceLogsMouseReleased
        new ServiceLogsForm().setVisible(true);
    }//GEN-LAST:event_btnServiceLogsMouseReleased

    private void btnArticlesServicesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArticlesServicesMouseReleased
        new ArticlesAndServicesForm().setVisible(true);
    }//GEN-LAST:event_btnArticlesServicesMouseReleased

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        new HelpForm().setVisible(true);
    }//GEN-LAST:event_btnHelpActionPerformed

    private void btnArticlesServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArticlesServicesActionPerformed
        new ArticlesAndServicesForm().setVisible(true);
    }//GEN-LAST:event_btnArticlesServicesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArticlesServices;
    private javax.swing.JButton btnCustomers;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnServiceLogs;
    private javax.swing.JButton btnVehicles;
    private javax.swing.JLabel lblTime;
    // End of variables declaration//GEN-END:variables
}
