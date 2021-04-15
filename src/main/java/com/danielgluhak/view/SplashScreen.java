/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgluhak.view;

import com.danielgluhak.util.HibernateUtil;
import javax.swing.JOptionPane;
import org.hibernate.Session;

/**
 *
 * @author Daniel
 */
public class SplashScreen extends javax.swing.JFrame {

    /**
     * Creates new form SplshScreen
     */
    public SplashScreen() {
        initComponents();
        new Loader().start();
    }
    
    public void startSplashScreen() {
        try{
        for(int p=0; p<=100; p++){
            Thread.sleep(20);
            splscrProgressBar.setValue(p);
//            txtProgress.setText("Loading..."+(Integer.toString(p)+"%"));
            if(p==100){
                splscrProgressBar.setVisible(false);
                    }
                }
            }catch(Exception e){
        }
    }
    private class Loader extends Thread {
        
         @Override
         public void run() {
            Session s = HibernateUtil.getSession();
            if (s.getMetamodel().getEntities().size() > 0) {
                new Authorization().setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(rootPane,"Database error.");
            }
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel = new javax.swing.JLabel();
        splscrProgressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/istockphoto-957612802-612x612.jpg"))); // NOI18N
        getContentPane().add(jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 370));

        splscrProgressBar.setForeground(new java.awt.Color(0, 204, 51));
        getContentPane().add(splscrProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 190, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel;
    private javax.swing.JProgressBar splscrProgressBar;
    // End of variables declaration//GEN-END:variables
}
