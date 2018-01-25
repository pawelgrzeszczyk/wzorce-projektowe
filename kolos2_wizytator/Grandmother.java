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
public class Grandmother implements Visitor{

    @Override
    public void visit(Mother visitable) {
        System.out.println("hello mother");
    }

    @Override
    public void visit(Father visitable) {
        System.out.println("hello father");
    }
    
}
