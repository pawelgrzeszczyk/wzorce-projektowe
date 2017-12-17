/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_obserwator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pawel
 */
public class TotoLotek {
    private List<Obserwator> obserwatorzy = new ArrayList();
    private int [] wynik = new int[5];
    
    public TotoLotek(){
        for(int i=0; i<wynik.length; i++){
            wynik[i] = 0;
        }
    }
    
    public void dodajObserwatora(Obserwator o){
        obserwatorzy.add(o);
    }
    public void usunObserwatora(Obserwator o){
        int id = obserwatorzy.indexOf(o);
        obserwatorzy.remove(id);
    }
    
    
    public void losuj(){
        
        for(int j=0; j<5; j++ ){
            int x = (int)(Math.random()*20);
            wynik[j] += x;
            
        }
        
        powiadamiaj();
    
    }
    public void powiadamiaj(){
        for(Obserwator o : obserwatorzy)
            o.update();
    }
    public int[] result(){
        return wynik;
    }
}
