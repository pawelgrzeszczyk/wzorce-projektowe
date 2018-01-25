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
public class Analiza implements Firma_inf {
    Mediator m;
    Oprogramowanie o;
    public Analiza(Mediator m) {
        this.m = m;
         o= new Oprogramowanie(m);
    }
    
    
    
    @Override
    public void do_zadanie(int ile_krokow) {
        if (ile_krokow == 2) {
            System.out.println("Robie analize");
        } else {
            System.out.println("Robie analize");
            o.do_zadanie(ile_krokow);
            this.wyslij("Przekazuje Dokumentacja Analizy");
        }
    }

    @Override
    public void odbierz(String wiadomosc) {
        System.out.println("Analiza Odbiera wiadomosc "+ wiadomosc);
    }

    @Override
    public void wyslij(String wiadomosc) {
        m.wyslij_dokumentacje(this.o,wiadomosc);
    }

   

}
