/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgluhak.view;

import com.danielgluhak.controller.ControllerOperator;
import com.danielgluhak.model.Operator;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Authorization extends javax.swing.JFrame {

    /**
     * Creates new form Authorization
     */
    public Authorization() {
        initComponents();
        setTitle(Application.APP_NAME);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lgnUsername = new javax.swing.JTextField();
        lgnPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lgnButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("   Service Log ");

        lgnUsername.setText("dgluhak");
        lgnUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lgnUsernameMouseReleased(evt);
            }
        });
        lgnUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgnUsernameActionPerformed(evt);
            }
        });
        lgnUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lgnUsernameKeyReleased(evt);
            }
        });

        lgnPassword.setText("default012");
        lgnPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lgnPasswordKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Username:");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Password:");

        lgnButton.setBackground(new java.awt.Color(204, 204, 204));
        lgnButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lgnButton.setText("Log in");
        lgnButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lgnButtonMouseReleased(evt);
            }
        });
        lgnButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lgnButtonKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lgnPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lgnUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lgnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(lgnUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lgnPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(39, 39, 39)
                .addComponent(lgnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lgnUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgnUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lgnUsernameActionPerformed

    private void lgnUsernameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgnUsernameMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lgnUsernameMouseReleased

    private void lgnUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lgnUsernameKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER || 
                evt.getKeyCode()==KeyEvent.VK_TAB && 
                !lgnUsername.getText().isEmpty()) {
            lgnPassword.requestFocus();
        }
    }//GEN-LAST:event_lgnUsernameKeyReleased

    private void lgnPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lgnPasswordKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER || 
                evt.getKeyCode()==KeyEvent.VK_TAB && 
                lgnPassword.getPassword().length>6) {
           login();
    }//GEN-LAST:event_lgnPasswordKeyReleased
}
    private void lgnButtonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lgnButtonKeyReleased
        login();
    }//GEN-LAST:event_lgnButtonKeyReleased

    private void lgnButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgnButtonMouseReleased
        login();
    }//GEN-LAST:event_lgnButtonMouseReleased

        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton lgnButton;
    private javax.swing.JPasswordField lgnPassword;
    private javax.swing.JTextField lgnUsername;
    // End of variables declaration//GEN-END:variables

    private void login() {
        
        if(lgnUsername.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Username must be entered.");
            lgnUsername.requestFocus();
            return;
        }
        if(lgnPassword.getPassword().length==0) {
            JOptionPane.showMessageDialog(rootPane, "Password must be entered.");
            lgnPassword.requestFocus();
            return;
        }
        
        ControllerOperator co = new ControllerOperator();
        Operator operator = co.authorize(lgnUsername.getText(), lgnPassword.getPassword());
        
        if(operator == null) {
            JOptionPane.showMessageDialog(rootPane, "Username and password does not match.");
            return;
        }
        
        Application.operator=operator;
        new MainMenu().setVisible(true);
        dispose();
    }
}
