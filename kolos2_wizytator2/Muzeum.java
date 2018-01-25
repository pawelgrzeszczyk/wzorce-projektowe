/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_wizytator2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pawel
 */
public class Muzeum {
    private List<DzialyMuzeum> dzialy = new ArrayList();
    
    public void addDzialy(DzialyMuzeum dzialMuzeum){
        dzialy.add(dzialMuzeum);
    }
    
    public void visit(TurystaVisitor turysta){
        for(DzialyMuzeum dzialMuzeum:dzialy)
            dzialMuzeum.accept(turysta);
    }
    
}
