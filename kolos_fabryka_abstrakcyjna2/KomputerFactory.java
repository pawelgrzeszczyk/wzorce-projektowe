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
public class KomputerFactory {

    
    public Komputer getKomputer(KomputerAbstractFactory factory){
        return factory.createKomputer();
    }
}
