/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buoi1_bai9;

import javax.swing.JFrame;

/**
 *
 * @author PC
 */
public class Buoi1_Bai9 {

public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,420);
        Boll_bai9 b = new Boll_bai9();
        f.add(b);
        f.setVisible(true);
        b.DiChuyen();
    }
}
