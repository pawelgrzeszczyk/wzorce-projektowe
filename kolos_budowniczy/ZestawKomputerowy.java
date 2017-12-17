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
public class ZestawKomputerowy {
    private String monitor;
    private String dysk;
    private String grafika;
    private String procesor;
    
    public void setMonitor(String monitor){
        this.monitor = monitor;
    }
    public void setDysk(String dysk){
        this.dysk = dysk;
    }
    public void setGrafika(String grafika){
        this.grafika = grafika;
    }
    public void setProcesor(String procesor){
        this.procesor = procesor;
    }
    
    public void show(){
        if(monitor!=null) System.out.println("Monitor: "+ monitor);
        if(dysk!=null) System.out.println("Dysk: "+dysk);
        if(grafika!=null) System.out.println("Grafika: "+grafika);
        if(procesor!=null) System.out.println("Procesor: "+procesor);
    }
    
}
