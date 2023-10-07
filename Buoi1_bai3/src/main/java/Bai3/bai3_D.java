/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class bai3_D extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        int w = 20, h = 10, x = 200, y= 10;
        int n = 10;
        for (int j = 0; j < 10; j++) {
            int tempx = x;//dem x
            for (int i = 0; i < j + 1; i++) {
                g.drawRect(tempx, y, 20, 10);
                tempx += 20;//ve row gach
            }
            x -= 10;//lui
            y += 10;//xuong dong
        }


    }
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setLocationRelativeTo(null);
        bai3_D b3 = new bai3_D();
        f.add(b3);
        f.setVisible(true);
    }
}
