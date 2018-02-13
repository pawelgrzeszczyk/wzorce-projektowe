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
public class ZmienBtn implements Komenda{


    	Kontrolka btn;

    
    public ZmienBtn(Kontrolka btn){
	
        this.btn =btn;
    }
    
	@Override
    
	public void execute() {

	        btn.zmienStatus();
    }
    
}
