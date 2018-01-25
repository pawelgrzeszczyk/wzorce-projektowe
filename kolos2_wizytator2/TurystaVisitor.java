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
public interface TurystaVisitor {
   
    public void visit(DzialStarozytny dzialStarozytny);
    public void visit(DzialSredniowieczny dzialSredniowieczny);
    public void visit(DzialNowoczensy dzialNowoczesny);
}
