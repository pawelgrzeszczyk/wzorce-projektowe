/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_metoda.szablonowa2;

/**
 *
 * @author Pawel
 */
public abstract class AbstractClass {
    
    public abstract void operationA();
    public abstract void operationB();
    public void operationC(){
        System.out.println("operation C");
    }
    public void operationD(){
        System.out.println("operation D");
    }
    
    public void run(){
        operationA();
        operationB();
        operationC();
        operationD();
    }
}
