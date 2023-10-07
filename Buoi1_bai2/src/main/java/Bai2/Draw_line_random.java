/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class Draw_line_random extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        for(int i = 0; i < 100; i++){
            g.setColor(new Color(Rad(0, 255), Rad(0, 255), Rad(0,255)));
            g.drawLine(Rad(0, 400), Rad(0, 200), Rad(0, 400), Rad(0, 200));
        }
    }
    
    int Rad(int min, int max){
        Random rD = new Random();
        return rD.nextInt(max - min)+min;
    }
}

