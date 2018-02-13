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
public class Hawajska extends Budowniczy{

    @Override
    public void budujCiasto() {
        System.out.println("ciasto cienkie");
    }

    @Override
    public void budujDodatki() {
        System.out.println("ananas+szynka");
    }

    @Override
    public void budujSosy() {
        System.out.println("pomidorowy");
    }
    
}
