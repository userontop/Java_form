/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi1_bai1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class Draw_Star extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        g.setColor(Color.red);
        g.drawLine(143, 18, 213, 243);//ac
        g.drawLine(143, 18, 75, 243);//ad
        g.drawLine(258, 105, 75, 243);//bd
        g.drawLine(258, 105, 32, 105);//be
        g.drawLine(213, 243, 32, 105);//ce
    }
    
}
