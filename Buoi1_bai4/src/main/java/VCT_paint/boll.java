/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VCT_paint;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class boll extends JPanel{
    Graphics g;
    public boll(){
        setBackground(Color.white);
    }

    void DiChuyen() {
         g = this.getGraphics();
        int x = 100, y = 100, dx = 1, dy =2;
        int n = 0;
        while(true){
            //bong 1
            g.setColor(Color.red);
                g.fillOval(x, y, 10, 10);
            try {
                Thread.sleep(30);
            } catch (InterruptedException ex) {
                Logger.getLogger(boll.class.getName()).log(Level.SEVERE, null, ex);
            }
                g.setColor(this.getBackground());
                g.fillOval(x, y, 10, 10);
                
            //qua bong 2
            g.setColor(Color.red);
                g.fillOval(x, y, 10, 10);
            try {
                Thread.sleep(30);
            } catch (InterruptedException ex) {
                Logger.getLogger(boll.class.getName()).log(Level.SEVERE, null, ex);
            }
                g.setColor(this.getBackground());
                g.fillOval(x, y, 10, 10);
            if(x <= 0){
                
                dx = -dx;
            }else if(y <= 0){
                dy = -dy;
                
            }else if(y >= 375){
                
                dy = -dy;
            }else if(x >= 375){
                
                dx = -dx;
            }
            x += dx;
            y += dy;   
        }
    }
    
    
}
