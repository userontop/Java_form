/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class bai3_C extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        g.fillRect(0, 0, 400, 400);
        
        g.setColor(Color.YELLOW);
        Polygon p1 = new Polygon();
        p1.addPoint(200, 0);
        p1.addPoint(400, 200);
        p1.addPoint(200, 400);
        p1.addPoint(0, 200);

        g.fillPolygon(p1);
        
        g.setColor(Color.red);
        g.fillRect(100, 100, 200, 200);
        
        g.setColor(Color.GREEN);
        g.fillRoundRect(100, 100, 200, 200, 200, 200);

    }
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setLocationRelativeTo(null);
        bai3_C b3 = new bai3_C();
        f.add(b3);
        f.setVisible(true);
    }
}
