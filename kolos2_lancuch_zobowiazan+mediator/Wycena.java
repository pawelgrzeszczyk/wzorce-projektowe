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
public class Wycena implements Firma_inf {
    Mediator m;
    Analiza a;
    public Wycena(Mediator m) {
        this.m = m;
        a= new Analiza(m);
    }
    
    @Override
    public void do_zadanie(int ile_krokow) {
        if (ile_krokow == 1) {
            System.out.println("Robie wycene");
        } else {
            System.out.println("Robie wycene");
            a.do_zadanie(ile_krokow);
            m.wyslij_dokumentacje(a,"Przekazuje Dokumentacja wyceny");
        }
    }

    @Override
    public void odbierz(String wiadomosc) {
        System.out.println(wiadomosc);
        
    }

    @Override
    public void wyslij(String wiadomosc) {
        m.wyslij_dokumentacje(a,wiadomosc);
    }

}
