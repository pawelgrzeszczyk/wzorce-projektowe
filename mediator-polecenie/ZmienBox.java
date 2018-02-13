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
public class ZmienBox implements Komenda{


     	Kontrolka box;
    
	public ZmienBox(Kontrolka box){

	        this.box = box;
    }

    
    @Override
    
	public void execute() {
	
       box.zmienStatus();
    }
    
}
