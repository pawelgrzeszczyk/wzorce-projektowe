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
public class DzialNowoczensy implements DzialyMuzeum{

    @Override
    public void accept(TurystaVisitor turystaVisitor) {
        turystaVisitor.visit(this);
    }
    
}
