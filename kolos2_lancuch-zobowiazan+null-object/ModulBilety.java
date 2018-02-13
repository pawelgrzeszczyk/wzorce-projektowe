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
public class ModulBilety implements Automat{
    private Automat next;

    public ModulBilety() {
    }

    @Override
    public void setNext(Automat next) {
        this.next=next;
    }

    @Override
    public DokumentOplaty execute(Banknot banknot) {
        if(banknot.getWaluta().equals("PLN"))
        {
            if(banknot.getWartosc()<100)
            {
                return new BiletJednorazowy();
            }
            else
            {
                return new BiletOkresowy();
            }
        }
        else
        {
            return next.execute(banknot);
        }
    }
    
}
