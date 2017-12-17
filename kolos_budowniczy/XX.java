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
public class XX extends Budowniczy{

    @Override
    public void budujMonitor() {
       zestaw.setMonitor("LG");
    }

    @Override
    public void budujDysk() {
        zestaw.setDysk("100GB");
    }

    @Override
    public void budujGrafike() {
        zestaw.setGrafika("1GB");
    }

    @Override
    public void budujProcesor() {
        zestaw.setProcesor("i3");
    }
    
}
