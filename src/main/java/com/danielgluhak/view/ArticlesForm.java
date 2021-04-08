
package com.danielgluhak.view;

import com.danielgluhak.controller.ControllerArticles;
import com.danielgluhak.model.Articles;
import com.danielgluhak.model.Operator;
import com.danielgluhak.util.ExceptionServiceLog;
import com.danielgluhak.util.NewOperator;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class ArticlesForm extends javax.swing.JFrame {

    private ControllerArticles conArt;
    
    public ArticlesForm() {
        initComponents();
        conArt = new ControllerArticles();
        load();
        setTitle(Application.APP_NAME);
        new ArticlesForm.Time().start();
    }

    
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel5 = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jTabbedPane = new javax.swing.JTabbedPane();
        jArticlesPane = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstArticles = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        txtArtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtArtCode = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        txtArtPrice = new javax.swing.JTextField();
        jServicesPanel = new javax.swing.JPanel();
        jArticlesPane1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstServices = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        txtSerName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnSerAdd = new javax.swing.JButton();
        btnSerEdit = new javax.swing.JButton();
        btnSerDelete = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtSerCode = new javax.swing.JTextField();
        txtSerSearch = new javax.swing.JTextField();
        btnSerSearch = new javax.swing.JButton();
        txtSerPrice = new javax.swing.JTextField();
        operatorName = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, 170, 30));

        jTabbedPane.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTabbedPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTabbedPaneMousePressed(evt);
            }
        });

        lstArticles.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstArticlesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstArticles);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Article name:");

        txtArtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArtNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Article price: ");

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Article code:");

        txtArtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArtCodeActionPerformed(evt);
            }
        });

        txtSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.setPreferredSize(new java.awt.Dimension(55, 23));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtArtPrice.setText("1234,55");

        javax.swing.GroupLayout jArticlesPaneLayout = new javax.swing.GroupLayout(jArticlesPane);
        jArticlesPane.setLayout(jArticlesPaneLayout);
        jArticlesPaneLayout.setHorizontalGroup(
            jArticlesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jArticlesPaneLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jArticlesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jArticlesPaneLayout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jArticlesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jArticlesPaneLayout.createSequentialGroup()
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jArticlesPaneLayout.createSequentialGroup()
                        .addGroup(jArticlesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtArtName, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jArticlesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtArtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jArticlesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtArtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jArticlesPaneLayout.setVerticalGroup(
            jArticlesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jArticlesPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jArticlesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jArticlesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jArticlesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtArtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtArtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtArtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jArticlesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jTabbedPane.addTab("Articles", jArticlesPane);

        lstServices.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstServicesValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstServices);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Service name:");

        txtSerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerNameActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Service price: ");

        btnSerAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSerAdd.setText("Add");
        btnSerAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSerAddActionPerformed(evt);
            }
        });

        btnSerEdit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSerEdit.setText("Edit");
        btnSerEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSerEditActionPerformed(evt);
            }
        });

        btnSerDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSerDelete.setText("Delete");
        btnSerDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSerDeleteActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Service code:");

        txtSerCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerCodeActionPerformed(evt);
            }
        });

        txtSerSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSerSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerSearchActionPerformed(evt);
            }
        });

        btnSerSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSerSearch.setText("Search");
        btnSerSearch.setPreferredSize(new java.awt.Dimension(55, 23));
        btnSerSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSerSearchActionPerformed(evt);
            }
        });

        txtSerPrice.setText("1234,55");

        javax.swing.GroupLayout jArticlesPane1Layout = new javax.swing.GroupLayout(jArticlesPane1);
        jArticlesPane1.setLayout(jArticlesPane1Layout);
        jArticlesPane1Layout.setHorizontalGroup(
            jArticlesPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jArticlesPane1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jArticlesPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jArticlesPane1Layout.createSequentialGroup()
                        .addComponent(txtSerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jArticlesPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jArticlesPane1Layout.createSequentialGroup()
                            .addComponent(btnSerEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnSerDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jArticlesPane1Layout.createSequentialGroup()
                        .addGroup(jArticlesPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSerName, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(btnSerAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jArticlesPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSerCode, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jArticlesPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtSerPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jArticlesPane1Layout.setVerticalGroup(
            jArticlesPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jArticlesPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jArticlesPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSerSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSerSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jArticlesPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jArticlesPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSerPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSerCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSerName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jArticlesPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSerAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSerEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSerDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jServicesPanelLayout = new javax.swing.GroupLayout(jServicesPanel);
        jServicesPanel.setLayout(jServicesPanelLayout);
        jServicesPanelLayout.setHorizontalGroup(
            jServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 785, Short.MAX_VALUE)
            .addGroup(jServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jServicesPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jArticlesPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jServicesPanelLayout.setVerticalGroup(
            jServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
            .addGroup(jServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jServicesPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jArticlesPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane.addTab("Services", jServicesPanel);

        getContentPane().add(jTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 460));
        getContentPane().add(operatorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 160, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPaneMousePressed
        load();
    }//GEN-LAST:event_jTabbedPaneMousePressed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        DefaultListModel<Articles> art = new DefaultListModel<>();
        if(!txtSearch.getText().isBlank() || !txtSearch.getText().isEmpty()) {
          art.addAll(conArt.getData(txtSearch.getText()));
            lstArticles.setModel(art);  
            cleanUp();
            
        } else {
            JOptionPane.showMessageDialog(rootPane, "At least one character must be entered to perform search.");
            load();
        }
//        art.addAll(conArt.getData(txtSearch.getText()));
//        lstArticles.setModel(art);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtArtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArtCodeActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(conArt.getEntityDefault()==null || conArt.getEntityDefault().getId()==null) {
            JOptionPane.showMessageDialog(rootPane, "Please choose the article to delete.");
            return;
        }
        try {
            conArt.delete();
            cleanUp();
            load();
        } catch (ExceptionServiceLog e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        conArt.setEntityDefault(new Articles());
//        setValuesToEntity();
        if(txtArtName.getText().isEmpty() || txtArtName.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Please enter article name.");
            return;
        } else if(txtArtCode.getText().isEmpty() || txtArtCode.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Please enter article code.");
        } else {
            setValuesToEntity();
        }
        
        try {
            conArt.create();
            cleanUp();
            load();
        } catch (ExceptionServiceLog e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtArtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArtNameActionPerformed

    private void lstArticlesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstArticlesValueChanged
        if(evt.getValueIsAdjusting()) {
            return;
        }
        if(lstArticles.getSelectedValue() == null) {
            return;
        }
        
        conArt.setEntityDefault(lstArticles.getSelectedValue());

        txtArtCode.setText(conArt.getEntityDefault().getArticleCode().toString());
        txtArtName.setText(conArt.getEntityDefault().getProductName().toString());
        try {
            txtArtPrice.setText(conArt.getEntityDefault().getPrice().toString());
        } catch (Exception e) {
            txtArtPrice.setText("");
        }
    }//GEN-LAST:event_lstArticlesValueChanged

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if(conArt.getEntityDefault()==null || 
                conArt.getEntityDefault().getId()==null) {
            JOptionPane.showMessageDialog(rootPane, "Please choose the article to edit.");
            return;
        } else {
            setValuesToEntity();
        }
        try {
            conArt.update();
            cleanUp();
            load();
        } catch (ExceptionServiceLog e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        if(txtSearch.getText().isEmpty() || txtSearch.getText().isBlank()) {
            cleanUp();
            load();
        } 
    }//GEN-LAST:event_txtSearchActionPerformed

    private void lstServicesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstServicesValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_lstServicesValueChanged

    private void txtSerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerNameActionPerformed

    private void btnSerAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSerAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSerAddActionPerformed

    private void btnSerEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSerEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSerEditActionPerformed

    private void btnSerDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSerDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSerDeleteActionPerformed

    private void txtSerCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerCodeActionPerformed

    private void txtSerSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerSearchActionPerformed

    private void btnSerSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSerSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSerSearchActionPerformed

    private void setValuesToEntity() {
        
        var entity = conArt.getEntityDefault();
        entity.setArticleCode(txtArtCode.getText().trim().toLowerCase().toString());
        entity.setProductName(txtArtName.getText().toString());
        
        try {
            entity.setPrice(new BigDecimal(txtArtPrice.getText()));
        } catch (Exception e) {
            entity.setPrice(BigDecimal.ZERO);
        }        
    }
   
    private void load() {
        DefaultListModel<Articles> art = new DefaultListModel<>();
        art.addAll(conArt.getData());
        lstArticles.setModel(art);
    }
    private void cleanUp() {
        txtArtCode.setText("");
        txtArtName.setText("");
        txtArtPrice.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSerAdd;
    private javax.swing.JButton btnSerDelete;
    private javax.swing.JButton btnSerEdit;
    private javax.swing.JButton btnSerSearch;
    private javax.swing.JPanel jArticlesPane;
    private javax.swing.JPanel jArticlesPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jServicesPanel;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JLabel lblTime;
    javax.swing.JList<Articles> lstArticles;
    javax.swing.JList<Articles> lstServices;
    private javax.swing.JLabel operatorName;
    private javax.swing.JTextField txtArtCode;
    private javax.swing.JTextField txtArtName;
    private javax.swing.JTextField txtArtPrice;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSerCode;
    private javax.swing.JTextField txtSerName;
    private javax.swing.JTextField txtSerPrice;
    private javax.swing.JTextField txtSerSearch;
    // End of variables declaration//GEN-END:variables

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
    }
