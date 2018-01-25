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
public class LogitechRemote implements InterfaceRemoteControl{
    private InterfaceTV tv;
    
    public LogitechRemote(InterfaceTV tv){
        this.tv = tv;
    }

    @Override
    public void wl() {
        tv.on();
    }

    @Override
    public void wyl() {
        tv.off();
    }

    @Override
    public void zmien(int kanal) {
        tv.switchChannel(kanal);
        System.out.println("switch keyboard logitech");
    
    }
    
}
