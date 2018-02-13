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
public class MediatorGUI {

    /**
     * @param args the command line arguments
     */
    
public static void main(String[] args) {

        
        Kontrolka btn = new Button();

        	Kontrolka box = new Checkbox();

        	Komenda boxCtrl = new ZmienBox(box);

        	Komenda btnCtrl = new ZmienBtn(btn);

        	Mediator m = new Mediator();

        	System.out.println(box.pobierzStatus());
        
		System.out.println(btn.pobierzStatus());
        
		box.zmienStatus();
        
		m.sprawdz(box, btn);
        
		System.out.println("-------------------------------");

        	System.out.println(box.pobierzStatus());

	        System.out.println(btn.pobierzStatus());
    }
    
}
