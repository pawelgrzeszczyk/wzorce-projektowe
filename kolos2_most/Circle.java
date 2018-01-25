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
public class Circle extends Shape{

    private int radius, x, y;
    
    public Circle(int radius, int x, int y, Draw draw){
        super(draw);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    @Override
    public void drawShape() {
        draw.drawCircle(radius, x, y);
    }
    
}
