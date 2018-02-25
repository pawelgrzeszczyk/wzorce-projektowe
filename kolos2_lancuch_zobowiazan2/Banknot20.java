/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_lancuch.zobowiazan2;

/**
 *
 * @author Pawel
 */
public class Banknot20 implements LancuchZobowiazan{

    private LancuchZobowiazan obecny;
    
    @Override
    public void setNext(LancuchZobowiazan next) {
        this.obecny = next;
    }

    @Override
    public void rozdziel(Waluta waluta) {
        System.out.println("rozmieniam "+waluta+" zl");
    }
    
}
