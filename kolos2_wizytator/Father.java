/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_wizytator;

/**
 *
 * @author Pawel
 */
public class Father implements Visitable{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
}
