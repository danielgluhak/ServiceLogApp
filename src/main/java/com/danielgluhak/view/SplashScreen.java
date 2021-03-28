
package com.danielgluhak.view;

public class SplashScreen extends javax.swing.JFrame {

    public SplashScreen() {
        initComponents();
         
        
    }
    public void startSplashScreen() {
        try{
        for(int p=0; p<=100; p++){
            Thread.sleep(20);
            splscrProgressBar.setValue(p);
            splscrLoadingLabel.setText("Loading..."+(Integer.toString(p)+"%"));
            if(p==100){
                splscrProgressBar.setVisible(false);
                    }
                }
            }catch(Exception e){
        }
    }
    

    
    
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splscrLoadingLabel = new javax.swing.JLabel();
        splscrProgressBar = new javax.swing.JProgressBar();
        splscrBackgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        splscrLoadingLabel.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        splscrLoadingLabel.setForeground(new java.awt.Color(255, 255, 255));
        splscrLoadingLabel.setPreferredSize(new java.awt.Dimension(50, 15));
        getContentPane().add(splscrLoadingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 120, 20));

        splscrProgressBar.setBackground(new java.awt.Color(204, 204, 204));
        splscrProgressBar.setForeground(new java.awt.Color(51, 255, 0));
        getContentPane().add(splscrProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 190, -1));

        splscrBackgroundLabel.setIcon(new javax.swing.ImageIcon("C:\\NetBeans-workspace\\ServiceLogApp\\src\\main\\resources\\Webp.net-resizeimage.jpg")); // NOI18N
        splscrBackgroundLabel.setOpaque(true);
        getContentPane().add(splscrBackgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 338));

        setSize(new java.awt.Dimension(614, 375));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel splscrBackgroundLabel;
    private javax.swing.JLabel splscrLoadingLabel;
    private javax.swing.JProgressBar splscrProgressBar;
    // End of variables declaration//GEN-END:variables
}
