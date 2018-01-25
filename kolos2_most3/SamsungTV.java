/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_most3;

/**
 *
 * @author Pawel
 */
public class SamsungTV implements InterfaceTV{

    @Override
    public void on() {
        System.out.println("samsung tv on");
    }

    @Override
    public void off() {
        System.out.println("samsung tv off");
    }

    @Override
    public void switchChannel(int channel) {
        System.out.println("samsung tv channel: "+channel );
    }
    
}
