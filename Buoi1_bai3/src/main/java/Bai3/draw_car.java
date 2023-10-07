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
public class draw_car extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 400, 200);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 200, 400, 40);
        
        g.setColor(Color.red);
        g.fillOval(40, 200-40, 80, 80);
        g.setColor(Color.red);
        g.fillOval(400-(40+80), 200-40, 80, 80);
        
        g.setColor(Color.CYAN);
        g.fillRect(280, 30, 400-280, 50);
    }
    
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        draw_car dC = new draw_car();
        f.add(dC);
    }
}
