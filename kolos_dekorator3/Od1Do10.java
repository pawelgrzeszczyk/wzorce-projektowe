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
public class Od1Do10 implements Liczby{

    private int[] tablica = {1,2,3,4,5,6,7,8,9,10};
    
    
    @Override
    public int[] liczby() {
        return tablica;
    }

    @Override
    public void wustwietl() {
        for(int i=0;i<tablica.length; i++)
            System.out.print(tablica[i]);
        System.out.println("\n");
    }
    
}
