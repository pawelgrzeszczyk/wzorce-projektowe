/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_lancuch.zobowiazan;

/**
 *
 * @author Pawel
 */
public class ZadanieMechanik implements Zadanie{
    private String zawod;
    
    public ZadanieMechanik(String zawod){
        this.zawod = zawod;
    }
    @Override
    public String getZawod() {
        return zawod;
    }
    
}
