/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_adapter3;

/**
 *
 * @author Pawel
 */
public class AdapterPtak implements Zabawka{

    private Ptak ptak;
    
    public AdapterPtak(Ptak ptak){
        this.ptak = ptak;
    }
    
    
    @Override
    public void odglos() {
        ptak.dzwieki();
    }
    
}
