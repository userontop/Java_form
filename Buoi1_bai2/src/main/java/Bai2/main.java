/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import javax.swing.JFrame;

/**
 *
 * @author PC
 */
public class main {
        public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,200);
        f.setLocationRelativeTo(null);
        Draw_line_random dLR = new Draw_line_random();
        f.add(dLR);
        f.setVisible(true);
    }
}
