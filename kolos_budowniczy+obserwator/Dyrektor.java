/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_budowniczy.obserwator;

/**
 *
 * @author Pawel
 */
public class Dyrektor {
    private Budowniczy budowniczy;
    
    public void setBudowniczy(Budowniczy budowniczy){
        this.budowniczy = budowniczy;
    }
    
    public String skladaj(){
        budowniczy.budujBody("Hello World");
        budowniczy.budujTitle("Title");
        return budowniczy.budujCalosc();
    }
}
