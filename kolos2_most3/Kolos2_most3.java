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
public class Kolos2_most3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InterfaceTV tv = new SamsungTV();
        LogitechRemote pilot = new LogitechRemote(tv);
        pilot.wl();
        pilot.zmien(5);
    }
    
}
