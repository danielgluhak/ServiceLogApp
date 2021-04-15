/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgluhak.servicelogapp;

import com.danielgluhak.util.InitFixtures;
import com.danielgluhak.util.NewOperator;
//import com.danielgluhak.view.SplashScreen;
import com.danielgluhak.view.SplashScreen;

/**
 *
 * @author Daniel
 */
public class Main {
    
    public static void main(String[] args) {
//        InitFixtures.start();
       SplashScreen sc = new SplashScreen();
       sc.setVisible(true);
       sc.startSplashScreen();
       new NewOperator();
        
    }
    
    
}
