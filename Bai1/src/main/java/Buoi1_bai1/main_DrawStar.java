
package Buoi1_bai1;

import javax.swing.JFrame;

/**
 *
 * @author PC
 */
public class main_DrawStar {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300,300);
        f.setLocationRelativeTo(null);
        Draw_Star dS = new Draw_Star();
        f.add(dS);
        f.setVisible(true);
    }
}
