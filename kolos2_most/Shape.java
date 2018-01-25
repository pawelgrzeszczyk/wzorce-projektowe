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
public abstract class Shape {
    protected Draw draw;
    
    protected Shape(Draw draw){
        this.draw = draw;
    }
    public abstract void drawShape();
}
