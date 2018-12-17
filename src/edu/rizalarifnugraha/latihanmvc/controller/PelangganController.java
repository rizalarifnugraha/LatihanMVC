/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rizalarifnugraha.latihanmvc.controller;

import edu.rizalarifnugraha.latihanmvc.model.PelangganModel;
import edu.rizalarifnugraha.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 * Nama : Rizal Arif Nugraha
 * NIM  : 10117048
 * Kelas : IF-2
 */
public class PelangganController {

    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }

    public void resetForm(PelangganView view) {
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelp = view.getTxtTelp().getText();

        if (nama.equals("") && email.equals("") && noTelp.equals("")) {

        } else {

            model.resetForm();

        }
    }

    public void simpanForm(PelangganView view) {
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelp = view.getTxtTelp().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showInputDialog(view, "Nama Masih Kosong");
                
        } else  if (email.trim().equals("")) {
            JOptionPane.showInputDialog(view, "Email Masih Kosong");
                
        }else  if (noTelp.trim().equals("")) {
            JOptionPane.showInputDialog(view, "No Telp Masih Kosong");
                
        }else {
            model.simpanForm();
        }
            
        

    }
}
