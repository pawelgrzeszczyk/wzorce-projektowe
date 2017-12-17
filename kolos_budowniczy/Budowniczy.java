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
public abstract class Budowniczy {
    protected ZestawKomputerowy zestaw;
    
    public ZestawKomputerowy getZestaw(){
        return zestaw;
    }
    public void newZestaw(){
        zestaw = new ZestawKomputerowy();
    }
    
    public abstract void budujMonitor();
    public abstract void budujDysk();
    public abstract void budujGrafike();
    public abstract void budujProcesor();
    
}
