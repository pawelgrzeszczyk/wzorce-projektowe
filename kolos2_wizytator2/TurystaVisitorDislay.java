/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_wizytator2;

/**
 *
 * @author Pawel
 */
public class TurystaVisitorDislay implements TurystaVisitor{


    @Override
    public void visit(DzialStarozytny dzialStarozytny) {
        System.out.println("visit dzial starozytny");
    }

    @Override
    public void visit(DzialSredniowieczny dzialSredniowieczny) {
        System.out.println("visit dzial sredniowieczny");
    }

    @Override
    public void visit(DzialNowoczensy dzialNowoczesny) {
        System.out.println("visit dzial nowoczesny");
    }
    
    
}
