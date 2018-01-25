/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_most2;

/**
 *
 * @author Pawel
 */
public class BMW extends Samochod{

    private String nazwa;
    
    public BMW(Tuning tuning, String nazwa){
        super(tuning);
        this.nazwa = nazwa;
    }
    
    
    @Override
    public void tuninguj() {
        tuning.zamontuj();
    }
    
}
