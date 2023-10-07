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
public class paint_Mat_cuoi extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        g.setColor(Color.yellow);
        int x = 100, y = 110;
        g.fillOval(x, y, 200, 200);
        
        g.setColor(Color.BLACK);
        g.fillOval(x+40, y+40, 30, 30);
        g.fillOval(2*x+40, y+40, 30, 30);
        g.fillOval(2*x+40, y+40, 30, 30);
        g.fillOval(x+40 + (2*x-40 - x+40)/2, 2*y, 30, 30);
        
        g.drawArc(x + (2*x-40 - x+40)/2, 2*y + 15, 100, 40, 5, -180);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setLocationRelativeTo(null);
        paint_Mat_cuoi b3 = new paint_Mat_cuoi();
        f.add(b3);
        f.setVisible(true);
    }
    
}
