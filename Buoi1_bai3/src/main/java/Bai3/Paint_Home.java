/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class Paint_Home extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Polygon p = new Polygon();
        int x = 200, y = 200;
        
        //noc nha
        p.addPoint(x, y);
        p.addPoint(x - 60, y + 40);
        p.addPoint(x + 60, y + 40);
        p.addPoint(x - 60, y + 40);
        
        //than nha
        p.addPoint(x - 60, y + 60*2);
        p.addPoint(x + 60, y + 60*2);
        p.addPoint(x + 60, y + 40);
        g.drawPolygon(p);
        
        Polygon p1 = new Polygon();//cua nha
        p1.addPoint(x - (60/2-15), y + 60*2);
        p1.addPoint(x - (60/2-15), y + 60+20);
        p1.addPoint(x + (60/2-15), y + 60+20);
        p1.addPoint(x + (60/2-15), y + 60*2);
        g.drawPolygon(p1);
        
        //cua so duoi trai
        int tempy = (x - (60/2-15));
        int tempx = (x - (60/2-15)) - 18;
        Polygon p2_0 = new Polygon();
        p2_0.addPoint((tempx - (60/2-15)-2), (tempy + 60*2)-5);
        p2_0.addPoint((tempx - (60/2-15)-2), (tempy + 60+20)+15);
        p2_0.addPoint((tempx + (60/2-15)-5), (tempy + 60+20)+15);
        p2_0.addPoint((tempx + (60/2-15)-5), (tempy + 60*2)-5);
        g.drawPolygon(p2_0);
        
            
        //cua so duoi phai
        tempx = (x + (60/2-15)) + 18 + 7; //do co -2 - 5
        Polygon p2_1 = new Polygon();
        p2_1.addPoint((tempx - (60/2-15)-2), (tempy + 60*2)-5);
        p2_1.addPoint((tempx - (60/2-15)-2), (tempy + 60+20)+15);
        p2_1.addPoint((tempx + (60/2-15)-5), (tempy + 60+20)+15);
        p2_1.addPoint((tempx + (60/2-15)-5), (tempy + 60*2)-5);
        g.drawPolygon(p2_1);
        
        //cua so tren trai
        tempy = (x - 60) + 15;
        tempx = (x - (60/2-15)) - 18;
        Polygon p2_3 = new Polygon();
        p2_3.addPoint((tempx - (60/2-15)-2), (tempy + 60*2)-5);
        p2_3.addPoint((tempx - (60/2-15)-2), (tempy + 60+20)+15);
        p2_3.addPoint((tempx + (60/2-15)-5), (tempy + 60+20)+15);
        p2_3.addPoint((tempx + (60/2-15)-5), (tempy + 60*2)-5);
        g.drawPolygon(p2_3);
        
        //cua so tren phai
        tempx = (x + (60/2-15)) + 18 + 7;
        Polygon p2_4 = new Polygon();
        p2_4.addPoint((tempx - (60/2-15)-2), (tempy + 60*2)-5);
        p2_4.addPoint((tempx - (60/2-15)-2), (tempy + 60+20)+15);
        p2_4.addPoint((tempx + (60/2-15)-5), (tempy + 60+20)+15);
        p2_4.addPoint((tempx + (60/2-15)-5), (tempy + 60*2)-5);
        g.drawPolygon(p2_4);
        

        
    }
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setLocationRelativeTo(null);
        Paint_Home b3 = new Paint_Home();
        f.add(b3);
        f.setVisible(true);
    }
    
}
