/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatorgui;

/**
 *
 * @author milosz
 */
public class Mediator {

   

    void sprawdz(Kontrolka box, Kontrolka btn) {

        	if(box.pobierzStatus()){

            		btn.zmienStatus();
        }
    }

}
