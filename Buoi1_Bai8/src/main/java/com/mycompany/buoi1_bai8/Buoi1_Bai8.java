/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buoi1_bai8;

import javax.swing.JFrame;

/**
 *
 * @author PC
 */
public class Buoi1_Bai8 {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,420);
        Boll_Image b = new Boll_Image();
        f.add(b);
        f.setVisible(true);
        b.DiChuyen();
    }
}
