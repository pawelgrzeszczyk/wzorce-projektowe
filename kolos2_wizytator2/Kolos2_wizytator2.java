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
public class Kolos2_wizytator2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TurystaVisitor turysta = new TurystaVisitorDislay();
        DzialyMuzeum nowoczesny = new DzialNowoczensy();
        DzialyMuzeum starozytny = new DzialStarozytny();
        DzialyMuzeum sredniowieczny = new DzialSredniowieczny();
        
        Muzeum muzeum = new Muzeum();
        muzeum.addDzialy(starozytny);
        muzeum.addDzialy(nowoczesny);
        muzeum.visit(turysta);
    }
    
}
