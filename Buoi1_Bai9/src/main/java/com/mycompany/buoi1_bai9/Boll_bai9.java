/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buoi1_bai9;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class Boll_bai9 extends JPanel{
    Graphics g;
    
    int Ran(int min, int max){
        Random rd = new Random();
        int dem = rd.nextInt(max - min)+min;
        while(dem == 0)
            dem = rd.nextInt(max - min)+min;
        return dem;
    }
    void Bong(int n, int x[], int y[]){
        for(int i = 0; i <= n; i++){
            g.fillOval(x[i], y[i], 10, 10);
        }
    }
    void DiChuyenBong(int n, int x[], int y[]){
        for(int i = 0; i <= n; i++){
            g.fillOval(x[i], y[i], 10, 10);
        }
    }
    void paintComponent(Graphics g, int x[], int y[], int n) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        g.setColor(Color.black);
        int w = 20, h = 10;
        for(int i = 0; i <= n; i++){
                g.drawRect(x[i], y[i], 20, 10);
        }
    }
    void DiChuyen() {
        g = this.getGraphics();
        int n = 10;//so bong 
        int[] x = new int[100];
        int[] y = new int[100];
        int[] dx = new int[100];
        int[] dy = new int[100];

        for(int i = 0; i <= n; i++){
            x[i] = Ran(50, 300);
            y[i] = Ran(50,300);
            dx[i] = Ran(-2, 2);
            dy[i] = Ran(-2, 2);
        }
        while(true){
            //bong 1

            g.setColor(Color.red);
            paintComponent(g, x, y, n);
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                Logger.getLogger(Boll_bai9.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            g.setColor(this.getBackground());
//            paintComponent(g);//neu khong muon anh bi an mon
            DiChuyenBong(n, x, y);
            for(int i = 0; i <= n; i++){                
            if(x[i] <= 0){ 
                dx[i] = -dx[i];
            }else if(y[i] <= 0){
                dy[i] = -dy[i];
                
            }else if(y[i] >= 375){
                
                dy[i] = -dy[i];
            }else if(x[i] >= 375){
                
                dx[i] = -dx[i];
            }
            x[i] += dx[i];
            y[i] += dy[i];  
            }
            
        }
 
    }
}
