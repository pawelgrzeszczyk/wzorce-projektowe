/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_kompozyt;

import java.util.ArrayList;

/**
 *
 * @author Pawel
 */
public class Composite implements Component{
    
    private ArrayList<Component> children = new ArrayList();
    private String nazwa;
    
    public Composite(String nazwa){
        this.nazwa = nazwa;
    }
    
    @Override
    public void zmien(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public void dodaj(Component component) {
        children.add(component);    
    }

    @Override
    public void usun(Component component) {
        int id = children.indexOf(component);
        children.remove(id);
    }

    @Override
    public void wyswietl() {
        System.out.println(nazwa+"\n");
        for(Component c : children){
           c.wyswietl();
        }
    }

    

    

   
    
}
