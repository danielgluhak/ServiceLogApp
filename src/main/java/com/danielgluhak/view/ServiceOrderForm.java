/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgluhak.view;

import com.danielgluhak.controller.ControllerAddedItems;
import com.danielgluhak.controller.ControllerArticles;
import com.danielgluhak.controller.ControllerCustomer;
import com.danielgluhak.controller.ControllerServiceOrder;
import com.danielgluhak.controller.ControllerVehicle;
import com.danielgluhak.model.AddedItems;
import com.danielgluhak.model.Articles;
import com.danielgluhak.model.Customer;
import com.danielgluhak.model.ServiceOrder;
import com.danielgluhak.model.Vehicle;
import com.danielgluhak.util.ExceptionServiceLog;
import java.awt.FlowLayout;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Daniel
 */
public class ServiceOrderForm extends javax.swing.JFrame {

    private ControllerServiceOrder conServiceOrder;
    private ControllerCustomer conCustomer;
    private ControllerVehicle conVehicle;
    private ControllerArticles conArticles;
    private ControllerAddedItems conItems;

//    TODO: line 767
//    TODO: line 885 implement lstJobDone 
    
    public ServiceOrderForm() {
        initComponents();
        new ServiceOrderForm.Time().start();
        
        conServiceOrder = new ControllerServiceOrder();
        conCustomer = new ControllerCustomer();
        conVehicle = new ControllerVehicle(); 
        conArticles = new ControllerArticles();
        conItems = new ControllerAddedItems();
        
        
        setTitle(Application.APP_NAME + " " + 
                Application.operator.getFirstName() + " " + 
                Application.operator.getLastName()); 
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTime = new javax.swing.JLabel();
        jTabbedPane = new javax.swing.JTabbedPane();
        jCustomerTab = new javax.swing.JPanel();
        jVehicleTab = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtManufacturer = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        txtProductionYear = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtLicensePlate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCreateSTab = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lstArticlesAndServices = new javax.swing.JList<>();
        btnAddToList = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        bntSearch = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstAddedItems = new javax.swing.JList<>();
        btnRemoveFromList = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        boxVehicle = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        boxCustomer = new javax.swing.JComboBox<>();
        btnCreateServiceOrder = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        dpDate = new com.github.lgooddatepicker.components.DatePicker();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtRemarks = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jServiceOrderListTab = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstServiceOrder = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtShowLastName = new javax.swing.JTextField();
        txtShowFirstName = new javax.swing.JTextField();
        txtShowPhoneNum = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtRemarksShow = new javax.swing.JTextPane();
        btnDeleteSo = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtShowModel = new javax.swing.JTextField();
        txtShowManufacturer = new javax.swing.JTextField();
        txtShowYear = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtShowLicenseNum = new javax.swing.JTextField();
        txtServiceOrderID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabbedPane.setForeground(new java.awt.Color(51, 153, 255));
        jTabbedPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPaneMouseClicked(evt);
            }
        });

        jCustomerTab.setForeground(new java.awt.Color(102, 204, 255));

        jVehicleTab.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vehicle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        jLabel4.setText("Manufacturer:");
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setText("Model:");
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel6.setText("Production year:");
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManufacturerActionPerformed(evt);
            }
        });

        txtModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelActionPerformed(evt);
            }
        });

        txtProductionYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductionYearActionPerformed(evt);
            }
        });

        jLabel13.setText("License plate:");
        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jVehicleTabLayout = new javax.swing.GroupLayout(jVehicleTab);
        jVehicleTab.setLayout(jVehicleTabLayout);
        jVehicleTabLayout.setHorizontalGroup(
            jVehicleTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jVehicleTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jVehicleTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jVehicleTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLicensePlate)
                    .addComponent(txtProductionYear)
                    .addComponent(txtModel)
                    .addComponent(txtManufacturer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        jVehicleTabLayout.setVerticalGroup(
            jVehicleTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jVehicleTabLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jVehicleTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jVehicleTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jVehicleTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jVehicleTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtProductionYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel1.setText("Last name:");
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel2.setText("First name:");
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setText("Phone number:");
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        btnCreate.setText("Create");
        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCreate.setNextFocusableComponent(jVehicleTab);
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\NetBeans-workspace\\ServiceLogApp\\src\\main\\resources\\imgNewEntry.jpg")); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));

        jLabel8.setText("Customer");
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        javax.swing.GroupLayout jCustomerTabLayout = new javax.swing.GroupLayout(jCustomerTab);
        jCustomerTab.setLayout(jCustomerTabLayout);
        jCustomerTabLayout.setHorizontalGroup(
            jCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCustomerTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jCustomerTabLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(jCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jCustomerTabLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jVehicleTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(478, Short.MAX_VALUE)))
        );
        jCustomerTabLayout.setVerticalGroup(
            jCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCustomerTabLayout.createSequentialGroup()
                .addGroup(jCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jCustomerTabLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(jCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jCustomerTabLayout.createSequentialGroup()
                                .addGroup(jCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33))
                            .addGroup(jCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)))
                        .addGap(28, 28, 28)
                        .addGroup(jCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCustomerTabLayout.createSequentialGroup()
                    .addContainerGap(200, Short.MAX_VALUE)
                    .addComponent(jVehicleTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(51, 51, 51)))
        );

        jTabbedPane.addTab("New entry", jCustomerTab);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Articles and services", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13))); // NOI18N

        lstArticlesAndServices.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstArticlesAndServicesValueChanged(evt);
            }
        });

        btnAddToList.setText("Add to list");
        btnAddToList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToListActionPerformed(evt);
            }
        });

        bntSearch.setText("Search");
        bntSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lstArticlesAndServices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 116, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddToList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bntSearch)))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lstArticlesAndServices, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnAddToList, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Added items", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13))); // NOI18N

        jScrollPane2.setViewportView(lstAddedItems);

        btnRemoveFromList.setText("Remove from list");
        btnRemoveFromList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveFromListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRemoveFromList)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(btnRemoveFromList)
                .addContainerGap())
        );

        jLabel10.setText("Choose vehicle:");

        jLabel14.setText("Choose customer:");

        btnCreateServiceOrder.setText("Create");
        btnCreateServiceOrder.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCreateServiceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateServiceOrderActionPerformed(evt);
            }
        });

        jLabel9.setText("Set recieving date:");

        txtRemarks.setColumns(20);
        txtRemarks.setRows(5);
        jScrollPane3.setViewportView(txtRemarks);

        jLabel15.setText("Enter remarks:");

        javax.swing.GroupLayout jCreateSTabLayout = new javax.swing.GroupLayout(jCreateSTab);
        jCreateSTab.setLayout(jCreateSTabLayout);
        jCreateSTabLayout.setHorizontalGroup(
            jCreateSTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCreateSTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jCreateSTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jCreateSTabLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jCreateSTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jCreateSTabLayout.createSequentialGroup()
                                .addGroup(jCreateSTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jCreateSTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jCreateSTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dpDate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addComponent(jLabel15)
                            .addComponent(jScrollPane3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCreateServiceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jCreateSTabLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jCreateSTabLayout.setVerticalGroup(
            jCreateSTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCreateSTabLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jCreateSTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jCreateSTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel14)
                    .addComponent(jLabel9))
                .addGroup(jCreateSTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jCreateSTabLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jCreateSTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dpDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jCreateSTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(boxVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boxCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCreateSTabLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCreateServiceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );

        jTabbedPane.addTab("Create service order", jCreateSTab);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Order list", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13))); // NOI18N

        lstServiceOrder.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstServiceOrderValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstServiceOrder);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel11.setText("First name: ");
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel17.setText("Last name: ");
        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel12.setText("Phone number:");
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtShowLastName.setEditable(false);

        txtShowFirstName.setEditable(false);

        txtShowPhoneNum.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtShowPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtShowFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtShowLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtShowFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(txtShowLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtShowPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Job done", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel21.setText("Remarks:");
        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtTotalPrice.setEditable(false);

        jLabel23.setText("Total price:");
        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jScrollPane5.setViewportView(txtRemarksShow);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5)))
                .addContainerGap())
        );

        btnDeleteSo.setText("Delete");
        btnDeleteSo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDeleteSo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSoActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vehicle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel18.setText("Manufacturer:");
        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel19.setText("Model:");
        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel20.setText("Model year:");
        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtShowModel.setEditable(false);

        txtShowManufacturer.setEditable(false);

        txtShowYear.setEditable(false);

        jLabel7.setText("License plate no.:");
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtShowLicenseNum.setEditable(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtShowLicenseNum, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtShowManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtShowModel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtShowYear, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtShowManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtShowModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtShowYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtShowLicenseNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        txtServiceOrderID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDeleteSo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(184, 184, 184))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtServiceOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDeleteSo)
                    .addComponent(txtServiceOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jServiceOrderListTabLayout = new javax.swing.GroupLayout(jServiceOrderListTab);
        jServiceOrderListTab.setLayout(jServiceOrderListTabLayout);
        jServiceOrderListTabLayout.setHorizontalGroup(
            jServiceOrderListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jServiceOrderListTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jServiceOrderListTabLayout.setVerticalGroup(
            jServiceOrderListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Summary", jServiceOrderListTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
    private void txtManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManufacturerActionPerformed
        
    }//GEN-LAST:event_txtManufacturerActionPerformed

    private void txtModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelActionPerformed

    private void btnRemoveFromListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveFromListActionPerformed
        DefaultListModel<AddedItems> ai;
        try {
            ai=(DefaultListModel<AddedItems>) lstAddedItems.getModel();
            ai.get(0).toString();
        } catch (Exception e) {
            return;
        }
        for(AddedItems item : lstAddedItems.getSelectedValuesList()) {
            for(int i=0; i<ai.size(); i++) {
                if(item.getId().equals(ai.get(i).getId())) {
                    ai.removeElementAt(i);
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnRemoveFromListActionPerformed

    private void lstArticlesAndServicesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstArticlesAndServicesValueChanged
      
    }//GEN-LAST:event_lstArticlesAndServicesValueChanged

    private void txtProductionYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductionYearActionPerformed
      
    }//GEN-LAST:event_txtProductionYearActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        createCustomerAndVehicle();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnCreateServiceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateServiceOrderActionPerformed
        conServiceOrder.setEntityDefault(new ServiceOrder());
        setValuesToServiceOrder();
        
        try {
            conServiceOrder.create();
            loadEntities();
            
        } catch (ExceptionServiceLog e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btnCreateServiceOrderActionPerformed

    private void jTabbedPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPaneMouseClicked
        loadCustomer();
        loadVehicle();
        loadArticles();
        loadEntities();
//        lstServiceOrder.getSelectedIndex()
    }//GEN-LAST:event_jTabbedPaneMouseClicked

    private void btnAddToListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToListActionPerformed
        DefaultListModel<AddedItems> aiList;
        try {
            aiList = (DefaultListModel<AddedItems>) lstAddedItems.getModel();
            aiList.get(0).toString();
        } catch (Exception e) {
            aiList = new DefaultListModel<>();
            lstAddedItems.setModel(aiList);
        }
            boolean exist;
            
       for(Articles a : lstArticlesAndServices.getSelectedValuesList()){
           exist=false;
           for(int i=0;i<aiList.size();i++){
               if(a.getId().equals(aiList.get(i).getArticles().getId())){
                   exist=true;
                   break;
               }
           }
           if(!exist){
               AddedItems addedItem = new AddedItems();
//               addedItem.setServiceOrder(lstIdName.getSelectedValue());
               addedItem.setArticles(a);
               aiList.addElement(addedItem);
           }
         
       }
//        
        lstAddedItems.repaint();
    }//GEN-LAST:event_btnAddToListActionPerformed

    private void bntSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSearchActionPerformed
        DefaultListModel<Articles> a = new DefaultListModel<>();
        if(!txtSearch.getText().isBlank() || !txtSearch.getText().isEmpty()) {
        a.addAll(conArticles.getData(txtSearch.getText()));
        lstArticlesAndServices.setModel(a);
         } else {
             JOptionPane.showMessageDialog(rootPane, "At least one character must be entered to perform search.");
         }
        if(txtSearch.getText().isBlank() || txtSearch.getText().isEmpty()) {
            loadArticles();
        }
    }//GEN-LAST:event_bntSearchActionPerformed

    private void lstServiceOrderValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstServiceOrderValueChanged
        var a = conServiceOrder;
        DefaultListModel<ServiceOrder> ai = new DefaultListModel<>();
        if(evt.getValueIsAdjusting()) {
            return;
        }
        if(lstServiceOrder.getSelectedValue()==null) {
            return;
        }
        conServiceOrder.setEntityDefault(lstServiceOrder.getSelectedValue());
        var so = conServiceOrder.getEntityDefault();
        txtServiceOrderID.setText("Service order ID number: #" + so.getId().toString());
        try {
            txtShowFirstName.setText(so.getCustomer().getFirstName()); 
            txtShowLastName.setText(so.getCustomer().getLastName());
            txtShowPhoneNum.setText(so.getCustomer().getContact());
            txtShowManufacturer.setText(so.getVehicle().getManufacturer());
            txtShowModel.setText(so.getVehicle().getModel());
            txtShowYear.setText(so.getVehicle().getProductionYear());
            txtShowLicenseNum.setText(so.getVehicle().getLicensePlate());
            txtTotalPrice.setText(so.getTotalPrice().toString() + "€");
            txtRemarksShow.setText(so.getRemarks());
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(rootPane, "Selected invalid service order.");
        }
        
    }//GEN-LAST:event_lstServiceOrderValueChanged

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void btnDeleteSoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSoActionPerformed
        if(conServiceOrder.getEntityDefault()==null || conServiceOrder.getEntityDefault().getId()==null) {
            JOptionPane.showMessageDialog(rootPane, "Please select item to delete.");
            return;
        }
//        TODO:
//          Create new joptiondialog: "are you sure you want to delete this..?"
        try {
            conServiceOrder.delete();
            cleanUpCustomer();
            cleanUpVehicle();
            loadEntities();
        } catch (ExceptionServiceLog e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteSoActionPerformed
    private void setItemToEntity() {
        var i = conItems.getEntityDefault();
        i.setArticles(lstArticlesAndServices.getSelectedValue());
        
    }
    private void setCustomerToEntity() {
        var c = conCustomer.getEntityDefault();
        c.setFirstName(txtFirstName.getText());
        c.setLastName(txtLastName.getText());
        c.setContact(txtPhoneNumber.getText());
    }
    private void setVehicleToEntity() {
        var v = conVehicle.getEntityDefault();
//        v.setCustomer();
        v.setManufacturer(txtManufacturer.getText());
        v.setModel(txtModel.getText());
        v.setProductionYear(txtProductionYear.getText());
        v.setLicensePlate(txtLicensePlate.getText());
    }
    private void loadCustomer() {
        DefaultComboBoxModel<Customer> cust = new DefaultComboBoxModel<>();
        cust.addAll(conCustomer.getData());
        boxCustomer.setModel(cust);
        boxCustomer.setSelectedIndex(0);
    }
    private void loadVehicle() {
        DefaultComboBoxModel<Vehicle> veh = new DefaultComboBoxModel<>();
        veh.addAll(conVehicle.getData());
        boxVehicle.setModel(veh);
        boxVehicle.setSelectedIndex(0);
    }
    private void loadArticles() {
        DefaultListModel<Articles> art = new DefaultListModel<>();
        art.addAll(conArticles.getData());
        lstArticlesAndServices.setModel(art);
    }
    private void loadEntities() {
        DefaultListModel<ServiceOrder> so = new DefaultListModel<>();
        conServiceOrder.getData().forEach(a -> {
        so.addElement(a);});
        lstServiceOrder.setModel(so);
//        lstIdName.setModel(so);
    }
    private void cleanUpCustomer() {
        txtFirstName.setText("");
        txtLastName.setText("");
        txtPhoneNumber.setText("");
    }
    private void cleanUpVehicle() {
        txtManufacturer.setText("");
        txtModel.setText("");
        txtProductionYear.setText("");
        txtLicensePlate.setText("");
    }
    private void createCustomerAndVehicle() {
        conCustomer.setEntityDefault(new Customer());

        if(txtFirstName.getText().isEmpty() || txtFirstName.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Please enter first name.");
            return;
        } else if(txtLastName.getText().isEmpty() || txtLastName.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Please enter last code.");
            return;
        } else if(txtPhoneNumber.getText().isEmpty() || txtPhoneNumber.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Please enter phone nubmer.");
        }
        else {
            setCustomerToEntity();
        }

        try {
            conCustomer.create();
            cleanUpCustomer();
            loadCustomer();
        } catch (ExceptionServiceLog e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        conVehicle.setEntityDefault(new Vehicle());
        
        if(txtManufacturer.getText().isEmpty() || txtModel.getText().isEmpty() || txtLicensePlate.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please enter all fields");
            return;
        } else {
            setVehicleToEntity();
        }
        try {
            conVehicle.create();
            cleanUpVehicle();
            loadVehicle();
        } catch (ExceptionServiceLog e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }
    
    private void setValuesToServiceOrder() {
        var price = conItems.getEntityDefault();
        var val = conServiceOrder.getEntityDefault();
        val.setCustomer((Customer)boxCustomer.getSelectedItem());
        val.setVehicle((Vehicle)boxVehicle.getSelectedItem());
        val.setRemarks(txtRemarks.getText());
        val.setItems(lstAddedItems.getSelectedValuesList());
//        setItemToEntity();
//        price.getTotalPrice(totalPrice());
        if(dpDate.getDate()!= null) {
            val.setRecievingDate(
             Date.from(dpDate.getDate()
                           .atStartOfDay()
                   .atZone(ZoneId.systemDefault()).toInstant()));
        }
        
        
        DefaultListModel<AddedItems> ai;
        try {
            ai=(DefaultListModel<AddedItems>) lstAddedItems.getModel();
            val.setItems(new ArrayList<>());
            for(int i=0; i<ai.size(); i++) {
                val.getItems().add(ai.get(i));            
                        }
        } catch (Exception e) {
        }
    }
    
//    private BigDecimal totalPrice() {
//        var so = conServiceOrder.getEntityDefault();
//        var iPrice = conItems.getEntityDefault();
//        DefaultListModel<AddedItems> ai;
//        
//        ai=(DefaultListModel<AddedItems>) lstAddedItems.getModel();
//            BigDecimal bd = BigDecimal.ZERO;
//
//        for(int i=0; i<ai.size(); i++) {
//           BigDecimal tp = ai.get(i).getArticles().getPrice();
//           bd.add(tp);
//        }
//          so.setTotalPrice(bd);
//          
//          return bd;
//    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntSearch;
    private javax.swing.JComboBox<Customer> boxCustomer;
    private javax.swing.JComboBox<Vehicle> boxVehicle;
    private javax.swing.JButton btnAddToList;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnCreateServiceOrder;
    private javax.swing.JButton btnDeleteSo;
    private javax.swing.JButton btnRemoveFromList;
    private com.github.lgooddatepicker.components.DatePicker dpDate;
    private javax.swing.JPanel jCreateSTab;
    private javax.swing.JPanel jCustomerTab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel jServiceOrderListTab;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JPanel jVehicleTab;
    private javax.swing.JLabel lblTime;
    private javax.swing.JList<AddedItems> lstAddedItems;
    private javax.swing.JList<Articles> lstArticlesAndServices;
    private javax.swing.JList<ServiceOrder> lstServiceOrder;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLicensePlate;
    private javax.swing.JTextField txtManufacturer;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtProductionYear;
    private javax.swing.JTextArea txtRemarks;
    private javax.swing.JTextPane txtRemarksShow;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel txtServiceOrderID;
    private javax.swing.JTextField txtShowFirstName;
    private javax.swing.JTextField txtShowLastName;
    private javax.swing.JTextField txtShowLicenseNum;
    private javax.swing.JTextField txtShowManufacturer;
    private javax.swing.JTextField txtShowModel;
    private javax.swing.JTextField txtShowPhoneNum;
    private javax.swing.JTextField txtShowYear;
    private javax.swing.JTextField txtTotalPrice;
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
