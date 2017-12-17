/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_obserwator;

/**
 *
 * @author Pawel
 */
public class Telewizja extends Obserwator{
    private TotoLotek lotek; 
    private int[] wynik = new int[5];
     
     
     
     public Telewizja(TotoLotek lotek){
         this.lotek = lotek;
        
     }
    
    
    @Override
    public void update() {
        wynik = lotek.result();
        System.out.println("Wyniki totolotka: ");
        for(int i:wynik){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public void rezygnuj(){
        lotek.usunObserwatora(this);
    }
    
}
