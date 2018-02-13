/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_budowniczy2;

/**
 *
 * @author Pawel
 */
public abstract class Budowniczy {
    protected Pizza pizza;
    
    public void createNewPizza(){
        pizza = new Pizza();
    }
    public Pizza getPizza(){
        return pizza;
    }
    
    public abstract void budujCiasto();
    public abstract void budujDodatki();
    public abstract void budujSosy();
}
