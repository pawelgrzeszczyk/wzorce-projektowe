/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanuchmediator;

/**
 *
 * @author Matje
 */
public class Oprogramowanie implements Firma_inf{
    Mediator m;

    public Oprogramowanie(Mediator m) {
        this.m = m;
    }
    
    

    @Override
    public void do_zadanie(int ile_krokow) {
        if(ile_krokow == 3)
            System.out.println("Programuje zadanie");
            this.wyslij("Dokumentacja Oprogramowania ");
    }

    @Override
    public void odbierz(String wiadomosc) {
        System.out.println("Oprogramowanie odebralo wiadomosc "+wiadomosc);
    }

    @Override
    public void wyslij(String wiadomosc) {
        m.wyslij_dokumentacje(this,wiadomosc);
    }

    

   
}
