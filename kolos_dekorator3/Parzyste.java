/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_dekorator3;

/**
 *
 * @author Pawel
 */
public class Parzyste extends Dekorator{
    
    
    
    public Parzyste(Liczby liczby) {
        super(liczby);
    }
    
    public void wyznaczParzyste(Liczby liczby){
        int[] nowa = liczby.liczby();
        for(int i=0; i<nowa.length;i++){
            if(nowa[i]%2 == 0)
                System.out.println(nowa[i]);
            
        }
    }

    @Override
    public int[] liczby() {
        wyznaczParzyste(liczby);
        return liczby.liczby();
    }
    
   
    
}
