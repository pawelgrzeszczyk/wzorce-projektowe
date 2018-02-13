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
public class Button implements Kontrolka{
 
   
    boolean enabled = false;
    
@Override
    
	public void zmienStatus() {

       		enabled = true;
    }

    
@Override

    	public boolean pobierzStatus() {

	        return this.enabled;
    }
    
}
