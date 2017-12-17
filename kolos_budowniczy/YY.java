/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_budowniczy;

/**
 *
 * @author Pawel
 */
public class YY extends Budowniczy{

    @Override
    public void budujMonitor() {
        zestaw.setMonitor("ASUS");
    }

    @Override
    public void budujDysk() {
        zestaw.setDysk("1TB");
    }

    @Override
    public void budujGrafike() {
        zestaw.setGrafika("4GB");
    }

    @Override
    public void budujProcesor() {
        zestaw.setProcesor("i7");
    }
    
}
