/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_most;

/**
 *
 * @author Pawel
 */
public class greenCircle implements Draw{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("draw green circle, radius:"+radius+", x:"+x+", y:"+y);
    }
    
}
