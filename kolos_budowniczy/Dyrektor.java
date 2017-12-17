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
public class Dyrektor {
    private Budowniczy budowniczy;
    
    public void wybierzBudowniczy(Budowniczy budowczniczy){
        this.budowniczy = budowczniczy;
    }
    
    public ZestawKomputerowy getZestaw(){
        return budowniczy.getZestaw();
    }
    public void skladaj(){
        budowniczy.newZestaw();
        budowniczy.budujMonitor();
        budowniczy.budujDysk();
        budowniczy.budujGrafike();
        budowniczy.budujProcesor();
    }
}
