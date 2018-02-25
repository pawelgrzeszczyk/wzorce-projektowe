/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_fabryka_abstrakcyjna2;

/**
 *
 * @author Pawel
 */
public class Server_Factory implements KomputerAbstractFactory{

    private String cpu,hdd,gpu;

    public Server_Factory(String cpu, String hdd, String gpu) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.gpu = gpu;
    }
    
    
    
    @Override
    public Komputer createKomputer() {
        return new Server(cpu, hdd, gpu);
    }
    
}
