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
public class LGTV implements InterfaceTV{

    @Override
    public void on() {
        System.out.println("LG tv on");
    }

    @Override
    public void off() {
        System.out.println("LG tv off");
    }

    @Override
    public void switchChannel(int channel) {
        System.out.println("LG tv channel: "+channel );
    }
    
}
