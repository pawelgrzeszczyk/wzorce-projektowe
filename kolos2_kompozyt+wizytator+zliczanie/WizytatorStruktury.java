/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kompozyt.wizytator;

/**
 *
 * @author Pawel
 */
public class WizytatorStruktury implements Wizytator{

    
    
    @Override
    public int visit(KatalogKompozyt katalog) {
       return katalog.waga;
    }

    @Override
    public int visit(PlikLisc plik) {
       return plik.waga;
    }
    
}
