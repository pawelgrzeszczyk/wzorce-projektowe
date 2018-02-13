/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;

/**
 *
 * @author Marcin
 */
public class ModulZaslepka implements Automat{
    private Automat next;

    public ModulZaslepka() {
    }
    
    
    @Override
    public void setNext(Automat next) {
        this.next=next;
    }

    @Override
    public DokumentOplaty execute(Banknot banknot) {
         return new NullObject();   
    }
    
}
