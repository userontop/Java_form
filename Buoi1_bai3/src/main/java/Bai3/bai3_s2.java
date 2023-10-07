/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class bai3_s2 extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        g.setColor(new Color(255, 0, 255));
        int i = 50;
        while(i < 185){
            g.fillOval(i, i - 20, 30, 30);
            i +=15;
        }
        
        g.setColor(Color.BLUE);
        while(i > 50){
            int temp = i - 30;
            g.fillOval(i, 185 - temp, 30, 30);
            i -= 15;
        }
    }
    
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,400);
        f.setLocationRelativeTo(null);
        bai3_s2 b3 = new bai3_s2();
        f.add(b3);
        f.setVisible(true);
    }
    
}
