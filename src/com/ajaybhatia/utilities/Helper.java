package com.ajaybhatia.utilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.ajaybhatia.entities.controllers.RoleJpaController;
import com.ajaybhatia.entities.controllers.UserJpaController;
import java.awt.Component;
import javax.persistence.Persistence;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ajay
 */
public class Helper {

    public static RoleJpaController getRoleControllerInstance() {
        return new RoleJpaController(
            Persistence.createEntityManagerFactory("Gulati-GarmentsPU")
        );
    }
    
    public static UserJpaController getUserControllerInstance() {
        return new UserJpaController(
            Persistence.createEntityManagerFactory("Gulati-GarmentsPU")
        );
    }
        
    public static void centerScreen(JFrame frame) {
        frame.setLocationRelativeTo(null);
    }
    
    public static void showSuccessMessage(Component component, String message) {
        JOptionPane.showMessageDialog(component, message, "Message", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void showErrorMessage(Component component, String message) {
        JOptionPane.showMessageDialog(component, message, "Message", JOptionPane.ERROR_MESSAGE);
    }
    
    public static void closeAndOpen(JFrame toClose, JFrame toOpen) {
        toClose.dispose();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                toOpen.setVisible(true);
            }
        });
    }
}
