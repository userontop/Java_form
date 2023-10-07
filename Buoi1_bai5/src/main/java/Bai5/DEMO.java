/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class DEMO extends JPanel{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;   
        g2.setColor(Color.red);
        double xa=-1000,ya=tinhY(xa),xb,yb;
        int tylex=10,tyley=10;
        
        GeneralPath path=new GeneralPath();        
        path.moveTo(xa*tylex+200, 200-ya*tyley);
        for(xb=xa+0.1;xb<=1000;xb+=0.1)
        {
            yb=tinhY(xb);
            path.lineTo(xb*tylex+200, 200-yb*tyley);           
        }       
        g2.draw(path);        
        veTruc(g2);       
    } 
    
    double tinhY(double x)
    {
        return 3*x*x-6*x+1;
    }    
   
    void veTruc(Graphics g)
    {
        g.setColor(Color.black);
        //truc x
        g.drawLine(0, 200, 400, 200);
        //truc y
        g.drawLine(200, 0,200 , 400);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setLocationRelativeTo(null);
        DEMO b5 = new DEMO();
        f.add(b5);
        f.setVisible(true);
    }
}
